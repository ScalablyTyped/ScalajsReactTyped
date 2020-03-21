package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeModalPopover.popoverTouchableMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverTouchable {
  def apply(
    onPopoverDisplayed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.reactNativeModalPopover.mod.PopoverTouchable, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      onPopoverDisplayed.foreach(p => __obj.updateDynamic("onPopoverDisplayed")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalPopover.popoverTouchableMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeModalPopover.mod.PopoverTouchable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalPopover.popoverTouchableMod.Props])(children: _*)
  }
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  object componentImport extends js.Object
  
}

