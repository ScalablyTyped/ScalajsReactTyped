package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath300QueryToolname extends StObject {
  
  /**
    * Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    */
  var get: ParametersPath300QueryToolname
}
object GetParametersPath300QueryToolname {
  
  inline def apply(get: ParametersPath300QueryToolname): GetParametersPath300QueryToolname = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath300QueryToolname]
  }
  
  extension [Self <: GetParametersPath300QueryToolname](x: Self) {
    
    inline def setGet(value: ParametersPath300QueryToolname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
