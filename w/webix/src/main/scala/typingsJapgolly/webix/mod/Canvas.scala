package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  def clearCanvas(): Unit
  
  def getCanvas(context: String): Any
  
  def hideCanvas(): Unit
  
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit
  
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit
  
  def showCanvas(): Unit
  
  def toggleCanvas(): Unit
}
object Canvas {
  
  @JSImport("webix", "Canvas")
  @js.native
  val ^ : Canvas = js.native
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setClearCanvas(value: Callback): Self = StObject.set(x, "clearCanvas", value.toJsFn)
    
    inline def setGetCanvas(value: String => Any): Self = StObject.set(x, "getCanvas", js.Any.fromFunction1(value))
    
    inline def setHideCanvas(value: Callback): Self = StObject.set(x, "hideCanvas", value.toJsFn)
    
    inline def setRenderText(value: (Double, Double, String, String, Double) => Callback): Self = StObject.set(x, "renderText", js.Any.fromFunction5((t0: Double, t1: Double, t2: String, t3: String, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRenderTextAt(value: (String, String, Double, Double, String, String, Double) => Callback): Self = StObject.set(x, "renderTextAt", js.Any.fromFunction7((t0: String, t1: String, t2: Double, t3: Double, t4: String, t5: String, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setShowCanvas(value: Callback): Self = StObject.set(x, "showCanvas", value.toJsFn)
    
    inline def setToggleCanvas(value: Callback): Self = StObject.set(x, "toggleCanvas", value.toJsFn)
  }
}
