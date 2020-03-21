package typingsJapgolly.fancybox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxFullScreen extends js.Object {
  def enabled(): Boolean
  def exit(): Unit
  def isFullscreen(): Boolean
  def request(elem: HTMLElement): Unit
  def toggle(elem: HTMLElement): Unit
}

object FancyBoxFullScreen {
  @scala.inline
  def apply(
    enabled: CallbackTo[Boolean],
    exit: Callback,
    isFullscreen: CallbackTo[Boolean],
    request: HTMLElement => Callback,
    toggle: HTMLElement => Callback
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled.toJsFn)
    __obj.updateDynamic("exit")(exit.toJsFn)
    __obj.updateDynamic("isFullscreen")(isFullscreen.toJsFn)
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => request(t0).runNow()))
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => toggle(t0).runNow()))
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
}

