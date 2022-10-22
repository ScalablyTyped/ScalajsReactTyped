package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
  */
trait PolicyRulesWithSubjects extends StObject {
  
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.UndefOr[Input[js.Array[Input[NonResourcePolicyRule]]]] = js.undefined
  
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.UndefOr[Input[js.Array[Input[ResourcePolicyRule]]]] = js.undefined
  
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: Input[js.Array[Input[Subject]]]
}
object PolicyRulesWithSubjects {
  
  inline def apply(subjects: Input[js.Array[Input[Subject]]]): PolicyRulesWithSubjects = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRulesWithSubjects]
  }
  
  extension [Self <: PolicyRulesWithSubjects](x: Self) {
    
    inline def setNonResourceRules(value: Input[js.Array[Input[NonResourcePolicyRule]]]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
    
    inline def setNonResourceRulesUndefined: Self = StObject.set(x, "nonResourceRules", js.undefined)
    
    inline def setNonResourceRulesVarargs(value: Input[NonResourcePolicyRule]*): Self = StObject.set(x, "nonResourceRules", js.Array(value*))
    
    inline def setResourceRules(value: Input[js.Array[Input[ResourcePolicyRule]]]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
    
    inline def setResourceRulesUndefined: Self = StObject.set(x, "resourceRules", js.undefined)
    
    inline def setResourceRulesVarargs(value: Input[ResourcePolicyRule]*): Self = StObject.set(x, "resourceRules", js.Array(value*))
    
    inline def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsVarargs(value: Input[Subject]*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
