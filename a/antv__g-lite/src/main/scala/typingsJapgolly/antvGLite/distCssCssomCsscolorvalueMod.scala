package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.antvGLiteStrings.none
import typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValue
import typingsJapgolly.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomCsscolorvalueMod {
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSColorValue", "CSSColorValue")
  @js.native
  open class CSSColorValue protected () extends CSSStyleValue {
    def this(colorSpace: ColorSpace) = this()
    
    var colorSpace: ColorSpace = js.native
    
    /**
      * @see https://drafts.css-houdini.org/css-typed-om-1/#dom-csscolorvalue-to
      */
    def to(colorSpace: ColorSpace): CSSColorValue = js.native
  }
  
  type CSSColorAngle = CSSNumberish | none
  
  type CSSColorNumber = CSSNumberish | none
  
  type CSSColorPercent = CSSNumberish | none
  
  type CSSColorRGBComp = CSSNumberish | none
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGLite.antvGLiteStrings.rgb
    - typingsJapgolly.antvGLite.antvGLiteStrings.hsl
    - typingsJapgolly.antvGLite.antvGLiteStrings.hwb
    - typingsJapgolly.antvGLite.antvGLiteStrings.lch
    - typingsJapgolly.antvGLite.antvGLiteStrings.lab
  */
  trait ColorSpace extends StObject
  object ColorSpace {
    
    inline def hsl: typingsJapgolly.antvGLite.antvGLiteStrings.hsl = "hsl".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.hsl]
    
    inline def hwb: typingsJapgolly.antvGLite.antvGLiteStrings.hwb = "hwb".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.hwb]
    
    inline def lab: typingsJapgolly.antvGLite.antvGLiteStrings.lab = "lab".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.lab]
    
    inline def lch: typingsJapgolly.antvGLite.antvGLiteStrings.lch = "lch".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.lch]
    
    inline def rgb: typingsJapgolly.antvGLite.antvGLiteStrings.rgb = "rgb".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.rgb]
  }
}
