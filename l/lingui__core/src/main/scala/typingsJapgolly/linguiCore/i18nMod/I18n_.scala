package typingsJapgolly.linguiCore.i18nMod

import typingsJapgolly.linguiCore.linguiCoreStrings.cardinal
import typingsJapgolly.linguiCore.linguiCoreStrings.ordinal
import typingsJapgolly.linguiCore.selectMod.PluralProps
import typingsJapgolly.linguiCore.selectMod.SelectProps
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/i18n", "I18n")
@js.native
class I18n_ () extends js.Object {
  var availableLanguages: js.Array[String] = js.native
  var language: String = js.native
  var languageData: LanguageData = js.native
  var messages: Messages = js.native
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, values: js.Object): String = js.native
  @JSName("_")
  def _underscore(id: String, values: js.Object, messageOptions: MessageOptions): String = js.native
  @JSName("_")
  def _underscore(id: MessageDescriptor): String = js.native
  def activate(language: String): Unit = js.native
  def load(catalogs: Catalogs): Unit = js.native
  def plural(config: PluralProps): String = js.native
  def plural(id: String, config: PluralProps): String = js.native
  def pluralForm(n: Double): String = js.native
  @JSName("pluralForm")
  def pluralForm_cardinal(n: Double, pluralType: cardinal): String = js.native
  @JSName("pluralForm")
  def pluralForm_ordinal(n: Double, pluralType: ordinal): String = js.native
  def select(config: SelectProps): String = js.native
  def select(id: String, config: SelectProps): String = js.native
  def selectOrdinal(config: PluralProps): String = js.native
  def selectOrdinal(id: String, config: PluralProps): String = js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  def t(strings: TemplateStringsArray, values: js.Any*): String = js.native
  def use(language: String): I18n_ = js.native
}

