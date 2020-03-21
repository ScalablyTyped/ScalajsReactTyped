package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansCollection extends js.Object {
  // Adds a new ban to the chat.
  def insert(resource: LiveChatBan, part: String): LiveChatBan
  // Removes a chat ban.
  def remove(id: String): Unit
}

object LiveChatBansCollection {
  @scala.inline
  def apply(insert: (LiveChatBan, String) => CallbackTo[LiveChatBan], remove: String => Callback): LiveChatBansCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[LiveChatBansCollection]
  }
}

