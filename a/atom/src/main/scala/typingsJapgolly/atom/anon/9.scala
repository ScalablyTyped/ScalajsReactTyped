package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.limited
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.undecided
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var newValue: limited | no | undecided
  
  var oldValue: js.UndefOr[limited | no | undecided] = js.undefined
}
object `9` {
  
  inline def apply(newValue: limited | no | undecided): `9` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setNewValue(value: limited | no | undecided): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: limited | no | undecided): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
