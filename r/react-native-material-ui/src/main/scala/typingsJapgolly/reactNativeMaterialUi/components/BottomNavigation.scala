package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigation {
  def apply(
    active: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    style: AnonContainerViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element]
  ): UnmountedWithRoot[
    BottomNavigationProps, 
    typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation, 
    Unit, 
    BottomNavigationProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationProps])
  }
  @JSImport("react-native-material-ui", "BottomNavigation")
  @js.native
  object componentImport extends js.Object
  
}

