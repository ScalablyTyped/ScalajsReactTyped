package typingsJapgolly.loopback

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGenerateVerificationToken extends js.Object {
  var from: String
  var redirect: String
  var subject: String
  var template: String
  var text: String
  var to: String
  var `type`: String
  def generateVerificationToken(): Unit
}

object AnonGenerateVerificationToken {
  @scala.inline
  def apply(
    from: String,
    generateVerificationToken: Callback,
    redirect: String,
    subject: String,
    template: String,
    text: String,
    to: String,
    `type`: String
  ): AnonGenerateVerificationToken = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("generateVerificationToken")(generateVerificationToken.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenerateVerificationToken]
  }
}

