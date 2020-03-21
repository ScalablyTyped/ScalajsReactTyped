package typingsJapgolly.wordpressData.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store[S, A /* <: AnyAction */] extends js.Object {
  var subscribe: Subscriber
  def dispatch(action: A): A
  def getState(): S
}

object Store {
  @scala.inline
  def apply[S, A /* <: AnyAction */](
    dispatch: A => CallbackTo[A],
    getState: CallbackTo[S],
    subscribe: /* callback */ js.Function0[Unit] => CallbackTo[js.Function0[Unit]]
  ): Store[S, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: A) => dispatch(t0).runNow()))
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Store[S, A]]
  }
}

