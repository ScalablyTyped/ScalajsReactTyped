package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationManagedRuleMetadata extends StObject {
  
  /**
    * The description that you provide for your organization Config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined
  
  /**
    * A string, in JSON format, that is passed to your organization Config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined
  
  /**
    * The maximum frequency with which Config runs evaluations for a rule. This is for an Config managed rule that is triggered at a periodic frequency.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.MaximumExecutionFrequency] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ResourceTypesScope] = js.undefined
  
  /**
    * For organization config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using Config managed rules.
    */
  var RuleIdentifier: StringWithCharLimit256
  
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined
  
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object OrganizationManagedRuleMetadata {
  
  inline def apply(RuleIdentifier: StringWithCharLimit256): OrganizationManagedRuleMetadata = {
    val __obj = js.Dynamic.literal(RuleIdentifier = RuleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationManagedRuleMetadata]
  }
  
  extension [Self <: OrganizationManagedRuleMetadata](x: Self) {
    
    inline def setDescription(value: StringWithCharLimit256Min0): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInputParameters(value: StringWithCharLimit2048): Self = StObject.set(x, "InputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "InputParameters", js.undefined)
    
    inline def setMaximumExecutionFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "MaximumExecutionFrequency", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "MaximumExecutionFrequency", js.undefined)
    
    inline def setResourceIdScope(value: StringWithCharLimit768): Self = StObject.set(x, "ResourceIdScope", value.asInstanceOf[js.Any])
    
    inline def setResourceIdScopeUndefined: Self = StObject.set(x, "ResourceIdScope", js.undefined)
    
    inline def setResourceTypesScope(value: ResourceTypesScope): Self = StObject.set(x, "ResourceTypesScope", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesScopeUndefined: Self = StObject.set(x, "ResourceTypesScope", js.undefined)
    
    inline def setResourceTypesScopeVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceTypesScope", js.Array(value*))
    
    inline def setRuleIdentifier(value: StringWithCharLimit256): Self = StObject.set(x, "RuleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTagKeyScope(value: StringWithCharLimit128): Self = StObject.set(x, "TagKeyScope", value.asInstanceOf[js.Any])
    
    inline def setTagKeyScopeUndefined: Self = StObject.set(x, "TagKeyScope", js.undefined)
    
    inline def setTagValueScope(value: StringWithCharLimit256): Self = StObject.set(x, "TagValueScope", value.asInstanceOf[js.Any])
    
    inline def setTagValueScopeUndefined: Self = StObject.set(x, "TagValueScope", js.undefined)
  }
}
