package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.error
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.primary
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.success
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  /**
    * Custom component to replace the badge component
    *
    * @default View (if onPress then TouchableOpacity)
    */
  var Component: js.UndefOr[ComponentClassP[js.Object]] = js.undefined
  /**
    * Additional styling for badge (background) view component
    */
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Style for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Function called when pressed on the badge
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Determines color of the indicator
    *
    * @default primary
    */
  var status: js.UndefOr[primary | success | warning | error] = js.undefined
  /**
    * Style for the text in the badge
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Text value to be displayed by badge
    *
    * @default null
    */
  var value: js.UndefOr[Node] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    Component: ComponentClassP[js.Object] = null,
    badgeStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    status: primary | success | warning | error = null,
    textStyle: StyleProp[TextStyle] = null,
    value: VdomNode = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

