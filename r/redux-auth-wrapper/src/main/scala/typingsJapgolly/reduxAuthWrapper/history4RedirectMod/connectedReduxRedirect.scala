package typingsJapgolly.reduxAuthWrapper.history4RedirectMod

import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsJapgolly.reduxAuthWrapper.redirectMod.InjectedAuthReduxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history4/redirect", "connectedReduxRedirect")
@js.native
object connectedReduxRedirect extends js.Object {
  def apply[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
}

