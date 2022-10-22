package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.figma.figmaStrings.CENTER
import typingsJapgolly.figma.figmaStrings.INSIDE
import typingsJapgolly.figma.figmaStrings.OUTSIDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryMixin extends StObject {
  
  var dashPattern: js.Array[Double]
  
  var fillStyleId: String | js.Symbol
  
  var fills: js.Array[Paint] | js.Symbol
  
  def outlineStroke(): VectorNode | Null
  
  var strokeAlign: CENTER | INSIDE | OUTSIDE
  
  var strokeCap: StrokeCap | js.Symbol
  
  var strokeJoin: StrokeJoin | js.Symbol
  
  var strokeMiterLimit: Double
  
  var strokeStyleId: String
  
  var strokeWeight: Double
  
  var strokes: js.Array[Paint]
}
object GeometryMixin {
  
  inline def apply(
    dashPattern: js.Array[Double],
    fillStyleId: String | js.Symbol,
    fills: js.Array[Paint] | js.Symbol,
    outlineStroke: CallbackTo[VectorNode | Null],
    strokeAlign: CENTER | INSIDE | OUTSIDE,
    strokeCap: StrokeCap | js.Symbol,
    strokeJoin: StrokeJoin | js.Symbol,
    strokeMiterLimit: Double,
    strokeStyleId: String,
    strokeWeight: Double,
    strokes: js.Array[Paint]
  ): GeometryMixin = {
    val __obj = js.Dynamic.literal(dashPattern = dashPattern.asInstanceOf[js.Any], fillStyleId = fillStyleId.asInstanceOf[js.Any], fills = fills.asInstanceOf[js.Any], outlineStroke = outlineStroke.toJsFn, strokeAlign = strokeAlign.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeMiterLimit = strokeMiterLimit.asInstanceOf[js.Any], strokeStyleId = strokeStyleId.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], strokes = strokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryMixin]
  }
  
  extension [Self <: GeometryMixin](x: Self) {
    
    inline def setDashPattern(value: js.Array[Double]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    inline def setDashPatternVarargs(value: Double*): Self = StObject.set(x, "dashPattern", js.Array(value*))
    
    inline def setFillStyleId(value: String | js.Symbol): Self = StObject.set(x, "fillStyleId", value.asInstanceOf[js.Any])
    
    inline def setFills(value: js.Array[Paint] | js.Symbol): Self = StObject.set(x, "fills", value.asInstanceOf[js.Any])
    
    inline def setFillsVarargs(value: Paint*): Self = StObject.set(x, "fills", js.Array(value*))
    
    inline def setOutlineStroke(value: CallbackTo[VectorNode | Null]): Self = StObject.set(x, "outlineStroke", value.toJsFn)
    
    inline def setStrokeAlign(value: CENTER | INSIDE | OUTSIDE): Self = StObject.set(x, "strokeAlign", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(value: StrokeCap | js.Symbol): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoin(value: StrokeJoin | js.Symbol): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterLimit(value: Double): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleId(value: String): Self = StObject.set(x, "strokeStyleId", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokes(value: js.Array[Paint]): Self = StObject.set(x, "strokes", value.asInstanceOf[js.Any])
    
    inline def setStrokesVarargs(value: Paint*): Self = StObject.set(x, "strokes", js.Array(value*))
  }
}
