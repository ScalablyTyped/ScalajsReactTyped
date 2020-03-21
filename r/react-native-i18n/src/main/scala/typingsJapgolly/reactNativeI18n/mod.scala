package typingsJapgolly.reactNativeI18n

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.i18nJs.mod.InterpolateOptions
import typingsJapgolly.i18nJs.mod.Scope
import typingsJapgolly.i18nJs.mod.ToCurrencyOptions
import typingsJapgolly.i18nJs.mod.ToHumanSizeOptions
import typingsJapgolly.i18nJs.mod.ToNumberOptions
import typingsJapgolly.i18nJs.mod.ToPercentageOptions
import typingsJapgolly.i18nJs.mod.TranslateOptions
import typingsJapgolly.reactNativeI18n.reactNativeI18nStrings.currency
import typingsJapgolly.reactNativeI18n.reactNativeI18nStrings.guess
import typingsJapgolly.reactNativeI18n.reactNativeI18nStrings.message
import typingsJapgolly.reactNativeI18n.reactNativeI18nStrings.number
import typingsJapgolly.reactNativeI18n.reactNativeI18nStrings.percentage
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-i18n", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getLanguages(): js.Promise[js.Array[String]] = js.native
  @js.native
  object default extends js.Object {
    var defaultLocale: String = js.native
    var defaultSeparator: String = js.native
    var fallbacks: Boolean = js.native
    var locale: String = js.native
    var missingBehaviour: message | guess = js.native
    // tslint:disable-next-line prefer-declare-function
    var missingPlaceholder: js.Function3[
        /* placeholder */ String, 
        /* message */ String, 
        /* options */ js.UndefOr[InterpolateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    // tslint:disable-next-line prefer-declare-function
    var missingTranslation: js.Function2[
        /* scope */ String, 
        /* options */ js.UndefOr[TranslateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    var missingTranslationPrefix: String = js.native
    // tslint:disable-next-line prefer-declare-function
    var nullPlaceholder: js.Function3[
        /* placeholder */ String, 
        /* message */ String, 
        /* options */ js.UndefOr[InterpolateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    var placeholder: js.RegExp = js.native
    def currentLocale(): String = js.native
    def l(scope: Scope, value: String): String = js.native
    def l(scope: Scope, value: String, options: InterpolateOptions): String = js.native
    def l(scope: Scope, value: Double): String = js.native
    def l(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
    def l(scope: Scope, value: Date): String = js.native
    def l(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
    @JSName("l")
    def l_currency(scope: currency, value: Double): String = js.native
    @JSName("l")
    def l_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
    @JSName("l")
    def l_number(scope: number, value: Double): String = js.native
    @JSName("l")
    def l_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
    @JSName("l")
    def l_percentage(scope: percentage, value: Double): String = js.native
    @JSName("l")
    def l_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
    def localize(scope: Scope, value: String): String = js.native
    def localize(scope: Scope, value: String, options: InterpolateOptions): String = js.native
    def localize(scope: Scope, value: Double): String = js.native
    def localize(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
    def localize(scope: Scope, value: Date): String = js.native
    def localize(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
    @JSName("localize")
    def localize_currency(scope: currency, value: Double): String = js.native
    @JSName("localize")
    def localize_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
    @JSName("localize")
    def localize_number(scope: number, value: Double): String = js.native
    @JSName("localize")
    def localize_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
    @JSName("localize")
    def localize_percentage(scope: percentage, value: Double): String = js.native
    @JSName("localize")
    def localize_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
    def reset(): Unit = js.native
    def strftime(date: js.Date, format: String): String = js.native
    def t(scope: Scope): String = js.native
    def t(scope: Scope, options: TranslateOptions): String = js.native
    def toCurrency(num: Double): String = js.native
    def toCurrency(num: Double, options: ToCurrencyOptions): String = js.native
    def toHumanSize(num: Double): String = js.native
    def toHumanSize(num: Double, options: ToHumanSizeOptions): String = js.native
    def toNumber(num: Double): String = js.native
    def toNumber(num: Double, options: ToNumberOptions): String = js.native
    def toPercentage(num: Double): String = js.native
    def toPercentage(num: Double, options: ToPercentageOptions): String = js.native
    def toTime(scope: Scope, value: String): String = js.native
    def toTime(scope: Scope, value: Double): String = js.native
    def toTime(scope: Scope, value: Date): String = js.native
    def translate(scope: Scope): String = js.native
    def translate(scope: Scope, options: TranslateOptions): String = js.native
    @js.native
    object locales
      extends /* key */ StringDictionary[
              String | js.Array[String] | (js.Function1[/* locale */ String, String | js.Array[String]])
            ]
    
    @js.native
    object pluralization
      extends /* locale */ StringDictionary[js.Function1[/* count */ Double, js.Array[String]]]
    
    @js.native
    object translations
      extends /* locale */ StringDictionary[js.Object]
    
  }
  
}

