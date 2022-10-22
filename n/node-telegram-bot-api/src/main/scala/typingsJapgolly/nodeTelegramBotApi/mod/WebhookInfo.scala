package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookInfo extends StObject {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  
  var has_custom_certificate: Boolean
  
  var ip_address: js.UndefOr[String] = js.undefined
  
  var last_error_date: js.UndefOr[Double] = js.undefined
  
  var last_error_message: js.UndefOr[String] = js.undefined
  
  var last_synchronization_error_date: js.UndefOr[Double] = js.undefined
  
  var max_connections: js.UndefOr[Double] = js.undefined
  
  var pending_update_count: Double
  
  var url: String
}
object WebhookInfo {
  
  inline def apply(has_custom_certificate: Boolean, pending_update_count: Double, url: String): WebhookInfo = {
    val __obj = js.Dynamic.literal(has_custom_certificate = has_custom_certificate.asInstanceOf[js.Any], pending_update_count = pending_update_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
  
  extension [Self <: WebhookInfo](x: Self) {
    
    inline def setAllowed_updates(value: js.Array[String]): Self = StObject.set(x, "allowed_updates", value.asInstanceOf[js.Any])
    
    inline def setAllowed_updatesUndefined: Self = StObject.set(x, "allowed_updates", js.undefined)
    
    inline def setAllowed_updatesVarargs(value: String*): Self = StObject.set(x, "allowed_updates", js.Array(value*))
    
    inline def setHas_custom_certificate(value: Boolean): Self = StObject.set(x, "has_custom_certificate", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
    
    inline def setLast_error_date(value: Double): Self = StObject.set(x, "last_error_date", value.asInstanceOf[js.Any])
    
    inline def setLast_error_dateUndefined: Self = StObject.set(x, "last_error_date", js.undefined)
    
    inline def setLast_error_message(value: String): Self = StObject.set(x, "last_error_message", value.asInstanceOf[js.Any])
    
    inline def setLast_error_messageUndefined: Self = StObject.set(x, "last_error_message", js.undefined)
    
    inline def setLast_synchronization_error_date(value: Double): Self = StObject.set(x, "last_synchronization_error_date", value.asInstanceOf[js.Any])
    
    inline def setLast_synchronization_error_dateUndefined: Self = StObject.set(x, "last_synchronization_error_date", js.undefined)
    
    inline def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
    
    inline def setMax_connectionsUndefined: Self = StObject.set(x, "max_connections", js.undefined)
    
    inline def setPending_update_count(value: Double): Self = StObject.set(x, "pending_update_count", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
