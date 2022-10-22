package typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSOProfileCreatedEvent extends StObject {
  
  /** sso profile name which got created */
  var inboundSsoProfileName: js.UndefOr[String] = js.undefined
}
object SSOProfileCreatedEvent {
  
  inline def apply(): SSOProfileCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSOProfileCreatedEvent]
  }
  
  extension [Self <: SSOProfileCreatedEvent](x: Self) {
    
    inline def setInboundSsoProfileName(value: String): Self = StObject.set(x, "inboundSsoProfileName", value.asInstanceOf[js.Any])
    
    inline def setInboundSsoProfileNameUndefined: Self = StObject.set(x, "inboundSsoProfileName", js.undefined)
  }
}
