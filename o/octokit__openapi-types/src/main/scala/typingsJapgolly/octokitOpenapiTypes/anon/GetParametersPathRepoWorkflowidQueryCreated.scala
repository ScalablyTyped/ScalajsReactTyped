package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoWorkflowidQueryCreated extends StObject {
  
  /**
    * List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  var get: ParametersPathRepoWorkflowidQueryCreated
}
object GetParametersPathRepoWorkflowidQueryCreated {
  
  inline def apply(get: ParametersPathRepoWorkflowidQueryCreated): GetParametersPathRepoWorkflowidQueryCreated = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoWorkflowidQueryCreated]
  }
  
  extension [Self <: GetParametersPathRepoWorkflowidQueryCreated](x: Self) {
    
    inline def setGet(value: ParametersPathRepoWorkflowidQueryCreated): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
