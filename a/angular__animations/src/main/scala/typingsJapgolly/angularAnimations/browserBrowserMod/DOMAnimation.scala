package typingsJapgolly.angularAnimations.browserBrowserMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DOMAnimation represents the Animation Web API.
  *
  * It is an external API by the browser, and must thus use "declare interface",
  * to prevent renaming by Closure Compiler.
  *
  * @see https://developer.mozilla.org/de/docs/Web/API/Animation
  */
trait DOMAnimation extends js.Object {
  var currentTime: Double
  var onfinish: js.Function
  var position: Double
  def addEventListener(eventName: String, handler: js.Function1[/* event */ js.Any, _]): js.Any
  def cancel(): Unit
  def dispatchEvent(eventName: String): js.Any
  def finish(): Unit
  def pause(): Unit
  def play(): Unit
}

object DOMAnimation {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ js.Any, js.Any]) => CallbackTo[js.Any],
    cancel: Callback,
    currentTime: Double,
    dispatchEvent: String => CallbackTo[js.Any],
    finish: Callback,
    onfinish: js.Function,
    pause: Callback,
    play: Callback,
    position: Double
  ): DOMAnimation = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], onfinish = onfinish.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* event */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: java.lang.String) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("finish")(finish.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.asInstanceOf[DOMAnimation]
  }
}

