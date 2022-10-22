package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.`12px`
import typingsJapgolly.atom.atomStrings.`14px`
import typingsJapgolly.atom.atomStrings.`16px`
import typingsJapgolly.atom.atomStrings.`18px`
import typingsJapgolly.atom.atomStrings.`21px`
import typingsJapgolly.atom.atomStrings.`24px`
import typingsJapgolly.atom.atomStrings.`28px`
import typingsJapgolly.atom.atomStrings.`32px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  
  var oldValue: js.UndefOr[`12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`] = js.undefined
}
object `5` {
  
  inline def apply(newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): `5` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setNewValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
