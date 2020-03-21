package typingsJapgolly.reactNativeActionsheet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeActionsheet.mod.ActionSheetProps
import typingsJapgolly.reactNativeActionsheet.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeActionsheet {
  def apply(
    options: js.Array[String],
    onPress: Double => Callback,
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    tintColor: String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActionSheetProps, default, Unit, ActionSheetProps] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeActionsheet.mod.ActionSheetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeActionsheet.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeActionsheet.mod.ActionSheetProps])(children: _*)
  }
  @JSImport("react-native-actionsheet", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

