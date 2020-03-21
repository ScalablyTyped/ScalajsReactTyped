package typingsJapgolly.oracleOraclejet.ojvalidationDatetimeMod.DateTimeRangeValidator

import typingsJapgolly.oracleOraclejet.AnonMin
import typingsJapgolly.oracleOraclejet.AnonRangeOverflowRangeUnderflow
import typingsJapgolly.oracleOraclejet.ojvalidationDatetimeMod.DateTimeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ValidatorOptions extends js.Object {
  var converter: DateTimeConverter
  var hint: js.UndefOr[AnonMin] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var messageDetail: js.UndefOr[AnonRangeOverflowRangeUnderflow] = js.undefined
  var messageSummary: js.UndefOr[AnonRangeOverflowRangeUnderflow] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var translationKey: js.UndefOr[String] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    converter: DateTimeConverter,
    hint: AnonMin = null,
    max: String = null,
    messageDetail: AnonRangeOverflowRangeUnderflow = null,
    messageSummary: AnonRangeOverflowRangeUnderflow = null,
    min: String = null,
    translationKey: String = null
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageSummary != null) __obj.updateDynamic("messageSummary")(messageSummary.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (translationKey != null) __obj.updateDynamic("translationKey")(translationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

