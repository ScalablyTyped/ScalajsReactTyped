package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabledrepositories extends StObject {
  
  var allowed_actions: js.UndefOr[all | local_only | selected] = js.undefined
  
  var enabled_repositories: all | none_ | selected
  
  var selected_actions_url: js.UndefOr[String] = js.undefined
  
  /** @description The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when `enabled_repositories` is set to `selected`. */
  var selected_repositories_url: js.UndefOr[String] = js.undefined
}
object Enabledrepositories {
  
  inline def apply(enabled_repositories: all | none_ | selected): Enabledrepositories = {
    val __obj = js.Dynamic.literal(enabled_repositories = enabled_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabledrepositories]
  }
  
  extension [Self <: Enabledrepositories](x: Self) {
    
    inline def setAllowed_actions(value: all | local_only | selected): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_repositories(value: all | none_ | selected): Self = StObject.set(x, "enabled_repositories", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_url(value: String): Self = StObject.set(x, "selected_actions_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_urlUndefined: Self = StObject.set(x, "selected_actions_url", js.undefined)
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_urlUndefined: Self = StObject.set(x, "selected_repositories_url", js.undefined)
  }
}
