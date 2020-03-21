package typingsJapgolly.linguiCore

import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core/formats", JSImport.Namespace)
@js.native
object formatsMod extends js.Object {
  def date(language: String): js.Function1[/* value */ js.Date, String] = js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ js.Date, String] = js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
}

