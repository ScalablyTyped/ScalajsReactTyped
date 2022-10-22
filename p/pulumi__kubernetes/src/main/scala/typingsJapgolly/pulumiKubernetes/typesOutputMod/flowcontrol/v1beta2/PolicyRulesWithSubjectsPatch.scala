package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta2

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
  var nonResourceRules: js.Array[NonResourcePolicyRulePatch]
  
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.Array[ResourcePolicyRulePatch]
  
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: js.Array[SubjectPatch]
}
object PolicyRulesWithSubjectsPatch {
  
  inline def apply(
    nonResourceRules: js.Array[NonResourcePolicyRulePatch],
    resourceRules: js.Array[ResourcePolicyRulePatch],
    subjects: js.Array[SubjectPatch]
  ): PolicyRulesWithSubjectsPatch = {
    val __obj = js.Dynamic.literal(nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRulesWithSubjectsPatch]
  }
  
  extension [Self <: PolicyRulesWithSubjectsPatch](x: Self) {
    
    inline def setNonResourceRules(value: js.Array[NonResourcePolicyRulePatch]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
    
    inline def setNonResourceRulesVarargs(value: NonResourcePolicyRulePatch*): Self = StObject.set(x, "nonResourceRules", js.Array(value*))
    
    inline def setResourceRules(value: js.Array[ResourcePolicyRulePatch]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
    
    inline def setResourceRulesVarargs(value: ResourcePolicyRulePatch*): Self = StObject.set(x, "resourceRules", js.Array(value*))
    
    inline def setSubjects(value: js.Array[SubjectPatch]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsVarargs(value: SubjectPatch*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
