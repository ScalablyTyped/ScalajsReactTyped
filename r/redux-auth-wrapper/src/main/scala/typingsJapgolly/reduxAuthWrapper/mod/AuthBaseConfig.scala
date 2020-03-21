package typingsJapgolly.reduxAuthWrapper.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  var authenticatedSelector: StateSelector[State, OwnProps, Boolean]
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.undefined
}

object AuthBaseConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => CallbackTo[Boolean],
    AuthenticatingComponent: ReactType[_] = null,
    authenticatingSelector: (State, OwnProps) => CallbackTo[Boolean] = null,
    wrapperDisplayName: String = null
  ): AuthBaseConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticatedSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatedSelector(t0, t1).runNow()))
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2((t0: State, t1: OwnProps) => authenticatingSelector(t0, t1).runNow()))
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
  }
}

