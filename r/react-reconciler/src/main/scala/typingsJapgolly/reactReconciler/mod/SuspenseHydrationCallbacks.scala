package typingsJapgolly.reactReconciler.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseHydrationCallbacks[SuspenseInstance] extends StObject {
  
  var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ SuspenseInstance, Unit]] = js.undefined
  
  var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ SuspenseInstance, Unit]] = js.undefined
}
object SuspenseHydrationCallbacks {
  
  inline def apply[SuspenseInstance](): SuspenseHydrationCallbacks[SuspenseInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseHydrationCallbacks[SuspenseInstance]]
  }
  
  extension [Self <: SuspenseHydrationCallbacks[?], SuspenseInstance](x: Self & SuspenseHydrationCallbacks[SuspenseInstance]) {
    
    inline def setOnDeleted(value: /* suspenseInstance */ SuspenseInstance => Callback): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1((t0: /* suspenseInstance */ SuspenseInstance) => value(t0).runNow()))
    
    inline def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
    
    inline def setOnHydrated(value: /* suspenseInstance */ SuspenseInstance => Callback): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1((t0: /* suspenseInstance */ SuspenseInstance) => value(t0).runNow()))
    
    inline def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
  }
}
