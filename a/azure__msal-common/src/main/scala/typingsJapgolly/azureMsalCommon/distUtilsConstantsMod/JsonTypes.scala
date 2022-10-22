package typingsJapgolly.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsonTypes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "JsonTypes")
@js.native
object JsonTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JsonTypes & String] = js.native
  
  @js.native
  sealed trait Jwk
    extends StObject
       with JsonTypes
  /* "JWK" */ val Jwk: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.JsonTypes.Jwk & String = js.native
  
  @js.native
  sealed trait Jwt
    extends StObject
       with JsonTypes
  /* "JWT" */ val Jwt: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.JsonTypes.Jwt & String = js.native
}
