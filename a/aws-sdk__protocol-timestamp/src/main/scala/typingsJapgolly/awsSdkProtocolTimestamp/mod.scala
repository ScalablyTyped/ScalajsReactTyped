package typingsJapgolly.awsSdkProtocolTimestamp

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-timestamp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def epoch(time: String): Double = js.native
  def epoch(time: Double): Double = js.native
  def epoch(time: Date): Double = js.native
  def iso8601(time: String): String = js.native
  def iso8601(time: Double): String = js.native
  def iso8601(time: Date): String = js.native
  def rfc822(time: String): String = js.native
  def rfc822(time: Double): String = js.native
  def rfc822(time: Date): String = js.native
  def toDate(time: String): js.Date = js.native
  def toDate(time: Double): js.Date = js.native
  def toDate(time: Date): js.Date = js.native
}

