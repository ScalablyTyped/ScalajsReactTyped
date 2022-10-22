package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLineageGroupPolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.LineageGroupArn] = js.undefined
  
  /**
    * The resource policy that gives access to the lineage group in another account.
    */
  var ResourcePolicy: js.UndefOr[ResourcePolicyString] = js.undefined
}
object GetLineageGroupPolicyResponse {
  
  inline def apply(): GetLineageGroupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLineageGroupPolicyResponse]
  }
  
  extension [Self <: GetLineageGroupPolicyResponse](x: Self) {
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setResourcePolicy(value: ResourcePolicyString): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
