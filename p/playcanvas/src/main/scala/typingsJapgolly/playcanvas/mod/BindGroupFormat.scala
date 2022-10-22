package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait BindGroupFormat extends StObject {
  
  /** @type {BindBufferFormat[]} */
  var bufferFormats: js.Array[BindBufferFormat]
  
  /** @type {Map<string, number>} */
  var bufferFormatsMap: Map[String, Double]
  
  /**
    * Frees resources associated with this bind group.
    */
  def destroy(): Unit
  
  /** @type {GraphicsDevice} */
  var device: GraphicsDevice
  
  def getShaderDeclarationTextures(bindGroup: Any): String
  
  /**
    * Returns format of texture with specified name.
    *
    * @param {string} name - The name of the texture slot.
    * @returns {BindTextureFormat} - The format.
    */
  def getTexture(name: String): BindTextureFormat
  
  var impl: Any
  
  def loseContext(): Unit
  
  /** @type {BindTextureFormat[]} */
  var textureFormats: js.Array[BindTextureFormat]
  
  /** @type {Map<string, number>} */
  var textureFormatsMap: Map[String, Double]
}
object BindGroupFormat {
  
  inline def apply(
    bufferFormats: js.Array[BindBufferFormat],
    bufferFormatsMap: Map[String, Double],
    destroy: Callback,
    device: GraphicsDevice,
    getShaderDeclarationTextures: Any => String,
    getTexture: String => BindTextureFormat,
    impl: Any,
    loseContext: Callback,
    textureFormats: js.Array[BindTextureFormat],
    textureFormatsMap: Map[String, Double]
  ): BindGroupFormat = {
    val __obj = js.Dynamic.literal(bufferFormats = bufferFormats.asInstanceOf[js.Any], bufferFormatsMap = bufferFormatsMap.asInstanceOf[js.Any], destroy = destroy.toJsFn, device = device.asInstanceOf[js.Any], getShaderDeclarationTextures = js.Any.fromFunction1(getShaderDeclarationTextures), getTexture = js.Any.fromFunction1(getTexture), impl = impl.asInstanceOf[js.Any], loseContext = loseContext.toJsFn, textureFormats = textureFormats.asInstanceOf[js.Any], textureFormatsMap = textureFormatsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindGroupFormat]
  }
  
  extension [Self <: BindGroupFormat](x: Self) {
    
    inline def setBufferFormats(value: js.Array[BindBufferFormat]): Self = StObject.set(x, "bufferFormats", value.asInstanceOf[js.Any])
    
    inline def setBufferFormatsMap(value: Map[String, Double]): Self = StObject.set(x, "bufferFormatsMap", value.asInstanceOf[js.Any])
    
    inline def setBufferFormatsVarargs(value: BindBufferFormat*): Self = StObject.set(x, "bufferFormats", js.Array(value*))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGetShaderDeclarationTextures(value: Any => String): Self = StObject.set(x, "getShaderDeclarationTextures", js.Any.fromFunction1(value))
    
    inline def setGetTexture(value: String => BindTextureFormat): Self = StObject.set(x, "getTexture", js.Any.fromFunction1(value))
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: Callback): Self = StObject.set(x, "loseContext", value.toJsFn)
    
    inline def setTextureFormats(value: js.Array[BindTextureFormat]): Self = StObject.set(x, "textureFormats", value.asInstanceOf[js.Any])
    
    inline def setTextureFormatsMap(value: Map[String, Double]): Self = StObject.set(x, "textureFormatsMap", value.asInstanceOf[js.Any])
    
    inline def setTextureFormatsVarargs(value: BindTextureFormat*): Self = StObject.set(x, "textureFormats", js.Array(value*))
  }
}
