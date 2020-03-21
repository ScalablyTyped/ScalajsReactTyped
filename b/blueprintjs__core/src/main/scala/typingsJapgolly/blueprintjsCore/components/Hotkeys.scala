package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.hotkeysMod.IHotkeysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hotkeys {
  def apply(
    className: String = null,
    tabIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IHotkeysProps, typingsJapgolly.blueprintjsCore.mod.Hotkeys, Unit, IHotkeysProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.hotkeysMod.IHotkeysProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Hotkeys](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.hotkeysMod.IHotkeysProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Hotkeys")
  @js.native
  object componentImport extends js.Object
  
}

