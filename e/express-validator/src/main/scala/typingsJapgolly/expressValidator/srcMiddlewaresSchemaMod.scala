package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.anon.ArrayValidationChainrunre
import typingsJapgolly.expressValidator.anon.Options
import typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
import typingsJapgolly.expressValidator.expressValidatorStrings.blacklist
import typingsJapgolly.expressValidator.expressValidatorStrings.contains
import typingsJapgolly.expressValidator.expressValidatorStrings.custom
import typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer
import typingsJapgolly.expressValidator.expressValidatorStrings.default
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
import typingsJapgolly.expressValidator.expressValidatorStrings.isBase58
import typingsJapgolly.expressValidator.expressValidatorStrings.isBase64
import typingsJapgolly.expressValidator.expressValidatorStrings.isBefore
import typingsJapgolly.expressValidator.expressValidatorStrings.isBoolean
import typingsJapgolly.expressValidator.expressValidatorStrings.isBtcAddress
import typingsJapgolly.expressValidator.expressValidatorStrings.isByteLength
import typingsJapgolly.expressValidator.expressValidatorStrings.isCreditCard
import typingsJapgolly.expressValidator.expressValidatorStrings.isCurrency
import typingsJapgolly.expressValidator.expressValidatorStrings.isDataURI
import typingsJapgolly.expressValidator.expressValidatorStrings.isDate
import typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal
import typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy
import typingsJapgolly.expressValidator.expressValidatorStrings.isEAN
import typingsJapgolly.expressValidator.expressValidatorStrings.isEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty
import typingsJapgolly.expressValidator.expressValidatorStrings.isEthereumAddress
import typingsJapgolly.expressValidator.expressValidatorStrings.isFQDN
import typingsJapgolly.expressValidator.expressValidatorStrings.isFloat
import typingsJapgolly.expressValidator.expressValidatorStrings.isFullWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isHSL
import typingsJapgolly.expressValidator.expressValidatorStrings.isHalfWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isHash
import typingsJapgolly.expressValidator.expressValidatorStrings.isHexColor
import typingsJapgolly.expressValidator.expressValidatorStrings.isHexadecimal
import typingsJapgolly.expressValidator.expressValidatorStrings.isIBAN
import typingsJapgolly.expressValidator.expressValidatorStrings.isIMEI
import typingsJapgolly.expressValidator.expressValidatorStrings.isIP
import typingsJapgolly.expressValidator.expressValidatorStrings.isIPRange
import typingsJapgolly.expressValidator.expressValidatorStrings.isISBN
import typingsJapgolly.expressValidator.expressValidatorStrings.isISIN
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha2
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO31661Alpha3
import typingsJapgolly.expressValidator.expressValidatorStrings.isISO4217
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
import typingsJapgolly.expressValidator.expressValidatorStrings.isLicensePlate
import typingsJapgolly.expressValidator.expressValidatorStrings.isLocale
import typingsJapgolly.expressValidator.expressValidatorStrings.isLowercase
import typingsJapgolly.expressValidator.expressValidatorStrings.isMACAddress
import typingsJapgolly.expressValidator.expressValidatorStrings.isMD5
import typingsJapgolly.expressValidator.expressValidatorStrings.isMagnetURI
import typingsJapgolly.expressValidator.expressValidatorStrings.isMimeType
import typingsJapgolly.expressValidator.expressValidatorStrings.isMobilePhone
import typingsJapgolly.expressValidator.expressValidatorStrings.isMongoId
import typingsJapgolly.expressValidator.expressValidatorStrings.isMultibyte
import typingsJapgolly.expressValidator.expressValidatorStrings.isNumeric
import typingsJapgolly.expressValidator.expressValidatorStrings.isObject
import typingsJapgolly.expressValidator.expressValidatorStrings.isOctal
import typingsJapgolly.expressValidator.expressValidatorStrings.isPassportNumber
import typingsJapgolly.expressValidator.expressValidatorStrings.isPort
import typingsJapgolly.expressValidator.expressValidatorStrings.isPostalCode
import typingsJapgolly.expressValidator.expressValidatorStrings.isRFC3339
import typingsJapgolly.expressValidator.expressValidatorStrings.isRgbColor
import typingsJapgolly.expressValidator.expressValidatorStrings.isSemVer
import typingsJapgolly.expressValidator.expressValidatorStrings.isSlug
import typingsJapgolly.expressValidator.expressValidatorStrings.isString
import typingsJapgolly.expressValidator.expressValidatorStrings.isStrongPassword
import typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair
import typingsJapgolly.expressValidator.expressValidatorStrings.isTaxID
import typingsJapgolly.expressValidator.expressValidatorStrings.isURL
import typingsJapgolly.expressValidator.expressValidatorStrings.isUUID
import typingsJapgolly.expressValidator.expressValidatorStrings.isUppercase
import typingsJapgolly.expressValidator.expressValidatorStrings.isVAT
import typingsJapgolly.expressValidator.expressValidatorStrings.isVariableWidth
import typingsJapgolly.expressValidator.expressValidatorStrings.isWhitelisted
import typingsJapgolly.expressValidator.expressValidatorStrings.ltrim
import typingsJapgolly.expressValidator.expressValidatorStrings.matches
import typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.not
import typingsJapgolly.expressValidator.expressValidatorStrings.notEmpty
import typingsJapgolly.expressValidator.expressValidatorStrings.replace
import typingsJapgolly.expressValidator.expressValidatorStrings.rtrim
import typingsJapgolly.expressValidator.expressValidatorStrings.stripLow
import typingsJapgolly.expressValidator.expressValidatorStrings.toArray
import typingsJapgolly.expressValidator.expressValidatorStrings.toBoolean
import typingsJapgolly.expressValidator.expressValidatorStrings.toDate
import typingsJapgolly.expressValidator.expressValidatorStrings.toFloat
import typingsJapgolly.expressValidator.expressValidatorStrings.toInt
import typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase
import typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase
import typingsJapgolly.expressValidator.expressValidatorStrings.trim
import typingsJapgolly.expressValidator.expressValidatorStrings.unescape
import typingsJapgolly.expressValidator.expressValidatorStrings.whitelist
import typingsJapgolly.expressValidator.expressValidatorStrings.withMessage
import typingsJapgolly.expressValidator.srcBaseMod.DynamicMessageCreator
import typingsJapgolly.expressValidator.srcBaseMod.Location
import typingsJapgolly.expressValidator.srcBaseMod.Meta
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresSchemaMod {
  
  @JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkSchema(schema: Schema): ArrayValidationChainrunre = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[ArrayValidationChainrunre]
  inline def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): ArrayValidationChainrunre = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any], defaultLocations.asInstanceOf[js.Any])).asInstanceOf[ArrayValidationChainrunre]
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.ValidatorsSchema & express-validator.express-validator/src/middlewares/schema.SanitizersSchema */
  trait InternalParamSchema extends StObject {
    
    var default: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.default]
      ] = js.undefined
    
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
    var equals_FInternalParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.undefined
    
    var escape: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.escape]
      ] = js.undefined
    
    var exists: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.exists]
      ] = js.undefined
    
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
    
    var isBase58: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase58]
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
    
    var isBtcAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBtcAddress]
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
    
    var isDate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDate]
      ] = js.undefined
    
    var isDecimal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal]
      ] = js.undefined
    
    var isDivisibleBy: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy]
      ] = js.undefined
    
    var isEAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEAN]
      ] = js.undefined
    
    var isEmail: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmail]
      ] = js.undefined
    
    var isEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty]
      ] = js.undefined
    
    var isEthereumAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEthereumAddress]
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
    
    var isHSL: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHSL]
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
    
    var isIBAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIBAN]
      ] = js.undefined
    
    var isIMEI: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIMEI]
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
    
    var isISO4217: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO4217]
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
    
    var isLicensePlate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLicensePlate]
      ] = js.undefined
    
    var isLocale: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLocale]
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
    
    var isObject: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isObject]
      ] = js.undefined
    
    var isOctal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isOctal]
      ] = js.undefined
    
    var isPassportNumber: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPassportNumber]
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
    
    var isRgbColor: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isRgbColor]
      ] = js.undefined
    
    var isSemVer: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSemVer]
      ] = js.undefined
    
    var isSlug: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSlug]
      ] = js.undefined
    
    var isString: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isString]
      ] = js.undefined
    
    var isStrongPassword: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isStrongPassword]
      ] = js.undefined
    
    var isSurrogatePair: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair]
      ] = js.undefined
    
    var isTaxID: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isTaxID]
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
    
    var isVAT: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVAT]
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
    
    var replace: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.replace]
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
    
    var toLowerCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase]
      ] = js.undefined
    
    var toUpperCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase]
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
  object InternalParamSchema {
    
    inline def apply(): InternalParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalParamSchema]
    }
    
    extension [Self <: InternalParamSchema](x: Self) {
      
      inline def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDefault(value: SanitizerSchemaOptions[default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      inline def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      inline def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      inline def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      inline def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      inline def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      inline def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      inline def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      inline def setIsBase58(value: ValidatorSchemaOptions[isBase58]): Self = StObject.set(x, "isBase58", value.asInstanceOf[js.Any])
      
      inline def setIsBase58Undefined: Self = StObject.set(x, "isBase58", js.undefined)
      
      inline def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      inline def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      inline def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      inline def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      inline def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      inline def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      inline def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      inline def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      inline def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      inline def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      inline def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      inline def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      inline def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      inline def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      inline def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      inline def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      inline def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      inline def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      inline def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      inline def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      inline def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      inline def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      inline def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      inline def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      inline def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      inline def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      inline def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      inline def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      inline def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      inline def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      inline def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      inline def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      inline def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      inline def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      inline def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      inline def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      inline def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      inline def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      inline def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      inline def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      inline def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      inline def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      inline def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      inline def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      inline def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      inline def setIsISO4217(value: ValidatorSchemaOptions[isISO4217]): Self = StObject.set(x, "isISO4217", value.asInstanceOf[js.Any])
      
      inline def setIsISO4217Undefined: Self = StObject.set(x, "isISO4217", js.undefined)
      
      inline def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      inline def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      inline def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      inline def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      inline def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      inline def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      inline def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      inline def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      inline def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      inline def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      inline def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      inline def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      inline def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      inline def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      inline def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      inline def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      inline def setIsLicensePlate(value: ValidatorSchemaOptions[isLicensePlate]): Self = StObject.set(x, "isLicensePlate", value.asInstanceOf[js.Any])
      
      inline def setIsLicensePlateUndefined: Self = StObject.set(x, "isLicensePlate", js.undefined)
      
      inline def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      inline def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      inline def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      inline def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      inline def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      inline def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      inline def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      inline def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      inline def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      inline def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      inline def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      inline def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      inline def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      inline def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      inline def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      inline def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      inline def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      inline def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsObject(value: ValidatorSchemaOptions[isObject]): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      inline def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      inline def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      inline def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      inline def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      inline def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      inline def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      inline def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      inline def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      inline def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      inline def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      inline def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      inline def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      inline def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      inline def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      inline def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      inline def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      inline def setIsStrongPassword(value: ValidatorSchemaOptions[isStrongPassword]): Self = StObject.set(x, "isStrongPassword", value.asInstanceOf[js.Any])
      
      inline def setIsStrongPasswordUndefined: Self = StObject.set(x, "isStrongPassword", js.undefined)
      
      inline def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      inline def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      inline def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      inline def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      inline def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      inline def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      inline def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      inline def setIsVAT(value: ValidatorSchemaOptions[isVAT]): Self = StObject.set(x, "isVAT", value.asInstanceOf[js.Any])
      
      inline def setIsVATUndefined: Self = StObject.set(x, "isVAT", js.undefined)
      
      inline def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      inline def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      inline def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      inline def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      inline def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setReplace(value: SanitizerSchemaOptions[replace]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      inline def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      inline def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      inline def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      inline def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      inline def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      inline def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      inline def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      inline def setToLowerCase(value: SanitizerSchemaOptions[toLowerCase]): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
      
      inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
      
      inline def setToUpperCase(value: SanitizerSchemaOptions[toUpperCase]): Self = StObject.set(x, "toUpperCase", value.asInstanceOf[js.Any])
      
      inline def setToUpperCaseUndefined: Self = StObject.set(x, "toUpperCase", js.undefined)
      
      inline def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      inline def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.InternalParamSchema & {  in :express-validator.express-validator/src/base.Location | std.Array<express-validator.express-validator/src/base.Location> | undefined,   errorMessage :express-validator.express-validator/src/base.DynamicMessageCreator | any | undefined,   optional :true | {  options :std.Partial<express-validator.express-validator/src/context.Optional> | undefined} | undefined} */
  trait ParamSchema extends StObject {
    
    var default: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.default]
      ] = js.undefined
    
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
    var equals_FParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.undefined
    
    var errorMessage: js.UndefOr[DynamicMessageCreator | Any] = js.undefined
    
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
    
    var isBase58: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase58]
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
    
    var isBtcAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBtcAddress]
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
    
    var isDate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDate]
      ] = js.undefined
    
    var isDecimal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal]
      ] = js.undefined
    
    var isDivisibleBy: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy]
      ] = js.undefined
    
    var isEAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEAN]
      ] = js.undefined
    
    var isEmail: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmail]
      ] = js.undefined
    
    var isEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty]
      ] = js.undefined
    
    var isEthereumAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEthereumAddress]
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
    
    var isHSL: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHSL]
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
    
    var isIBAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIBAN]
      ] = js.undefined
    
    var isIMEI: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIMEI]
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
    
    var isISO4217: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO4217]
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
    
    var isLicensePlate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLicensePlate]
      ] = js.undefined
    
    var isLocale: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLocale]
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
    
    var isObject: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isObject]
      ] = js.undefined
    
    var isOctal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isOctal]
      ] = js.undefined
    
    var isPassportNumber: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPassportNumber]
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
    
    var isRgbColor: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isRgbColor]
      ] = js.undefined
    
    var isSemVer: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSemVer]
      ] = js.undefined
    
    var isSlug: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSlug]
      ] = js.undefined
    
    var isString: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isString]
      ] = js.undefined
    
    var isStrongPassword: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isStrongPassword]
      ] = js.undefined
    
    var isSurrogatePair: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair]
      ] = js.undefined
    
    var isTaxID: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isTaxID]
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
    
    var isVAT: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVAT]
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
    
    var optional: js.UndefOr[`true` | Options] = js.undefined
    
    var replace: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.replace]
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
    
    var toLowerCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase]
      ] = js.undefined
    
    var toUpperCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase]
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
  object ParamSchema {
    
    inline def apply(): ParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamSchema]
    }
    
    extension [Self <: ParamSchema](x: Self) {
      
      inline def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDefault(value: SanitizerSchemaOptions[default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setErrorMessage(value: DynamicMessageCreator | Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageFunction2(value: (/* value */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setIn(value: Location | js.Array[Location]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInVarargs(value: Location*): Self = StObject.set(x, "in", js.Array(value*))
      
      inline def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      inline def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      inline def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      inline def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      inline def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      inline def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      inline def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      inline def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      inline def setIsBase58(value: ValidatorSchemaOptions[isBase58]): Self = StObject.set(x, "isBase58", value.asInstanceOf[js.Any])
      
      inline def setIsBase58Undefined: Self = StObject.set(x, "isBase58", js.undefined)
      
      inline def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      inline def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      inline def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      inline def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      inline def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      inline def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      inline def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      inline def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      inline def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      inline def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      inline def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      inline def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      inline def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      inline def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      inline def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      inline def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      inline def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      inline def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      inline def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      inline def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      inline def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      inline def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      inline def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      inline def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      inline def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      inline def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      inline def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      inline def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      inline def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      inline def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      inline def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      inline def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      inline def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      inline def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      inline def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      inline def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      inline def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      inline def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      inline def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      inline def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      inline def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      inline def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      inline def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      inline def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      inline def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      inline def setIsISO4217(value: ValidatorSchemaOptions[isISO4217]): Self = StObject.set(x, "isISO4217", value.asInstanceOf[js.Any])
      
      inline def setIsISO4217Undefined: Self = StObject.set(x, "isISO4217", js.undefined)
      
      inline def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      inline def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      inline def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      inline def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      inline def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      inline def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      inline def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      inline def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      inline def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      inline def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      inline def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      inline def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      inline def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      inline def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      inline def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      inline def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      inline def setIsLicensePlate(value: ValidatorSchemaOptions[isLicensePlate]): Self = StObject.set(x, "isLicensePlate", value.asInstanceOf[js.Any])
      
      inline def setIsLicensePlateUndefined: Self = StObject.set(x, "isLicensePlate", js.undefined)
      
      inline def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      inline def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      inline def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      inline def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      inline def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      inline def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      inline def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      inline def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      inline def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      inline def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      inline def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      inline def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      inline def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      inline def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      inline def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      inline def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      inline def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      inline def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsObject(value: ValidatorSchemaOptions[isObject]): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      inline def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      inline def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      inline def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      inline def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      inline def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      inline def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      inline def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      inline def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      inline def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      inline def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      inline def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      inline def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      inline def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      inline def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      inline def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      inline def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      inline def setIsStrongPassword(value: ValidatorSchemaOptions[isStrongPassword]): Self = StObject.set(x, "isStrongPassword", value.asInstanceOf[js.Any])
      
      inline def setIsStrongPasswordUndefined: Self = StObject.set(x, "isStrongPassword", js.undefined)
      
      inline def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      inline def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      inline def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      inline def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      inline def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      inline def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      inline def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      inline def setIsVAT(value: ValidatorSchemaOptions[isVAT]): Self = StObject.set(x, "isVAT", value.asInstanceOf[js.Any])
      
      inline def setIsVATUndefined: Self = StObject.set(x, "isVAT", js.undefined)
      
      inline def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      inline def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      inline def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      inline def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      inline def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOptional(value: `true` | Options): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setReplace(value: SanitizerSchemaOptions[replace]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      inline def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      inline def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      inline def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      inline def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      inline def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      inline def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      inline def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      inline def setToLowerCase(value: SanitizerSchemaOptions[toLowerCase]): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
      
      inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
      
      inline def setToUpperCase(value: SanitizerSchemaOptions[toUpperCase]): Self = StObject.set(x, "toUpperCase", value.asInstanceOf[js.Any])
      
      inline def setToUpperCaseUndefined: Self = StObject.set(x, "toUpperCase", js.undefined)
      
      inline def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      inline def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
    - typingsJapgolly.expressValidator.anon.`0`[K]
  */
  trait SanitizerSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | default | replace | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | toLowerCase | toUpperCase | trim | whitelist */] extends StObject
  
  /* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
  trait SanitizersSchema extends StObject {
    
    var default: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.default]
      ] = js.undefined
    
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
    
    var replace: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.replace]
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
    
    var toLowerCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase]
      ] = js.undefined
    
    var toUpperCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase]
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
    
    inline def apply(): SanitizersSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SanitizersSchema]
    }
    
    extension [Self <: SanitizersSchema](x: Self) {
      
      inline def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      inline def setDefault(value: SanitizerSchemaOptions[default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      inline def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      inline def setReplace(value: SanitizerSchemaOptions[replace]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      inline def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      inline def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      inline def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      inline def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      inline def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      inline def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      inline def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      inline def setToLowerCase(value: SanitizerSchemaOptions[toLowerCase]): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
      
      inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
      
      inline def setToUpperCase(value: SanitizerSchemaOptions[toUpperCase]): Self = StObject.set(x, "toUpperCase", value.asInstanceOf[js.Any])
      
      inline def setToUpperCaseUndefined: Self = StObject.set(x, "toUpperCase", js.undefined)
      
      inline def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    }
  }
  
  type Schema = Record[String, ParamSchema]
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.ParamSchema */
  trait ValidationParamSchema extends StObject {
    
    var default: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.default]
      ] = js.undefined
    
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
    
    var errorMessage: js.UndefOr[DynamicMessageCreator | Any] = js.undefined
    
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
    
    var isBase58: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase58]
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
    
    var isBtcAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBtcAddress]
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
    
    var isDate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDate]
      ] = js.undefined
    
    var isDecimal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal]
      ] = js.undefined
    
    var isDivisibleBy: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy]
      ] = js.undefined
    
    var isEAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEAN]
      ] = js.undefined
    
    var isEmail: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmail]
      ] = js.undefined
    
    var isEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty]
      ] = js.undefined
    
    var isEthereumAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEthereumAddress]
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
    
    var isHSL: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHSL]
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
    
    var isIBAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIBAN]
      ] = js.undefined
    
    var isIMEI: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIMEI]
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
    
    var isISO4217: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO4217]
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
    
    var isLicensePlate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLicensePlate]
      ] = js.undefined
    
    var isLocale: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLocale]
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
    
    var isObject: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isObject]
      ] = js.undefined
    
    var isOctal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isOctal]
      ] = js.undefined
    
    var isPassportNumber: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPassportNumber]
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
    
    var isRgbColor: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isRgbColor]
      ] = js.undefined
    
    var isSemVer: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSemVer]
      ] = js.undefined
    
    var isSlug: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSlug]
      ] = js.undefined
    
    var isString: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isString]
      ] = js.undefined
    
    var isStrongPassword: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isStrongPassword]
      ] = js.undefined
    
    var isSurrogatePair: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair]
      ] = js.undefined
    
    var isTaxID: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isTaxID]
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
    
    var isVAT: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVAT]
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
    
    var optional: js.UndefOr[`true` | Options] = js.undefined
    
    var replace: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.replace]
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
    
    var toLowerCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase]
      ] = js.undefined
    
    var toUpperCase: js.UndefOr[
        SanitizerSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase]
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
    
    inline def apply(): ValidationParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationParamSchema]
    }
    
    extension [Self <: ValidationParamSchema](x: Self) {
      
      inline def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      inline def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDefault(value: SanitizerSchemaOptions[default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setErrorMessage(value: DynamicMessageCreator | Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageFunction2(value: (/* value */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setIn(value: Location | js.Array[Location]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInVarargs(value: Location*): Self = StObject.set(x, "in", js.Array(value*))
      
      inline def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      inline def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      inline def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      inline def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      inline def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      inline def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      inline def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      inline def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      inline def setIsBase58(value: ValidatorSchemaOptions[isBase58]): Self = StObject.set(x, "isBase58", value.asInstanceOf[js.Any])
      
      inline def setIsBase58Undefined: Self = StObject.set(x, "isBase58", js.undefined)
      
      inline def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      inline def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      inline def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      inline def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      inline def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      inline def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      inline def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      inline def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      inline def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      inline def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      inline def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      inline def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      inline def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      inline def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      inline def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      inline def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      inline def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      inline def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      inline def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      inline def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      inline def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      inline def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      inline def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      inline def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      inline def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      inline def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      inline def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      inline def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      inline def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      inline def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      inline def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      inline def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      inline def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      inline def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      inline def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      inline def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      inline def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      inline def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      inline def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      inline def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      inline def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      inline def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      inline def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      inline def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      inline def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      inline def setIsISO4217(value: ValidatorSchemaOptions[isISO4217]): Self = StObject.set(x, "isISO4217", value.asInstanceOf[js.Any])
      
      inline def setIsISO4217Undefined: Self = StObject.set(x, "isISO4217", js.undefined)
      
      inline def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      inline def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      inline def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      inline def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      inline def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      inline def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      inline def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      inline def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      inline def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      inline def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      inline def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      inline def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      inline def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      inline def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      inline def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      inline def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      inline def setIsLicensePlate(value: ValidatorSchemaOptions[isLicensePlate]): Self = StObject.set(x, "isLicensePlate", value.asInstanceOf[js.Any])
      
      inline def setIsLicensePlateUndefined: Self = StObject.set(x, "isLicensePlate", js.undefined)
      
      inline def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      inline def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      inline def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      inline def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      inline def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      inline def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      inline def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      inline def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      inline def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      inline def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      inline def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      inline def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      inline def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      inline def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      inline def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      inline def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      inline def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      inline def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsObject(value: ValidatorSchemaOptions[isObject]): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      inline def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      inline def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      inline def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      inline def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      inline def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      inline def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      inline def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      inline def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      inline def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      inline def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      inline def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      inline def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      inline def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      inline def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      inline def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      inline def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      inline def setIsStrongPassword(value: ValidatorSchemaOptions[isStrongPassword]): Self = StObject.set(x, "isStrongPassword", value.asInstanceOf[js.Any])
      
      inline def setIsStrongPasswordUndefined: Self = StObject.set(x, "isStrongPassword", js.undefined)
      
      inline def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      inline def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      inline def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      inline def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      inline def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      inline def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      inline def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      inline def setIsVAT(value: ValidatorSchemaOptions[isVAT]): Self = StObject.set(x, "isVAT", value.asInstanceOf[js.Any])
      
      inline def setIsVATUndefined: Self = StObject.set(x, "isVAT", js.undefined)
      
      inline def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      inline def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      inline def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      inline def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      inline def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      inline def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOptional(value: `true` | Options): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setReplace(value: SanitizerSchemaOptions[replace]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      inline def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      inline def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      inline def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      inline def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      inline def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      inline def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      inline def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      inline def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      inline def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      inline def setToLowerCase(value: SanitizerSchemaOptions[toLowerCase]): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
      
      inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
      
      inline def setToUpperCase(value: SanitizerSchemaOptions[toUpperCase]): Self = StObject.set(x, "toUpperCase", value.asInstanceOf[js.Any])
      
      inline def setToUpperCaseUndefined: Self = StObject.set(x, "toUpperCase", js.undefined)
      
      inline def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      inline def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  type ValidationSchema = Schema
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
    - typingsJapgolly.expressValidator.anon.Bail[K]
  */
  trait ValidatorSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typingsJapgolly.expressValidator.expressValidatorStrings.not, typingsJapgolly.expressValidator.expressValidatorStrings.withMessage, typingsJapgolly.expressValidator.expressValidatorStrings.custom */ Any */] extends StObject
  
  /* Inlined {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>} */
  trait ValidatorsSchema extends StObject {
    
    var contains: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.contains]
      ] = js.undefined
    
    var custom: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.custom]
      ] = js.undefined
    
    @JSName("equals")
    var equals_FValidatorsSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.undefined
    
    var exists: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.exists]
      ] = js.undefined
    
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
    
    var isBase58: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBase58]
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
    
    var isBtcAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isBtcAddress]
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
    
    var isDate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDate]
      ] = js.undefined
    
    var isDecimal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDecimal]
      ] = js.undefined
    
    var isDivisibleBy: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isDivisibleBy]
      ] = js.undefined
    
    var isEAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEAN]
      ] = js.undefined
    
    var isEmail: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmail]
      ] = js.undefined
    
    var isEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEmpty]
      ] = js.undefined
    
    var isEthereumAddress: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isEthereumAddress]
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
    
    var isHSL: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isHSL]
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
    
    var isIBAN: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIBAN]
      ] = js.undefined
    
    var isIMEI: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isIMEI]
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
    
    var isISO4217: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isISO4217]
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
    
    var isLicensePlate: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLicensePlate]
      ] = js.undefined
    
    var isLocale: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isLocale]
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
    
    var isObject: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isObject]
      ] = js.undefined
    
    var isOctal: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isOctal]
      ] = js.undefined
    
    var isPassportNumber: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isPassportNumber]
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
    
    var isRgbColor: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isRgbColor]
      ] = js.undefined
    
    var isSemVer: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSemVer]
      ] = js.undefined
    
    var isSlug: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSlug]
      ] = js.undefined
    
    var isString: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isString]
      ] = js.undefined
    
    var isStrongPassword: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isStrongPassword]
      ] = js.undefined
    
    var isSurrogatePair: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isSurrogatePair]
      ] = js.undefined
    
    var isTaxID: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isTaxID]
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
    
    var isVAT: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVAT]
      ] = js.undefined
    
    var isVariableWidth: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isVariableWidth]
      ] = js.undefined
    
    var isWhitelisted: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.isWhitelisted]
      ] = js.undefined
    
    var matches: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.matches]
      ] = js.undefined
    
    var not: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.not]
      ] = js.undefined
    
    var notEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.notEmpty]
      ] = js.undefined
    
    var withMessage: js.UndefOr[
        ValidatorSchemaOptions[typingsJapgolly.expressValidator.expressValidatorStrings.withMessage]
      ] = js.undefined
  }
  object ValidatorsSchema {
    
    inline def apply(): ValidatorsSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorsSchema]
    }
    
    extension [Self <: ValidatorsSchema](x: Self) {
      
      inline def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      inline def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      inline def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      inline def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      inline def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      inline def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      inline def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      inline def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      inline def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      inline def setIsBase58(value: ValidatorSchemaOptions[isBase58]): Self = StObject.set(x, "isBase58", value.asInstanceOf[js.Any])
      
      inline def setIsBase58Undefined: Self = StObject.set(x, "isBase58", js.undefined)
      
      inline def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      inline def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      inline def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      inline def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      inline def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      inline def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      inline def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      inline def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      inline def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      inline def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      inline def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      inline def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      inline def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      inline def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      inline def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      inline def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      inline def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      inline def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      inline def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      inline def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      inline def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      inline def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      inline def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      inline def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      inline def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      inline def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      inline def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      inline def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      inline def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      inline def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      inline def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      inline def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      inline def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      inline def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      inline def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      inline def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      inline def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      inline def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      inline def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      inline def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      inline def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      inline def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      inline def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      inline def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      inline def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      inline def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      inline def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      inline def setIsISO4217(value: ValidatorSchemaOptions[isISO4217]): Self = StObject.set(x, "isISO4217", value.asInstanceOf[js.Any])
      
      inline def setIsISO4217Undefined: Self = StObject.set(x, "isISO4217", js.undefined)
      
      inline def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      inline def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      inline def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      inline def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      inline def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      inline def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      inline def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      inline def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      inline def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      inline def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      inline def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      inline def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      inline def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      inline def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      inline def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      inline def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      inline def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      inline def setIsLicensePlate(value: ValidatorSchemaOptions[isLicensePlate]): Self = StObject.set(x, "isLicensePlate", value.asInstanceOf[js.Any])
      
      inline def setIsLicensePlateUndefined: Self = StObject.set(x, "isLicensePlate", js.undefined)
      
      inline def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      inline def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      inline def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      inline def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      inline def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      inline def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      inline def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      inline def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      inline def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      inline def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      inline def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      inline def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      inline def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      inline def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      inline def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      inline def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      inline def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      inline def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      inline def setIsObject(value: ValidatorSchemaOptions[isObject]): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      inline def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      inline def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      inline def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      inline def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      inline def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      inline def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      inline def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      inline def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      inline def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      inline def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      inline def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      inline def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      inline def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      inline def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      inline def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      inline def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      inline def setIsStrongPassword(value: ValidatorSchemaOptions[isStrongPassword]): Self = StObject.set(x, "isStrongPassword", value.asInstanceOf[js.Any])
      
      inline def setIsStrongPasswordUndefined: Self = StObject.set(x, "isStrongPassword", js.undefined)
      
      inline def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      inline def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      inline def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      inline def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      inline def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      inline def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      inline def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      inline def setIsVAT(value: ValidatorSchemaOptions[isVAT]): Self = StObject.set(x, "isVAT", value.asInstanceOf[js.Any])
      
      inline def setIsVATUndefined: Self = StObject.set(x, "isVAT", js.undefined)
      
      inline def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      inline def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      inline def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      inline def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
}
