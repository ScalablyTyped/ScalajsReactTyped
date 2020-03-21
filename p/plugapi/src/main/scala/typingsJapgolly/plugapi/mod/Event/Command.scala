package typingsJapgolly.plugapi.mod.Event

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.plugapi.mod.RawChatMessage
import typingsJapgolly.plugapi.mod.User.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Chat {
  var args: js.Array[String]
  var command: String
  def havePermission(args: js.Any*): Boolean
  def isFrom(args: js.Any*): Boolean
  def respond(args: js.Any*): js.Any
  def respondTimeout(args: js.Any*): js.Any
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[String],
    command: String,
    from: User,
    havePermission: /* repeated */ js.Any => CallbackTo[Boolean],
    id: String,
    isFrom: /* repeated */ js.Any => CallbackTo[Boolean],
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    respond: /* repeated */ js.Any => CallbackTo[js.Any],
    respondTimeout: /* repeated */ js.Any => CallbackTo[js.Any],
    `type`: String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("havePermission")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => havePermission(t0).runNow()))
    __obj.updateDynamic("isFrom")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => isFrom(t0).runNow()))
    __obj.updateDynamic("respond")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => respond(t0).runNow()))
    __obj.updateDynamic("respondTimeout")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => respondTimeout(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

