package typingsJapgolly.reactDashNavigationDashDrawer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod.Props
import typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchableItem {
  def apply(
    borderless: Boolean,
    pressColor: String,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

