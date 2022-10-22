package typingsJapgolly.glReact.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLFramebuffer
import org.scalajs.dom.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Framebuffer extends StObject {
  
  def bind(): Unit
  
  var color: WebGLTexture
  
  def dispose(): Unit
  
  var handle: WebGLFramebuffer
  
  def syncSize(w: Double, h: Double): Unit
}
object Framebuffer {
  
  inline def apply(
    bind: Callback,
    color: WebGLTexture,
    dispose: Callback,
    handle: WebGLFramebuffer,
    syncSize: (Double, Double) => Callback
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, color = color.asInstanceOf[js.Any], dispose = dispose.toJsFn, handle = handle.asInstanceOf[js.Any], syncSize = js.Any.fromFunction2((t0: Double, t1: Double) => (syncSize(t0, t1)).runNow()))
    __obj.asInstanceOf[Framebuffer]
  }
  
  extension [Self <: Framebuffer](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setColor(value: WebGLTexture): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setHandle(value: WebGLFramebuffer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setSyncSize(value: (Double, Double) => Callback): Self = StObject.set(x, "syncSize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
