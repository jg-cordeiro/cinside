import React from 'react';

import { css, cx } from '@emotion/css';

const styleBase = css`
  display: block;
  color: #FFF;
  background-color: #235BFF;
  padding: 4px 8px;
  font-size: 20px;
  border-radius: 5px;
  text-align: center;
  line-height: 25px;
`;
const negativeStyle = css`
  background-color: #EEE;
  color: #1C1C1C;
`;

export default function ProblemDifficulty({ children, negative, style }) {
  const composedStyle = cx(
    styleBase,
    { [negativeStyle]: negative },
    style,
  );

  return (
    <div className={composedStyle}>{children}</div>
  );
}
