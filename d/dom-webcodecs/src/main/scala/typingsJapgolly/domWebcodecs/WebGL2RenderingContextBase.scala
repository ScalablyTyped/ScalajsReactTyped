package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.GLenum
import typingsJapgolly.std.GLint
import typingsJapgolly.std.GLsizei
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGL2RenderingContextBase extends StObject {
  
  def texImage3D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    depth: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
  
  def texSubImage3D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    zoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    depth: GLsizei,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSourceWebCodecs
  ): Unit
}
object WebGL2RenderingContextBase {
  
  inline def apply(
    texImage3D: (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback,
    texSubImage3D: (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, TexImageSourceWebCodecs) => Callback
  ): WebGL2RenderingContextBase = {
    val __obj = js.Dynamic.literal(texImage3D = js.Any.fromFunction10((t0: GLenum, t1: GLint, t2: GLint, t3: GLsizei, t4: GLsizei, t5: GLsizei, t6: GLint, t7: GLenum, t8: GLenum, t9: TexImageSourceWebCodecs) => (texImage3D(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)).runNow()), texSubImage3D = js.Any.fromFunction11((t0: GLenum, t1: GLint, t2: GLint, t3: GLint, t4: GLint, t5: GLsizei, t6: GLsizei, t7: GLsizei, t8: GLenum, t9: GLenum, t10: TexImageSourceWebCodecs) => (texSubImage3D(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)).runNow()))
    __obj.asInstanceOf[WebGL2RenderingContextBase]
  }
  
  extension [Self <: WebGL2RenderingContextBase](x: Self) {
    
    inline def setTexImage3D(
      value: (GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, TexImageSourceWebCodecs) => Callback
    ): Self = StObject.set(x, "texImage3D", js.Any.fromFunction10((t0: GLenum, t1: GLint, t2: GLint, t3: GLsizei, t4: GLsizei, t5: GLsizei, t6: GLint, t7: GLenum, t8: GLenum, t9: TexImageSourceWebCodecs) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)).runNow()))
    
    inline def setTexSubImage3D(
      value: (GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, TexImageSourceWebCodecs) => Callback
    ): Self = StObject.set(x, "texSubImage3D", js.Any.fromFunction11((t0: GLenum, t1: GLint, t2: GLint, t3: GLint, t4: GLint, t5: GLsizei, t6: GLsizei, t7: GLsizei, t8: GLenum, t9: GLenum, t10: TexImageSourceWebCodecs) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)).runNow()))
  }
}
