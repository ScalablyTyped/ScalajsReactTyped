package typingsJapgolly.pulumiKubernetes.typesOutputMod.authorization.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourceRule holds information that describes a rule for the non-resource
  */
trait NonResourceRulePatch extends StObject {
  
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
    */
  var nonResourceURLs: js.Array[String]
  
  /**
    * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
    */
  var verbs: js.Array[String]
}
object NonResourceRulePatch {
  
  inline def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourceRulePatch = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceRulePatch]
  }
  
  extension [Self <: NonResourceRulePatch](x: Self) {
    
    inline def setNonResourceURLs(value: js.Array[String]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
    
    inline def setNonResourceURLsVarargs(value: String*): Self = StObject.set(x, "nonResourceURLs", js.Array(value*))
    
    inline def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value*))
  }
}
