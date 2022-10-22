package typingsJapgolly.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureAuthorityHosts extends StObject
@JSImport("@azure/identity", "AzureAuthorityHosts")
@js.native
object AzureAuthorityHosts extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AzureAuthorityHosts & String] = js.native
  
  /**
    * China-based Azure Authority Host
    */
  @js.native
  sealed trait AzureChina
    extends StObject
       with AzureAuthorityHosts
  /* "https://login.chinacloudapi.cn" */ val AzureChina: typingsJapgolly.azureIdentity.mod.AzureAuthorityHosts.AzureChina & String = js.native
  
  /**
    * Germany-based Azure Authority Host
    */
  @js.native
  sealed trait AzureGermany
    extends StObject
       with AzureAuthorityHosts
  /* "https://login.microsoftonline.de" */ val AzureGermany: typingsJapgolly.azureIdentity.mod.AzureAuthorityHosts.AzureGermany & String = js.native
  
  /**
    * US Government Azure Authority Host
    */
  @js.native
  sealed trait AzureGovernment
    extends StObject
       with AzureAuthorityHosts
  /* "https://login.microsoftonline.us" */ val AzureGovernment: typingsJapgolly.azureIdentity.mod.AzureAuthorityHosts.AzureGovernment & String = js.native
  
  /**
    * Public Cloud Azure Authority Host
    */
  @js.native
  sealed trait AzurePublicCloud
    extends StObject
       with AzureAuthorityHosts
  /* "https://login.microsoftonline.com" */ val AzurePublicCloud: typingsJapgolly.azureIdentity.mod.AzureAuthorityHosts.AzurePublicCloud & String = js.native
}
