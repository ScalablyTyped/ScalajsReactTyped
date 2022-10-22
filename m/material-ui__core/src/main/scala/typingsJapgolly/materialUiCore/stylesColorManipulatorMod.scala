package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesColorManipulatorMod {
  
  @JSImport("@material-ui/core/styles/colorManipulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
  inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fade(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.rgb
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.rgba
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.hsl
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.hsla
  */
  trait ColorFormat extends StObject
  object ColorFormat {
    
    inline def hsl: typingsJapgolly.materialUiCore.materialUiCoreStrings.hsl = "hsl".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.hsl]
    
    inline def hsla: typingsJapgolly.materialUiCore.materialUiCoreStrings.hsla = "hsla".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.hsla]
    
    inline def rgb: typingsJapgolly.materialUiCore.materialUiCoreStrings.rgb = "rgb".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.rgb]
    
    inline def rgba: typingsJapgolly.materialUiCore.materialUiCoreStrings.rgba = "rgba".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.rgba]
  }
  
  trait ColorObject extends StObject {
    
    var `type`: ColorFormat
    
    var values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  }
  object ColorObject {
    
    inline def apply(
      `type`: ColorFormat,
      values: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): ColorObject = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    extension [Self <: ColorObject](x: Self) {
      
      inline def setType(value: ColorFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
