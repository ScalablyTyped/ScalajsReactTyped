package typingsJapgolly.glFbo.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBuffer extends js.Object {
  var color: js.Array[Texture]
  var depth: Texture | Null
  var gl: WebGLRenderingContext
  var handle: WebGLFramebuffer
  var shape: js.Tuple2[Double, Double]
  def bind(): Unit
  def dispose(): Unit
}

object FrameBuffer {
  @scala.inline
  def apply(
    bind: Callback,
    color: js.Array[Texture],
    dispose: Callback,
    gl: WebGLRenderingContext,
    handle: WebGLFramebuffer,
    shape: js.Tuple2[Double, Double],
    depth: Texture = null
  ): FrameBuffer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("bind")(bind.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
}

