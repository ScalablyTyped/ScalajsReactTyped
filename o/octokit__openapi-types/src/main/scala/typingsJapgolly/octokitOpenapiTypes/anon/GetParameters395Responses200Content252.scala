package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters395Responses200Content252 extends StObject {
  
  /**
    * Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var get: Parameters395Responses200Content252
  
  /**
    * Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * If the repository belongs to an organization or enterprise that has `selected` actions and reusable workflows set at the organization or enterprise levels, then you cannot override any of the allowed actions and reusable workflows settings.
    *
    * To use the `patterns_allowed` setting for private repositories, the repository must belong to an enterprise. If the repository does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var put: Parameters395RequestBodyContent252
}
object GetParameters395Responses200Content252 {
  
  inline def apply(get: Parameters395Responses200Content252, put: Parameters395RequestBodyContent252): GetParameters395Responses200Content252 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters395Responses200Content252]
  }
  
  extension [Self <: GetParameters395Responses200Content252](x: Self) {
    
    inline def setGet(value: Parameters395Responses200Content252): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters395RequestBodyContent252): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
