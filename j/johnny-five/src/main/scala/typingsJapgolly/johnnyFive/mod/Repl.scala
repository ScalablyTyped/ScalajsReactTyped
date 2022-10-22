package typingsJapgolly.johnnyFive.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repl extends StObject {
  
  def inject(`object`: Any): Unit
}
object Repl {
  
  inline def apply(inject: Any => Callback): Repl = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1((t0: Any) => inject(t0).runNow()))
    __obj.asInstanceOf[Repl]
  }
  
  extension [Self <: Repl](x: Self) {
    
    inline def setInject(value: Any => Callback): Self = StObject.set(x, "inject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
