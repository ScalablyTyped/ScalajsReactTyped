package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonTitleContainer
import typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Title
import typingsJapgolly.reactNativeMaterialUi.mod.DialogTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogTitle {
  def apply(
    style: AnonTitleContainer = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DialogTitleProps, Title, Unit, DialogTitleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DialogTitleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Title](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DialogTitleProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Dialog.Title")
  @js.native
  object componentImport extends js.Object
  
}

