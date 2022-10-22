package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatingHookContext[T, Key] extends StObject {
  
  var onerror: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onsuccess: js.UndefOr[js.Function1[/* primKey */ Key, Unit]] = js.undefined
}
object CreatingHookContext {
  
  inline def apply[T, Key](): CreatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatingHookContext[T, Key]]
  }
  
  extension [Self <: CreatingHookContext[?, ?], T, Key](x: Self & (CreatingHookContext[T, Key])) {
    
    inline def setOnerror(value: /* err */ Any => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* err */ Any) => value(t0).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnsuccess(value: /* primKey */ Key => Callback): Self = StObject.set(x, "onsuccess", js.Any.fromFunction1((t0: /* primKey */ Key) => value(t0).runNow()))
    
    inline def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
  }
}
