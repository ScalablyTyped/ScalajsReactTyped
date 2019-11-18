package typingsJapgolly.reactDashNavigation.reactDashNavigationMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProp[S] extends js.Object {
  var dispatch: NavigationDispatch
  var state: S
}

object NavigationProp {
  @scala.inline
  def apply[S](dispatch: /* action */ NavigationAction => CallbackTo[Boolean], state: S): NavigationProp[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationAction) => dispatch(t0).runNow()))
    __obj.asInstanceOf[NavigationProp[S]]
  }
}

