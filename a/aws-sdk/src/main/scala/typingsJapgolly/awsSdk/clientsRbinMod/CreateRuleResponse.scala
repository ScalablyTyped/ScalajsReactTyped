package typingsJapgolly.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleResponse extends StObject {
  
  /**
    * The retention rule description.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.Description] = js.undefined
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: js.UndefOr[RuleIdentifier] = js.undefined
  
  /**
    * Information about the resource tags used to identify resources that are retained by the retention rule.
    */
  var ResourceTags: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.ResourceTags] = js.undefined
  
  /**
    * The resource type retained by the retention rule.
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.ResourceType] = js.undefined
  
  var RetentionPeriod: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.RetentionPeriod] = js.undefined
  
  /**
    * The state of the retention rule. Only retention rules that are in the available state retain resources.
    */
  var Status: js.UndefOr[RuleStatus] = js.undefined
  
  /**
    * Information about the tags assigned to the retention rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRuleResponse {
  
  inline def apply(): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  extension [Self <: CreateRuleResponse](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setStatus(value: RuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
