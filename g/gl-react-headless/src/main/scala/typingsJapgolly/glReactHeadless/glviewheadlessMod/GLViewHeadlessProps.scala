package typingsJapgolly.glReactHeadless.glviewheadlessMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewHeadlessProps extends js.Object {
  var height: Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
  var width: Double
}

object GLViewHeadlessProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onContextFailure: /* e */ js.Error => Callback = null,
    onContextLost: js.UndefOr[Callback] = js.undefined,
    onContextRestored: /* gl */ WebGLRenderingContext => Callback = null,
    pixelRatio: Int | Double = null,
    webglContextAttributes: WebGLContextAttributes = null
  ): GLViewHeadlessProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1((t0: /* e */ js.Error) => onContextFailure(t0).runNow()))
    onContextLost.foreach(p => __obj.updateDynamic("onContextLost")(p.toJsFn))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextRestored(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLViewHeadlessProps]
  }
}

