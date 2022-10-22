package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content367 extends StObject {
  
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  var get: Responses200Content367
}
object GetResponses200Content367 {
  
  inline def apply(get: Responses200Content367): GetResponses200Content367 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content367]
  }
  
  extension [Self <: GetResponses200Content367](x: Self) {
    
    inline def setGet(value: Responses200Content367): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
