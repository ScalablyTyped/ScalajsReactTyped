package typingsJapgolly.reactIntl

import typingsJapgolly.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions
import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.reactIntl.reactIntlStrings.date
import typingsJapgolly.reactIntl.reactIntlStrings.number
import typingsJapgolly.reactIntl.reactIntlStrings.relative
import typingsJapgolly.reactIntl.reactIntlStrings.time
import typingsJapgolly.reactIntl.typesMod.CustomFormats
import typingsJapgolly.reactIntl.typesMod.Formatters
import typingsJapgolly.reactIntl.typesMod.IntlCache
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def createError(message: String): String = js.native
  def createError(message: String, exception: js.Error): String = js.native
  def createFormatters(): Formatters = js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  def createIntlCache(): IntlCache = js.native
  def defaultErrorHandler(error: String): Unit = js.native
  def escape(str: String): String = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: js.Function1[/* err */ String, Unit]): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_number(
    formats: CustomFormats,
    `type`: number,
    name: String,
    onError: js.Function1[/* err */ String, Unit]
  ): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_relative(
    formats: CustomFormats,
    `type`: relative,
    name: String,
    onError: js.Function1[/* err */ String, Unit]
  ): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: js.Function1[/* err */ String, Unit]): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  def invariantIntlContext(): /* asserts intl */ Boolean = js.native
  def invariantIntlContext(intl: js.Any): /* asserts intl */ Boolean = js.native
  @js.native
  object DEFAULT_INTL_CONFIG extends js.Object {
    var defaultFormats: CustomFormats = js.native
    var defaultLocale: String = js.native
    var formats: CustomFormats = js.native
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    var onError: js.Function1[/* err */ String, Unit] = js.native
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
      ] = js.native
    var timeZone: js.UndefOr[String] = js.native
  }
  
}

