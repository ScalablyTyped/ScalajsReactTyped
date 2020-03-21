package typingsJapgolly.ol.renderTargetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTarget extends js.Object {
  def clearCachedData(): Unit
  def getFramebuffer(): WebGLFramebuffer
  def getSize(): js.Array[Double]
  def getTexture(): WebGLTexture
  def readAll(): scala.scalajs.js.typedarray.Uint8Array
  def readPixel(x: Double, y: Double): scala.scalajs.js.typedarray.Uint8Array
  def setSize(size: js.Array[Double]): Unit
}

object WebGLRenderTarget {
  @scala.inline
  def apply(
    clearCachedData: Callback,
    getFramebuffer: CallbackTo[WebGLFramebuffer],
    getSize: CallbackTo[js.Array[Double]],
    getTexture: CallbackTo[WebGLTexture],
    readAll: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    readPixel: (Double, Double) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    setSize: js.Array[Double] => Callback
  ): WebGLRenderTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearCachedData")(clearCachedData.toJsFn)
    __obj.updateDynamic("getFramebuffer")(getFramebuffer.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("getTexture")(getTexture.toJsFn)
    __obj.updateDynamic("readAll")(readAll.toJsFn)
    __obj.updateDynamic("readPixel")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => readPixel(t0, t1).runNow()))
    __obj.updateDynamic("setSize")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setSize(t0).runNow()))
    __obj.asInstanceOf[WebGLRenderTarget]
  }
}

