package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfSubjectRulesReviewSpecPatch extends StObject {
  
  /**
    * Namespace to evaluate rules for. Required.
    */
  var namespace: String
}
object SelfSubjectRulesReviewSpecPatch {
  
  inline def apply(namespace: String): SelfSubjectRulesReviewSpecPatch = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectRulesReviewSpecPatch]
  }
  
  extension [Self <: SelfSubjectRulesReviewSpecPatch](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
