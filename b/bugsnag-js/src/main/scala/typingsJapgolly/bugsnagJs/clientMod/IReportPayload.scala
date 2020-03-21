package typingsJapgolly.bugsnagJs.clientMod

import typingsJapgolly.bugsnagJs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportPayload extends js.Object {
  var apiKey: String
  var events: js.Array[typingsJapgolly.bugsnagJs.reportMod.default]
  var notifier: AnonName
}

object IReportPayload {
  @scala.inline
  def apply(apiKey: String, events: js.Array[typingsJapgolly.bugsnagJs.reportMod.default], notifier: AnonName): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReportPayload]
  }
}

