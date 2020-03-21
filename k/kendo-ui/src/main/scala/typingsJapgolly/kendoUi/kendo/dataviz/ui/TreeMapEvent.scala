package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TreeMap
  def isDefaultPrevented(): Boolean
}

object TreeMapEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TreeMap): TreeMapEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[TreeMapEvent]
  }
}

