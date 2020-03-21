package typingsJapgolly.glReact.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framebuffer extends js.Object {
  var color: WebGLTexture
  var handle: WebGLFramebuffer
  def bind(): Unit
  def dispose(): Unit
  def syncSize(w: Double, h: Double): Unit
}

object Framebuffer {
  @scala.inline
  def apply(
    bind: Callback,
    color: WebGLTexture,
    dispose: Callback,
    handle: WebGLFramebuffer,
    syncSize: (Double, Double) => Callback
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
    __obj.updateDynamic("bind")(bind.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("syncSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => syncSize(t0, t1).runNow()))
    __obj.asInstanceOf[Framebuffer]
  }
}

