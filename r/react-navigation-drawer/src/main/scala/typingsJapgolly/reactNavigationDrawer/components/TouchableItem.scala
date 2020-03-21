package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigationDrawer.touchableItemMod.Props
import typingsJapgolly.reactNavigationDrawer.touchableItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchableItem {
  def apply(
    borderless: Boolean,
    pressColor: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationDrawer.touchableItemMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationDrawer.touchableItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationDrawer.touchableItemMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

