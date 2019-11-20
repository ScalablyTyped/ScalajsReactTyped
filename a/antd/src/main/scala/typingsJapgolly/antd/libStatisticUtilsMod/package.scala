package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStatisticUtilsMod {
  import japgolly.scalajs.react.raw.React.Node

  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdNumbers.`false`
    - typings.antd.antdStrings.number
    - typings.antd.antdStrings.countdown
    - js.Function2[
  / * value * / typings.antd.libStatisticUtilsMod.valueType, 
  / * config * / js.UndefOr[typings.antd.libStatisticUtilsMod.FormatConfig], 
  typings.react.reactMod.ReactNode]
  */
  type Formatter = _Formatter | (js.Function2[/* value */ valueType, /* config */ js.UndefOr[FormatConfig], Node])
  type countdownValueType = valueType | String
  type valueType = Double | String
}
