package typingsJapgolly.reduxAuthWrapper.history4RedirectMod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsJapgolly.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import typingsJapgolly.reduxAuthWrapper.redirectMod.InjectedAuthRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history4/redirect", "connectedRouterRedirect")
@js.native
object connectedRouterRedirect extends js.Object {
  def apply[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
}

