package typingsJapgolly.intlRelativeformat.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.intlRelativeformat.AnonLocale
import typingsJapgolly.intlRelativeformat.AnonNow
import typingsJapgolly.intlRelativeformat.typesMod.LocaleData
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlRelativeFormat
  extends Instantiable0[IntlRelativeFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), IntlRelativeFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* opts */ IntlRelativeFormatOptions, 
      IntlRelativeFormat
    ] {
  var __localeData__ : Record[String, LocaleData] = js.native
  var defaultLocale: String = js.native
  var thresholds: Record[String, Double] = js.native
  def apply(): IntlRelativeFormat = js.native
  def apply(locales: String): IntlRelativeFormat = js.native
  def apply(locales: String, opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def apply(locales: js.Array[String]): IntlRelativeFormat = js.native
  def apply(locales: js.Array[String], opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def __addLocaleData(data: LocaleData*): Unit = js.native
  @JSName("format")
  def format_0(
    date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any
  ): String = js.native
  @JSName("format")
  def format_0(
    date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any,
    opts: AnonNow
  ): String = js.native
  def resolvedOptions(): AnonLocale = js.native
}

