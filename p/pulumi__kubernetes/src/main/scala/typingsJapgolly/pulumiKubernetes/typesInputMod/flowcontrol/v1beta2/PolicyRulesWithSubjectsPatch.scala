package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
  */
trait PolicyRulesWithSubjectsPatch extends StObject {
  
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.UndefOr[Input[js.Array[Input[NonResourcePolicyRulePatch]]]] = js.undefined
  
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.UndefOr[Input[js.Array[Input[ResourcePolicyRulePatch]]]] = js.undefined
  
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: js.UndefOr[Input[js.Array[Input[SubjectPatch]]]] = js.undefined
}
object PolicyRulesWithSubjectsPatch {
  
  inline def apply(): PolicyRulesWithSubjectsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRulesWithSubjectsPatch]
  }
  
  extension [Self <: PolicyRulesWithSubjectsPatch](x: Self) {
    
    inline def setNonResourceRules(value: Input[js.Array[Input[NonResourcePolicyRulePatch]]]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
    
    inline def setNonResourceRulesUndefined: Self = StObject.set(x, "nonResourceRules", js.undefined)
    
    inline def setNonResourceRulesVarargs(value: Input[NonResourcePolicyRulePatch]*): Self = StObject.set(x, "nonResourceRules", js.Array(value*))
    
    inline def setResourceRules(value: Input[js.Array[Input[ResourcePolicyRulePatch]]]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
    
    inline def setResourceRulesUndefined: Self = StObject.set(x, "resourceRules", js.undefined)
    
    inline def setResourceRulesVarargs(value: Input[ResourcePolicyRulePatch]*): Self = StObject.set(x, "resourceRules", js.Array(value*))
    
    inline def setSubjects(value: Input[js.Array[Input[SubjectPatch]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: Input[SubjectPatch]*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
