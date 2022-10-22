package typingsJapgolly.libphonenumberJs

import typingsJapgolly.libphonenumberJs.anon.DefaultCallingCode
import typingsJapgolly.libphonenumberJs.anon.DefaultCountry
import typingsJapgolly.libphonenumberJs.anon.Extract
import typingsJapgolly.libphonenumberJs.anon.`0`
import typingsJapgolly.libphonenumberJs.typesMod.CountryCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.E164Number
import typingsJapgolly.libphonenumberJs.typesMod.Examples
import typingsJapgolly.libphonenumberJs.typesMod.MetadataJson
import typingsJapgolly.libphonenumberJs.typesMod.NationalNumber
import typingsJapgolly.libphonenumberJs.typesMod.NumberFound
import typingsJapgolly.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsJapgolly.libphonenumberJs.typesMod.NumberingPlan
import typingsJapgolly.libphonenumberJs.typesMod.ValidatePhoneNumberLengthResult
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("libphonenumber-js/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, defaultCountry: Extract, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, defaultCountry: CountryCode, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  @JSImport("libphonenumber-js/core", "AsYouType")
  @js.native
  open class AsYouType protected () extends StObject {
    def this(defaultCountryCode: Unit, metadata: MetadataJson) = this()
    def this(defaultCountryCode: DefaultCallingCode, metadata: MetadataJson) = this()
    def this(defaultCountryCode: CountryCode, metadata: MetadataJson) = this()
    
    def getCallingCode(): js.UndefOr[String] = js.native
    
    def getChars(): String = js.native
    
    def getCountry(): js.UndefOr[CountryCode] = js.native
    
    def getNumber(): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getNumberValue(): js.UndefOr[E164Number] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def isInternational(): Boolean = js.native
    
    def isPossible(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/core", "Metadata")
  @js.native
  open class Metadata protected () extends StObject {
    def this(metadata: MetadataJson) = this()
    
    var numberingPlan: js.UndefOr[NumberingPlan] = js.native
    
    def selectNumberingPlan(country: CountryCode): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/core", "ParseError")
  @js.native
  open class ParseError ()
    extends typingsJapgolly.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js/core", "PhoneNumber")
  @js.native
  open class PhoneNumber protected ()
    extends typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: MetadataJson
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: MetadataJson) = this()
  }
  
  @JSImport("libphonenumber-js/core", "PhoneNumberMatcher")
  @js.native
  open class PhoneNumberMatcher protected () extends StObject {
    def this(text: String, metadata: MetadataJson) = this()
    def this(text: String, options: DefaultCountry, metadata: MetadataJson) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  inline def findNumbers(text: String, metadata: MetadataJson): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findNumbers(text: String, options: DefaultCountry, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findNumbers(text: String, options: CountryCode, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def findPhoneNumbersInText(text: String, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: `0`, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: CountryCode, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIncompletePhoneNumber(number: String, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(metadata: MetadataJson): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode, metadata: MetadataJson): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def getExampleNumber(country: CountryCode, examples: Examples, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def getExtPrefix(countryCode: CountryCode, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumber(text: String, metadata: MetadataJson): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumberFromString(text: String, defaultCountry: Extract, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, metadata: MetadataJson): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberWithError(text: String, metadata: MetadataJson): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def searchNumbers(text: String, metadata: MetadataJson): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchNumbers(text: String, options: DefaultCountry, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchNumbers(text: String, options: CountryCode, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def searchPhoneNumbersInText(text: String, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: `0`, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def validatePhoneNumberLength(text: String, defaultCountry: DefaultCallingCode, metadata: MetadataJson): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, defaultCountry: CountryCode, metadata: MetadataJson): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, metadata: MetadataJson): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
}
