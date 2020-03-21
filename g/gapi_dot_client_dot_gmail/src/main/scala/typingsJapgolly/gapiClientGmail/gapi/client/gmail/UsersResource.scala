package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var drafts: DraftsResource
  var history: HistoryResource
  var labels: LabelsResource
  var messages: MessagesResource
  var settings: SettingsResource
  var threads: ThreadsResource
  /** Gets the current user's Gmail profile. */
  def getProfile(request: AnonAlt): Request_[Profile]
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: AnonAlt): Request_[Unit]
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: AnonAlt): Request_[WatchResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: AnonAlt => CallbackTo[Request_[Profile]],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: AnonAlt => CallbackTo[Request_[Unit]],
    threads: ThreadsResource,
    watch: AnonAlt => CallbackTo[Request_[WatchResponse]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(drafts = drafts.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
    __obj.updateDynamic("getProfile")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => getProfile(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => stop(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => watch(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

