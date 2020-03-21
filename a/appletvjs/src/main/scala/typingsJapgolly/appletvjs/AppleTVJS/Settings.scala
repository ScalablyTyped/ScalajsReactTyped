package typingsJapgolly.appletvjs.AppleTVJS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Contains the language the device displays information in. */
  var language: String
  /** Contains the restriction information on the device. */
  var restrictions: Restrictions
  /** Contains the country code used by the store on this device. */
  var storefrontCountryCode: String
  /**
  		* Called when changes to a device’s restriction information changes.
  		*/
  def onRestrictionsChange(): Unit
}

object Settings {
  @scala.inline
  def apply(
    language: String,
    onRestrictionsChange: Callback,
    restrictions: Restrictions,
    storefrontCountryCode: String
  ): Settings = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], storefrontCountryCode = storefrontCountryCode.asInstanceOf[js.Any])
    __obj.updateDynamic("onRestrictionsChange")(onRestrictionsChange.toJsFn)
    __obj.asInstanceOf[Settings]
  }
}

