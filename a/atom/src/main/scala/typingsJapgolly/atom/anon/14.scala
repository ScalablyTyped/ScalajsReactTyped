package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.auto
import typingsJapgolly.atom.atomStrings.hard
import typingsJapgolly.atom.atomStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var newValue: auto | soft | hard
  
  var oldValue: js.UndefOr[auto | soft | hard] = js.undefined
}
object `14` {
  
  inline def apply(newValue: auto | soft | hard): `14` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setNewValue(value: auto | soft | hard): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: auto | soft | hard): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
