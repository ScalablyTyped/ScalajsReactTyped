package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import typingsJapgolly.reactNativeMaterialUi.mod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  def apply(
    onPress: js.UndefOr[Callback] = js.undefined,
    style: AnonContainerViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element]
  ): UnmountedWithRoot[DialogProps, typingsJapgolly.reactNativeMaterialUi.mod.Dialog, Unit, DialogProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DialogProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeMaterialUi.mod.Dialog](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DialogProps])
  }
  @JSImport("react-native-material-ui", "Dialog")
  @js.native
  object componentImport extends js.Object
  
}

