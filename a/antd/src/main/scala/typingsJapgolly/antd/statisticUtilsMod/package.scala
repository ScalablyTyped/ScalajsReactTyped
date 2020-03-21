package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object statisticUtilsMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdBooleans.`false`
    - typingsJapgolly.antd.antdStrings.number
    - typingsJapgolly.antd.antdStrings.countdown
    - js.Function2[
  / * value * / typingsJapgolly.antd.statisticUtilsMod.valueType, 
  / * config * / js.UndefOr[typingsJapgolly.antd.statisticUtilsMod.FormatConfig], 
  typingsJapgolly.react.mod.ReactNode]
  */
  type Formatter = typingsJapgolly.antd.statisticUtilsMod._Formatter | (js.Function2[
    /* value */ typingsJapgolly.antd.statisticUtilsMod.valueType, 
    /* config */ js.UndefOr[typingsJapgolly.antd.statisticUtilsMod.FormatConfig], 
    japgolly.scalajs.react.raw.React.Node
  ])
  type countdownValueType = typingsJapgolly.antd.statisticUtilsMod.valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
