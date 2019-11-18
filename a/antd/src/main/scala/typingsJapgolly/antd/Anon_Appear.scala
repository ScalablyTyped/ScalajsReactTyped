package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appear extends js.Object {
  def appear(): Unit
  def enter(node: HTMLElement, done: js.Function0[Unit]): js.Any
  def leave(node: HTMLElement, done: js.Function0[Unit]): js.Any
}

object Anon_Appear {
  @scala.inline
  def apply(
    appear: Callback,
    enter: (HTMLElement, js.Function0[Unit]) => CallbackTo[js.Any],
    leave: (HTMLElement, js.Function0[Unit]) => CallbackTo[js.Any]
  ): Anon_Appear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appear")(appear.toJsFn)
    __obj.updateDynamic("enter")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Function0[scala.Unit]) => enter(t0, t1).runNow()))
    __obj.updateDynamic("leave")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Function0[scala.Unit]) => leave(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_Appear]
  }
}

