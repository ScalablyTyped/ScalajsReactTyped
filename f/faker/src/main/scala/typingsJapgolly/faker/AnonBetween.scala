package typingsJapgolly.faker

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBetween extends js.Object {
  def between(from: String, to: String): js.Date = js.native
  def between(from: String, to: Date): js.Date = js.native
  def between(from: Double, to: String): js.Date = js.native
  def between(from: Double, to: Date): js.Date = js.native
  def between(from: Date, to: String): js.Date = js.native
  def between(from: Date, to: Date): js.Date = js.native
  def future(): js.Date = js.native
  def future(years: Double): js.Date = js.native
  def future(years: Double, refDate: String): js.Date = js.native
  def future(years: Double, refDate: Date): js.Date = js.native
  def month(): String = js.native
  def month(options: AnonAbbr): String = js.native
  def past(): js.Date = js.native
  def past(years: Double): js.Date = js.native
  def past(years: Double, refDate: String): js.Date = js.native
  def past(years: Double, refDate: Date): js.Date = js.native
  def recent(): js.Date = js.native
  def recent(days: Double): js.Date = js.native
  def weekday(): String = js.native
  def weekday(options: AnonAbbr): String = js.native
}

