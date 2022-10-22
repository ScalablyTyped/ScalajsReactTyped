package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.fix_started
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.inaccurate
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.no_bandwidth
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_used
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.tolerable_risk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DismissedreasonState extends StObject {
  
  var dismissed_comment: js.UndefOr[String | Null] = js.undefined
  
  var dismissed_reason: js.UndefOr[fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk | Null] = js.undefined
  
  var state: dismissed | open
}
object DismissedreasonState {
  
  inline def apply(state: dismissed | open): DismissedreasonState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissedreasonState]
  }
  
  extension [Self <: DismissedreasonState](x: Self) {
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(value: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    inline def setState(value: dismissed | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
