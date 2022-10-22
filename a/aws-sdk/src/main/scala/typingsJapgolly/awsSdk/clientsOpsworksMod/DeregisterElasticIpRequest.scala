package typingsJapgolly.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterElasticIpRequest extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
}
object DeregisterElasticIpRequest {
  
  inline def apply(ElasticIp: String): DeregisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterElasticIpRequest]
  }
  
  extension [Self <: DeregisterElasticIpRequest](x: Self) {
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
  }
}
