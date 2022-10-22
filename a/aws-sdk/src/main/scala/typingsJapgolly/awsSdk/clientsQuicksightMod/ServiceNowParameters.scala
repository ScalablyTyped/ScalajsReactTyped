package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowParameters extends StObject {
  
  /**
    * URL of the base site.
    */
  var SiteBaseUrl: typingsJapgolly.awsSdk.clientsQuicksightMod.SiteBaseUrl
}
object ServiceNowParameters {
  
  inline def apply(SiteBaseUrl: SiteBaseUrl): ServiceNowParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowParameters]
  }
  
  extension [Self <: ServiceNowParameters](x: Self) {
    
    inline def setSiteBaseUrl(value: SiteBaseUrl): Self = StObject.set(x, "SiteBaseUrl", value.asInstanceOf[js.Any])
  }
}
