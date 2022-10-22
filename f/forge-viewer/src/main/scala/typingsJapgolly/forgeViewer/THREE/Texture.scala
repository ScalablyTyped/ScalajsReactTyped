package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalajs.dom.ImageData
import typingsJapgolly.forgeViewer.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var anisotropy: Double
  
  def copy(source: Texture): Texture
  
  def dispatchEvent(event: Target): Unit
  
  def dispose(): Unit
  
  var flipY: Boolean
  
  var format: PixelFormat
  
  var generateMipmaps: Boolean
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var id: Double
  
  var image: Any
  
  var magFilter: TextureFilter
  
  var mapping: Mapping
  
  var minFilter: TextureFilter
  
  // HTMLImageElement or ImageData ;
  var mipmaps: js.Array[ImageData]
  
  var name: String
  
  var needsUpdate: Boolean
  
  var offset: Vector2
  
  def onUpdate(): Unit
  
  var premultiplyAlpha: Boolean
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit
  
  var repeat: Vector2
  
  var sourceFile: String
  
  var `type`: TextureDataType
  
  var unpackAlignment: Double
  
  def update(): Unit
  
  var uuid: String
  
  var wrapS: Wrapping
  
  var wrapT: Wrapping
}
object Texture {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Any, Unit]) => Callback,
    anisotropy: Double,
    copy: Texture => Texture,
    dispatchEvent: Target => Callback,
    dispose: Callback,
    flipY: Boolean,
    format: PixelFormat,
    generateMipmaps: Boolean,
    hasEventListener: (String, js.Function1[/* event */ Any, Unit]) => Callback,
    id: Double,
    image: Any,
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
  ): Texture = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (addEventListener(t0, t1)).runNow()), anisotropy = anisotropy.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), dispatchEvent = js.Any.fromFunction1((t0: Target) => dispatchEvent(t0).runNow()), dispose = dispose.toJsFn, flipY = flipY.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], generateMipmaps = generateMipmaps.asInstanceOf[js.Any], hasEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (hasEventListener(t0, t1)).runNow()), id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onUpdate = onUpdate.toJsFn, premultiplyAlpha = premultiplyAlpha.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (removeEventListener(t0, t1)).runNow()), repeat = repeat.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], unpackAlignment = unpackAlignment.asInstanceOf[js.Any], update = update.toJsFn, uuid = uuid.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
  
  extension [Self <: Texture](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Texture => Texture): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDispatchEvent(value: Target => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipmaps(value: Boolean): Self = StObject.set(x, "generateMipmaps", value.asInstanceOf[js.Any])
    
    inline def setHasEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Callback): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: Mapping): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setMipmaps(value: js.Array[ImageData]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setMipmapsVarargs(value: ImageData*): Self = StObject.set(x, "mipmaps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnUpdate(value: Callback): Self = StObject.set(x, "onUpdate", value.toJsFn)
    
    inline def setPremultiplyAlpha(value: Boolean): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* event */ Any, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRepeat(value: Vector2): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnpackAlignment(value: Double): Self = StObject.set(x, "unpackAlignment", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setWrapS(value: Wrapping): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
    
    inline def setWrapT(value: Wrapping): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
  }
}
