package typingsJapgolly.ol

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.ol.colorMod.Color
import typingsJapgolly.ol.imageStateMod.ImageState
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.styleCircleMod.Options
import typingsJapgolly.ol.styleCircleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("ol/style", "Circle")
  @js.native
  open class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/style", "Fill")
  @js.native
  open class Fill ()
    extends typingsJapgolly.ol.styleFillMod.default {
    def this(opt_options: typingsJapgolly.ol.styleFillMod.Options) = this()
  }
  
  @JSImport("ol/style", "Icon")
  @js.native
  open class Icon ()
    extends typingsJapgolly.ol.styleIconMod.default {
    def this(opt_options: typingsJapgolly.ol.styleIconMod.Options) = this()
  }
  
  @JSImport("ol/style", "IconImage")
  @js.native
  open class IconImage protected ()
    extends typingsJapgolly.ol.styleIconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/style", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.ol.styleImageMod.default {
    def this(options: typingsJapgolly.ol.styleImageMod.Options) = this()
  }
  
  @JSImport("ol/style", "RegularShape")
  @js.native
  open class RegularShape protected ()
    extends typingsJapgolly.ol.styleRegularShapeMod.default {
    def this(options: typingsJapgolly.ol.styleRegularShapeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Stroke")
  @js.native
  open class Stroke ()
    extends typingsJapgolly.ol.styleStrokeMod.default {
    def this(opt_options: typingsJapgolly.ol.styleStrokeMod.Options) = this()
  }
  
  @JSImport("ol/style", "Style")
  @js.native
  open class Style ()
    extends typingsJapgolly.ol.styleStyleMod.default {
    def this(opt_options: typingsJapgolly.ol.styleStyleMod.Options) = this()
  }
  
  @JSImport("ol/style", "Text")
  @js.native
  open class Text ()
    extends typingsJapgolly.ol.styleTextMod.default {
    def this(opt_options: typingsJapgolly.ol.styleTextMod.Options) = this()
  }
}
