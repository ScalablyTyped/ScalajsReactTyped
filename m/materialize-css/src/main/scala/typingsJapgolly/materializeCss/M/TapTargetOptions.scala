package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapTargetOptions extends js.Object {
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(origin: Element): Unit
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(origin: Element): Unit
}

object TapTargetOptions {
  @scala.inline
  def apply(onClose: Element => Callback, onOpen: Element => Callback): TapTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onClose(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpen(t0).runNow()))
    __obj.asInstanceOf[TapTargetOptions]
  }
}

