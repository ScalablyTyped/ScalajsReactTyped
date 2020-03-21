package typingsJapgolly.reactNativeActionsheet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustomProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionSheetCustom {
  def apply(
    options: js.Array[Node],
    onPress: Double => Callback,
    buttonUnderlayColor: String = null,
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    styles: js.Object = null,
    tintColor: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ActionSheetCustomProps, 
    typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustom, 
    Unit, 
    ActionSheetCustomProps
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    if (buttonUnderlayColor != null) __obj.updateDynamic("buttonUnderlayColor")(buttonUnderlayColor.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustomProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustom](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustomProps])(children: _*)
  }
  @JSImport("react-native-actionsheet", "ActionSheetCustom")
  @js.native
  object componentImport extends js.Object
  
}

