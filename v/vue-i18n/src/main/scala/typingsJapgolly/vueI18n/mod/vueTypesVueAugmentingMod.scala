package typingsJapgolly.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Date
import typingsJapgolly.vueI18n.Fn0
import typingsJapgolly.vueI18n.FnCall
import typingsJapgolly.vueI18n.FnCallKeyChoiceLocaleValues
import typingsJapgolly.vueI18n.FnCallValueKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$d")
    var $d_Original: FnCallValueKeyLocale = js.native
    @JSName("$i18n")
    val $i18n: VueI18n with IVueI18n = js.native
    @JSName("$n")
    var $n_Original: Fn0 = js.native
    @JSName("$t")
    var $t_Original: FnCall = js.native
    @JSName("$tc")
    var $tc_Original: FnCallKeyChoiceLocaleValues = js.native
    @JSName("$te")
    var $te_Original: js.Function2[
        /* key */ typingsJapgolly.vueI18n.mod.VueI18n.Path, 
        /* locale */ js.UndefOr[typingsJapgolly.vueI18n.mod.VueI18n.Locale], 
        Boolean
      ] = js.native
    @JSName("$d")
    def $d(value: Double): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Double,
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
    ): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Date,
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
    ): typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$n")
    def $n(value: Double): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(
      value: Double,
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
    ): typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$t")
    def $t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
      values: typingsJapgolly.vueI18n.mod.VueI18n.Values
    ): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, values: typingsJapgolly.vueI18n.mod.VueI18n.Values): typingsJapgolly.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$tc")
    def $tc(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): String = js.native
    @JSName("$tc")
    def $tc(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
      locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale,
      values: typingsJapgolly.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typingsJapgolly.vueI18n.mod.VueI18n.Path,
      choice: typingsJapgolly.vueI18n.mod.VueI18n.Choice,
      values: typingsJapgolly.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$te")
    def $te(key: typingsJapgolly.vueI18n.mod.VueI18n.Path): Boolean = js.native
    @JSName("$te")
    def $te(key: typingsJapgolly.vueI18n.mod.VueI18n.Path, locale: typingsJapgolly.vueI18n.mod.VueI18n.Locale): Boolean = js.native
  }
  
}

