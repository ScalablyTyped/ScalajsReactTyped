package typingsJapgolly.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceQuotaRequest extends StObject {
  
  /**
    * The quota identifier.
    */
  var QuotaCode: typingsJapgolly.awsSdk.clientsServicequotasMod.QuotaCode
  
  /**
    * The service identifier.
    */
  var ServiceCode: typingsJapgolly.awsSdk.clientsServicequotasMod.ServiceCode
}
object GetServiceQuotaRequest {
  
  inline def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaRequest]
  }
  
  extension [Self <: GetServiceQuotaRequest](x: Self) {
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
