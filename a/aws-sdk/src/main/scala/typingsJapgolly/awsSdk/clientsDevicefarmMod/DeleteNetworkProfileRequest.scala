package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the network profile to delete.
    */
  var arn: AmazonResourceName
}
object DeleteNetworkProfileRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
  
  extension [Self <: DeleteNetworkProfileRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
