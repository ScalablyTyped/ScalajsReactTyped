package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsIntl.anon.TypeofDateTimeFormat
import typingsJapgolly.formatjsIntl.anon.TypeofDisplayNames
import typingsJapgolly.formatjsIntl.anon.TypeofIntlListFormat
import typingsJapgolly.formatjsIntl.anon.TypeofIntlMessageFormat
import typingsJapgolly.formatjsIntl.anon.TypeofPluralRules
import typingsJapgolly.formatjsIntl.anon.TypeofRelativeTimeFormat
import typingsJapgolly.formatjsIntlDisplaynames.mod.DisplayNames
import typingsJapgolly.formatjsIntlListformat.mod.default
import typingsJapgolly.intlMessageformat.mod.IntlMessageFormat
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.Intl.RelativeTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatters extends StObject {
  
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[TypeofDateTimeFormat]
  ): DateTimeFormat = js.native
  
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[TypeofDisplayNames]
  ): DisplayNames = js.native
  
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default = js.native
  
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): IntlMessageFormat = js.native
  
  def getNumberFormat(): NumberFormat = js.native
  def getNumberFormat(locales: String): NumberFormat = js.native
  def getNumberFormat(locales: String, opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locales: js.Array[String]): NumberFormat = js.native
  def getNumberFormat(locales: js.Array[String], opts: NumberFormatOptions): NumberFormat = js.native
  def getNumberFormat(locales: Unit, opts: NumberFormatOptions): NumberFormat = js.native
  
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[TypeofPluralRules]
  ): PluralRules = js.native
  
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.RelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofRelativeTimeFormat]
  ): RelativeTimeFormat = js.native
}
