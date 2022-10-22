package typingsJapgolly.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintPolicyRequest extends StObject {
  
  /** google.iam.v1.Binding.condition object to be linted. */
  var condition: js.UndefOr[Expr] = js.undefined
  
  /**
    * The full resource name of the policy this lint request is about. The name follows the Google Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project`
    * will be named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not used to read the policy instance from the Cloud IAM database. The candidate
    * policy for lint has to be provided in the same request object.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
}
object LintPolicyRequest {
  
  inline def apply(): LintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintPolicyRequest]
  }
  
  extension [Self <: LintPolicyRequest](x: Self) {
    
    inline def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
