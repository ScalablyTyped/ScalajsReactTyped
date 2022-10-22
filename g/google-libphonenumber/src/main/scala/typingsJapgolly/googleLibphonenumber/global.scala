package typingsJapgolly.googleLibphonenumber

import typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object libphonenumber {
    
    @JSGlobal("libphonenumber.AsYouTypeFormatter")
    @js.native
    open class AsYouTypeFormatter protected ()
      extends StObject
         with typingsJapgolly.googleLibphonenumber.libphonenumber.AsYouTypeFormatter {
      def this(region: String) = this()
      
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /* CompleteClass */
      override def inputDigit(digit: String): String = js.native
    }
    
    @JSGlobal("libphonenumber.PhoneNumber")
    @js.native
    open class PhoneNumber ()
      extends StObject
         with typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber {
      
      /* CompleteClass */
      override def clearCountryCode(): Unit = js.native
      
      /* CompleteClass */
      override def clearCountryCodeSource(): Unit = js.native
      
      /* CompleteClass */
      override def clearExtension(): Unit = js.native
      
      /* CompleteClass */
      override def clearItalianLeadingZero(): Unit = js.native
      
      /* CompleteClass */
      override def clearNationalNumber(): Unit = js.native
      
      /* CompleteClass */
      override def clearNumberOfLeadingZeros(): Unit = js.native
      
      /* CompleteClass */
      override def clearPreferredDomesticCarrierCode(): Unit = js.native
      
      /* CompleteClass */
      override def clearRawInput(): Unit = js.native
      
      /* CompleteClass */
      override def countryCodeCount(): Double = js.native
      
      /* CompleteClass */
      override def countryCodeSourceCount(): Double = js.native
      
      /* CompleteClass */
      override def extensionCount(): Double = js.native
      
      /* CompleteClass */
      override def getCountryCode(): js.UndefOr[Double] = js.native
      
      /* CompleteClass */
      override def getCountryCodeOrDefault(): Double = js.native
      
      /* CompleteClass */
      override def getCountryCodeSource(): js.UndefOr[CountryCodeSource] = js.native
      
      /* CompleteClass */
      override def getCountryCodeSourceOrDefault(): CountryCodeSource = js.native
      
      /* CompleteClass */
      override def getExtension(): js.UndefOr[String] = js.native
      
      /* CompleteClass */
      override def getExtensionOrDefault(): String = js.native
      
      /* CompleteClass */
      override def getItalianLeadingZero(): js.UndefOr[Boolean] = js.native
      
      /* CompleteClass */
      override def getItalianLeadingZeroOrDefault(): Boolean = js.native
      
      /* CompleteClass */
      override def getNationalNumber(): js.UndefOr[Double] = js.native
      
      /* CompleteClass */
      override def getNationalNumberOrDefault(): Double = js.native
      
      /* CompleteClass */
      override def getNumberOfLeadingZeros(): js.UndefOr[Double] = js.native
      
      /* CompleteClass */
      override def getNumberOfLeadingZerosOrDefault(): Double = js.native
      
      /* CompleteClass */
      override def getPreferredDomesticCarrierCode(): js.UndefOr[String] = js.native
      
      /* CompleteClass */
      override def getPreferredDomesticCarrierCodeOrDefault(): String = js.native
      
      /* CompleteClass */
      override def getRawInput(): js.UndefOr[String] = js.native
      
      /* CompleteClass */
      override def getRawInputOrDefault(): String = js.native
      
      /* CompleteClass */
      override def hasCountryCode(): Boolean = js.native
      
      /* CompleteClass */
      override def hasCountryCodeSource(): Boolean = js.native
      
      /* CompleteClass */
      override def hasExtension(): Boolean = js.native
      
      /* CompleteClass */
      override def hasItalianLeadingZero(): Boolean = js.native
      
      /* CompleteClass */
      override def hasNationalNumber(): Boolean = js.native
      
      /* CompleteClass */
      override def hasNumberOfLeadingZeros(): Boolean = js.native
      
      /* CompleteClass */
      override def hasPreferredDomesticCarrierCode(): Boolean = js.native
      
      /* CompleteClass */
      override def hasRawInput(): Boolean = js.native
      
      /* CompleteClass */
      override def italianLeadingZeroCount(): Double = js.native
      
      /* CompleteClass */
      override def nationalNumberCount(): Double = js.native
      
      /* CompleteClass */
      override def numberOfLeadingZerosCount(): Double = js.native
      
      /* CompleteClass */
      override def preferredDomesticCarrierCodeCount(): Double = js.native
      
      /* CompleteClass */
      override def rawInputCount(): Double = js.native
      
      /* CompleteClass */
      override def setCountryCode(value: Double): Unit = js.native
      
      /* CompleteClass */
      override def setCountryCodeSource(value: CountryCodeSource): Unit = js.native
      
      /* CompleteClass */
      override def setExtension(value: String): Unit = js.native
      
      /* CompleteClass */
      override def setItalianLeadingZero(value: Boolean): Unit = js.native
      
      /* CompleteClass */
      override def setNationalNumber(value: Double): Double = js.native
      
      /* CompleteClass */
      override def setNumberOfLeadingZeros(value: Double): Unit = js.native
      
      /* CompleteClass */
      override def setPreferredDomesticCarrierCode(value: String): Unit = js.native
      
      /* CompleteClass */
      override def setRawInput(value: String): Unit = js.native
    }
    object PhoneNumber {
      
      @JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
      @js.native
      object CountryCodeSource extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource & Double
              ] = js.native
        
        /* 20 */ val FROM_DEFAULT_COUNTRY: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY & Double = js.native
        
        /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN & Double = js.native
        
        /* 5 */ val FROM_NUMBER_WITH_IDD: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD & Double = js.native
        
        /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN & Double = js.native
      }
    }
    
    @JSGlobal("libphonenumber.PhoneNumberFormat")
    @js.native
    object PhoneNumberFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat & Double] = js.native
      
      /* 0 */ val E164: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.E164 & Double = js.native
      
      /* 1 */ val INTERNATIONAL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL & Double = js.native
      
      /* 2 */ val NATIONAL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL & Double = js.native
      
      /* 3 */ val RFC3966: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 & Double = js.native
    }
    
    @JSGlobal("libphonenumber.PhoneNumberType")
    @js.native
    object PhoneNumberType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType & Double] = js.native
      
      /* 0 */ val FIXED_LINE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE & Double = js.native
      
      /* 2 */ val FIXED_LINE_OR_MOBILE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE & Double = js.native
      
      /* 1 */ val MOBILE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.MOBILE & Double = js.native
      
      /* 8 */ val PAGER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PAGER & Double = js.native
      
      /* 7 */ val PERSONAL_NUMBER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER & Double = js.native
      
      /* 4 */ val PREMIUM_RATE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE & Double = js.native
      
      /* 5 */ val SHARED_COST: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST & Double = js.native
      
      /* 3 */ val TOLL_FREE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE & Double = js.native
      
      /* 9 */ val UAN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.UAN & Double = js.native
      
      /* -1 */ val UNKNOWN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN & Double = js.native
      
      /* 10 */ val VOICEMAIL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL & Double = js.native
      
      /* 6 */ val VOIP: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.VOIP & Double = js.native
    }
    
    @JSGlobal("libphonenumber.PhoneNumberUtil")
    @js.native
    open class PhoneNumberUtil ()
      extends StObject
         with typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil
    /* static members */
    object PhoneNumberUtil {
      
      @JSGlobal("libphonenumber.PhoneNumberUtil")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("libphonenumber.PhoneNumberUtil.MatchType")
      @js.native
      object MatchType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType & Double
              ] = js.native
        
        /* 0 */ val EXACT_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH & Double = js.native
        
        /* 2 */ val NOT_A_NUMBER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER & Double = js.native
        
        /* 1 */ val NO_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH & Double = js.native
        
        /* 3 */ val NSN_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH & Double = js.native
        
        /* 4 */ val SHORT_NSN_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH & Double = js.native
      }
      
      @JSGlobal("libphonenumber.PhoneNumberUtil.ValidationResult")
      @js.native
      object ValidationResult extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult & Double
              ] = js.native
        
        /* 1 */ val INVALID_COUNTRY_CODE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE & Double = js.native
        
        /* 5 */ val INVALID_LENGTH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_LENGTH & Double = js.native
        
        /* 0 */ val IS_POSSIBLE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE & Double = js.native
        
        /* 4 */ val IS_POSSIBLE_LOCAL_ONLY: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY & Double = js.native
        
        /* 3 */ val TOO_LONG: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG & Double = js.native
        
        /* 2 */ val TOO_SHORT: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT & Double = js.native
      }
      
      inline def getInstance(): typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil]
    }
    
    @JSGlobal("libphonenumber.StringBuffer")
    @js.native
    open class StringBuffer protected ()
      extends StObject
         with typingsJapgolly.googleLibphonenumber.libphonenumber.StringBuffer {
      def this(opt_a1: Any, var_args: Any*) = this()
      def this(opt_a1: Unit, var_args: Any*) = this()
    }
  }
}
