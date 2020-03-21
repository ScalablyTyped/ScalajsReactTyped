package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonDefaultActionsContainer
import typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogDefaultActions {
  def apply(
    actions: js.Array[String],
    onActionPress: String => Callback,
    style: AnonDefaultActionsContainer = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DialogDefaultActionsProps, 
    typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActions, 
    Unit, 
    DialogDefaultActionsProps
  ] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onActionPress")(js.Any.fromFunction1((t0: java.lang.String) => onActionPress(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActions](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActionsProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "DialogDefaultActions")
  @js.native
  object componentImport extends js.Object
  
}

