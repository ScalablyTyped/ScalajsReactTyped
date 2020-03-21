package typingsJapgolly.reduxAuthWrapper.redirectMod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", "connectedRouterRedirect")
@js.native
object connectedRouterRedirect extends js.Object {
  def apply[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
}

