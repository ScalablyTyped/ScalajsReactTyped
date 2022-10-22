package typingsJapgolly.reactRelay.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRef extends StObject {
  
  var componentRef: js.UndefOr[js.Function1[/* ref */ Any, Unit]] = js.undefined
}
object ComponentRef {
  
  inline def apply(): ComponentRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRef]
  }
  
  extension [Self <: ComponentRef](x: Self) {
    
    inline def setComponentRef(value: /* ref */ Any => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ Any) => value(t0).runNow()))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
  }
}
