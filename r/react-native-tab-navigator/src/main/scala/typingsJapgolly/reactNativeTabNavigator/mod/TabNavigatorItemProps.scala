package typingsJapgolly.reactNativeTabNavigator.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[String | Double] = js.undefined
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Item title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[TextStyle] = js.undefined
}

object TabNavigatorItemProps {
  @scala.inline
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
    titleStyle: TextStyle = null
  ): TabNavigatorItemProps = {
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
    __obj.asInstanceOf[TabNavigatorItemProps]
  }
}

