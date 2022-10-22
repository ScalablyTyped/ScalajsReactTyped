package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowspublicrepositoriesName extends StObject {
  
  /**
    * @description Whether the runner group can be used by `public` repositories.
    * @default false
    */
  var allows_public_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description Name of the runner group. */
  var name: String
  
  /**
    * @description If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.
    * @default false
    */
  var restricted_to_workflows: js.UndefOr[Boolean] = js.undefined
  
  /** @description List of runner IDs to add to the runner group. */
  var runners: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description List of repository IDs that can access the runner group. */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. */
  var selected_workflows: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories.
    * @default all
    * @enum {string}
    */
  var visibility: js.UndefOr[selected | all | `private`] = js.undefined
}
object AllowspublicrepositoriesName {
  
  inline def apply(name: String): AllowspublicrepositoriesName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowspublicrepositoriesName]
  }
  
  extension [Self <: AllowspublicrepositoriesName](x: Self) {
    
    inline def setAllows_public_repositories(value: Boolean): Self = StObject.set(x, "allows_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setAllows_public_repositoriesUndefined: Self = StObject.set(x, "allows_public_repositories", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflows(value: Boolean): Self = StObject.set(x, "restricted_to_workflows", value.asInstanceOf[js.Any])
    
    inline def setRestricted_to_workflowsUndefined: Self = StObject.set(x, "restricted_to_workflows", js.undefined)
    
    inline def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
    
    inline def setSelected_workflows(value: js.Array[String]): Self = StObject.set(x, "selected_workflows", value.asInstanceOf[js.Any])
    
    inline def setSelected_workflowsUndefined: Self = StObject.set(x, "selected_workflows", js.undefined)
    
    inline def setSelected_workflowsVarargs(value: String*): Self = StObject.set(x, "selected_workflows", js.Array(value*))
    
    inline def setVisibility(value: selected | all | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
