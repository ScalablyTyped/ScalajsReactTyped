package typingsJapgolly.glReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.mod.SurfaceProps
import typingsJapgolly.glReact.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Surface {
  def apply(
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoadError: /* e */ js.Error => Callback = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[SurfaceProps, typingsJapgolly.glReactNative.mod.Surface, Unit, SurfaceProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* e */ js.Error) => onLoadError(t0).runNow()))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReact.mod.SurfaceProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReactNative.mod.Surface](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReact.mod.SurfaceProps])
  }
  @JSImport("gl-react-native", "Surface")
  @js.native
  object componentImport extends js.Object
  
}

