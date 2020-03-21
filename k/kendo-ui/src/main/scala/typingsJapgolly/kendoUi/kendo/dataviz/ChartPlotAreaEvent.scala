package typingsJapgolly.kendoUi.kendo.dataviz

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotAreaEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPlotArea
  def isDefaultPrevented(): Boolean
}

object ChartPlotAreaEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: ChartPlotArea): ChartPlotAreaEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[ChartPlotAreaEvent]
  }
}

