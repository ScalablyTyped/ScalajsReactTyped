package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.default
import typingsJapgolly.atom.atomStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var newValue: default | srgb
  
  var oldValue: js.UndefOr[default | srgb] = js.undefined
}
object `11` {
  
  inline def apply(newValue: default | srgb): `11` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setNewValue(value: default | srgb): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: default | srgb): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
