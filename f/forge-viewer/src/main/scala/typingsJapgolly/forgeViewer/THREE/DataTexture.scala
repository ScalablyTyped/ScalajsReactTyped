package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalajs.dom.ImageData
import typingsJapgolly.forgeViewer.anon.Data
import typingsJapgolly.forgeViewer.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTexture
  extends StObject
     with Texture {
  
  def copy(source: DataTexture): DataTexture
  
  @JSName("image")
  var image_DataTexture: Data
}
object DataTexture {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Any, Unit]) => Callback,
    anisotropy: Double,
    copy: DataTexture => DataTexture,
    dispatchEvent: Target => Callback,
    dispose: Callback,
    flipY: Boolean,
    format: PixelFormat,
    generateMipmaps: Boolean,
    hasEventListener: (String, js.Function1[/* event */ Any, Unit]) => Callback,
    id: Double,
    image: Data,
    magFilter: TextureFilter,
    mapping: Mapping,
    minFilter: TextureFilter,
    mipmaps: js.Array[ImageData],
    name: String,
    needsUpdate: Boolean,
    offset: Vector2,
    onUpdate: Callback,
    premultiplyAlpha: Boolean,
    removeEventListener: (String, js.Function1[/* event */ Any, Unit]) => Callback,
    repeat: Vector2,
    sourceFile: String,
    `type`: TextureDataType,
    unpackAlignment: Double,
    update: Callback,
    uuid: String,
    wrapS: Wrapping,
    wrapT: Wrapping
  ): DataTexture = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (addEventListener(t0, t1)).runNow()), anisotropy = anisotropy.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), dispatchEvent = js.Any.fromFunction1((t0: Target) => dispatchEvent(t0).runNow()), dispose = dispose.toJsFn, flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generateMipmaps = generateMipmaps.asInstanceOf[js.Any], hasEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (hasEventListener(t0, t1)).runNow()), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onUpdate = onUpdate.toJsFn, premultiplyAlpha = premultiplyAlpha.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (removeEventListener(t0, t1)).runNow()), repeat = repeat.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], unpackAlignment = unpackAlignment.asInstanceOf[js.Any], update = update.toJsFn, uuid = uuid.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTexture]
  }
  
  extension [Self <: DataTexture](x: Self) {
    
    inline def setCopy(value: DataTexture => DataTexture): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setImage(value: Data): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
