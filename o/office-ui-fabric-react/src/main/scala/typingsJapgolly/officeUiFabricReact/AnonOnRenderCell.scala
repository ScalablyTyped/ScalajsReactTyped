package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderCell extends js.Object {
  var renderedWindowsAhead: Double
  var renderedWindowsBehind: Double
  var startIndex: Double
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): Element
}

object AnonOnRenderCell {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => CallbackTo[Element],
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): AnonOnRenderCell = {
    val __obj = js.Dynamic.literal(renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onRenderCell")(js.Any.fromFunction3((t0: js.Any, t1: scala.Double, t2: scala.Boolean) => onRenderCell(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonOnRenderCell]
  }
}

