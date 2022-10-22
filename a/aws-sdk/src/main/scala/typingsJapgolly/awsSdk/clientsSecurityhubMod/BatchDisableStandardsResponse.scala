package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisableStandardsResponse extends StObject {
  
  /**
    * The details of the standards subscriptions that were disabled.
    */
  var StandardsSubscriptions: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.StandardsSubscriptions] = js.undefined
}
object BatchDisableStandardsResponse {
  
  inline def apply(): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
  
  extension [Self <: BatchDisableStandardsResponse](x: Self) {
    
    inline def setStandardsSubscriptions(value: StandardsSubscriptions): Self = StObject.set(x, "StandardsSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setStandardsSubscriptionsUndefined: Self = StObject.set(x, "StandardsSubscriptions", js.undefined)
    
    inline def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = StObject.set(x, "StandardsSubscriptions", js.Array(value*))
  }
}
