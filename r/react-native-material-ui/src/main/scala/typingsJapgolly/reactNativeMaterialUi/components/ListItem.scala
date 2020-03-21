package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemCenterElement
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemProps
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemStyle
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    centerElement: Element | String | ListItemCenterElement,
    dense: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element | String = null,
    numberOfLines: `1` | `2` | `3` | dynamic = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressValue: js.Any = null,
    onRightElementPress: js.UndefOr[Callback] = js.undefined,
    rightElement: Element | String = null,
    style: ListItemStyle = null,
    testID: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListItemProps, typingsJapgolly.reactNativeMaterialUi.mod.ListItem, Unit, ListItemProps] = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
  
      if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onPressValue != null) __obj.updateDynamic("onPressValue")(onPressValue.asInstanceOf[js.Any])
    onRightElementPress.foreach(p => __obj.updateDynamic("onRightElementPress")(p.toJsFn))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.ListItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.ListItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.ListItemProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "ListItem")
  @js.native
  object componentImport extends js.Object
  
}

