package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A uniform buffer represents a GPU memory buffer storing the uniforms.
  *
  * @ignore
  */
trait UniformBuffer extends StObject {
  
  /**
    * Frees resources associated with this uniform buffer.
    */
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  var format: UniformBufferFormat
  
  var impl: Any
  
  /**
    * Called when the rendering context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit
  
  /**
    * Assign a value to the uniform specified by name.
    *
    * @param {string} name - The name of the uniform.
    */
  def set(name: String): Unit
  
  /**
    * Assign a value to the uniform specified by its format. This is the fast version of assigning
    * a value to a uniform, avoiding any lookups.
    *
    * @param {UniformFormat} uniformFormat - The format of the uniform.
    */
  def setUniform(uniformFormat: UniformFormat): Unit
  
  var storage: js.typedarray.ArrayBuffer
  
  var storageFloat32: js.typedarray.Float32Array
  
  var storageInt32: js.typedarray.Int32Array
  
  def update(): Unit
}
object UniformBuffer {
  
  inline def apply(
    destroy: Callback,
    device: GraphicsDevice,
    format: UniformBufferFormat,
    impl: Any,
    loseContext: Callback,
    set: String => Callback,
    setUniform: UniformFormat => Callback,
    storage: js.typedarray.ArrayBuffer,
    storageFloat32: js.typedarray.Float32Array,
    storageInt32: js.typedarray.Int32Array,
    update: Callback
  ): UniformBuffer = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, device = device.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], impl = impl.asInstanceOf[js.Any], loseContext = loseContext.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()), setUniform = js.Any.fromFunction1((t0: UniformFormat) => setUniform(t0).runNow()), storage = storage.asInstanceOf[js.Any], storageFloat32 = storageFloat32.asInstanceOf[js.Any], storageInt32 = storageInt32.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[UniformBuffer]
  }
  
  extension [Self <: UniformBuffer](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: UniformBufferFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: Callback): Self = StObject.set(x, "loseContext", value.toJsFn)
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUniform(value: UniformFormat => Callback): Self = StObject.set(x, "setUniform", js.Any.fromFunction1((t0: UniformFormat) => value(t0).runNow()))
    
    inline def setStorage(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "storageFloat32", value.asInstanceOf[js.Any])
    
    inline def setStorageInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "storageInt32", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
