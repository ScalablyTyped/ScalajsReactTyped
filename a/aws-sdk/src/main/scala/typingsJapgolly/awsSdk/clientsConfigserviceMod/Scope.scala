package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    * The ID of the only Amazon Web Services resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
    */
  var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The resource types of only those Amazon Web Services resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
    */
  var ComplianceResourceTypes: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ComplianceResourceTypes] = js.undefined
  
  /**
    * The tag key that is applied to only those Amazon Web Services resources that you want to trigger an evaluation for the rule.
    */
  var TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined
  
  /**
    * The tag value applied to only those Amazon Web Services resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
    */
  var TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object Scope {
  
  inline def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setComplianceResourceId(value: BaseResourceId): Self = StObject.set(x, "ComplianceResourceId", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceIdUndefined: Self = StObject.set(x, "ComplianceResourceId", js.undefined)
    
    inline def setComplianceResourceTypes(value: ComplianceResourceTypes): Self = StObject.set(x, "ComplianceResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceTypesUndefined: Self = StObject.set(x, "ComplianceResourceTypes", js.undefined)
    
    inline def setComplianceResourceTypesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ComplianceResourceTypes", js.Array(value*))
    
    inline def setTagKey(value: StringWithCharLimit128): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTagValue(value: StringWithCharLimit256): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "TagValue", js.undefined)
  }
}
