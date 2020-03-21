package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingCardProps extends js.Object {
  /**
    * {title, icon, buttonStyle}
    * Button information
    */
  var button: ButtonInformation
  /**
    * Color scheme for button & title
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Outer component styling
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Pricing information
    */
  var info: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * component info text style
    */
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Function to be run when button is pressed
    */
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Price
    */
  var price: String
  /**
    * component pricing text style
    */
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * component title style
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Inner wrapper component styling
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PricingCardProps {
  @scala.inline
  def apply(
    button: ButtonInformation,
    price: String,
    color: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    info: js.Array[String] = null,
    infoStyle: StyleProp[TextStyle] = null,
    onButtonPress: js.UndefOr[Callback] = js.undefined,
    pricingStyle: StyleProp[TextStyle] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null
  ): PricingCardProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoStyle != null) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    onButtonPress.foreach(p => __obj.updateDynamic("onButtonPress")(p.toJsFn))
    if (pricingStyle != null) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingCardProps]
  }
}

