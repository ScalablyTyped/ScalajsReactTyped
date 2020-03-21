package typingsJapgolly.gl.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.GLint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGLResizeDrawingbuffer extends js.Object {
  def resize(width: GLint, height: GLint): Unit
}

object STACKGLResizeDrawingbuffer {
  @scala.inline
  def apply(resize: (GLint, GLint) => Callback): STACKGLResizeDrawingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resize")(js.Any.fromFunction2((t0: typingsJapgolly.std.GLint, t1: typingsJapgolly.std.GLint) => resize(t0, t1).runNow()))
    __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
  }
}

