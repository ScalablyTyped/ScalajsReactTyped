package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApprovalRuleTemplateInput extends StObject {
  
  /**
    * The name of the approval rule template for which you want to get information.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
}
object GetApprovalRuleTemplateInput {
  
  inline def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): GetApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApprovalRuleTemplateInput]
  }
  
  extension [Self <: GetApprovalRuleTemplateInput](x: Self) {
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
