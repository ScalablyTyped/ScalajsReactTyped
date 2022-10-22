package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateMaintainHistory extends StObject {
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object InvalidateMaintainHistory {
  
  inline def apply(): InvalidateMaintainHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidateMaintainHistory]
  }
  
  extension [Self <: InvalidateMaintainHistory](x: Self) {
    
    inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    inline def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
    
    inline def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
