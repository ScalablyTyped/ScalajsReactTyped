package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  /** Postal code. This is equivalent to the id field. */
  var code: js.UndefOr[String] = js.undefined
  /** Country code of the country to which this postal code belongs. */
  var countryCode: js.UndefOr[String] = js.undefined
  /** DART ID of the country to which this postal code belongs. */
  var countryDartId: js.UndefOr[String] = js.undefined
  /** ID of this postal code. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode". */
  var kind: js.UndefOr[String] = js.undefined
}

object PostalCode {
  @scala.inline
  def apply(
    code: String = null,
    countryCode: String = null,
    countryDartId: String = null,
    id: String = null,
    kind: String = null
  ): PostalCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCode]
  }
}

