package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonItem
import typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Section
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionItem
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerSection {
  def apply(
    items: js.Array[DrawerSectionItem],
    divider: js.UndefOr[Boolean] = js.undefined,
    style: AnonItem = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerSectionProps, Section, Unit, DrawerSectionProps] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Section](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DrawerSectionProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Drawer.Section")
  @js.native
  object componentImport extends js.Object
  
}

