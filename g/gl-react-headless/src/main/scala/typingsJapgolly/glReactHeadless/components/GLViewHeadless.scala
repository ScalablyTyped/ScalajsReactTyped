package typingsJapgolly.glReactHeadless.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewHeadless {
  def apply(
    height: Double,
    width: Double,
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onContextFailure: /* e */ js.Error => Callback = null,
    onContextLost: js.UndefOr[Callback] = js.undefined,
    onContextRestored: /* gl */ WebGLRenderingContext => Callback = null,
    pixelRatio: Int | Double = null,
    webglContextAttributes: WebGLContextAttributes = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    GLViewHeadlessProps, 
    typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadless, 
    Unit, 
    GLViewHeadlessProps
  ] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1((t0: /* e */ js.Error) => onContextFailure(t0).runNow()))
    onContextLost.foreach(p => __obj.updateDynamic("onContextLost")(p.toJsFn))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextRestored(t0).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadless](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps])(children: _*)
  }
  @JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
  @js.native
  object componentImport extends js.Object
  
}

