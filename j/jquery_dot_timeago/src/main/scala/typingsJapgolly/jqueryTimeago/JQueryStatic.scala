package typingsJapgolly.jqueryTimeago

import typingsJapgolly.std.Date
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("timeago")
  var timeago_Original: TimeagoStatic = js.native
  def timeago(timestamp: String): String = js.native
  def timeago(timestamp: Double): String = js.native
  def timeago(timestamp: JQuery): String = js.native
  def timeago(timestamp: Date): String = js.native
  def timeago(timestamp: Element): String = js.native
}

