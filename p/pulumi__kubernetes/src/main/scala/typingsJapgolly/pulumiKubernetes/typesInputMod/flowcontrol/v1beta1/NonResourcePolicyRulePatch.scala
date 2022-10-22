package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
  */
trait NonResourcePolicyRulePatch extends StObject {
  
  /**
    * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
    *   - "/healthz" is legal
    *   - "/hea*" is illegal
    *   - "/hea" is legal but matches nothing
    *   - "/hea/ *" also matches nothing
    *   - "/healthz/ *" matches all per-component health checks.
    * "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
    */
  var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
    */
  var verbs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object NonResourcePolicyRulePatch {
  
  inline def apply(): NonResourcePolicyRulePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonResourcePolicyRulePatch]
  }
  
  extension [Self <: NonResourcePolicyRulePatch](x: Self) {
    
    inline def setNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
    
    inline def setNonResourceURLsUndefined: Self = StObject.set(x, "nonResourceURLs", js.undefined)
    
    inline def setNonResourceURLsVarargs(value: Input[String]*): Self = StObject.set(x, "nonResourceURLs", js.Array(value*))
    
    inline def setVerbs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsUndefined: Self = StObject.set(x, "verbs", js.undefined)
    
    inline def setVerbsVarargs(value: Input[String]*): Self = StObject.set(x, "verbs", js.Array(value*))
  }
}
