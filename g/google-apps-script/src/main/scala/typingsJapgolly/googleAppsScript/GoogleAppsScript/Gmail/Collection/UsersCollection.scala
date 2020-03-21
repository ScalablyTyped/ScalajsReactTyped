package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.DraftsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.HistoryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.LabelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.MessagesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.SettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.ThreadsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Profile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCollection extends js.Object {
  var Drafts: js.UndefOr[DraftsCollection] = js.undefined
  var History: js.UndefOr[HistoryCollection] = js.undefined
  var Labels: js.UndefOr[LabelsCollection] = js.undefined
  var Messages: js.UndefOr[MessagesCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  var Threads: js.UndefOr[ThreadsCollection] = js.undefined
  // Gets the current user's Gmail profile.
  def getProfile(userId: String): Profile
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: String): Unit
  // Set up or update a push notification watch on the given user mailbox.
  def watch(resource: WatchRequest, userId: String): WatchResponse
}

object UsersCollection {
  @scala.inline
  def apply(
    getProfile: String => CallbackTo[Profile],
    stop: String => Callback,
    watch: (WatchRequest, String) => CallbackTo[WatchResponse],
    Drafts: DraftsCollection = null,
    History: HistoryCollection = null,
    Labels: LabelsCollection = null,
    Messages: MessagesCollection = null,
    Settings: SettingsCollection = null,
    Threads: ThreadsCollection = null
  ): UsersCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProfile")(js.Any.fromFunction1((t0: java.lang.String) => getProfile(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: java.lang.String) => stop(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest, t1: java.lang.String) => watch(t0, t1).runNow()))
    if (Drafts != null) __obj.updateDynamic("Drafts")(Drafts.asInstanceOf[js.Any])
    if (History != null) __obj.updateDynamic("History")(History.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (Threads != null) __obj.updateDynamic("Threads")(Threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCollection]
  }
}

