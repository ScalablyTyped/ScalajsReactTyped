package typingsJapgolly.pdfmake.interfacesMod

import typingsJapgolly.pdfmake.pdfmakeStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPolyline
  extends StObject
     with CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  /**
    * Controls whether to draw a line between the last and the first specified {@link points}.
    *
    * Defaults to `false`.
    */
  var closePath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Line end type.
    *
    * Defaults to `butt`.
    */
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  
  /**
    * The points that make up the line.
    */
  var points: js.Array[Point]
  
  var `type`: polyline
}
object CanvasPolyline {
  
  inline def apply(points: js.Array[Point]): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("polyline")
    __obj.asInstanceOf[CanvasPolyline]
  }
  
  extension [Self <: CanvasPolyline](x: Self) {
    
    inline def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setType(value: polyline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
