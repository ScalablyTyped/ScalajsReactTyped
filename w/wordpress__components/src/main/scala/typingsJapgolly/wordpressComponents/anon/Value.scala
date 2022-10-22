package typingsJapgolly.wordpressComponents.anon

import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with _OptionCompletion {
  
  var action: replace
  
  var value: typingsJapgolly.wordpressRichText.mod.Value
}
object Value {
  
  inline def apply(value: typingsJapgolly.wordpressRichText.mod.Value): Value = {
    val __obj = js.Dynamic.literal(action = "replace", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setAction(value: replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typingsJapgolly.wordpressRichText.mod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
