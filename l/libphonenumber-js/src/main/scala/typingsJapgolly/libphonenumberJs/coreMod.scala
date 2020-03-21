package typingsJapgolly.libphonenumberJs

import typingsJapgolly.libphonenumberJs.typesMod.CountryCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.Metadata
import typingsJapgolly.libphonenumberJs.typesMod.NationalNumber
import typingsJapgolly.libphonenumberJs.typesMod.NumberFound
import typingsJapgolly.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class AsYouType protected () extends js.Object {
    def this(defaultCountryCode: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(defaultCountryCode: AnonDefaultCallingCode, metadata: Metadata) = this()
    def this(defaultCountryCode: CountryCode, metadata: Metadata) = this()
    def getNumber(): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typingsJapgolly.libphonenumberJs.typesMod.ParseError
  
  @js.native
  class PhoneNumber protected ()
    extends typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: Metadata
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
  }
  
  @js.native
  class PhoneNumberMatcher protected () extends js.Object {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: AnonDefaultCountry, metadata: Metadata) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: AnonDefaultCountry, metadata: Metadata): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, metadata: Metadata): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: AnonDefaultCountryCountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = js.native
  def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = js.native
  def getCountries(metadata: Metadata): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio, metadata: Metadata): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = js.native
  def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, metadata: Metadata): typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, metadata: Metadata): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: AnonDefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: AnonDefaultCountryCountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
}

