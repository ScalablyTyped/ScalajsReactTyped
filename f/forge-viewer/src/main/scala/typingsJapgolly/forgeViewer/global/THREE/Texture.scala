package typingsJapgolly.forgeViewer.global.THREE

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import typingsJapgolly.forgeViewer.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.Texture {
  def this(
    image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
    mapping: js.UndefOr[typingsJapgolly.forgeViewer.THREE.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.forgeViewer.THREE.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.forgeViewer.THREE.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.forgeViewer.THREE.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.forgeViewer.THREE.TextureFilter],
    format: js.UndefOr[typingsJapgolly.forgeViewer.THREE.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.forgeViewer.THREE.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
  
  // EventDispatcher mixins
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var anisotropy: Double = js.native
  
  /* CompleteClass */
  override def copy(source: typingsJapgolly.forgeViewer.THREE.Texture): typingsJapgolly.forgeViewer.THREE.Texture = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: Target): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  var flipY: Boolean = js.native
  
  /* CompleteClass */
  var format: typingsJapgolly.forgeViewer.THREE.PixelFormat = js.native
  
  /* CompleteClass */
  var generateMipmaps: Boolean = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var image: Any = js.native
  
  /* CompleteClass */
  var magFilter: typingsJapgolly.forgeViewer.THREE.TextureFilter = js.native
  
  /* CompleteClass */
  var mapping: typingsJapgolly.forgeViewer.THREE.Mapping = js.native
  
  /* CompleteClass */
  var minFilter: typingsJapgolly.forgeViewer.THREE.TextureFilter = js.native
  
  // HTMLImageElement or ImageData ;
  /* CompleteClass */
  var mipmaps: js.Array[ImageData] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  var offset: typingsJapgolly.forgeViewer.THREE.Vector2 = js.native
  
  /* CompleteClass */
  override def onUpdate(): Unit = js.native
  
  /* CompleteClass */
  var premultiplyAlpha: Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  /* CompleteClass */
  var repeat: typingsJapgolly.forgeViewer.THREE.Vector2 = js.native
  
  /* CompleteClass */
  var sourceFile: String = js.native
  
  /* CompleteClass */
  var `type`: typingsJapgolly.forgeViewer.THREE.TextureDataType = js.native
  
  /* CompleteClass */
  var unpackAlignment: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
  
  /* CompleteClass */
  var wrapS: typingsJapgolly.forgeViewer.THREE.Wrapping = js.native
  
  /* CompleteClass */
  var wrapT: typingsJapgolly.forgeViewer.THREE.Wrapping = js.native
}
object Texture {
  
  @JSGlobal("THREE.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("THREE.Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: Any = js.native
  inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("THREE.Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: Any = js.native
  inline def DEFAULT_MAPPING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
