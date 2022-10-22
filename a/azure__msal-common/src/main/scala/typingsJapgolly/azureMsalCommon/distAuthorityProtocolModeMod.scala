package typingsJapgolly.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityProtocolModeMod {
  
  @js.native
  sealed trait ProtocolMode extends StObject
  @JSImport("@azure/msal-common/dist/authority/ProtocolMode", "ProtocolMode")
  @js.native
  object ProtocolMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProtocolMode & String] = js.native
    
    @js.native
    sealed trait AAD
      extends StObject
         with ProtocolMode
    /* "AAD" */ val AAD: typingsJapgolly.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode.AAD & String = js.native
    
    @js.native
    sealed trait OIDC
      extends StObject
         with ProtocolMode
    /* "OIDC" */ val OIDC: typingsJapgolly.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode.OIDC & String = js.native
  }
}
