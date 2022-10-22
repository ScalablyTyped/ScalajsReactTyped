package typingsJapgolly.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClaimsRequestKeys extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "ClaimsRequestKeys")
@js.native
object ClaimsRequestKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ClaimsRequestKeys & String] = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN
    extends StObject
       with ClaimsRequestKeys
  /* "access_token" */ val ACCESS_TOKEN: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.ClaimsRequestKeys.ACCESS_TOKEN & String = js.native
  
  @js.native
  sealed trait XMS_CC
    extends StObject
       with ClaimsRequestKeys
  /* "xms_cc" */ val XMS_CC: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.ClaimsRequestKeys.XMS_CC & String = js.native
}
