package typingsJapgolly.reactNativeNavigation.optionsMod

import typingsJapgolly.reactNative.mod.ImageRequireSource
import typingsJapgolly.reactNative.mod.Insets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBottomTab extends js.Object {
  /**
    * Set the text in a badge that is overlayed over the component
    */
  var badge: js.UndefOr[String] = js.undefined
  /**
    * Set the background color of the badge that is overlayed over the component
    */
  var badgeColor: js.UndefOr[String] = js.undefined
  /**
    * Set true if you want to disable the icon tinting
    * #### (iOS specific)
    */
  var disableIconTint: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to disable the text tinting
    * #### (iOS specific)
    */
  var disableSelectedIconTint: js.UndefOr[Boolean] = js.undefined
  var dotIndicator: js.UndefOr[DotIndicatorOptions] = js.undefined
  /**
    * Set the text font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Set the text font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * Set the tab icon
    */
  var icon: js.UndefOr[ImageRequireSource] = js.undefined
  /**
    * Set the icon tint
    */
  var iconColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the insets of the icon
    * #### (iOS specific)
    */
  var iconInsets: js.UndefOr[Insets] = js.undefined
  /**
    * Set the font size for selected tabs
    * #### (Android specific)
    */
  var selectedFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Set selected icon image
    * #### (iOS specific)
    */
  var selectedIcon: js.UndefOr[ImageRequireSource] = js.undefined
  /**
    * Set the selected icon tint
    */
  var selectedIconColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the selected text color
    */
  var selectedTextColor: js.UndefOr[Color] = js.undefined
  /**
    * Set a testID to reference the tab in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  /**
    * Set the text to display below the icon
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Set the text color
    */
  var textColor: js.UndefOr[Color] = js.undefined
}

object OptionsBottomTab {
  @scala.inline
  def apply(
    badge: String = null,
    badgeColor: String = null,
    disableIconTint: js.UndefOr[Boolean] = js.undefined,
    disableSelectedIconTint: js.UndefOr[Boolean] = js.undefined,
    dotIndicator: DotIndicatorOptions = null,
    fontFamily: FontFamily = null,
    fontSize: Int | Double = null,
    fontWeight: FontWeight = null,
    icon: Int | Double = null,
    iconColor: Color = null,
    iconInsets: Insets = null,
    selectedFontSize: Int | Double = null,
    selectedIcon: Int | Double = null,
    selectedIconColor: Color = null,
    selectedTextColor: Color = null,
    testID: String = null,
    text: String = null,
    textColor: Color = null
  ): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIconTint)) __obj.updateDynamic("disableIconTint")(disableIconTint.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelectedIconTint)) __obj.updateDynamic("disableSelectedIconTint")(disableSelectedIconTint.asInstanceOf[js.Any])
    if (dotIndicator != null) __obj.updateDynamic("dotIndicator")(dotIndicator.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconInsets != null) __obj.updateDynamic("iconInsets")(iconInsets.asInstanceOf[js.Any])
    if (selectedFontSize != null) __obj.updateDynamic("selectedFontSize")(selectedFontSize.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (selectedIconColor != null) __obj.updateDynamic("selectedIconColor")(selectedIconColor.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsBottomTab]
  }
}

