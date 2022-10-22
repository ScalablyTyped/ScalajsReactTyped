package typingsJapgolly.fluentBundle

import typingsJapgolly.fluentBundle.anon.TypeofDateTimeFormat
import typingsJapgolly.fluentBundle.anon.TypeofNumberFormat
import typingsJapgolly.fluentBundle.anon.TypeofPluralRules
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMemoizerMod {
  
  @JSImport("@fluent/bundle/esm/memoizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMemoizerForLocale(locales: String): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoizerForLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[IntlCache]
  inline def getMemoizerForLocale(locales: js.Array[String]): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoizerForLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[IntlCache]
  
  type IntlCache = Map[
    TypeofNumberFormat | TypeofDateTimeFormat | TypeofPluralRules, 
    Record[String, NumberFormat | DateTimeFormat | PluralRules]
  ]
}
