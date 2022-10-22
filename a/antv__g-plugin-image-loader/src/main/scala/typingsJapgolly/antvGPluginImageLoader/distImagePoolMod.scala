package typingsJapgolly.antvGPluginImageLoader

import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImagePoolMod {
  
  @JSImport("@antv/g-plugin-image-loader/dist/ImagePool", "ImagePool")
  @js.native
  open class ImagePool protected () extends StObject {
    def this(canvasConfig: CanvasConfig) = this()
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var generateGradientKey: Any = js.native
    
    /* private */ var generatePatternKey: Any = js.native
    
    def getImageSync(src: String): HTMLImageElement = js.native
    def getImageSync(src: String, callback: js.Function0[Unit]): HTMLImageElement = js.native
    
    def getOrCreateGradient(params: GradientParams, context: CanvasRenderingContext2D): CanvasGradient = js.native
    
    def getOrCreateImage(src: String): js.Promise[HTMLImageElement] = js.native
    
    def getOrCreatePatternSync(pattern: Pattern, context: CanvasRenderingContext2D, callback: js.Function0[Unit]): CanvasPattern = js.native
    
    /* private */ var gradientCache: Any = js.native
    
    /* private */ var imageCache: Any = js.native
    
    /* private */ var patternCache: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGPluginImageLoader.anon.LinearGradientwidthnumber
    - typingsJapgolly.antvGPluginImageLoader.anon.RadialGradientwidthnumber
  */
  trait GradientParams extends StObject
  object GradientParams {
    
    inline def LinearGradientwidthnumber(
      angle: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): typingsJapgolly.antvGPluginImageLoader.anon.LinearGradientwidthnumber = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.antvGPluginImageLoader.anon.LinearGradientwidthnumber]
    }
    
    inline def RadialGradientwidthnumber(
      cx: Double,
      cy: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): typingsJapgolly.antvGPluginImageLoader.anon.RadialGradientwidthnumber = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.antvGPluginImageLoader.anon.RadialGradientwidthnumber]
    }
  }
}
