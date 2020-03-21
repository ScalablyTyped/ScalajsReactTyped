package typingsJapgolly.expressValidator.schemaMod

import typingsJapgolly.expressValidator.AnonOptions
import typingsJapgolly.expressValidator.baseMod.DynamicMessageCreator
import typingsJapgolly.expressValidator.baseMod.Location
import typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
import typingsJapgolly.expressValidator.expressValidatorStrings.blacklist
import typingsJapgolly.expressValidator.expressValidatorStrings.contains
import typingsJapgolly.expressValidator.expressValidatorStrings.custom
import typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer
import typingsJapgolly.expressValidator.expressValidatorStrings.equals
import typingsJapgolly.expressValidator.expressValidatorStrings.escape
import typingsJapgolly.expressValidator.expressValidatorStrings.exists
import typingsJapgolly.expressValidator.expressValidatorStrings.isAfter
import typingsJapgolly.expressValidator.expressValidatorStrings.isAlpha
import typingsJapgolly.expressValidator.expressValidatorStrings.isAlphanumeric
import typingsJapgolly.expressValidator.expressValidatorStrings.isArray
import typingsJapgolly.expressValidator.expressValidatorStrings.isAscii
import typingsJapgolly.expressValidator.expressValidatorStrings.isBIC
import typingsJapgolly.expressValidator.expressValidatorStrings.isBase32
import typingsJapgolly.expressValidator.expressValidatorStrings.isBase64
import typingsJapgolly.expressValidator.expressValidatorStrings.isBefore
import typingsJapgolly.expressValidator.expressValidatorStrings.isBoolean
import typingsJapgolly.expressValidator.expressValidatorStrings.isByteLength
import typingsJapgolly.expressValidator.expressValidatorStrings.isCreditCard
import typingsJapgolly.expressValidator.expressValidatorStrings.isCurrency
import typingsJapgolly.expressValidator.expressValidatorStrings.isDataURI
import typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal
import typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy
import typingsJapgolly.expressValidator.expressValidatorStrings.isEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty
import typingsJapgolly.expressValidator.expressValidatorStrings.isFQDN
import typingsJapgolly.expressValidator.expressValidatorStrings.isFloat
import typingsJapgolly.expressValidator.expressValidatorStrings.isFullWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isHalfWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isHash
import typingsJapgolly.expressValidator.expressValidatorStrings.isHexColor
import typingsJapgolly.expressValidator.expressValidatorStrings.isHexadecimal
import typingsJapgolly.expressValidator.expressValidatorStrings.isIP
import typingsJapgolly.expressValidator.expressValidatorStrings.isIPRange
import typingsJapgolly.expressValidator.expressValidatorStrings.isISBN
import typingsJapgolly.expressValidator.expressValidatorStrings.isISIN
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha2
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha3
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO8601
import typingsJapgolly.expressValidator.expressValidatorStrings.isISRC
import typingsJapgolly.expressValidator.expressValidatorStrings.isISSN
import typingsJapgolly.expressValidator.expressValidatorStrings.isIdentityCard
import typingsJapgolly.expressValidator.expressValidatorStrings.isIn
import typingsJapgolly.expressValidator.expressValidatorStrings.isInt
import typingsJapgolly.expressValidator.expressValidatorStrings.isJSON
import typingsJapgolly.expressValidator.expressValidatorStrings.isJWT
import typingsJapgolly.expressValidator.expressValidatorStrings.isLatLong
import typingsJapgolly.expressValidator.expressValidatorStrings.isLength
import typingsJapgolly.expressValidator.expressValidatorStrings.isLowercase
import typingsJapgolly.expressValidator.expressValidatorStrings.isMACAddress
import typingsJapgolly.expressValidator.expressValidatorStrings.isMD5
import typingsJapgolly.expressValidator.expressValidatorStrings.isMagnetURI
import typingsJapgolly.expressValidator.expressValidatorStrings.isMimeType
import typingsJapgolly.expressValidator.expressValidatorStrings.isMobilePhone
import typingsJapgolly.expressValidator.expressValidatorStrings.isMongoId
import typingsJapgolly.expressValidator.expressValidatorStrings.isMultibyte
import typingsJapgolly.expressValidator.expressValidatorStrings.isNumeric
import typingsJapgolly.expressValidator.expressValidatorStrings.isOctal
import typingsJapgolly.expressValidator.expressValidatorStrings.isPort
import typingsJapgolly.expressValidator.expressValidatorStrings.isPostalCode
import typingsJapgolly.expressValidator.expressValidatorStrings.isRFC3339
import typingsJapgolly.expressValidator.expressValidatorStrings.isSlug
import typingsJapgolly.expressValidator.expressValidatorStrings.isString
import typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair
import typingsJapgolly.expressValidator.expressValidatorStrings.isURL
import typingsJapgolly.expressValidator.expressValidatorStrings.isUUID
import typingsJapgolly.expressValidator.expressValidatorStrings.isUppercase
import typingsJapgolly.expressValidator.expressValidatorStrings.isVariableWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isWhitelisted
import typingsJapgolly.expressValidator.expressValidatorStrings.ltrim
import typingsJapgolly.expressValidator.expressValidatorStrings.matches
import typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.not
import typingsJapgolly.expressValidator.expressValidatorStrings.notEmpty
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
import typingsJapgolly.expressValidator.expressValidatorStrings.withMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined express-validator.express-validator/src/middlewares/schema.ParamSchema */
trait ValidationParamSchema extends js.Object {
  var blacklist: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.blacklist]
  ] = js.undefined
  var contains: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.contains]
  ] = js.undefined
  var custom: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.custom]
  ] = js.undefined
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer]
  ] = js.undefined
  @JSName("equals")
  var equals_FValidationParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.undefined
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var escape: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.escape]
  ] = js.undefined
  var exists: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.exists]
  ] = js.undefined
  var in: js.UndefOr[Location | js.Array[Location]] = js.undefined
  var isAfter: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isAfter]
  ] = js.undefined
  var isAlpha: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isAlpha]
  ] = js.undefined
  var isAlphanumeric: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isAlphanumeric]
  ] = js.undefined
  var isArray: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isArray]
  ] = js.undefined
  var isAscii: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isAscii]
  ] = js.undefined
  var isBIC: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBIC]
  ] = js.undefined
  var isBase32: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase32]
  ] = js.undefined
  var isBase64: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase64]
  ] = js.undefined
  var isBefore: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBefore]
  ] = js.undefined
  var isBoolean: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBoolean]
  ] = js.undefined
  var isByteLength: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isByteLength]
  ] = js.undefined
  var isCreditCard: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isCreditCard]
  ] = js.undefined
  var isCurrency: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isCurrency]
  ] = js.undefined
  var isDataURI: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDataURI]
  ] = js.undefined
  var isDecimal: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal]
  ] = js.undefined
  var isDivisibleBy: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy]
  ] = js.undefined
  var isEmail: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmail]
  ] = js.undefined
  var isEmpty: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty]
  ] = js.undefined
  var isFQDN: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isFQDN]
  ] = js.undefined
  var isFloat: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isFloat]
  ] = js.undefined
  var isFullWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isFullWidth]
  ] = js.undefined
  var isHalfWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHalfWidth]
  ] = js.undefined
  var isHash: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHash]
  ] = js.undefined
  var isHexColor: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHexColor]
  ] = js.undefined
  var isHexadecimal: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHexadecimal]
  ] = js.undefined
  var isIP: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIP]
  ] = js.undefined
  var isIPRange: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIPRange]
  ] = js.undefined
  var isISBN: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISBN]
  ] = js.undefined
  var isISIN: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISIN]
  ] = js.undefined
  var isISO31661Alpha2: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha2]
  ] = js.undefined
  var isISO31661Alpha3: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha3]
  ] = js.undefined
  var isISO8601: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO8601]
  ] = js.undefined
  var isISRC: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISRC]
  ] = js.undefined
  var isISSN: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISSN]
  ] = js.undefined
  var isIdentityCard: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIdentityCard]
  ] = js.undefined
  var isIn: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIn]
  ] = js.undefined
  var isInt: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isInt]
  ] = js.undefined
  var isJSON: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isJSON]
  ] = js.undefined
  var isJWT: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isJWT]
  ] = js.undefined
  var isLatLong: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLatLong]
  ] = js.undefined
  var isLength: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLength]
  ] = js.undefined
  var isLowercase: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLowercase]
  ] = js.undefined
  var isMACAddress: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMACAddress]
  ] = js.undefined
  var isMD5: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMD5]
  ] = js.undefined
  var isMagnetURI: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMagnetURI]
  ] = js.undefined
  var isMimeType: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMimeType]
  ] = js.undefined
  var isMobilePhone: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMobilePhone]
  ] = js.undefined
  var isMongoId: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMongoId]
  ] = js.undefined
  var isMultibyte: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isMultibyte]
  ] = js.undefined
  var isNumeric: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isNumeric]
  ] = js.undefined
  var isOctal: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isOctal]
  ] = js.undefined
  var isPort: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPort]
  ] = js.undefined
  var isPostalCode: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPostalCode]
  ] = js.undefined
  var isRFC3339: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isRFC3339]
  ] = js.undefined
  var isSlug: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSlug]
  ] = js.undefined
  var isString: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isString]
  ] = js.undefined
  var isSurrogatePair: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair]
  ] = js.undefined
  var isURL: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isURL]
  ] = js.undefined
  var isUUID: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isUUID]
  ] = js.undefined
  var isUppercase: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isUppercase]
  ] = js.undefined
  var isVariableWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVariableWidth]
  ] = js.undefined
  var isWhitelisted: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isWhitelisted]
  ] = js.undefined
  var ltrim: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.ltrim]
  ] = js.undefined
  var matches: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.matches]
  ] = js.undefined
  var normalizeEmail: js.UndefOr[
    SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail]
  ] = js.undefined
  var not: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.not]
  ] = js.undefined
  var notEmpty: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.notEmpty]
  ] = js.undefined
  var optional: js.UndefOr[`true` | AnonOptions] = js.undefined
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
  var withMessage: js.UndefOr[
    ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.withMessage]
  ] = js.undefined
}

