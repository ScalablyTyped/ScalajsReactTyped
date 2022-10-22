package typingsJapgolly.reactIntl.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedRef extends StObject {
  
  var forwardedRef: js.UndefOr[Ref[Any]] = js.undefined
}
object ForwardedRef {
  
  inline def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  
  extension [Self <: ForwardedRef](x: Self) {
    
    inline def setForwardedRef(value: Ref[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
