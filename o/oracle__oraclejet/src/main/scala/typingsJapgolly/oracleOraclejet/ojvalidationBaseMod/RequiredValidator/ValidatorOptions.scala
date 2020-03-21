package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.RequiredValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageSummary: js.UndefOr[String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(hint: String = null, messageDetail: String = null, messageSummary: String = null): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

