package typingsJapgolly.three

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.PixelFormat
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import typingsJapgolly.three.srcCoreEventDispatcherMod.EventDispatcher
import typingsJapgolly.three.srcMathVector2Mod.Vector
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/Texture", JSImport.Namespace)
@js.native
object srcTexturesTextureMod extends js.Object {
  @js.native
  class Texture protected () extends EventDispatcher {
    def this(
      image: js.UndefOr[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    var anisotropy: Double = js.native
    var center: Vector2 = js.native
    var encoding: TextureEncoding = js.native
    var flipY: Boolean = js.native
    var format: PixelFormat = js.native
    var generateMipmaps: Boolean = js.native
    var id: Double = js.native
    var image: js.Any = js.native
    var magFilter: TextureFilter = js.native
    var mapping: Mapping = js.native
    var minFilter: TextureFilter = js.native
     // HTMLImageElement or ImageData or { width: number, height: number } in some children;
    var mipmaps: js.Array[ImageData] = js.native
    var name: String = js.native
    var needsUpdate: Boolean = js.native
    var offset: Vector2 = js.native
    var premultiplyAlpha: Boolean = js.native
    var repeat: Vector2 = js.native
    var rotation: Double = js.native
    var sourceFile: String = js.native
    var `type`: TextureDataType = js.native
    var unpackAlignment: Double = js.native
    var uuid: String = js.native
    var version: Double = js.native
    var wrapS: Wrapping = js.native
    var wrapT: Wrapping = js.native
    def copy(source: Texture): this.type = js.native
    def dispose(): Unit = js.native
    def onUpdate(): Unit = js.native
    def toJSON(meta: js.Any): js.Any = js.native
    def transformUv(uv: Vector): Unit = js.native
  }
  
  var TextureIdCount: Double = js.native
  /* static members */
  @js.native
  object Texture extends js.Object {
    var DEFAULT_IMAGE: js.Any = js.native
    var DEFAULT_MAPPING: js.Any = js.native
  }
  
}

