package typingsJapgolly.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCc extends js.Object {
  var bcc: js.Any
  var cc: js.Any
  var custom_args: js.Any
  var headers: js.Any
  var send_at: Double
  var subject: String
  var substitutions: js.Any
  var to: js.Any
}

object AnonCc {
  @scala.inline
  def apply(
    bcc: js.Any,
    cc: js.Any,
    custom_args: js.Any,
    headers: js.Any,
    send_at: Double,
    subject: String,
    substitutions: js.Any,
    to: js.Any
  ): AnonCc = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCc]
  }
}

