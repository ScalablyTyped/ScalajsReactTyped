package typingsJapgolly.gsap.gsap

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenPlugin extends js.Object {
  def activate(plugins: js.Array[_]): Boolean
}

object TweenPlugin {
  @scala.inline
  def apply(activate: js.Array[js.Any] => CallbackTo[Boolean]): TweenPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: js.Array[js.Any]) => activate(t0).runNow()))
    __obj.asInstanceOf[TweenPlugin]
  }
}

