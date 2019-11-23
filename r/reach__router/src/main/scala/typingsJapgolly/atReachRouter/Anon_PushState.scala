package typingsJapgolly.atReachRouter

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushState extends js.Object {
  val state: js.Any
  def pushState(state: js.Any, title: String, uri: String): Unit
  def replaceState(state: js.Any, title: String, uri: String): Unit
}

object Anon_PushState {
  @scala.inline
  def apply(
    pushState: (js.Any, String, String) => Callback,
    replaceState: (js.Any, String, String) => Callback,
    state: js.Any
  ): Anon_PushState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("pushState")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: java.lang.String) => pushState(t0, t1, t2).runNow()))
    __obj.updateDynamic("replaceState")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: java.lang.String) => replaceState(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon_PushState]
  }
}

