package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.Subsequence
import typingsJapgolly.atom.atomStrings.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var newValue: Subsequence | Symbol
  
  var oldValue: js.UndefOr[Subsequence | Symbol] = js.undefined
}
object `3` {
  
  inline def apply(newValue: Subsequence | Symbol): `3` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setNewValue(value: Subsequence | Symbol): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Subsequence | Symbol): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
