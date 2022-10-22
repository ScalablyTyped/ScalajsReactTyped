package typingsJapgolly.std.Intl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayNames extends StObject {
  
  /**
    * Receives a code and returns a string based on the locale and options provided when instantiating
    * [`Intl.DisplayNames()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
    *
    * @param code The `code` to provide depends on the `type` passed to display name during creation:
    *  - If the type is `"region"`, code should be either an [ISO-3166 two letters region code](https://www.iso.org/iso-3166-country-codes.html),
    *    or a [three digits UN M49 Geographic Regions](https://unstats.un.org/unsd/methodology/m49/).
    *  - If the type is `"script"`, code should be an [ISO-15924 four letters script code](https://unicode.org/iso15924/iso15924-codes.html).
    *  - If the type is `"language"`, code should be a `languageCode` ["-" `scriptCode`] ["-" `regionCode` ] *("-" `variant` )
    *    subsequence of the unicode_language_id grammar in [UTS 35's Unicode Language and Locale Identifiers grammar](https://unicode.org/reports/tr35/#Unicode_language_identifier).
    *    `languageCode` is either a two letters ISO 639-1 language code or a three letters ISO 639-2 language code.
    *  - If the type is `"currency"`, code should be a [3-letter ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/of).
    */
  /* standard es2020.intl */
  def of(code: String): js.UndefOr[String]
  
  /**
    * Returns a new object with properties reflecting the locale and style formatting options computed during the construction of the current
    * [`Intl/DisplayNames`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/resolvedOptions).
    */
  /* standard es2020.intl */
  def resolvedOptions(): ResolvedDisplayNamesOptions
}
object DisplayNames {
  
  inline def apply(of: String => js.UndefOr[String], resolvedOptions: CallbackTo[ResolvedDisplayNamesOptions]): DisplayNames = {
    val __obj = js.Dynamic.literal(of = js.Any.fromFunction1(of), resolvedOptions = resolvedOptions.toJsFn)
    __obj.asInstanceOf[DisplayNames]
  }
  
  extension [Self <: DisplayNames](x: Self) {
    
    inline def setOf(value: String => js.UndefOr[String]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def setResolvedOptions(value: CallbackTo[ResolvedDisplayNamesOptions]): Self = StObject.set(x, "resolvedOptions", value.toJsFn)
  }
}
