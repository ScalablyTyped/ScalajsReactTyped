package typingsJapgolly.googleLibphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-libphonenumber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AsYouTypeFormatter protected ()
    extends typingsJapgolly.googleLibphonenumber.libphonenumber.AsYouTypeFormatter {
    def this(region: String) = this()
  }
  
  @js.native
  class PhoneNumber ()
    extends typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber
  
  @js.native
  class PhoneNumberUtil ()
    extends typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil
  
  @js.native
  class StringBuffer ()
    extends typingsJapgolly.googleLibphonenumber.libphonenumber.StringBuffer {
    def this(opt_a1: js.Any, var_args: js.Any*) = this()
  }
  
  @js.native
  object PhoneNumber extends js.Object {
    @js.native
    object CountryCodeSource extends js.Object {
      /* 20 */ val FROM_DEFAULT_COUNTRY: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
      /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
      /* 5 */ val FROM_NUMBER_WITH_IDD: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
      /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource with Double
          ] = js.native
    }
    
  }
  
  @js.native
  object PhoneNumberFormat extends js.Object {
    /* 0 */ val E164: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
    /* 1 */ val INTERNATIONAL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
    /* 2 */ val NATIONAL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
    /* 3 */ val RFC3966: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberFormat with Double
      ] = js.native
  }
  
  @js.native
  object PhoneNumberType extends js.Object {
    /* 0 */ val FIXED_LINE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE with Double = js.native
    /* 2 */ val FIXED_LINE_OR_MOBILE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE with Double = js.native
    /* 1 */ val MOBILE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.MOBILE with Double = js.native
    /* 8 */ val PAGER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PAGER with Double = js.native
    /* 7 */ val PERSONAL_NUMBER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER with Double = js.native
    /* 4 */ val PREMIUM_RATE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE with Double = js.native
    /* 5 */ val SHARED_COST: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST with Double = js.native
    /* 3 */ val TOLL_FREE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE with Double = js.native
    /* 9 */ val UAN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.UAN with Double = js.native
    /* -1 */ val UNKNOWN: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN with Double = js.native
    /* 10 */ val VOICEMAIL: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL with Double = js.native
    /* 6 */ val VOIP: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType.VOIP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object PhoneNumberUtil extends js.Object {
    def getInstance(): typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil = js.native
    @js.native
    object MatchType extends js.Object {
      /* 0 */ val EXACT_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH with Double = js.native
      /* 2 */ val NOT_A_NUMBER: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER with Double = js.native
      /* 1 */ val NO_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH with Double = js.native
      /* 3 */ val NSN_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH with Double = js.native
      /* 4 */ val SHORT_NSN_MATCH: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType with Double
          ] = js.native
    }
    
    @js.native
    object ValidationResult extends js.Object {
      /* 1 */ val INVALID_COUNTRY_CODE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
      /* 0 */ val IS_POSSIBLE: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE with Double = js.native
      /* 3 */ val TOO_LONG: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG with Double = js.native
      /* 2 */ val TOO_SHORT: typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult with Double
          ] = js.native
    }
    
  }
  
}

