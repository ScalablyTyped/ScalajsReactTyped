package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Messages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsCollection extends js.Object {
  // Gets the specified message attachment.
  def get(userId: String, messageId: String, id: String): MessagePartBody
}

object AttachmentsCollection {
  @scala.inline
  def apply(get: (String, String, String) => CallbackTo[MessagePartBody]): AttachmentsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => get(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AttachmentsCollection]
  }
}

