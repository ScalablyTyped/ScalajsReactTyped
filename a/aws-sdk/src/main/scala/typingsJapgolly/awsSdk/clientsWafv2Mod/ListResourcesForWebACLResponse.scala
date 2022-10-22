package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForWebACLResponse extends StObject {
  
  /**
    * The array of Amazon Resource Names (ARNs) of the associated resources.
    */
  var ResourceArns: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.ResourceArns] = js.undefined
}
object ListResourcesForWebACLResponse {
  
  inline def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  
  extension [Self <: ListResourcesForWebACLResponse](x: Self) {
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
  }
}