object ValidationParamSchema {
  @scala.inline
  def apply(
    blacklist: SanitizerSchemaOptions[blacklist] = null,
    contains: ValidatorSchemaOptions[contains] = null,
    custom: ValidatorSchemaOptions[custom] = null,
    customSanitizer: SanitizerSchemaOptions[customSanitizer] = null,
    equals: ValidatorSchemaOptions[equals] = null,
    errorMessage: DynamicMessageCreator | js.Any = null,
    escape: SanitizerSchemaOptions[escape] = null,
    exists: ValidatorSchemaOptions[exists] = null,
    in: Location | js.Array[Location] = null,
    isAfter: ValidatorSchemaOptions[isAfter] = null,
    isAlpha: ValidatorSchemaOptions[isAlpha] = null,
    isAlphanumeric: ValidatorSchemaOptions[isAlphanumeric] = null,
    isArray: ValidatorSchemaOptions[isArray] = null,
    isAscii: ValidatorSchemaOptions[isAscii] = null,
    isBIC: ValidatorSchemaOptions[isBIC] = null,
    isBase32: ValidatorSchemaOptions[isBase32] = null,
    isBase64: ValidatorSchemaOptions[isBase64] = null,
    isBefore: ValidatorSchemaOptions[isBefore] = null,
    isBoolean: ValidatorSchemaOptions[isBoolean] = null,
    isByteLength: ValidatorSchemaOptions[isByteLength] = null,
    isCreditCard: ValidatorSchemaOptions[isCreditCard] = null,
    isCurrency: ValidatorSchemaOptions[isCurrency] = null,
    isDataURI: ValidatorSchemaOptions[isDataURI] = null,
    isDecimal: ValidatorSchemaOptions[isDecimal] = null,
    isDivisibleBy: ValidatorSchemaOptions[isDivisibleBy] = null,
    isEmail: ValidatorSchemaOptions[isEmail] = null,
    isEmpty: ValidatorSchemaOptions[isEmpty] = null,
    isFQDN: ValidatorSchemaOptions[isFQDN] = null,
    isFloat: ValidatorSchemaOptions[isFloat] = null,
    isFullWidth: ValidatorSchemaOptions[isFullWidth] = null,
    isHalfWidth: ValidatorSchemaOptions[isHalfWidth] = null,
    isHash: ValidatorSchemaOptions[isHash] = null,
    isHexColor: ValidatorSchemaOptions[isHexColor] = null,
    isHexadecimal: ValidatorSchemaOptions[isHexadecimal] = null,
    isIP: ValidatorSchemaOptions[isIP] = null,
    isIPRange: ValidatorSchemaOptions[isIPRange] = null,
    isISBN: ValidatorSchemaOptions[isISBN] = null,
    isISIN: ValidatorSchemaOptions[isISIN] = null,
    isISO31661Alpha2: ValidatorSchemaOptions[isISO31661Alpha2] = null,
    isISO31661Alpha3: ValidatorSchemaOptions[isISO31661Alpha3] = null,
    isISO8601: ValidatorSchemaOptions[isISO8601] = null,
    isISRC: ValidatorSchemaOptions[isISRC] = null,
    isISSN: ValidatorSchemaOptions[isISSN] = null,
    isIdentityCard: ValidatorSchemaOptions[isIdentityCard] = null,
    isIn: ValidatorSchemaOptions[isIn] = null,
    isInt: ValidatorSchemaOptions[isInt] = null,
    isJSON: ValidatorSchemaOptions[isJSON] = null,
    isJWT: ValidatorSchemaOptions[isJWT] = null,
    isLatLong: ValidatorSchemaOptions[isLatLong] = null,
    isLength: ValidatorSchemaOptions[isLength] = null,
    isLowercase: ValidatorSchemaOptions[isLowercase] = null,
    isMACAddress: ValidatorSchemaOptions[isMACAddress] = null,
    isMD5: ValidatorSchemaOptions[isMD5] = null,
    isMagnetURI: ValidatorSchemaOptions[isMagnetURI] = null,
    isMimeType: ValidatorSchemaOptions[isMimeType] = null,
    isMobilePhone: ValidatorSchemaOptions[isMobilePhone] = null,
    isMongoId: ValidatorSchemaOptions[isMongoId] = null,
    isMultibyte: ValidatorSchemaOptions[isMultibyte] = null,
    isNumeric: ValidatorSchemaOptions[isNumeric] = null,
    isOctal: ValidatorSchemaOptions[isOctal] = null,
    isPort: ValidatorSchemaOptions[isPort] = null,
    isPostalCode: ValidatorSchemaOptions[isPostalCode] = null,
    isRFC3339: ValidatorSchemaOptions[isRFC3339] = null,
    isSlug: ValidatorSchemaOptions[isSlug] = null,
    isString: ValidatorSchemaOptions[isString] = null,
    isSurrogatePair: ValidatorSchemaOptions[isSurrogatePair] = null,
    isURL: ValidatorSchemaOptions[isURL] = null,
    isUUID: ValidatorSchemaOptions[isUUID] = null,
    isUppercase: ValidatorSchemaOptions[isUppercase] = null,
    isVariableWidth: ValidatorSchemaOptions[isVariableWidth] = null,
    isWhitelisted: ValidatorSchemaOptions[isWhitelisted] = null,
    ltrim: SanitizerSchemaOptions[ltrim] = null,
    matches: ValidatorSchemaOptions[matches] = null,
    normalizeEmail: SanitizerSchemaOptions[normalizeEmail] = null,
    not: ValidatorSchemaOptions[not] = null,
    notEmpty: ValidatorSchemaOptions[notEmpty] = null,
    optional: `true` | AnonOptions = null,
    rtrim: SanitizerSchemaOptions[rtrim] = null,
    stripLow: SanitizerSchemaOptions[stripLow] = null,
    toArray: SanitizerSchemaOptions[toArray] = null,
    toBoolean: SanitizerSchemaOptions[toBoolean] = null,
    toDate: SanitizerSchemaOptions[toDate] = null,
    toFloat: SanitizerSchemaOptions[toFloat] = null,
    toInt: SanitizerSchemaOptions[toInt] = null,
    trim: SanitizerSchemaOptions[trim] = null,
    unescape: SanitizerSchemaOptions[unescape] = null,
    whitelist: SanitizerSchemaOptions[whitelist] = null,
    withMessage: ValidatorSchemaOptions[withMessage] = null
  ): ValidationParamSchema = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (customSanitizer != null) __obj.updateDynamic("customSanitizer")(customSanitizer.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (exists != null) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (isAfter != null) __obj.updateDynamic("isAfter")(isAfter.asInstanceOf[js.Any])
    if (isAlpha != null) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (isAlphanumeric != null) __obj.updateDynamic("isAlphanumeric")(isAlphanumeric.asInstanceOf[js.Any])
    if (isArray != null) __obj.updateDynamic("isArray")(isArray.asInstanceOf[js.Any])
    if (isAscii != null) __obj.updateDynamic("isAscii")(isAscii.asInstanceOf[js.Any])
    if (isBIC != null) __obj.updateDynamic("isBIC")(isBIC.asInstanceOf[js.Any])
    if (isBase32 != null) __obj.updateDynamic("isBase32")(isBase32.asInstanceOf[js.Any])
    if (isBase64 != null) __obj.updateDynamic("isBase64")(isBase64.asInstanceOf[js.Any])
    if (isBefore != null) __obj.updateDynamic("isBefore")(isBefore.asInstanceOf[js.Any])
    if (isBoolean != null) __obj.updateDynamic("isBoolean")(isBoolean.asInstanceOf[js.Any])
    if (isByteLength != null) __obj.updateDynamic("isByteLength")(isByteLength.asInstanceOf[js.Any])
    if (isCreditCard != null) __obj.updateDynamic("isCreditCard")(isCreditCard.asInstanceOf[js.Any])
    if (isCurrency != null) __obj.updateDynamic("isCurrency")(isCurrency.asInstanceOf[js.Any])
    if (isDataURI != null) __obj.updateDynamic("isDataURI")(isDataURI.asInstanceOf[js.Any])
    if (isDecimal != null) __obj.updateDynamic("isDecimal")(isDecimal.asInstanceOf[js.Any])
    if (isDivisibleBy != null) __obj.updateDynamic("isDivisibleBy")(isDivisibleBy.asInstanceOf[js.Any])
    if (isEmail != null) __obj.updateDynamic("isEmail")(isEmail.asInstanceOf[js.Any])
    if (isEmpty != null) __obj.updateDynamic("isEmpty")(isEmpty.asInstanceOf[js.Any])
    if (isFQDN != null) __obj.updateDynamic("isFQDN")(isFQDN.asInstanceOf[js.Any])
    if (isFloat != null) __obj.updateDynamic("isFloat")(isFloat.asInstanceOf[js.Any])
    if (isFullWidth != null) __obj.updateDynamic("isFullWidth")(isFullWidth.asInstanceOf[js.Any])
    if (isHalfWidth != null) __obj.updateDynamic("isHalfWidth")(isHalfWidth.asInstanceOf[js.Any])
    if (isHash != null) __obj.updateDynamic("isHash")(isHash.asInstanceOf[js.Any])
    if (isHexColor != null) __obj.updateDynamic("isHexColor")(isHexColor.asInstanceOf[js.Any])
    if (isHexadecimal != null) __obj.updateDynamic("isHexadecimal")(isHexadecimal.asInstanceOf[js.Any])
    if (isIP != null) __obj.updateDynamic("isIP")(isIP.asInstanceOf[js.Any])
    if (isIPRange != null) __obj.updateDynamic("isIPRange")(isIPRange.asInstanceOf[js.Any])
    if (isISBN != null) __obj.updateDynamic("isISBN")(isISBN.asInstanceOf[js.Any])
    if (isISIN != null) __obj.updateDynamic("isISIN")(isISIN.asInstanceOf[js.Any])
    if (isISO31661Alpha2 != null) __obj.updateDynamic("isISO31661Alpha2")(isISO31661Alpha2.asInstanceOf[js.Any])
    if (isISO31661Alpha3 != null) __obj.updateDynamic("isISO31661Alpha3")(isISO31661Alpha3.asInstanceOf[js.Any])
    if (isISO8601 != null) __obj.updateDynamic("isISO8601")(isISO8601.asInstanceOf[js.Any])
    if (isISRC != null) __obj.updateDynamic("isISRC")(isISRC.asInstanceOf[js.Any])
    if (isISSN != null) __obj.updateDynamic("isISSN")(isISSN.asInstanceOf[js.Any])
    if (isIdentityCard != null) __obj.updateDynamic("isIdentityCard")(isIdentityCard.asInstanceOf[js.Any])
    if (isIn != null) __obj.updateDynamic("isIn")(isIn.asInstanceOf[js.Any])
    if (isInt != null) __obj.updateDynamic("isInt")(isInt.asInstanceOf[js.Any])
    if (isJSON != null) __obj.updateDynamic("isJSON")(isJSON.asInstanceOf[js.Any])
    if (isJWT != null) __obj.updateDynamic("isJWT")(isJWT.asInstanceOf[js.Any])
    if (isLatLong != null) __obj.updateDynamic("isLatLong")(isLatLong.asInstanceOf[js.Any])
    if (isLength != null) __obj.updateDynamic("isLength")(isLength.asInstanceOf[js.Any])
    if (isLowercase != null) __obj.updateDynamic("isLowercase")(isLowercase.asInstanceOf[js.Any])
    if (isMACAddress != null) __obj.updateDynamic("isMACAddress")(isMACAddress.asInstanceOf[js.Any])
    if (isMD5 != null) __obj.updateDynamic("isMD5")(isMD5.asInstanceOf[js.Any])
    if (isMagnetURI != null) __obj.updateDynamic("isMagnetURI")(isMagnetURI.asInstanceOf[js.Any])
    if (isMimeType != null) __obj.updateDynamic("isMimeType")(isMimeType.asInstanceOf[js.Any])
    if (isMobilePhone != null) __obj.updateDynamic("isMobilePhone")(isMobilePhone.asInstanceOf[js.Any])
    if (isMongoId != null) __obj.updateDynamic("isMongoId")(isMongoId.asInstanceOf[js.Any])
    if (isMultibyte != null) __obj.updateDynamic("isMultibyte")(isMultibyte.asInstanceOf[js.Any])
    if (isNumeric != null) __obj.updateDynamic("isNumeric")(isNumeric.asInstanceOf[js.Any])
    if (isOctal != null) __obj.updateDynamic("isOctal")(isOctal.asInstanceOf[js.Any])
    if (isPort != null) __obj.updateDynamic("isPort")(isPort.asInstanceOf[js.Any])
    if (isPostalCode != null) __obj.updateDynamic("isPostalCode")(isPostalCode.asInstanceOf[js.Any])
    if (isRFC3339 != null) __obj.updateDynamic("isRFC3339")(isRFC3339.asInstanceOf[js.Any])
    if (isSlug != null) __obj.updateDynamic("isSlug")(isSlug.asInstanceOf[js.Any])
    if (isString != null) __obj.updateDynamic("isString")(isString.asInstanceOf[js.Any])
    if (isSurrogatePair != null) __obj.updateDynamic("isSurrogatePair")(isSurrogatePair.asInstanceOf[js.Any])
    if (isURL != null) __obj.updateDynamic("isURL")(isURL.asInstanceOf[js.Any])
    if (isUUID != null) __obj.updateDynamic("isUUID")(isUUID.asInstanceOf[js.Any])
    if (isUppercase != null) __obj.updateDynamic("isUppercase")(isUppercase.asInstanceOf[js.Any])
    if (isVariableWidth != null) __obj.updateDynamic("isVariableWidth")(isVariableWidth.asInstanceOf[js.Any])
    if (isWhitelisted != null) __obj.updateDynamic("isWhitelisted")(isWhitelisted.asInstanceOf[js.Any])
    if (ltrim != null) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (normalizeEmail != null) __obj.updateDynamic("normalizeEmail")(normalizeEmail.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (notEmpty != null) __obj.updateDynamic("notEmpty")(notEmpty.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
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
    if (withMessage != null) __obj.updateDynamic("withMessage")(withMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationParamSchema]
  }
}

