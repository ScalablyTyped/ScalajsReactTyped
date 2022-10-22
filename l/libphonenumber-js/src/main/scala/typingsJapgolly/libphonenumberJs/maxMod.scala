package typingsJapgolly.libphonenumberJs

import typingsJapgolly.libphonenumberJs.anon.DefaultCallingCode
import typingsJapgolly.libphonenumberJs.anon.DefaultCountry
import typingsJapgolly.libphonenumberJs.anon.Extract
import typingsJapgolly.libphonenumberJs.typesMod.CountryCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.Examples
import typingsJapgolly.libphonenumberJs.typesMod.MetadataJson
import typingsJapgolly.libphonenumberJs.typesMod.NationalNumber
import typingsJapgolly.libphonenumberJs.typesMod.NumberFound
import typingsJapgolly.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsJapgolly.libphonenumberJs.typesMod.ValidatePhoneNumberLengthResult
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object maxMod {
  
  @JSImport("libphonenumber-js/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, defaultCountry: Extract): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, defaultCountry: CountryCode): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  @JSImport("libphonenumber-js/max", "AsYouType")
  @js.native
  open class AsYouType ()
    extends typingsJapgolly.libphonenumberJs.minMod.AsYouType {
    def this(defaultCountryCode: DefaultCallingCode) = this()
    def this(defaultCountryCode: CountryCode) = this()
  }
  
  @JSImport("libphonenumber-js/max", "Metadata")
  @js.native
  open class Metadata ()
    extends typingsJapgolly.libphonenumberJs.minMod.Metadata
  
  @JSImport("libphonenumber-js/max", "ParseError")
  @js.native
  open class ParseError ()
    extends typingsJapgolly.libphonenumberJs.minMod.ParseError
  
  @JSImport("libphonenumber-js/max", "PhoneNumber")
  @js.native
  open class PhoneNumber protected ()
    extends typingsJapgolly.libphonenumberJs.minMod.PhoneNumber {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: MetadataJson
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: MetadataJson) = this()
  }
  
  @JSImport("libphonenumber-js/max", "PhoneNumberMatcher")
  @js.native
  open class PhoneNumberMatcher protected ()
    extends typingsJapgolly.libphonenumberJs.minMod.PhoneNumberMatcher {
    def this(text: String) = this()
    def this(text: String, options: DefaultCountry) = this()
  }
  
  inline def findNumbers(text: String): js.Array[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findNumbers(text: String, options: DefaultCountry): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  
  inline def findPhoneNumbersInText(text: String): js.Array[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: DefaultCallingCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def formatIncompletePhoneNumber(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  inline def getExampleNumber(country: CountryCode, examples: Examples): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def getExtPrefix(countryCode: CountryCode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isPossiblePhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumber(text: String): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumberFromString(text: String): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: Extract): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def parsePhoneNumberWithError(text: String): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchNumbers(text: String, options: DefaultCountry): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  
  inline def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def validatePhoneNumberLength(text: String): js.UndefOr[ValidatePhoneNumberLengthResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, defaultCountry: CountryCode): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
}
