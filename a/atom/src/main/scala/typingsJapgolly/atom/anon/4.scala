package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.none
import typingsJapgolly.atom.atomStrings.textOrSnippet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var newValue: none | textOrSnippet
  
  var oldValue: js.UndefOr[none | textOrSnippet] = js.undefined
}
object `4` {
  
  inline def apply(newValue: none | textOrSnippet): `4` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setNewValue(value: none | textOrSnippet): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: none | textOrSnippet): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
