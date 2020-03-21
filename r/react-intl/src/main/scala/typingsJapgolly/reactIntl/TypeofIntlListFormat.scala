package typingsJapgolly.reactIntl

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.formatjsIntlListformat.PickIntlListFormatOptions
import typingsJapgolly.formatjsIntlListformat.mod.default
import typingsJapgolly.formatjsIntlUtils.listTypesMod.ListPatternFieldsData
import typingsJapgolly.formatjsIntlUtils.listTypesMod.ListPatternLocaleData
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIntlListFormat extends Instantiable0[default] {
  val __INTERNAL_SLOT_MAP__ : js.Any = js.native
  var __defaultLocale: js.Any = js.native
  var availableLocales: js.Any = js.native
  var getDefaultLocale: js.Any = js.native
  var localeData: Record[String, ListPatternFieldsData] = js.native
  var polyfilled: Boolean = js.native
  var relevantExtensionKeys: js.Any = js.native
  def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
}

