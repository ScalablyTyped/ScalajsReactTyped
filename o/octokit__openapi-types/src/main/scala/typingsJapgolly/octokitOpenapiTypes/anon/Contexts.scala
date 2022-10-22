package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contexts extends StObject {
  
  var checks: js.Array[Appid]
  
  /**
    * @example [
    *   "continuous-integration/travis-ci"
    * ]
    */
  var contexts: js.Array[String]
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks/contexts
    */
  var contexts_url: String
  
  /** @example true */
  var strict: Boolean
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks
    */
  var url: String
}
object Contexts {
  
  inline def apply(
    checks: js.Array[Appid],
    contexts: js.Array[String],
    contexts_url: String,
    strict: Boolean,
    url: String
  ): Contexts = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], contexts_url = contexts_url.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
  
  extension [Self <: Contexts](x: Self) {
    
    inline def setChecks(value: js.Array[Appid]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksVarargs(value: Appid*): Self = StObject.set(x, "checks", js.Array(value*))
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setContexts_url(value: String): Self = StObject.set(x, "contexts_url", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
