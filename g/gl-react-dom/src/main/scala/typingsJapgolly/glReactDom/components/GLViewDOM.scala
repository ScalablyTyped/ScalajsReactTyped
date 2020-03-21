package typingsJapgolly.glReactDom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glReactDom.glviewdomMod.GLViewDOMProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewDOM {
  def apply(
    height: Double,
    width: Double,
    debug: Int | Double = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onContextFailure: /* e */ js.Error => Callback = null,
    onContextLost: js.UndefOr[Callback] = js.undefined,
    onContextRestored: /* gl */ WebGLRenderingContext => Callback = null,
    pixelRatio: Int | Double = null,
    style: js.Any = null,
    webglContextAttributes: WebGLContextAttributes = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    GLViewDOMProps, 
    typingsJapgolly.glReactDom.glviewdomMod.GLViewDOM, 
    Unit, 
    GLViewDOMProps
  ] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1((t0: /* e */ js.Error) => onContextFailure(t0).runNow()))
    onContextLost.foreach(p => __obj.updateDynamic("onContextLost")(p.toJsFn))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextRestored(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReactDom.glviewdomMod.GLViewDOMProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.glReactDom.glviewdomMod.GLViewDOM](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReactDom.glviewdomMod.GLViewDOMProps])(children: _*)
  }
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  object componentImport extends js.Object
  
}

