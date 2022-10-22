package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserEndpointResponse extends StObject {
  
  /**
    * The full details of an AppInstanceUserEndpoint: the AppInstanceUserArn, ID, name, type, resource ARN, attributes, allow messages, state, and created and last updated timestamps. All timestamps use epoch milliseconds.
    */
  var AppInstanceUserEndpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.AppInstanceUserEndpoint] = js.undefined
}
object DescribeAppInstanceUserEndpointResponse {
  
  inline def apply(): DescribeAppInstanceUserEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceUserEndpointResponse]
  }
  
  extension [Self <: DescribeAppInstanceUserEndpointResponse](x: Self) {
    
    inline def setAppInstanceUserEndpoint(value: AppInstanceUserEndpoint): Self = StObject.set(x, "AppInstanceUserEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserEndpointUndefined: Self = StObject.set(x, "AppInstanceUserEndpoint", js.undefined)
  }
}
