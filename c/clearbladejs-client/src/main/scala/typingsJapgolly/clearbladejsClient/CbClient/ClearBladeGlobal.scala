package typingsJapgolly.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBladeGlobal extends ClearBladeInt {
  var MESSAGING_QOS_AT_LEAST_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE = js.native
  var MESSAGING_QOS_AT_MOST_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE = js.native
  var MESSAGING_QOS_EXACTLY_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE = js.native
  def request(options: RequestOptions, callback: CbCallback): Unit = js.native
}

