package api.projects.dal.dao

import api.projects.dal.model.JoinRequest
import api.projects.dal.model.Project
import io.micronaut.data.model.Page
import org.bson.types.ObjectId

interface ProjectRepository {

  fun save(project: Project): ObjectId?

  fun findByFounderUsername(username: String): List<Project>

  fun findById(id: ObjectId): Project?

  fun findAllPaged(pageNumber: Int, filterPrivate: Boolean): Page<Project>

  fun update(project: Project): Long

  fun delete(id: ObjectId): Long

  fun addJoinRequest(id: ObjectId, joinRequest: JoinRequest): Long

  fun addUnNotifiedJoinRequest(id: ObjectId, joinRequest: JoinRequest): Long
}