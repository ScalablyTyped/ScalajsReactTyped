package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.AnonW
import typingsJapgolly.protonNative.AnonY
import typingsJapgolly.protonNative.mod.WindowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Window {
  def apply(
    borderless: js.UndefOr[Boolean] = js.undefined,
    closed: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    lastWindow: js.UndefOr[Boolean] = js.undefined,
    margined: js.UndefOr[Boolean] = js.undefined,
    menuBar: js.UndefOr[Boolean] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onContentSizeChange: /* size */ AnonY => Callback = null,
    size: AnonW = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[WindowProps, typingsJapgolly.protonNative.mod.Window, Unit, WindowProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(lastWindow)) __obj.updateDynamic("lastWindow")(lastWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(margined)) __obj.updateDynamic("margined")(margined.asInstanceOf[js.Any])
    if (!js.isUndefined(menuBar)) __obj.updateDynamic("menuBar")(menuBar.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.protonNative.AnonY) => onContentSizeChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.WindowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.protonNative.mod.Window](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.WindowProps])(children: _*)
  }
  @JSImport("proton-native", "Window")
  @js.native
  object componentImport extends js.Object
  
}

