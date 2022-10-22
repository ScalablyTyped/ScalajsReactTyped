package typingsJapgolly.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayAuditConfig extends StObject {
  
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[ApigatewayAuditLogConfig]] = js.undefined
  
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all
    * services.
    */
  var service: js.UndefOr[String] = js.undefined
}
object ApigatewayAuditConfig {
  
  inline def apply(): ApigatewayAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayAuditConfig]
  }
  
  extension [Self <: ApigatewayAuditConfig](x: Self) {
    
    inline def setAuditLogConfigs(value: js.Array[ApigatewayAuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
    
    inline def setAuditLogConfigsVarargs(value: ApigatewayAuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
