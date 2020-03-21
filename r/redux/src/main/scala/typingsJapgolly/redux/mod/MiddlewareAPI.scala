package typingsJapgolly.redux.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends js.Object {
  var dispatch: D
  def getState(): S
}

object MiddlewareAPI {
  @scala.inline
  def apply[D /* <: Dispatch[AnyAction] */, S](dispatch: D, getState: CallbackTo[S]): MiddlewareAPI[D, S] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.asInstanceOf[MiddlewareAPI[D, S]]
  }
}

