package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedactionsEnabledBoolean extends StObject {
  
  var allowed_actions: js.UndefOr[all | local_only | selected] = js.undefined
  
  var enabled: Boolean
}
object AllowedactionsEnabledBoolean {
  
  inline def apply(enabled: Boolean): AllowedactionsEnabledBoolean = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedactionsEnabledBoolean]
  }
  
  extension [Self <: AllowedactionsEnabledBoolean](x: Self) {
    
    inline def setAllowed_actions(value: all | local_only | selected): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
