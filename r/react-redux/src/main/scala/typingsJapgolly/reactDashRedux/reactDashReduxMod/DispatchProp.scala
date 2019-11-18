package typingsJapgolly.reactDashRedux.reactDashReduxMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.reduxMod.Action
import typingsJapgolly.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchProp[A /* <: Action[_] */] extends js.Object {
  var dispatch: Dispatch[A]
}

object DispatchProp {
  @scala.inline
  def apply[A /* <: Action[_] */](dispatch: A => CallbackTo[A]): DispatchProp[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: A) => dispatch(t0).runNow()))
    __obj.asInstanceOf[DispatchProp[A]]
  }
}

