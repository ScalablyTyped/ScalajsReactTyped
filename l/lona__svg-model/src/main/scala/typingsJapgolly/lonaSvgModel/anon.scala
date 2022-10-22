package typingsJapgolly.lonaSvgModel

import typingsJapgolly.lonaSvgModel.libPrimitivesMod.Point_
import typingsJapgolly.lonaSvgModel.libPrimitivesMod.Rect_
import typingsJapgolly.lonaSvgModel.lonaSvgModelBooleans.`true`
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.close
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.cubicCurve
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.line
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.move
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.quadCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ControlPoint extends StObject {
    
    val controlPoint: Point_
    
    val to: Point_
    
    val `type`: quadCurve
  }
  object ControlPoint {
    
    inline def apply(controlPoint: Point_, to: Point_): ControlPoint = {
      val __obj = js.Dynamic.literal(controlPoint = controlPoint.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quadCurve")
      __obj.asInstanceOf[ControlPoint]
    }
    
    extension [Self <: ControlPoint](x: Self) {
      
      inline def setControlPoint(value: Point_): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Point_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: quadCurve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlPoint1 extends StObject {
    
    val controlPoint1: Point_
    
    val controlPoint2: Point_
    
    val to: Point_
    
    val `type`: cubicCurve
  }
  object ControlPoint1 {
    
    inline def apply(controlPoint1: Point_, controlPoint2: Point_, to: Point_): ControlPoint1 = {
      val __obj = js.Dynamic.literal(controlPoint1 = controlPoint1.asInstanceOf[js.Any], controlPoint2 = controlPoint2.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cubicCurve")
      __obj.asInstanceOf[ControlPoint1]
    }
    
    extension [Self <: ControlPoint1](x: Self) {
      
      inline def setControlPoint1(value: Point_): Self = StObject.set(x, "controlPoint1", value.asInstanceOf[js.Any])
      
      inline def setControlPoint2(value: Point_): Self = StObject.set(x, "controlPoint2", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Point_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: cubicCurve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertQuadraticsToCubics extends StObject {
    
    var convertQuadraticsToCubics: `true`
  }
  object ConvertQuadraticsToCubics {
    
    inline def apply(): ConvertQuadraticsToCubics = {
      val __obj = js.Dynamic.literal(convertQuadraticsToCubics = true)
      __obj.asInstanceOf[ConvertQuadraticsToCubics]
    }
    
    extension [Self <: ConvertQuadraticsToCubics](x: Self) {
      
      inline def setConvertQuadraticsToCubics(value: `true`): Self = StObject.set(x, "convertQuadraticsToCubics", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fill extends StObject {
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var fillRule: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[String] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object Fill {
    
    inline def apply(): Fill = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fill]
    }
    
    extension [Self <: Fill](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCap(value: String): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var viewBox: js.UndefOr[Rect_] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setViewBox(value: Rect_): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait To extends StObject {
    
    val to: Point_
    
    val `type`: line
  }
  object To {
    
    inline def apply(to: Point_): To = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[To]
    }
    
    extension [Self <: To](x: Self) {
      
      inline def setTo(value: Point_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToType extends StObject {
    
    val to: Point_
    
    val `type`: move
  }
  object ToType {
    
    inline def apply(to: Point_): ToType = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move")
      __obj.asInstanceOf[ToType]
    }
    
    extension [Self <: ToType](x: Self) {
      
      inline def setTo(value: Point_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    val `type`: close
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("close")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsupportedFeatures extends StObject {
    
    var unsupportedFeatures: js.Array[String]
  }
  object UnsupportedFeatures {
    
    inline def apply(unsupportedFeatures: js.Array[String]): UnsupportedFeatures = {
      val __obj = js.Dynamic.literal(unsupportedFeatures = unsupportedFeatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsupportedFeatures]
    }
    
    extension [Self <: UnsupportedFeatures](x: Self) {
      
      inline def setUnsupportedFeatures(value: js.Array[String]): Self = StObject.set(x, "unsupportedFeatures", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedFeaturesVarargs(value: String*): Self = StObject.set(x, "unsupportedFeatures", js.Array(value*))
    }
  }
}
