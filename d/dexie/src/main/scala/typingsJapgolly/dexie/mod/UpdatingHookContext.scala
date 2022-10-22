package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatingHookContext[T, Key] extends StObject {
  
  var onerror: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onsuccess: js.UndefOr[js.Function1[/* updatedObj */ T, Unit]] = js.undefined
}
object UpdatingHookContext {
  
  inline def apply[T, Key](): UpdatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatingHookContext[T, Key]]
  }
  
  extension [Self <: UpdatingHookContext[?, ?], T, Key](x: Self & (UpdatingHookContext[T, Key])) {
    
    inline def setOnerror(value: /* err */ Any => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* err */ Any) => value(t0).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnsuccess(value: /* updatedObj */ T => Callback): Self = StObject.set(x, "onsuccess", js.Any.fromFunction1((t0: /* updatedObj */ T) => value(t0).runNow()))
    
    inline def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
  }
}
