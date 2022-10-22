package typingsJapgolly.googleLibphonenumber.libphonenumber

import typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType
import typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberUtil extends StObject {
  
  def extractCountryCode(fullNumber: StringBuffer, nationalNumber: StringBuffer): Double = js.native
  
  def format(phoneNumber: PhoneNumber, format: PhoneNumberFormat): String = js.native
  
  def formatInOriginalFormat(phoneNumber: PhoneNumber): String = js.native
  def formatInOriginalFormat(phoneNumber: PhoneNumber, regionDialingFrom: String): String = js.native
  
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber): String = js.native
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber, regionDialingFrom: String): String = js.native
  
  def getCountryCodeForRegion(supportedRegion: String): Double = js.native
  
  def getExampleNumber(regionCode: String): PhoneNumber = js.native
  
  def getExampleNumberForType(regionCode: String, `type`: PhoneNumberType): PhoneNumber = js.native
  
  def getLengthOfGeographicalAreaCode(number: PhoneNumber): Double = js.native
  
  def getNationalSignificantNumber(number: PhoneNumber): String = js.native
  
  def getNddPrefixForRegion(): js.UndefOr[String] = js.native
  def getNddPrefixForRegion(regionCode: String): js.UndefOr[String] = js.native
  def getNddPrefixForRegion(regionCode: String, stripNonDigits: Boolean): js.UndefOr[String] = js.native
  def getNddPrefixForRegion(regionCode: Unit, stripNonDigits: Boolean): js.UndefOr[String] = js.native
  
  def getNumberType(phoneNumber: PhoneNumber): PhoneNumberType = js.native
  
  def getRegionCodeForCountryCode(countryCallingCode: Double): String = js.native
  
  def getRegionCodeForNumber(phoneNumber: PhoneNumber): js.UndefOr[String] = js.native
  
  def getSupportedRegions(): js.Array[String] = js.native
  
  def isAlphaNumber(number: String): Boolean = js.native
  
  def isLeadingZeroPossible(countryCallingCode: Double): Boolean = js.native
  
  def isNANPACountry(): Boolean = js.native
  def isNANPACountry(regionCode: String): Boolean = js.native
  
  def isNumberMatch(firstNumber: String, secondNumber: String): MatchType = js.native
  def isNumberMatch(firstNumber: String, secondNumber: PhoneNumber): MatchType = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: String): MatchType = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: PhoneNumber): MatchType = js.native
  
  def isPossibleNumber(number: PhoneNumber): Boolean = js.native
  
  def isPossibleNumberForType(number: PhoneNumber, `type`: PhoneNumberType): Boolean = js.native
  
  def isPossibleNumberForTypeWithReason(number: PhoneNumber, `type`: PhoneNumberType): ValidationResult = js.native
  
  def isPossibleNumberString(number: String, regionDialingFrom: String): Boolean = js.native
  
  def isPossibleNumberWithReason(number: PhoneNumber): ValidationResult = js.native
  
  def isValidNumber(phoneNumber: PhoneNumber): Boolean = js.native
  
  def isValidNumberForRegion(phoneNumber: PhoneNumber): Boolean = js.native
  def isValidNumberForRegion(phoneNumber: PhoneNumber, region: String): Boolean = js.native
  
  def parse(): PhoneNumber = js.native
  def parse(number: String): PhoneNumber = js.native
  def parse(number: String, region: String): PhoneNumber = js.native
  def parse(number: Unit, region: String): PhoneNumber = js.native
  
  def parseAndKeepRawInput(number: String): PhoneNumber = js.native
  def parseAndKeepRawInput(number: String, regionCode: String): PhoneNumber = js.native
  
  def truncateTooLongNumber(number: PhoneNumber): Boolean = js.native
}
object PhoneNumberUtil {
  
  @js.native
  sealed trait MatchType extends StObject
  @JSGlobal("libphonenumber.PhoneNumberUtil.MatchType")
  @js.native
  object MatchType extends StObject {
    
    @js.native
    sealed trait EXACT_MATCH
      extends StObject
         with MatchType
    
    @js.native
    sealed trait NOT_A_NUMBER
      extends StObject
         with MatchType
    
    @js.native
    sealed trait NO_MATCH
      extends StObject
         with MatchType
    
    @js.native
    sealed trait NSN_MATCH
      extends StObject
         with MatchType
    
    @js.native
    sealed trait SHORT_NSN_MATCH
      extends StObject
         with MatchType
  }
  
  @js.native
  sealed trait ValidationResult extends StObject
  @JSGlobal("libphonenumber.PhoneNumberUtil.ValidationResult")
  @js.native
  object ValidationResult extends StObject {
    
    /** The number has an invalid country calling code. =1 */
    @js.native
    sealed trait INVALID_COUNTRY_CODE
      extends StObject
         with ValidationResult
    
    /**
      * The number is longer than the shortest valid numbers for this region,
      * shorter than the longest valid numbers for this region, and does not itself
      * have a number length that matches valid numbers for this region.
      * This can also be returned in the case where
      * isPossibleNumberForTypeWithReason was called, and there are no numbers of
      * this type at all for this region.
      * =5
      */
    @js.native
    sealed trait INVALID_LENGTH
      extends StObject
         with ValidationResult
    
    /** The number length matches that of valid numbers for this region. =0 */
    @js.native
    sealed trait IS_POSSIBLE
      extends StObject
         with ValidationResult
    
    /**
      * The number length matches that of local numbers for this region only (i.e.
      * numbers that may be able to be dialled within an area, but do not have all
      * the information to be dialled from anywhere inside or outside the country).
      * =4
      */
    @js.native
    sealed trait IS_POSSIBLE_LOCAL_ONLY
      extends StObject
         with ValidationResult
    
    /** The number is longer than all valid numbers for this region. =3 */
    @js.native
    sealed trait TOO_LONG
      extends StObject
         with ValidationResult
    
    /** The number is shorter than all valid numbers for this region. =2 */
    @js.native
    sealed trait TOO_SHORT
      extends StObject
         with ValidationResult
  }
}
