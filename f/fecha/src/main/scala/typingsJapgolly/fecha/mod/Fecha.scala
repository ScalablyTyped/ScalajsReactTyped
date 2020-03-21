package typingsJapgolly.fecha.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fecha extends js.Object {
  var i18n: i18nSettings = js.native
  var masks: Masks = js.native
  def format(dateObj: Double, mask: String): String = js.native
  def format(dateObj: Double, mask: String, i18nSettings: i18nSettings): String = js.native
  def format(dateObj: Date, mask: String): String = js.native
  def format(dateObj: Date, mask: String, i18nSettings: i18nSettings): String = js.native
  def parse(dateStr: String, format: String): js.Date | Null = js.native
  def parse(dateStr: String, format: String, i18nSettings: i18nSettings): js.Date | Null = js.native
}

