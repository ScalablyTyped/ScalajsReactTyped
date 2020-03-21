package typingsJapgolly.reactNativeTabNavigator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TabNavigatorItemProps276262979[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    badgeText: String | Double = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    renderBadge: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderIcon: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderSelectedIcon: js.UndefOr[CallbackTo[Element]] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedTitleStyle: TextStyle = null,
    tabStyle: ViewStyle = null,
    title: String = null,
    titleStyle: TextStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabNavigatorItemProps, ComponentRef, Unit, TabNavigatorItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (badgeText != null) __obj.updateDynamic("badgeText")(badgeText.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    renderBadge.foreach(p => __obj.updateDynamic("renderBadge")(p.toJsFn))
    renderIcon.foreach(p => __obj.updateDynamic("renderIcon")(p.toJsFn))
    renderSelectedIcon.foreach(p => __obj.updateDynamic("renderSelectedIcon")(p.toJsFn))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedTitleStyle != null) __obj.updateDynamic("selectedTitleStyle")(selectedTitleStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeTabNavigator.mod.TabNavigatorItemProps])(children: _*)
  }
}

