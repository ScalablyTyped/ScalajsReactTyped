package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdateFunction
  extends StObject
     with OptimisticUpdate {
  
  def storeUpdater(store: RecordSourceProxy): Unit
}
object OptimisticUpdateFunction {
  
  inline def apply(storeUpdater: RecordSourceProxy => Callback): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1((t0: RecordSourceProxy) => storeUpdater(t0).runNow()))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
  
  extension [Self <: OptimisticUpdateFunction](x: Self) {
    
    inline def setStoreUpdater(value: RecordSourceProxy => Callback): Self = StObject.set(x, "storeUpdater", js.Any.fromFunction1((t0: RecordSourceProxy) => value(t0).runNow()))
  }
}
