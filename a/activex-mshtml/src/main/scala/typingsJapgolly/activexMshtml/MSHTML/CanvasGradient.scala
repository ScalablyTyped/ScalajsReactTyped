package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGradient extends StObject {
  
  /* private */ @JSName("MSHTML.CanvasGradient_typekey")
  var MSHTMLDotCanvasGradient_typekey: CanvasGradient
  
  def addColorStop(offset: Double, color: String): Unit
}
object CanvasGradient {
  
  inline def apply(MSHTMLDotCanvasGradient_typekey: CanvasGradient, addColorStop: (Double, String) => Callback): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: String) => (addColorStop(t0, t1)).runNow()))
    __obj.updateDynamic("MSHTML.CanvasGradient_typekey")(MSHTMLDotCanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGradient]
  }
  
  extension [Self <: CanvasGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setMSHTMLDotCanvasGradient_typekey(value: CanvasGradient): Self = StObject.set(x, "MSHTML.CanvasGradient_typekey", value.asInstanceOf[js.Any])
  }
}
