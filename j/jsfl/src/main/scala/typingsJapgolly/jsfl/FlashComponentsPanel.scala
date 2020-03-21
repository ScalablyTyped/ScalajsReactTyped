package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashComponentsPanel extends js.Object {
  def addItemToDocument(): js.Any
  def reload(): js.Any
}

object FlashComponentsPanel {
  @scala.inline
  def apply(addItemToDocument: CallbackTo[js.Any], reload: CallbackTo[js.Any]): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItemToDocument")(addItemToDocument.toJsFn)
    __obj.updateDynamic("reload")(reload.toJsFn)
    __obj.asInstanceOf[FlashComponentsPanel]
  }
}

