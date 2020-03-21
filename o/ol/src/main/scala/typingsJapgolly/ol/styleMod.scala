package typingsJapgolly.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.ol.colorMod.Color
import typingsJapgolly.ol.imageStateMod.ImageState
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.styleCircleMod.Options
import typingsJapgolly.ol.styleCircleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  @js.native
  class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Fill ()
    extends typingsJapgolly.ol.fillMod.default {
    def this(opt_options: typingsJapgolly.ol.fillMod.Options) = this()
  }
  
  @js.native
  class Icon ()
    extends typingsJapgolly.ol.iconMod.default {
    def this(opt_options: typingsJapgolly.ol.iconMod.Options) = this()
  }
  
  @js.native
  class IconImage protected ()
    extends typingsJapgolly.ol.iconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
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
  }
  
  @js.native
  abstract class Image protected ()
    extends typingsJapgolly.ol.styleImageMod.default {
    def this(options: typingsJapgolly.ol.styleImageMod.Options) = this()
  }
  
  @js.native
  class RegularShape protected ()
    extends typingsJapgolly.ol.regularShapeMod.default {
    def this(options: typingsJapgolly.ol.regularShapeMod.Options) = this()
  }
  
  @js.native
  class Stroke ()
    extends typingsJapgolly.ol.strokeMod.default {
    def this(opt_options: typingsJapgolly.ol.strokeMod.Options) = this()
  }
  
  @js.native
  class Style ()
    extends typingsJapgolly.ol.styleStyleMod.default {
    def this(opt_options: typingsJapgolly.ol.styleStyleMod.Options) = this()
  }
  
  @js.native
  class Text ()
    extends typingsJapgolly.ol.textMod.default {
    def this(opt_options: typingsJapgolly.ol.textMod.Options) = this()
  }
  
}

