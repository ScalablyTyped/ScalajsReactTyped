package typingsJapgolly.reduxAuthWrapper.authWrapperMod

import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/authWrapper", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[OwnProps](config: AuthWrapperConfig): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
}

