package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.always
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var newValue: no | yes | always
  
  var oldValue: js.UndefOr[no | yes | always] = js.undefined
}
object `8` {
  
  inline def apply(newValue: no | yes | always): `8` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setNewValue(value: no | yes | always): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: no | yes | always): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
