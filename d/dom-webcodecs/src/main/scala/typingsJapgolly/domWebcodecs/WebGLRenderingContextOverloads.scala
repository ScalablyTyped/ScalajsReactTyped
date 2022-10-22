package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.GLenum
import typingsJapgolly.std.GLint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRenderingContextOverloads extends StObject {
  
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
  
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
}
object WebGLRenderingContextOverloads {
  
  inline def apply(
    texImage2D: (GLenum, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback,
    texSubImage2D: (GLenum, GLint, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback
  ): WebGLRenderingContextOverloads = {
    val __obj = js.Dynamic.literal(texImage2D = js.Any.fromFunction6((t0: GLenum, t1: GLint, t2: GLint, t3: GLenum, t4: GLenum, t5: TexImageSourceWebCodecs) => (texImage2D(t0, t1, t2, t3, t4, t5)).runNow()), texSubImage2D = js.Any.fromFunction7((t0: GLenum, t1: GLint, t2: GLint, t3: GLint, t4: GLenum, t5: GLenum, t6: TexImageSourceWebCodecs) => (texSubImage2D(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    __obj.asInstanceOf[WebGLRenderingContextOverloads]
  }
  
  extension [Self <: WebGLRenderingContextOverloads](x: Self) {
    
    inline def setTexImage2D(value: (GLenum, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback): Self = StObject.set(x, "texImage2D", js.Any.fromFunction6((t0: GLenum, t1: GLint, t2: GLint, t3: GLenum, t4: GLenum, t5: TexImageSourceWebCodecs) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setTexSubImage2D(value: (GLenum, GLint, GLint, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback): Self = StObject.set(x, "texSubImage2D", js.Any.fromFunction7((t0: GLenum, t1: GLint, t2: GLint, t3: GLint, t4: GLenum, t5: GLenum, t6: TexImageSourceWebCodecs) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
  }
}
