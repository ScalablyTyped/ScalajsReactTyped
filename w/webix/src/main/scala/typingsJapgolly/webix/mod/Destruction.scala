package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destruction extends StObject {
  
  def destructor(): Unit
}
object Destruction {
  
  @JSImport("webix", "Destruction")
  @js.native
  val ^ : Destruction = js.native
  
  extension [Self <: Destruction](x: Self) {
    
    inline def setDestructor(value: Callback): Self = StObject.set(x, "destructor", value.toJsFn)
  }
}
