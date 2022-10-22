package typingsJapgolly.nodeRedRegistry.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPILibrary extends StObject {
  
  def register(`type`: String): Unit
}
object NodeAPILibrary {
  
  inline def apply(register: String => Callback): NodeAPILibrary = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1((t0: String) => register(t0).runNow()))
    __obj.asInstanceOf[NodeAPILibrary]
  }
  
  extension [Self <: NodeAPILibrary](x: Self) {
    
    inline def setRegister(value: String => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
