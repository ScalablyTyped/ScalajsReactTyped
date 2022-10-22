package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uniform[T] extends StObject {
  
  var current: T
  
  var gl: WebGLRenderingContext
  
  var location: WebGLUniformLocation
  
  def set(v: T): scala.Unit
}
object Uniform {
  
  inline def apply[T](
    current: T,
    gl: WebGLRenderingContext,
    location: WebGLUniformLocation,
    set: T => japgolly.scalajs.react.Callback
  ): Uniform[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[Uniform[T]]
  }
  
  extension [Self <: Uniform[?], T](x: Self & Uniform[T]) {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WebGLUniformLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setSet(value: T => japgolly.scalajs.react.Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
