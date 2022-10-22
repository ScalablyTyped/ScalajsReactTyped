package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bind group represents an collection of {@link UniformBuffer} and {@link Texture} instance,
  * which can be bind on a GPU for rendering.
  *
  * @ignore
  */
trait BindGroup extends StObject {
  
  /** @type {UniformBuffer} */
  var defaultUniformBuffer: UniformBuffer
  
  /**
    * Frees resources associated with this bind group.
    */
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  var dirty: Boolean
  
  var format: BindGroupFormat
  
  var impl: Any
  
  /**
    * Assign a texture to a named slot.
    *
    * @param {string} name - The name of the texture slot.
    * @param {Texture} texture - Texture to assign to the slot.
    */
  def setTexture(name: String, texture: Texture): Unit
  
  /**
    * Assign a uniform buffer to a slot.
    *
    * @param {string} name - The name of the uniform buffer slot
    * @param {UniformBuffer} uniformBuffer - The Uniform buffer to assign to the slot.
    */
  def setUniformBuffer(name: String, uniformBuffer: UniformBuffer): Unit
  
  var textures: js.Array[Any]
  
  var uniformBuffers: js.Array[Any]
  
  /**
    * Applies any changes made to the bind group's properties.
    */
  def update(): Unit
}
object BindGroup {
  
  inline def apply(
    defaultUniformBuffer: UniformBuffer,
    destroy: Callback,
    device: GraphicsDevice,
    dirty: Boolean,
    format: BindGroupFormat,
    impl: Any,
    setTexture: (String, Texture) => Callback,
    setUniformBuffer: (String, UniformBuffer) => Callback,
    textures: js.Array[Any],
    uniformBuffers: js.Array[Any],
    update: Callback
  ): BindGroup = {
    val __obj = js.Dynamic.literal(defaultUniformBuffer = defaultUniformBuffer.asInstanceOf[js.Any], destroy = destroy.toJsFn, device = device.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], impl = impl.asInstanceOf[js.Any], setTexture = js.Any.fromFunction2((t0: String, t1: Texture) => (setTexture(t0, t1)).runNow()), setUniformBuffer = js.Any.fromFunction2((t0: String, t1: UniformBuffer) => (setUniformBuffer(t0, t1)).runNow()), textures = textures.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[BindGroup]
  }
  
  extension [Self <: BindGroup](x: Self) {
    
    inline def setDefaultUniformBuffer(value: UniformBuffer): Self = StObject.set(x, "defaultUniformBuffer", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: BindGroupFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setSetTexture(value: (String, Texture) => Callback): Self = StObject.set(x, "setTexture", js.Any.fromFunction2((t0: String, t1: Texture) => (value(t0, t1)).runNow()))
    
    inline def setSetUniformBuffer(value: (String, UniformBuffer) => Callback): Self = StObject.set(x, "setUniformBuffer", js.Any.fromFunction2((t0: String, t1: UniformBuffer) => (value(t0, t1)).runNow()))
    
    inline def setTextures(value: js.Array[Any]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Any*): Self = StObject.set(x, "textures", js.Array(value*))
    
    inline def setUniformBuffers(value: js.Array[Any]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersVarargs(value: Any*): Self = StObject.set(x, "uniformBuffers", js.Array(value*))
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
