package typingsJapgolly.timeago.Timeago

import typingsJapgolly.std.Date
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeagoStatic extends js.Object {
  var settings: Settings = js.native
  def apply(timestamp: String): String = js.native
  def apply(timestamp: Double): String = js.native
  def apply(timestamp: Date): String = js.native
  def apply(timestamp: Element): String = js.native
  def datetime(elem: org.scalajs.dom.raw.Element): js.Date = js.native
  def inWords(distanceMillis: Double): String = js.native
  def isTime(elem: org.scalajs.dom.raw.Element): Boolean = js.native
  def parse(timestamp: String): js.Date = js.native
}

