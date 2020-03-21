package typingsJapgolly.stripejs.elementMod

import typingsJapgolly.stripejs.AnonEmpty
import typingsJapgolly.stripejs.AnonInvalid
import typingsJapgolly.stripejs.stripejsStrings.default
import typingsJapgolly.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANElementOptions extends BaseOptions {
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.undefined
  /**
    * Customize the country and format of the placeholder IBAN
    * @default 'DE"
    */
  var placeholderCountry: js.UndefOr[String] = js.undefined
  /**
    * Specify the list of countries or country-groups whose IBANs you want to allow
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
}

object IBANElementOptions {
  @scala.inline
  def apply(
    classes: AnonEmpty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    placeholderCountry: String = null,
    style: AnonInvalid = null,
    supportedCountries: js.Array[String] = null
  ): IBANElementOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANElementOptions]
  }
}

