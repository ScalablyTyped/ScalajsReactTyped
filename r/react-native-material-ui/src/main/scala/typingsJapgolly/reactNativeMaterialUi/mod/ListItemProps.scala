package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var centerElement: Element | String | ListItemCenterElement
  var dense: js.UndefOr[Boolean] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var leftElement: js.UndefOr[Element | String] = js.undefined
  var numberOfLines: js.UndefOr[`1` | `2` | `3` | dynamic] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressValue: js.UndefOr[js.Any] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rightElement: js.UndefOr[Element | String] = js.undefined
  var style: js.UndefOr[ListItemStyle] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

object ListItemProps {
  @scala.inline
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
    testID: String = null
  ): ListItemProps = {
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
    __obj.asInstanceOf[ListItemProps]
  }
}

