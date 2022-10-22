package typingsJapgolly.jspdf.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient extends StObject {
  
  def addColorStop(position: Double, color: String): Unit
  
  def getColor(): String
}
object Gradient {
  
  inline def apply(addColorStop: (Double, String) => Callback, getColor: CallbackTo[String]): Gradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: String) => (addColorStop(t0, t1)).runNow()), getColor = getColor.toJsFn)
    __obj.asInstanceOf[Gradient]
  }
  
  extension [Self <: Gradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "getColor", value.toJsFn)
  }
}
