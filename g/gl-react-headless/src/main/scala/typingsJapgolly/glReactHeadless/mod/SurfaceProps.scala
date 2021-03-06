package typingsJapgolly.glReactHeadless.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glReact.mod.Visitor
import typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps
  extends typingsJapgolly.glReact.mod.SurfaceProps
     with GLViewHeadlessProps

object SurfaceProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onContextFailure: /* e */ js.Error => Callback = null,
    onContextLost: js.UndefOr[Callback] = js.undefined,
    onContextRestored: /* gl */ WebGLRenderingContext => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoadError: /* e */ js.Error => Callback = null,
    pixelRatio: Int | Double = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null,
    webglContextAttributes: WebGLContextAttributes = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1((t0: /* e */ js.Error) => onContextFailure(t0).runNow()))
    onContextLost.foreach(p => __obj.updateDynamic("onContextLost")(p.toJsFn))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextRestored(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* e */ js.Error) => onLoadError(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

