package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
trait ANGLEInstancedArrays extends StObject {
  
  /* standard dom */
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
  
  /* standard dom */
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): Unit
  
  /* standard dom */
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): Unit
  
  /* standard dom */
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): Unit
}
object ANGLEInstancedArrays {
  
  inline def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: (GLenum, GLint, GLsizei, GLsizei) => Callback,
    drawElementsInstancedANGLE: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Callback,
    vertexAttribDivisorANGLE: (GLuint, GLuint) => Callback
  ): ANGLEInstancedArrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE.asInstanceOf[js.Any], drawArraysInstancedANGLE = js.Any.fromFunction4((t0: GLenum, t1: GLint, t2: GLsizei, t3: GLsizei) => (drawArraysInstancedANGLE(t0, t1, t2, t3)).runNow()), drawElementsInstancedANGLE = js.Any.fromFunction5((t0: GLenum, t1: GLsizei, t2: GLenum, t3: GLintptr, t4: GLsizei) => (drawElementsInstancedANGLE(t0, t1, t2, t3, t4)).runNow()), vertexAttribDivisorANGLE = js.Any.fromFunction2((t0: GLuint, t1: GLuint) => (vertexAttribDivisorANGLE(t0, t1)).runNow()))
    __obj.asInstanceOf[ANGLEInstancedArrays]
  }
  
  extension [Self <: ANGLEInstancedArrays](x: Self) {
    
    inline def setDrawArraysInstancedANGLE(value: (GLenum, GLint, GLsizei, GLsizei) => Callback): Self = StObject.set(x, "drawArraysInstancedANGLE", js.Any.fromFunction4((t0: GLenum, t1: GLint, t2: GLsizei, t3: GLsizei) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDrawElementsInstancedANGLE(value: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Callback): Self = StObject.set(x, "drawElementsInstancedANGLE", js.Any.fromFunction5((t0: GLenum, t1: GLsizei, t2: GLenum, t3: GLintptr, t4: GLsizei) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(value: GLenum): Self = StObject.set(x, "VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE", value.asInstanceOf[js.Any])
    
    inline def setVertexAttribDivisorANGLE(value: (GLuint, GLuint) => Callback): Self = StObject.set(x, "vertexAttribDivisorANGLE", js.Any.fromFunction2((t0: GLuint, t1: GLuint) => (value(t0, t1)).runNow()))
  }
}
