package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeModalPopover.popoverControllerMod.PopoverControllerRenderProps
import typingsJapgolly.reactNativeModalPopover.popoverControllerMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverController {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: PopoverControllerRenderProps => CallbackTo[Element]
  ): UnmountedWithRoot[Props, typingsJapgolly.reactNativeModalPopover.mod.PopoverController, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeModalPopover.popoverControllerMod.PopoverControllerRenderProps) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalPopover.popoverControllerMod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeModalPopover.mod.PopoverController](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalPopover.popoverControllerMod.Props])
  }
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  object componentImport extends js.Object
  
}

