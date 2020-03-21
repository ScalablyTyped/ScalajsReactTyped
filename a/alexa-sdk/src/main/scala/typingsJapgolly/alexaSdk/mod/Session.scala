package typingsJapgolly.alexaSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var application: Application
  var attributes: StringDictionary[js.Any]
  var `new`: Boolean
  var sessionId: String
  var user: SessionUser
}

object Session {
  @scala.inline
  def apply(
    application: Application,
    attributes: StringDictionary[js.Any],
    `new`: Boolean,
    sessionId: String,
    user: SessionUser
  ): Session = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

