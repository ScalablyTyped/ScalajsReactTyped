package typingsJapgolly.timeStamp

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("time-stamp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(): String = js.native
  def default(pattern: String): String = js.native
  def default(pattern: String, date: js.Date): String = js.native
  def default(pattern: Date): String = js.native
  def default(pattern: Date, date: js.Date): String = js.native
  def utc(): String = js.native
  def utc(pattern: String): String = js.native
  def utc(pattern: String, date: js.Date): String = js.native
  def utc(pattern: Date): String = js.native
  def utc(pattern: Date, date: js.Date): String = js.native
}

