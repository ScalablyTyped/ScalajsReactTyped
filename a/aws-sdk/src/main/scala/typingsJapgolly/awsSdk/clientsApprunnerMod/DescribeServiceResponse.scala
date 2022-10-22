package typingsJapgolly.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceResponse extends StObject {
  
  /**
    * A full description of the App Runner service that you specified in this request.
    */
  var Service: typingsJapgolly.awsSdk.clientsApprunnerMod.Service
}
object DescribeServiceResponse {
  
  inline def apply(Service: Service): DescribeServiceResponse = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceResponse]
  }
  
  extension [Self <: DescribeServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
