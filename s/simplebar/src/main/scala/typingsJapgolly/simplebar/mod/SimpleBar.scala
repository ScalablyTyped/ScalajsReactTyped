package typingsJapgolly.simplebar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBar extends js.Object {
  def getContentElement(): Element
  def getScrollElement(): Element
  def recalculate(): Unit
}

object SimpleBar {
  @scala.inline
  def apply(
    getContentElement: CallbackTo[Element],
    getScrollElement: CallbackTo[Element],
    recalculate: Callback
  ): SimpleBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContentElement")(getContentElement.toJsFn)
    __obj.updateDynamic("getScrollElement")(getScrollElement.toJsFn)
    __obj.updateDynamic("recalculate")(recalculate.toJsFn)
    __obj.asInstanceOf[SimpleBar]
  }
}

