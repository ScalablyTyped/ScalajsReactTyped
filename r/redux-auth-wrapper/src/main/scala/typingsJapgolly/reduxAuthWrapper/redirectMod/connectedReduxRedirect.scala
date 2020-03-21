package typingsJapgolly.reduxAuthWrapper.redirectMod

import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", "connectedReduxRedirect")
@js.native
object connectedReduxRedirect extends js.Object {
  def apply[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
}

