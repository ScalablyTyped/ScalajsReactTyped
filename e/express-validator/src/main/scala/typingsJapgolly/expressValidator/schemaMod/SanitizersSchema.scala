package typingsJapgolly.expressValidator.schemaMod

import typingsJapgolly.expressValidator.expressValidatorStrings.blacklist
import typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer
import typingsJapgolly.expressValidator.expressValidatorStrings.escape
import typingsJapgolly.expressValidator.expressValidatorStrings.ltrim
import typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.rtrim
import typingsJapgolly.expressValidator.expressValidatorStrings.stripLow
import typingsJapgolly.expressValidator.expressValidatorStrings.toArray
import typingsJapgolly.expressValidator.expressValidatorStrings.toBoolean
import typingsJapgolly.expressValidator.expressValidatorStrings.toDate
import typingsJapgolly.expressValidator.expressValidatorStrings.toFloat
import typingsJapgolly.expressValidator.expressValidatorStrings.toInt
import typingsJapgolly.expressValidator.expressValidatorStrings.trim
import typingsJapgolly.expressValidator.expressValidatorStrings.unescape
import typingsJapgolly.expressValidator.expressValidatorStrings.whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
trait SanitizersSchema extends js.Object {
  var blacklist: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.blacklist]
  ] = js.undefined
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer]
  ] = js.undefined
  var escape: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.escape]
  ] = js.undefined
  var ltrim: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.ltrim]
  ] = js.undefined
  var normalizeEmail: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail]
  ] = js.undefined
  var rtrim: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.rtrim]
  ] = js.undefined
  var stripLow: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.stripLow]
  ] = js.undefined
  var toArray: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toArray]
  ] = js.undefined
  var toBoolean: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toBoolean]
  ] = js.undefined
  var toDate: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toDate]
  ] = js.undefined
  var toFloat: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toFloat]
  ] = js.undefined
  var toInt: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toInt]
  ] = js.undefined
  var trim: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.trim]
  ] = js.undefined
  var unescape: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.unescape]
  ] = js.undefined
  var whitelist: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.whitelist]
  ] = js.undefined
}

object SanitizersSchema {
  @scala.inline
  def apply(
    blacklist: SanitizerSchemaOptions[blacklist] = null,
    customSanitizer: SanitizerSchemaOptions[customSanitizer] = null,
    escape: SanitizerSchemaOptions[escape] = null,
    ltrim: SanitizerSchemaOptions[ltrim] = null,
    normalizeEmail: SanitizerSchemaOptions[normalizeEmail] = null,
    rtrim: SanitizerSchemaOptions[rtrim] = null,
    stripLow: SanitizerSchemaOptions[stripLow] = null,
    toArray: SanitizerSchemaOptions[toArray] = null,
    toBoolean: SanitizerSchemaOptions[toBoolean] = null,
    toDate: SanitizerSchemaOptions[toDate] = null,
    toFloat: SanitizerSchemaOptions[toFloat] = null,
    toInt: SanitizerSchemaOptions[toInt] = null,
    trim: SanitizerSchemaOptions[trim] = null,
    unescape: SanitizerSchemaOptions[unescape] = null,
    whitelist: SanitizerSchemaOptions[whitelist] = null
  ): SanitizersSchema = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (customSanitizer != null) __obj.updateDynamic("customSanitizer")(customSanitizer.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (ltrim != null) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (normalizeEmail != null) __obj.updateDynamic("normalizeEmail")(normalizeEmail.asInstanceOf[js.Any])
    if (rtrim != null) __obj.updateDynamic("rtrim")(rtrim.asInstanceOf[js.Any])
    if (stripLow != null) __obj.updateDynamic("stripLow")(stripLow.asInstanceOf[js.Any])
    if (toArray != null) __obj.updateDynamic("toArray")(toArray.asInstanceOf[js.Any])
    if (toBoolean != null) __obj.updateDynamic("toBoolean")(toBoolean.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (toFloat != null) __obj.updateDynamic("toFloat")(toFloat.asInstanceOf[js.Any])
    if (toInt != null) __obj.updateDynamic("toInt")(toInt.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (unescape != null) __obj.updateDynamic("unescape")(unescape.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizersSchema]
  }
}

