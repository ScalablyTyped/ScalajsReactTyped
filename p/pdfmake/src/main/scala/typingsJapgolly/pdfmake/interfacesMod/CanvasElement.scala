package typingsJapgolly.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pdfmake.interfacesMod.CanvasRect
  - typingsJapgolly.pdfmake.interfacesMod.CanvasPolyline
  - typingsJapgolly.pdfmake.interfacesMod.CanvasLine
  - typingsJapgolly.pdfmake.interfacesMod.CanvasEllipse
*/
trait CanvasElement extends StObject
object CanvasElement {
  
  inline def CanvasEllipse(r1: Double, x: Double, y: Double): typingsJapgolly.pdfmake.interfacesMod.CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ellipse")
    __obj.asInstanceOf[typingsJapgolly.pdfmake.interfacesMod.CanvasEllipse]
  }
  
  inline def CanvasLine(x1: Double, x2: Double, y1: Double, y2: Double): typingsJapgolly.pdfmake.interfacesMod.CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.pdfmake.interfacesMod.CanvasLine]
  }
  
  inline def CanvasPolyline(points: js.Array[Point]): typingsJapgolly.pdfmake.interfacesMod.CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("polyline")
    __obj.asInstanceOf[typingsJapgolly.pdfmake.interfacesMod.CanvasPolyline]
  }
  
  inline def CanvasRect(h: Double, w: Double, x: Double, y: Double): typingsJapgolly.pdfmake.interfacesMod.CanvasRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[typingsJapgolly.pdfmake.interfacesMod.CanvasRect]
  }
}
