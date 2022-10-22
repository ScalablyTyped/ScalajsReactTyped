package typingsJapgolly.relayRuntime.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdater extends StObject {
  
  def optimisticUpdater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit
  @JSName("optimisticUpdater")
  var optimisticUpdater_Original: SelectorStoreUpdater[js.Object]
  
  def updater(
    store: RecordSourceSelectorProxy[js.Object],
    // Actually SelectorData, but mixed is inconvenient to access deeply in
  // product code.
  data: js.Object
  ): Unit
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object]
}
object OptimisticUpdater {
  
  inline def apply(
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback
  ): OptimisticUpdater = {
    val __obj = js.Dynamic.literal(optimisticUpdater = js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (optimisticUpdater(t0, t1)).runNow()), updater = js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (updater(t0, t1)).runNow()))
    __obj.asInstanceOf[OptimisticUpdater]
  }
  
  extension [Self <: OptimisticUpdater](x: Self) {
    
    inline def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
