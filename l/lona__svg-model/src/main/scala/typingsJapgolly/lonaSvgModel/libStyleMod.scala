package typingsJapgolly.lonaSvgModel

import typingsJapgolly.lonaSvgModel.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleMod {
  
  @JSImport("@lona/svg-model/lib/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def style(): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")().asInstanceOf[Style_]
  inline def style(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity: Fill): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity.asInstanceOf[js.Any]).asInstanceOf[Style_]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.nonzero
    - typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.evenodd
  */
  trait FillRule extends StObject
  object FillRule {
    
    inline def evenodd: typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.evenodd = "evenodd".asInstanceOf[typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.evenodd]
    
    inline def nonzero: typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.nonzero = "nonzero".asInstanceOf[typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.nonzero]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.butt
    - typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.round
    - typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.square
  */
  trait LineCap extends StObject
  object LineCap {
    
    inline def butt: typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.butt = "butt".asInstanceOf[typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.butt]
    
    inline def round: typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.round = "round".asInstanceOf[typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.round]
    
    inline def square: typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.square = "square".asInstanceOf[typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.square]
  }
  
  trait Style_ extends StObject {
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillRule: FillRule
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: LineCap
    
    var strokeWidth: Double
  }
  object Style_ {
    
    inline def apply(fillRule: FillRule, strokeLineCap: LineCap, strokeWidth: Double): Style_ = {
      val __obj = js.Dynamic.literal(fillRule = fillRule.asInstanceOf[js.Any], strokeLineCap = strokeLineCap.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style_]
    }
    
    extension [Self <: Style_](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCap(value: LineCap): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
}
