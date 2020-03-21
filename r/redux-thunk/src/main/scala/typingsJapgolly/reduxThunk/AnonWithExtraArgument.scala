package typingsJapgolly.reduxThunk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.reduxThunk.mod.ThunkMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWithExtraArgument extends js.Object {
  def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E]
}

object AnonWithExtraArgument {
  @scala.inline
  def apply(withExtraArgument: js.Any => CallbackTo[ThunkMiddleware[js.Object, AnyAction, js.Any]]): AnonWithExtraArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withExtraArgument")(js.Any.fromFunction1((t0: js.Any) => withExtraArgument(t0).runNow()))
    __obj.asInstanceOf[AnonWithExtraArgument]
  }
}

