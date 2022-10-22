package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRuleGroupLimitExceededViolation extends StObject {
  
  /**
    * The number of rule groups currently associated with the VPC. 
    */
  var NumberOfRuleGroupsAlreadyAssociated: js.UndefOr[BasicInteger] = js.undefined
  
  /**
    * Information about the VPC ID. 
    */
  var ViolationTarget: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
  
  /**
    * A description of the violation that specifies the rule group and VPC.
    */
  var ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
}
object DnsRuleGroupLimitExceededViolation {
  
  inline def apply(): DnsRuleGroupLimitExceededViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRuleGroupLimitExceededViolation]
  }
  
  extension [Self <: DnsRuleGroupLimitExceededViolation](x: Self) {
    
    inline def setNumberOfRuleGroupsAlreadyAssociated(value: BasicInteger): Self = StObject.set(x, "NumberOfRuleGroupsAlreadyAssociated", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRuleGroupsAlreadyAssociatedUndefined: Self = StObject.set(x, "NumberOfRuleGroupsAlreadyAssociated", js.undefined)
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescription(value: LengthBoundedString): Self = StObject.set(x, "ViolationTargetDescription", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescriptionUndefined: Self = StObject.set(x, "ViolationTargetDescription", js.undefined)
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
