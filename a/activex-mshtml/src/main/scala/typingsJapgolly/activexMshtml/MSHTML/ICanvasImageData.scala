package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasImageData extends StObject {
  
  /* private */ @JSName("MSHTML.ICanvasImageData_typekey")
  var MSHTMLDotICanvasImageData_typekey: ICanvasImageData
  
  val data: Any
  
  val height: Double
  
  val width: Double
}
object ICanvasImageData {
  
  inline def apply(MSHTMLDotICanvasImageData_typekey: ICanvasImageData, data: Any, height: Double, width: Double): ICanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasImageData_typekey")(MSHTMLDotICanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasImageData]
  }
  
  extension [Self <: ICanvasImageData](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotICanvasImageData_typekey(value: ICanvasImageData): Self = StObject.set(x, "MSHTML.ICanvasImageData_typekey", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
