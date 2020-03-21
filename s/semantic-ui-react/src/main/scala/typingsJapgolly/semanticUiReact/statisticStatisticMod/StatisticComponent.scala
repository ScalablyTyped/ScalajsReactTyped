package typingsJapgolly.semanticUiReact.statisticStatisticMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typingsJapgolly.semanticUiReact.statisticLabelMod.StatisticLabelProps
import typingsJapgolly.semanticUiReact.statisticValueMod.StatisticValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticComponent extends FunctionComponent[StatisticProps] {
  var Group: StatelessComponent[StatisticGroupProps] = js.native
  var Label: StatelessComponent[StatisticLabelProps] = js.native
  var Value: StatelessComponent[StatisticValueProps] = js.native
}

