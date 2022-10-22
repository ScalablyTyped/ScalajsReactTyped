package typingsJapgolly.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see [Examples]{@link https://github.com/mifi/editly/tree/master/examples}
	 * @see [Example 'commonFeatures.json5']{@link https://github.com/mifi/editly/blob/master/examples/commonFeatures.json5}
	 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.editly.mod.VideoLayer
  - typingsJapgolly.editly.mod.AudioLayer
  - typingsJapgolly.editly.mod.DetachedAudioLayer
  - typingsJapgolly.editly.mod.ImageLayer
  - typingsJapgolly.editly.mod.ImageOverlayLayer
  - typingsJapgolly.editly.mod.TitleLayer
  - typingsJapgolly.editly.mod.SubtitleLayer
  - typingsJapgolly.editly.mod.TitleBackgroundLayer
  - typingsJapgolly.editly.mod.NewsTitleLayer
  - typingsJapgolly.editly.mod.SlideInTextLayer
  - typingsJapgolly.editly.mod.FillColorLayer
  - typingsJapgolly.editly.mod.PauseLayer
  - typingsJapgolly.editly.mod.RadialGradientLayer
  - typingsJapgolly.editly.mod.LinearGradientLayer
  - typingsJapgolly.editly.mod.RainbowColorsLayer
  - typingsJapgolly.editly.mod.CanvasLayer
  - typingsJapgolly.editly.mod.FabricLayer
  - typingsJapgolly.editly.mod.GlLayer
  - typingsJapgolly.editly.mod.EditlyBannerLayer
*/
trait Layer extends StObject
object Layer {
  
  inline def AudioLayer(path: String): typingsJapgolly.editly.mod.AudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.AudioLayer]
  }
  
  inline def CanvasLayer(func: /* args */ CustomCanvasFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): typingsJapgolly.editly.mod.CanvasLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.CanvasLayer]
  }
  
  inline def DetachedAudioLayer(path: String): typingsJapgolly.editly.mod.DetachedAudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("detached-audio")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.DetachedAudioLayer]
  }
  
  inline def EditlyBannerLayer(): typingsJapgolly.editly.mod.EditlyBannerLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("editly-banner")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.EditlyBannerLayer]
  }
  
  inline def FabricLayer(func: /* args */ CustomFabricFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): typingsJapgolly.editly.mod.FabricLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("fabric")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.FabricLayer]
  }
  
  inline def FillColorLayer(): typingsJapgolly.editly.mod.FillColorLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill-color")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.FillColorLayer]
  }
  
  inline def GlLayer(fragmentPath: String): typingsJapgolly.editly.mod.GlLayer = {
    val __obj = js.Dynamic.literal(fragmentPath = fragmentPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gl")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.GlLayer]
  }
  
  inline def ImageLayer(path: String): typingsJapgolly.editly.mod.ImageLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.ImageLayer]
  }
  
  inline def ImageOverlayLayer(path: String): typingsJapgolly.editly.mod.ImageOverlayLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image-overlay")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.ImageOverlayLayer]
  }
  
  inline def LinearGradientLayer(): typingsJapgolly.editly.mod.LinearGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.LinearGradientLayer]
  }
  
  inline def NewsTitleLayer(text: String): typingsJapgolly.editly.mod.NewsTitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("news-title")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.NewsTitleLayer]
  }
  
  inline def PauseLayer(): typingsJapgolly.editly.mod.PauseLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.PauseLayer]
  }
  
  inline def RadialGradientLayer(): typingsJapgolly.editly.mod.RadialGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.RadialGradientLayer]
  }
  
  inline def RainbowColorsLayer(): typingsJapgolly.editly.mod.RainbowColorsLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rainbow-colors")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.RainbowColorsLayer]
  }
  
  inline def SlideInTextLayer(text: String): typingsJapgolly.editly.mod.SlideInTextLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slide-in-text")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.SlideInTextLayer]
  }
  
  inline def SubtitleLayer(text: String): typingsJapgolly.editly.mod.SubtitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("subtitle")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.SubtitleLayer]
  }
  
  inline def TitleBackgroundLayer(text: String): typingsJapgolly.editly.mod.TitleBackgroundLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("title-background")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.TitleBackgroundLayer]
  }
  
  inline def TitleLayer(text: String): typingsJapgolly.editly.mod.TitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("title")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.TitleLayer]
  }
  
  inline def VideoLayer(path: String): typingsJapgolly.editly.mod.VideoLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.VideoLayer]
  }
}
