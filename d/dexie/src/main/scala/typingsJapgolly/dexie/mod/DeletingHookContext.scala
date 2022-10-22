package typingsJapgolly.dexie.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletingHookContext[T, Key] extends StObject {
  
  var onerror: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onsuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DeletingHookContext {
  
  inline def apply[T, Key](): DeletingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletingHookContext[T, Key]]
  }
  
  extension [Self <: DeletingHookContext[?, ?], T, Key](x: Self & (DeletingHookContext[T, Key])) {
    
    inline def setOnerror(value: /* err */ Any => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* err */ Any) => value(t0).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnsuccess(value: Callback): Self = StObject.set(x, "onsuccess", value.toJsFn)
    
    inline def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
  }
}
