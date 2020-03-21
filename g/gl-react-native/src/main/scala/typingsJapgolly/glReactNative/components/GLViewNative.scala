package typingsJapgolly.glReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.glReactNative.glviewnativeMod.GLViewNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewNative {
  def apply(
    onContextCreate: /* gl */ WebGLRenderingContext => Callback = null,
    onContextFailure: /* e */ js.Error => Callback = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[
    GLViewNativeProps, 
    typingsJapgolly.glReactNative.glviewnativeMod.GLViewNative, 
    Unit, 
    GLViewNativeProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1((t0: /* gl */ org.scalajs.dom.raw.WebGLRenderingContext) => onContextCreate(t0).runNow()))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1((t0: /* e */ js.Error) => onContextFailure(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReactNative.glviewnativeMod.GLViewNativeProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReactNative.glviewnativeMod.GLViewNative](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReactNative.glviewnativeMod.GLViewNativeProps])
  }
  @JSImport("gl-react-native/GLViewNative", "GLViewNative")
  @js.native
  object componentImport extends js.Object
  
}

