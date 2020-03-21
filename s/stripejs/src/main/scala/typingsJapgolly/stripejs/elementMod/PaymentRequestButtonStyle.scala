package typingsJapgolly.stripejs.elementMod

import typingsJapgolly.stripejs.stripejsStrings.`light-outline`
import typingsJapgolly.stripejs.stripejsStrings.buy
import typingsJapgolly.stripejs.stripejsStrings.dark
import typingsJapgolly.stripejs.stripejsStrings.default
import typingsJapgolly.stripejs.stripejsStrings.donate
import typingsJapgolly.stripejs.stripejsStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestButtonStyle extends js.Object {
  /**
    * The height of the button
    * @example '25px'
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * The theme of the button that should be used
    * @default 'dark'
    */
  var theme: js.UndefOr[dark | light | `light-outline`] = js.undefined
  /**
    * The type of button that should be shown
    * @default 'default'
    */
  var `type`: js.UndefOr[default | donate | buy] = js.undefined
}

object PaymentRequestButtonStyle {
  @scala.inline
  def apply(
    height: String = null,
    theme: dark | light | `light-outline` = null,
    `type`: default | donate | buy = null
  ): PaymentRequestButtonStyle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyle]
  }
}

