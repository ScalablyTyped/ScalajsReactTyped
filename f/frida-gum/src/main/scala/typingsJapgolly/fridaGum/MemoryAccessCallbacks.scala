package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callbacks to be notified synchronously on memory access.
  */
trait MemoryAccessCallbacks extends StObject {
  
  def onAccess(details: MemoryAccessDetails): Unit
}
object MemoryAccessCallbacks {
  
  inline def apply(onAccess: MemoryAccessDetails => Callback): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1((t0: MemoryAccessDetails) => onAccess(t0).runNow()))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
  
  extension [Self <: MemoryAccessCallbacks](x: Self) {
    
    inline def setOnAccess(value: MemoryAccessDetails => Callback): Self = StObject.set(x, "onAccess", js.Any.fromFunction1((t0: MemoryAccessDetails) => value(t0).runNow()))
  }
}
