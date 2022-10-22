package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalPresenceEventMap extends StObject {
  
  def error(error: Error): Unit
}
object LocalPresenceEventMap {
  
  inline def apply(error: Error => japgolly.scalajs.react.Callback): LocalPresenceEventMap = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Error) => error(t0).runNow()))
    __obj.asInstanceOf[LocalPresenceEventMap]
  }
  
  extension [Self <: LocalPresenceEventMap](x: Self) {
    
    inline def setError(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
  }
}
