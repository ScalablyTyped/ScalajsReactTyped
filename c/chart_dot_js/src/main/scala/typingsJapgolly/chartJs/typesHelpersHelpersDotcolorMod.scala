package typingsJapgolly.chartJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import typingsJapgolly.chartJs.anon.A
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotcolorMod {
  
  @JSImport("chart.js/types/helpers/helpers.color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def color(value: String): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: js.Tuple3[Double, Double, Double]): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: js.Tuple4[Double, Double, Double, Double]): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  inline def color(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def color(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  inline def color(value: A): ColorModel = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[ColorModel]
  
  inline def getHoverColor(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoverColor(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def getHoverColor(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def isPatternOrGradient(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPatternOrGradient(value: AnyObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ColorModel extends StObject {
    
    def alpha(a: Double): ColorModel
    
    def clearer(ration: Double): ColorModel
    
    def darken(ratio: Double): ColorModel
    
    def desaturate(ratio: Double): ColorModel
    
    def greyscale(): ColorModel
    
    def hexString(): String
    
    def hslString(): String
    
    def lighten(ratio: Double): ColorModel
    
    def mix(color: ColorModel, weight: Double): this.type
    
    def negate(): ColorModel
    
    def opaquer(ratio: Double): ColorModel
    
    var rgb: A
    
    def rgbString(): String
    
    def rotate(deg: Double): this.type
    
    def saturate(ratio: Double): ColorModel
    
    var valid: Boolean
  }
  object ColorModel {
    
    inline def apply(
      alpha: Double => ColorModel,
      clearer: Double => ColorModel,
      darken: Double => ColorModel,
      desaturate: Double => ColorModel,
      greyscale: CallbackTo[ColorModel],
      hexString: CallbackTo[String],
      hslString: CallbackTo[String],
      lighten: Double => ColorModel,
      mix: (ColorModel, Double) => ColorModel,
      negate: CallbackTo[ColorModel],
      opaquer: Double => ColorModel,
      rgb: A,
      rgbString: CallbackTo[String],
      rotate: Double => ColorModel,
      saturate: Double => ColorModel,
      valid: Boolean
    ): ColorModel = {
      val __obj = js.Dynamic.literal(alpha = js.Any.fromFunction1(alpha), clearer = js.Any.fromFunction1(clearer), darken = js.Any.fromFunction1(darken), desaturate = js.Any.fromFunction1(desaturate), greyscale = greyscale.toJsFn, hexString = hexString.toJsFn, hslString = hslString.toJsFn, lighten = js.Any.fromFunction1(lighten), mix = js.Any.fromFunction2(mix), negate = negate.toJsFn, opaquer = js.Any.fromFunction1(opaquer), rgb = rgb.asInstanceOf[js.Any], rgbString = rgbString.toJsFn, rotate = js.Any.fromFunction1(rotate), saturate = js.Any.fromFunction1(saturate), valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorModel]
    }
    
    extension [Self <: ColorModel](x: Self) {
      
      inline def setAlpha(value: Double => ColorModel): Self = StObject.set(x, "alpha", js.Any.fromFunction1(value))
      
      inline def setClearer(value: Double => ColorModel): Self = StObject.set(x, "clearer", js.Any.fromFunction1(value))
      
      inline def setDarken(value: Double => ColorModel): Self = StObject.set(x, "darken", js.Any.fromFunction1(value))
      
      inline def setDesaturate(value: Double => ColorModel): Self = StObject.set(x, "desaturate", js.Any.fromFunction1(value))
      
      inline def setGreyscale(value: CallbackTo[ColorModel]): Self = StObject.set(x, "greyscale", value.toJsFn)
      
      inline def setHexString(value: CallbackTo[String]): Self = StObject.set(x, "hexString", value.toJsFn)
      
      inline def setHslString(value: CallbackTo[String]): Self = StObject.set(x, "hslString", value.toJsFn)
      
      inline def setLighten(value: Double => ColorModel): Self = StObject.set(x, "lighten", js.Any.fromFunction1(value))
      
      inline def setMix(value: (ColorModel, Double) => ColorModel): Self = StObject.set(x, "mix", js.Any.fromFunction2(value))
      
      inline def setNegate(value: CallbackTo[ColorModel]): Self = StObject.set(x, "negate", value.toJsFn)
      
      inline def setOpaquer(value: Double => ColorModel): Self = StObject.set(x, "opaquer", js.Any.fromFunction1(value))
      
      inline def setRgb(value: A): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setRgbString(value: CallbackTo[String]): Self = StObject.set(x, "rgbString", value.toJsFn)
      
      inline def setRotate(value: Double => ColorModel): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setSaturate(value: Double => ColorModel): Self = StObject.set(x, "saturate", js.Any.fromFunction1(value))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
