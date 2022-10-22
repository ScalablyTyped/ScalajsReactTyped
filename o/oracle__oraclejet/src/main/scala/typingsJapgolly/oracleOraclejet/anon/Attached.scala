package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attached extends StObject {
  
  def attached(param0: js.Object): Unit
}
object Attached {
  
  inline def apply(attached: js.Object => Callback): Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1((t0: js.Object) => attached(t0).runNow()))
    __obj.asInstanceOf[Attached]
  }
  
  extension [Self <: Attached](x: Self) {
    
    inline def setAttached(value: js.Object => Callback): Self = StObject.set(x, "attached", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
