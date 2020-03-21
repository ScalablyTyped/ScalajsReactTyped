package typingsJapgolly.newrelic.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributedTracePayload extends js.Object {
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def httpSafe(): String
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def text(): String
}

object DistributedTracePayload {
  @scala.inline
  def apply(httpSafe: CallbackTo[String], text: CallbackTo[String]): DistributedTracePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpSafe")(httpSafe.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.asInstanceOf[DistributedTracePayload]
  }
}

