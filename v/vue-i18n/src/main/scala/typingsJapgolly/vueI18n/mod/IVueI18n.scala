package typingsJapgolly.vueI18n.mod

import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
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
}

