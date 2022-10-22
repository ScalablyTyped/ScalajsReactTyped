package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathLanguageOwnerRepo extends StObject {
  
  /**
    * Gets a CodeQL database for a language in a repository.
    *
    * By default this endpoint returns JSON metadata about the CodeQL database. To
    * download the CodeQL database binary content, set the `Accept` header of the request
    * to [`application/zip`](https://docs.github.com/rest/overview/media-types), and make sure
    * your HTTP client is configured to follow redirects or use the `Location` header
    * to make a second request to get the redirect URL.
    *
    * For private repositories, you must use an access token with the `security_events` scope.
    * For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
    * GitHub Apps must have the `contents` read permission to use this endpoint.
    */
  var get: ParametersPathLanguageOwnerRepo
}
object GetParametersPathLanguageOwnerRepo {
  
  inline def apply(get: ParametersPathLanguageOwnerRepo): GetParametersPathLanguageOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathLanguageOwnerRepo]
  }
  
  extension [Self <: GetParametersPathLanguageOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathLanguageOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
