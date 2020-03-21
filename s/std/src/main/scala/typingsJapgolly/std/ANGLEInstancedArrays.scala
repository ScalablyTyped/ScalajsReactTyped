package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type. */
trait ANGLEInstancedArrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): Unit
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): Unit
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): Unit
}

object ANGLEInstancedArrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: (GLenum, GLint, GLsizei, GLsizei) => Callback,
    drawElementsInstancedANGLE: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Callback,
    vertexAttribDivisorANGLE: (GLuint, GLuint) => Callback
  ): ANGLEInstancedArrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE.asInstanceOf[js.Any])
    __obj.updateDynamic("drawArraysInstancedANGLE")(js.Any.fromFunction4((t0: typingsJapgolly.std.GLenum, t1: typingsJapgolly.std.GLint, t2: typingsJapgolly.std.GLsizei, t3: typingsJapgolly.std.GLsizei) => drawArraysInstancedANGLE(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("drawElementsInstancedANGLE")(js.Any.fromFunction5((t0: typingsJapgolly.std.GLenum, t1: typingsJapgolly.std.GLsizei, t2: typingsJapgolly.std.GLenum, t3: typingsJapgolly.std.GLintptr, t4: typingsJapgolly.std.GLsizei) => drawElementsInstancedANGLE(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("vertexAttribDivisorANGLE")(js.Any.fromFunction2((t0: typingsJapgolly.std.GLuint, t1: typingsJapgolly.std.GLuint) => vertexAttribDivisorANGLE(t0, t1).runNow()))
    __obj.asInstanceOf[ANGLEInstancedArrays]
  }
}

