package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryRefSarifid extends StObject {
  
  /**
    * Lists the details of all code scanning analyses for a repository,
    * starting with the most recent.
    * The response is paginated and you can use the `page` and `per_page` parameters
    * to list the analyses you're interested in.
    * By default 30 analyses are listed per page.
    *
    * The `rules_count` field in the response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * **Deprecation notice**:
    * The `tool_name` field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the `tool` field.
    */
  var get: ParametersQueryRefSarifid
}
object GetParametersQueryRefSarifid {
  
  inline def apply(get: ParametersQueryRefSarifid): GetParametersQueryRefSarifid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryRefSarifid]
  }
  
  extension [Self <: GetParametersQueryRefSarifid](x: Self) {
    
    inline def setGet(value: ParametersQueryRefSarifid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
