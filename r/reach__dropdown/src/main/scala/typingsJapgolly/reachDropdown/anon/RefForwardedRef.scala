package typingsJapgolly.reachDropdown.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefForwardedRef extends StObject {
  
  var ref: ForwardedRef[HTMLButtonElement]
}
object RefForwardedRef {
  
  inline def apply(): RefForwardedRef = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[RefForwardedRef]
  }
  
  extension [Self <: RefForwardedRef](x: Self) {
    
    inline def setRef(value: ForwardedRef[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLButtonElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ HTMLButtonElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
