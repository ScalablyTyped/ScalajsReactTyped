package typingsJapgolly.reduxAuthWrapper.history4RedirectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxAuthWrapper.mod.StateSelector
import typingsJapgolly.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedReduxRedirectConfig[OwnProps, State] extends ConnectedRouterRedirectConfig[OwnProps, State] {
  @JSName("redirectAction")
  def redirectAction_MConnectedReduxRedirectConfig(location: Location[LocationState]): Action[_]
}

object ConnectedReduxRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => CallbackTo[Boolean],
    redirectAction: Location[LocationState] => CallbackTo[Action[js.Any]],
    redirectPath: String | (StateSelector[State, OwnProps, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateSelector[State, OwnProps, Boolean]) = null,
    authenticatingSelector: (State, OwnProps) => CallbackTo[Boolean] = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): ConnectedReduxRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.updateDynamic("authenticatedSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatedSelector(t0, t1).runNow()))
    __obj.updateDynamic("redirectAction")(js.Any.fromFunction1((t0: typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]) => redirectAction(t0).runNow()))
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatingSelector(t0, t1).runNow()))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
  }
}

