package typingsJapgolly.reduxAuthWrapper

import typingsJapgolly.reduxAuthWrapper.authWrapperMod.AuthWrapperConfig
import typingsJapgolly.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typingsJapgolly.reduxAuthWrapper.mod.AuthBaseConfig
import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
@js.native
object connectedAuthWrapperMod extends js.Object {
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}

