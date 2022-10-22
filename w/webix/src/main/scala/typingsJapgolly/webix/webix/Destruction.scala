package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destruction extends StObject {
  
  def destructor(): Unit
}
object Destruction {
  
  inline def apply(destructor: Callback): Destruction = {
    val __obj = js.Dynamic.literal(destructor = destructor.toJsFn)
    __obj.asInstanceOf[Destruction]
  }
  
  extension [Self <: Destruction](x: Self) {
    
    inline def setDestructor(value: Callback): Self = StObject.set(x, "destructor", value.toJsFn)
  }
}
