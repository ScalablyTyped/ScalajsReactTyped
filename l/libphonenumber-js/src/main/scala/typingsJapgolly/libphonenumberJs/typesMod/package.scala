package typingsJapgolly.libphonenumberJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CarrierCode = java.lang.String
  type CountryCallingCode = java.lang.String
  type CountryCallingCodes = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.libphonenumberJs.typesMod.CountryCode]]
  type E164Number = java.lang.String
  type Extension = java.lang.String
  type FormatExtension = js.Function3[
    /* formattedNumber */ java.lang.String, 
    /* extension */ typingsJapgolly.libphonenumberJs.typesMod.Extension, 
    /* metadata */ typingsJapgolly.libphonenumberJs.typesMod.Metadata, 
    java.lang.String
  ]
  type NationalNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PREMIUM_RATE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOLL_FREE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SHARED_COST
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VOIP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PERSONAL_NUMBER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PAGER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UAN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VOICEMAIL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE_OR_MOBILE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod._NumberType]
}
