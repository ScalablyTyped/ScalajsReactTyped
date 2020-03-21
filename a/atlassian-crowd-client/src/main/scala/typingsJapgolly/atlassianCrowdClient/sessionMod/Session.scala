package typingsJapgolly.atlassianCrowdClient.sessionMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  val createdAt: js.Date
  val expiresAt: js.Date
  val token: String
  def toCrowd(): SessionObj
}

object Session {
  @scala.inline
  def apply(createdAt: js.Date, expiresAt: js.Date, toCrowd: CallbackTo[SessionObj], token: String): Session = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("toCrowd")(toCrowd.toJsFn)
    __obj.asInstanceOf[Session]
  }
}

