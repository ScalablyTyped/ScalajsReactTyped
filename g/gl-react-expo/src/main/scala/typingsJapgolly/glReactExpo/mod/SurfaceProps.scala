package typingsJapgolly.glReactExpo.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glReact.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.glReactExpo.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ trait SurfaceProps
  extends typingsJapgolly.glReact.mod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoadError: /* e */ js.Error => Callback = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* e */ js.Error) => onLoadError(t0).runNow()))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

