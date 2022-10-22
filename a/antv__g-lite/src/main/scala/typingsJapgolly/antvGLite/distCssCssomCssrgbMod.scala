package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorPercent
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorRGBComp
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomCssrgbMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSRGB", "CSSRGB")
  @js.native
  open class CSSRGB protected () extends CSSColorValue {
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp) = this()
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp, alpha: CSSColorPercent) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: Unit,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: CSSColorPercent,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
    
    var alpha: CSSColorPercent = js.native
    
    var b: CSSColorRGBComp = js.native
    
    var g: CSSColorRGBComp = js.native
    
    /**
      * 'transparent' & 'none' has the same rgba data
      */
    var isNone: Boolean = js.native
    
    var r: CSSColorRGBComp = js.native
  }
}
