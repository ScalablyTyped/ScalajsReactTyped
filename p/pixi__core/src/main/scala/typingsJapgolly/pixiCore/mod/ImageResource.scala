package typingsJapgolly.pixiCore.mod

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.pixiConstants.mod.ALPHA_MODES
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ImageResource")
@js.native
open class ImageResource protected () extends BaseImageResource {
  def this(source: String) = this()
  /**
    * @param source - image source or URL
    * @param options
    * @param {boolean} [options.autoLoad=true] - start loading process
    * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - whether its required to create
    *        a bitmap before upload
    * @param {boolean} [options.crossorigin=true] - Load image using cross origin
    * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Premultiply image alpha in bitmap
    */
  def this(source: HTMLImageElement) = this()
  def this(source: String, options: IImageResourceOptions) = this()
  def this(source: HTMLImageElement, options: IImageResourceOptions) = this()
  
  /**
    * Promise when loading.
    * @default null
    */
  /* private */ var _load: Any = js.native
  
  /** When process is completed */
  /* private */ var _process: Any = js.native
  
  /**
    * Controls texture alphaMode field
    * Copies from options
    * Default is `null`, copies option from baseTexture
    * @readonly
    */
  var alphaMode: ALPHA_MODES = js.native
  
  /**
    * The ImageBitmap element created for a {@code HTMLImageElement}.
    * @default null
    */
  var bitmap: ImageBitmap = js.native
  
  /**
    * If capable, convert the image using createImageBitmap API.
    * @default PIXI.settings.CREATE_IMAGE_BITMAP
    */
  var createBitmap: Boolean = js.native
  
  def load(createBitmap: Boolean): js.Promise[ImageResource] = js.native
  
  /**
    * If the image should be disposed after upload
    * @default false
    */
  var preserveBitmap: Boolean = js.native
  
  /**
    * Called when we need to convert image into BitmapImage.
    * Can be called multiple times, real promise is cached inside.
    * @returns - Cached promise to fill that bitmap
    */
  def process(): js.Promise[ImageResource] = js.native
  
  /** URL of the image source */
  var url: String = js.native
}
/* static members */
object ImageResource {
  
  @JSImport("@pixi/core", "ImageResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if source is string or HTMLImageElement
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
