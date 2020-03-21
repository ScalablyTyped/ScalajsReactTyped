package typingsJapgolly.stripejs.elementMod

import typingsJapgolly.stripejs.stripejsStrings.auto
import typingsJapgolly.stripejs.stripejsStrings.da
import typingsJapgolly.stripejs.stripejsStrings.de
import typingsJapgolly.stripejs.stripejsStrings.en
import typingsJapgolly.stripejs.stripejsStrings.es
import typingsJapgolly.stripejs.stripejsStrings.fi
import typingsJapgolly.stripejs.stripejsStrings.fr
import typingsJapgolly.stripejs.stripejsStrings.it
import typingsJapgolly.stripejs.stripejsStrings.ja
import typingsJapgolly.stripejs.stripejsStrings.nl
import typingsJapgolly.stripejs.stripejsStrings.no
import typingsJapgolly.stripejs.stripejsStrings.sv
import typingsJapgolly.stripejs.stripejsStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.undefined
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.undefined
}

object ElementCreatorOptions {
  @scala.inline
  def apply(
    fonts: js.Array[FontCSSElement | FontConfigElement] = null,
    locale: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String = null
  ): ElementCreatorOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCreatorOptions]
  }
}

