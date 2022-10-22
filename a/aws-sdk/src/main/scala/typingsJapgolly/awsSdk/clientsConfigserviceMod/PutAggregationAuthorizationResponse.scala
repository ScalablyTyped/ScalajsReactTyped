package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAggregationAuthorizationResponse extends StObject {
  
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.AggregationAuthorization] = js.undefined
}
object PutAggregationAuthorizationResponse {
  
  inline def apply(): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
  
  extension [Self <: PutAggregationAuthorizationResponse](x: Self) {
    
    inline def setAggregationAuthorization(value: AggregationAuthorization): Self = StObject.set(x, "AggregationAuthorization", value.asInstanceOf[js.Any])
    
    inline def setAggregationAuthorizationUndefined: Self = StObject.set(x, "AggregationAuthorization", js.undefined)
  }
}
