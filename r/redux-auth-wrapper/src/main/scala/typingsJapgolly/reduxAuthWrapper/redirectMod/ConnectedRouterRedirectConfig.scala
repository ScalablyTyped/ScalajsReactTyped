package typingsJapgolly.reduxAuthWrapper.redirectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxAuthWrapper.mod.AuthBaseConfig
import typingsJapgolly.reduxAuthWrapper.mod.StateSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterRedirectConfig[OwnProps, State] extends AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.undefined
  var redirectAction: js.UndefOr[js.Function1[/* location */ Location[LocationState], Action[_]]] = js.undefined
  var redirectPath: String | (StateSelector[State, OwnProps, String])
  var redirectQueryParamName: js.UndefOr[String] = js.undefined
}

object ConnectedRouterRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => CallbackTo[Boolean],
    redirectPath: String | (StateSelector[State, OwnProps, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateSelector[State, OwnProps, Boolean]) = null,
    authenticatingSelector: (State, OwnProps) => CallbackTo[Boolean] = null,
    redirectAction: /* location */ Location[LocationState] => CallbackTo[Action[js.Any]] = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): ConnectedRouterRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.updateDynamic("authenticatedSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatedSelector(t0, t1).runNow()))
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatingSelector(t0, t1).runNow()))
    if (redirectAction != null) __obj.updateDynamic("redirectAction")(js.Any.fromFunction1((t0: /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]) => redirectAction(t0).runNow()))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
  }
}

