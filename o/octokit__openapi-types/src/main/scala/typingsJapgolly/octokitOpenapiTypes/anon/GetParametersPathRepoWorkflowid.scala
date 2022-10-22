package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoWorkflowid extends StObject {
  
  /** Gets a specific workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathRepoWorkflowid
}
object GetParametersPathRepoWorkflowid {
  
  inline def apply(get: ParametersPathRepoWorkflowid): GetParametersPathRepoWorkflowid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoWorkflowid]
  }
  
  extension [Self <: GetParametersPathRepoWorkflowid](x: Self) {
    
    inline def setGet(value: ParametersPathRepoWorkflowid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
