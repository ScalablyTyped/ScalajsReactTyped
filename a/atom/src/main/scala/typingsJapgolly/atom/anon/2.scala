package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.Cursor
import typingsJapgolly.atom.atomStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var newValue: Word | Cursor
  
  var oldValue: js.UndefOr[Word | Cursor] = js.undefined
}
object `2` {
  
  inline def apply(newValue: Word | Cursor): `2` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setNewValue(value: Word | Cursor): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Word | Cursor): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
