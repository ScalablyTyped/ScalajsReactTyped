package typingsJapgolly.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsJapgolly.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/authplus", JSImport.Namespace)
@js.native
object authplusMod extends js.Object {
  @js.native
  class AuthPlus () extends GoogleAuth {
    var Compute: Instantiable0[typingsJapgolly.googleAuthLibrary.mod.Compute] = js.native
    var JWT: Instantiable1[/* options */ JWTOptions, typingsJapgolly.googleAuthLibrary.mod.JWT] = js.native
    var OAuth2: TypeofOAuth2Client = js.native
  }
  
}

