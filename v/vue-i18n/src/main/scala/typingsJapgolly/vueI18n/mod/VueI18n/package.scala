package typingsJapgolly.vueI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VueI18n {
  type Choice = scala.Double
  type DateTimeFormat = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormatOptions]
  type DateTimeFormatOptions = typingsJapgolly.std.Intl.DateTimeFormatOptions | typingsJapgolly.vueI18n.mod.VueI18n.SpecificDateTimeFormatOptions
  type DateTimeFormatResult = java.lang.String
  type DateTimeFormats = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vueI18n.mod.VueI18n.DateTimeFormat]
  type Locale = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageObject
    - typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = typingsJapgolly.vueI18n.mod.VueI18n._LocaleMessage | java.lang.String
  type LocaleMessages = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessageObject]
  type MissingHandler = js.Function4[
    /* locale */ typingsJapgolly.vueI18n.mod.VueI18n.Locale, 
    /* key */ typingsJapgolly.vueI18n.mod.VueI18n.Path, 
    /* vm */ typingsJapgolly.vue.vueMod.Vue | scala.Null, 
    /* values */ js.Any, 
    java.lang.String | scala.Unit
  ]
  type Modifiers = org.scalablytyped.runtime.StringDictionary[js.Function1[/* str */ java.lang.String, java.lang.String]]
  type NumberFormat = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vueI18n.mod.VueI18n.NumberFormatOptions]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.Intl.NumberFormatOptions
    - typingsJapgolly.vueI18n.mod.VueI18n.SpecificNumberFormatOptions
    - typingsJapgolly.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = typingsJapgolly.vueI18n.mod.VueI18n._NumberFormatOptions | typingsJapgolly.std.Intl.NumberFormatOptions
  type NumberFormatResult = java.lang.String
  type NumberFormatToPartsResult = org.scalablytyped.runtime.NumberDictionary[typingsJapgolly.vueI18n.mod.VueI18n.FormattedNumberPart]
  type NumberFormats = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vueI18n.mod.VueI18n.NumberFormat]
  type Path = java.lang.String
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* choice */ scala.Double, /* choicesLength */ scala.Double, scala.Double]
  ]
  type TranslateResult = java.lang.String | typingsJapgolly.vueI18n.mod.VueI18n.LocaleMessages
  type Values = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
}
