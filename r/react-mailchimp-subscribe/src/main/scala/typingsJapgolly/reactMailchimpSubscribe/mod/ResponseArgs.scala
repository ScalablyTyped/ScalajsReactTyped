package typingsJapgolly.reactMailchimpSubscribe.mod

import typingsJapgolly.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typingsJapgolly.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseArgs extends js.Object {
  var message: String
  var status: success | error
}

object ResponseArgs {
  @scala.inline
  def apply(message: String, status: success | error): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseArgs]
  }
}

