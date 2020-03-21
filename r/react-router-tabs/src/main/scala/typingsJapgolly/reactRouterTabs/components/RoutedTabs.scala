package typingsJapgolly.reactRouterTabs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterTabs.mod.RoutedTabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RoutedTabs {
  def apply(
    activeTabClassName: String = null,
    activeTabStyle: js.Object = null,
    className: String = null,
    startPathWith: String = null,
    style: js.Object = null,
    tabClassName: String = null,
    tabStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RoutedTabsProps, typingsJapgolly.reactRouterTabs.mod.RoutedTabs, Unit, RoutedTabsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeTabClassName != null) __obj.updateDynamic("activeTabClassName")(activeTabClassName.asInstanceOf[js.Any])
    if (activeTabStyle != null) __obj.updateDynamic("activeTabStyle")(activeTabStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (startPathWith != null) __obj.updateDynamic("startPathWith")(startPathWith.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabClassName != null) __obj.updateDynamic("tabClassName")(tabClassName.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterTabs.mod.RoutedTabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouterTabs.mod.RoutedTabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterTabs.mod.RoutedTabsProps])(children: _*)
  }
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  object componentImport extends js.Object
  
}

