package typingsJapgolly.reduxAuthWrapper.redirectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reduxAuthWrapper.mod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOnEnterConfig[State] extends AuthConfig {
  var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.undefined
  var authenticatedSelector: StateMutateSelector[State, Boolean]
  var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.undefined
  var redirectPath: String | (StateMutateSelector[State, String])
  var redirectQueryParamName: js.UndefOr[String] = js.undefined
}

object CreateOnEnterConfig {
  @scala.inline
  def apply[State](
    authenticatedSelector: (State, State) => CallbackTo[Boolean],
    redirectPath: String | (StateMutateSelector[State, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateMutateSelector[State, Boolean]) = null,
    authenticatingSelector: (State, State) => CallbackTo[Boolean] = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): CreateOnEnterConfig[State] = {
    val __obj = js.Dynamic.literal(redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.updateDynamic("authenticatedSelector")(js.Any.fromFunction2((t0: State, t1: State) => authenticatedSelector(t0, t1).runNow()))
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2((t0: State, t1: State) => authenticatingSelector(t0, t1).runNow()))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnEnterConfig[State]]
  }
}

