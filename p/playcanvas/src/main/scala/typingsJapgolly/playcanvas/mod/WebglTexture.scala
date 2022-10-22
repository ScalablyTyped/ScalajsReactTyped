package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the Texture.
  *
  * @ignore
  */
trait WebglTexture extends StObject {
  
  var _glFormat: Any
  
  var _glInternalFormat: Any
  
  var _glPixelType: Any
  
  var _glTarget: Any
  
  var _glTexture: Any
  
  def destroy(device: Any): Unit
  
  def initialize(device: Any, texture: Any): Unit
  
  def loseContext(): Unit
  
  def upload(device: Any, texture: Any): Unit
}
object WebglTexture {
  
  inline def apply(
    _glFormat: Any,
    _glInternalFormat: Any,
    _glPixelType: Any,
    _glTarget: Any,
    _glTexture: Any,
    destroy: Any => Callback,
    initialize: (Any, Any) => Callback,
    loseContext: Callback,
    upload: (Any, Any) => Callback
  ): WebglTexture = {
    val __obj = js.Dynamic.literal(_glFormat = _glFormat.asInstanceOf[js.Any], _glInternalFormat = _glInternalFormat.asInstanceOf[js.Any], _glPixelType = _glPixelType.asInstanceOf[js.Any], _glTarget = _glTarget.asInstanceOf[js.Any], _glTexture = _glTexture.asInstanceOf[js.Any], destroy = js.Any.fromFunction1((t0: Any) => destroy(t0).runNow()), initialize = js.Any.fromFunction2((t0: Any, t1: Any) => (initialize(t0, t1)).runNow()), loseContext = loseContext.toJsFn, upload = js.Any.fromFunction2((t0: Any, t1: Any) => (upload(t0, t1)).runNow()))
    __obj.asInstanceOf[WebglTexture]
  }
  
  extension [Self <: WebglTexture](x: Self) {
    
    inline def setDestroy(value: Any => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setInitialize(value: (Any, Any) => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setLoseContext(value: Callback): Self = StObject.set(x, "loseContext", value.toJsFn)
    
    inline def setUpload(value: (Any, Any) => Callback): Self = StObject.set(x, "upload", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def set_glFormat(value: Any): Self = StObject.set(x, "_glFormat", value.asInstanceOf[js.Any])
    
    inline def set_glInternalFormat(value: Any): Self = StObject.set(x, "_glInternalFormat", value.asInstanceOf[js.Any])
    
    inline def set_glPixelType(value: Any): Self = StObject.set(x, "_glPixelType", value.asInstanceOf[js.Any])
    
    inline def set_glTarget(value: Any): Self = StObject.set(x, "_glTarget", value.asInstanceOf[js.Any])
    
    inline def set_glTexture(value: Any): Self = StObject.set(x, "_glTexture", value.asInstanceOf[js.Any])
  }
}
