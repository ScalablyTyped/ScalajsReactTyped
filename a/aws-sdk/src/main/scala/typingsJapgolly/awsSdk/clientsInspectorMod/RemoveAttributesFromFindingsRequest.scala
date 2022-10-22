package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesFromFindingsRequest extends StObject {
  
  /**
    * The array of attribute keys that you want to remove from specified findings.
    */
  var attributeKeys: UserAttributeKeyList
  
  /**
    * The ARNs that specify the findings that you want to remove attributes from.
    */
  var findingArns: AddRemoveAttributesFindingArnList
}
object RemoveAttributesFromFindingsRequest {
  
  inline def apply(attributeKeys: UserAttributeKeyList, findingArns: AddRemoveAttributesFindingArnList): RemoveAttributesFromFindingsRequest = {
    val __obj = js.Dynamic.literal(attributeKeys = attributeKeys.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsRequest]
  }
  
  extension [Self <: RemoveAttributesFromFindingsRequest](x: Self) {
    
    inline def setAttributeKeys(value: UserAttributeKeyList): Self = StObject.set(x, "attributeKeys", value.asInstanceOf[js.Any])
    
    inline def setAttributeKeysVarargs(value: AttributeKey*): Self = StObject.set(x, "attributeKeys", js.Array(value*))
    
    inline def setFindingArns(value: AddRemoveAttributesFindingArnList): Self = StObject.set(x, "findingArns", value.asInstanceOf[js.Any])
    
    inline def setFindingArnsVarargs(value: Arn*): Self = StObject.set(x, "findingArns", js.Array(value*))
  }
}
