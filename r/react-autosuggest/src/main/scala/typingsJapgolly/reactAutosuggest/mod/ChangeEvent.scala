package typingsJapgolly.reactAutosuggest.mod

import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.`type`
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.click
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.down
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.enter
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.escape
import typingsJapgolly.reactAutosuggest.reactAutosuggestStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent extends StObject {
  
  var method: down | up | escape | enter | click | `type`
  
  var newValue: String
}
object ChangeEvent {
  
  inline def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  extension [Self <: ChangeEvent](x: Self) {
    
    inline def setMethod(value: down | up | escape | enter | click | `type`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
