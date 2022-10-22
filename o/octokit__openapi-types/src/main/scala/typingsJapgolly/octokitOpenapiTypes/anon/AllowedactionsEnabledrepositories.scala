package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedactionsEnabledrepositories extends StObject {
  
  var allowed_actions: js.UndefOr[all | local_only | selected] = js.undefined
  
  var enabled_repositories: all | none_ | selected
}
object AllowedactionsEnabledrepositories {
  
  inline def apply(enabled_repositories: all | none_ | selected): AllowedactionsEnabledrepositories = {
    val __obj = js.Dynamic.literal(enabled_repositories = enabled_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedactionsEnabledrepositories]
  }
  
  extension [Self <: AllowedactionsEnabledrepositories](x: Self) {
    
    inline def setAllowed_actions(value: all | local_only | selected): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_repositories(value: all | none_ | selected): Self = StObject.set(x, "enabled_repositories", value.asInstanceOf[js.Any])
  }
}
