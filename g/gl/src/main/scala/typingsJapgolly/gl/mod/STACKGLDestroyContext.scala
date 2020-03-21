package typingsJapgolly.gl.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGLDestroyContext extends js.Object {
  def destroy(): Unit
}

object STACKGLDestroyContext {
  @scala.inline
  def apply(destroy: Callback): STACKGLDestroyContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[STACKGLDestroyContext]
  }
}

