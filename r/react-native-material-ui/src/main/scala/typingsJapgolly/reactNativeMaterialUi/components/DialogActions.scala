package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonActionsContainer
import typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Actions
import typingsJapgolly.reactNativeMaterialUi.mod.DialogActionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogActions {
  def apply(
    style: AnonActionsContainer = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DialogActionsProps, Actions, Unit, DialogActionsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DialogActionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Actions](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DialogActionsProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Dialog.Actions")
  @js.native
  object componentImport extends js.Object
  
}

