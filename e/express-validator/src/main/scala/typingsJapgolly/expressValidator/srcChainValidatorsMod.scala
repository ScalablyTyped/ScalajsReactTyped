package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.anon.CheckFalsy
import typingsJapgolly.expressValidator.anon.Max
import typingsJapgolly.expressValidator.anon.Strict
import typingsJapgolly.expressValidator.srcBaseMod.CustomValidator
import typingsJapgolly.expressValidator.srcBaseMod.DynamicMessageCreator
import typingsJapgolly.expressValidator.srcOptionsMod.AlphaLocale
import typingsJapgolly.expressValidator.srcOptionsMod.AlphanumericLocale
import typingsJapgolly.expressValidator.srcOptionsMod.ContainsOptions
import typingsJapgolly.expressValidator.srcOptionsMod.HashAlgorithm
import typingsJapgolly.expressValidator.srcOptionsMod.IPVersion
import typingsJapgolly.expressValidator.srcOptionsMod.IdentityCardLocale
import typingsJapgolly.expressValidator.srcOptionsMod.IsAlphaOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsAlphanumericOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsBase64Options
import typingsJapgolly.expressValidator.srcOptionsMod.IsBooleanOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsCurrencyOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsDateOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsDecimalOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsEmailOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsEmptyOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsFQDNOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsFloatOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsIMEIOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsISO8601Options
import typingsJapgolly.expressValidator.srcOptionsMod.IsISSNOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsIntOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsJSONOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsLatLongOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsLicensePlateLocale
import typingsJapgolly.expressValidator.srcOptionsMod.IsMACAddressOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsMobilePhoneOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsNumericOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsStrongPasswordOptions
import typingsJapgolly.expressValidator.srcOptionsMod.IsURLOptions
import typingsJapgolly.expressValidator.srcOptionsMod.MinMaxExtendedOptions
import typingsJapgolly.expressValidator.srcOptionsMod.MinMaxOptions
import typingsJapgolly.expressValidator.srcOptionsMod.MobilePhoneLocale
import typingsJapgolly.expressValidator.srcOptionsMod.PassportCountryCode
import typingsJapgolly.expressValidator.srcOptionsMod.PostalCodeLocale
import typingsJapgolly.expressValidator.srcOptionsMod.TaxIDLocale
import typingsJapgolly.expressValidator.srcOptionsMod.UUIDVersion
import typingsJapgolly.expressValidator.srcOptionsMod.VATCountryCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainValidatorsMod {
  
  @js.native
  trait Validators[Return] extends StObject {
    
    def contains(elem: Any): Return = js.native
    def contains(elem: Any, options: ContainsOptions): Return = js.native
    
    def custom(validator: CustomValidator): Return = js.native
    
    def equals(comparison: String): Return = js.native
    
    def exists(): Return = js.native
    def exists(options: CheckFalsy): Return = js.native
    
    def isAfter(): Return = js.native
    def isAfter(date: String): Return = js.native
    
    def isAlpha(): Return = js.native
    def isAlpha(locale: Unit, options: IsAlphaOptions): Return = js.native
    def isAlpha(locale: AlphaLocale): Return = js.native
    def isAlpha(locale: AlphaLocale, options: IsAlphaOptions): Return = js.native
    
    def isAlphanumeric(): Return = js.native
    def isAlphanumeric(locale: Unit, options: IsAlphanumericOptions): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale, options: IsAlphanumericOptions): Return = js.native
    
    def isArray(): Return = js.native
    def isArray(options: Max): Return = js.native
    
    def isAscii(): Return = js.native
    
    def isBIC(): Return = js.native
    
    def isBase32(): Return = js.native
    
    def isBase58(): Return = js.native
    
    def isBase64(): Return = js.native
    def isBase64(options: IsBase64Options): Return = js.native
    
    def isBefore(): Return = js.native
    def isBefore(date: String): Return = js.native
    
    def isBoolean(): Return = js.native
    def isBoolean(options: IsBooleanOptions): Return = js.native
    
    def isBtcAddress(): Return = js.native
    
    def isByteLength(options: MinMaxExtendedOptions): Return = js.native
    
    def isCreditCard(): Return = js.native
    
    def isCurrency(): Return = js.native
    def isCurrency(options: IsCurrencyOptions): Return = js.native
    
    def isDataURI(): Return = js.native
    
    def isDate(): Return = js.native
    def isDate(options: IsDateOptions): Return = js.native
    
    def isDecimal(): Return = js.native
    def isDecimal(options: IsDecimalOptions): Return = js.native
    
    def isDivisibleBy(number: Double): Return = js.native
    
    def isEAN(): Return = js.native
    
    def isEmail(): Return = js.native
    def isEmail(options: IsEmailOptions): Return = js.native
    
    def isEmpty(): Return = js.native
    def isEmpty(options: IsEmptyOptions): Return = js.native
    
    def isEthereumAddress(): Return = js.native
    
    def isFQDN(): Return = js.native
    def isFQDN(options: IsFQDNOptions): Return = js.native
    
    def isFloat(): Return = js.native
    def isFloat(options: IsFloatOptions): Return = js.native
    
    def isFullWidth(): Return = js.native
    
    def isHSL(): Return = js.native
    
    def isHalfWidth(): Return = js.native
    
    def isHash(algorithm: HashAlgorithm): Return = js.native
    
    def isHexColor(): Return = js.native
    
    def isHexadecimal(): Return = js.native
    
    def isIBAN(): Return = js.native
    
    def isIMEI(): Return = js.native
    def isIMEI(options: IsIMEIOptions): Return = js.native
    
    def isIP(): Return = js.native
    def isIP(version: IPVersion): Return = js.native
    
    def isIPRange(): Return = js.native
    def isIPRange(version: IPVersion): Return = js.native
    
    def isISBN(): Return = js.native
    def isISBN(version: Double): Return = js.native
    
    def isISIN(): Return = js.native
    
    def isISO31661Alpha2(): Return = js.native
    
    def isISO31661Alpha3(): Return = js.native
    
    def isISO4217(): Return = js.native
    
    def isISO8601(): Return = js.native
    def isISO8601(options: IsISO8601Options): Return = js.native
    
    def isISRC(): Return = js.native
    
    def isISSN(): Return = js.native
    def isISSN(options: IsISSNOptions): Return = js.native
    
    def isIdentityCard(): Return = js.native
    def isIdentityCard(locale: IdentityCardLocale): Return = js.native
    
    def isIn(values: js.Array[Any]): Return = js.native
    
    def isInt(): Return = js.native
    def isInt(options: IsIntOptions): Return = js.native
    
    def isJSON(): Return = js.native
    def isJSON(options: IsJSONOptions): Return = js.native
    
    def isJWT(): Return = js.native
    
    def isLatLong(): Return = js.native
    def isLatLong(options: IsLatLongOptions): Return = js.native
    
    def isLength(options: MinMaxOptions): Return = js.native
    
    def isLicensePlate(locale: IsLicensePlateLocale): Return = js.native
    
    def isLocale(): Return = js.native
    
    def isLowercase(): Return = js.native
    
    def isMACAddress(): Return = js.native
    def isMACAddress(options: IsMACAddressOptions): Return = js.native
    
    def isMD5(): Return = js.native
    
    def isMagnetURI(): Return = js.native
    
    def isMimeType(): Return = js.native
    
    def isMobilePhone(locale: js.Array[MobilePhoneLocale]): Return = js.native
    def isMobilePhone(locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Return = js.native
    
    def isMongoId(): Return = js.native
    
    def isMultibyte(): Return = js.native
    
    def isNumeric(): Return = js.native
    def isNumeric(options: IsNumericOptions): Return = js.native
    
    def isObject(): Return = js.native
    def isObject(options: Strict): Return = js.native
    
    def isOctal(): Return = js.native
    
    def isPassportNumber(): Return = js.native
    def isPassportNumber(countryCode: PassportCountryCode): Return = js.native
    
    def isPort(): Return = js.native
    
    def isPostalCode(locale: PostalCodeLocale): Return = js.native
    
    def isRFC3339(): Return = js.native
    
    def isRgbColor(): Return = js.native
    def isRgbColor(includePercentValues: Boolean): Return = js.native
    
    def isSemVer(): Return = js.native
    
    def isSlug(): Return = js.native
    
    def isString(): Return = js.native
    
    def isStrongPassword(): Return = js.native
    def isStrongPassword(options: IsStrongPasswordOptions): Return = js.native
    
    def isSurrogatePair(): Return = js.native
    
    def isTaxID(locale: TaxIDLocale): Return = js.native
    
    def isURL(): Return = js.native
    def isURL(options: IsURLOptions): Return = js.native
    
    def isUUID(): Return = js.native
    def isUUID(version: UUIDVersion): Return = js.native
    
    def isUppercase(): Return = js.native
    
    def isVAT(countryCode: VATCountryCode): Return = js.native
    
    def isVariableWidth(): Return = js.native
    
    def isWhitelisted(chars: String): Return = js.native
    def isWhitelisted(chars: js.Array[String]): Return = js.native
    
    def matches(pattern: String): Return = js.native
    def matches(pattern: String, modifiers: String): Return = js.native
    def matches(pattern: js.RegExp): Return = js.native
    def matches(pattern: js.RegExp, modifiers: String): Return = js.native
    
    def not(): Return = js.native
    
    def notEmpty(): Return = js.native
    def notEmpty(options: IsEmptyOptions): Return = js.native
    
    def withMessage(message: Any): Return = js.native
    def withMessage(message: DynamicMessageCreator): Return = js.native
  }
}
