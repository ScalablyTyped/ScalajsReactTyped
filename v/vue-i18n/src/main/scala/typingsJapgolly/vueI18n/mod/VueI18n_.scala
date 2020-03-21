package typingsJapgolly.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Date
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueI18n_ extends js.Object {
  val availableLocales: js.Array[typingsJapgolly.vueI18n.mod.VueI18n.Locale] = js.native
  val dateTimeFormats: typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typingsJapgolly.vueI18n.mod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typingsJapgolly.vueI18n.mod.VueI18n.Formatter = js.native
  var locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale = js.native
  val messages: typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typingsJapgolly.vueI18n.mod.VueI18n.MissingHandler = js.native
  val numberFormats: typingsJapgolly.vueI18n.mod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  var warnHtmlInMessage: typingsJapgolly.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
  ): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Date,
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
  ): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormat = js.native
  def getLocaleMessage(locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageObject = js.native
  def getNumberFormat(locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    format: typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def mergeLocaleMessage(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    message: typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    format: typingsJapgolly.vueI18n.mod.VueI18n.NumberFormat
  ): Unit = js.native
  def missing(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
  def n(value: Double): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
  ): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def setDateTimeFormat(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    format: typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def setLocaleMessage(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    message: typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    format: typingsJapgolly.vueI18n.mod.VueI18n.NumberFormat
  ): Unit = js.native
  def t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    values: typingsJapgolly.vueI18n.mod.VueI18n.Values
  ): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, values: typingsJapgolly.vueI18n.mod.VueI18n.Values): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
  def tc(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): String = js.native
  def tc(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice): String = js.native
  def tc(
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
  ): String = js.native
  def tc(
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
    locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
    values: typingsJapgolly.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def tc(
    key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
    choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
    values: typingsJapgolly.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def te(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): Boolean = js.native
  def te(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): Boolean = js.native
}

