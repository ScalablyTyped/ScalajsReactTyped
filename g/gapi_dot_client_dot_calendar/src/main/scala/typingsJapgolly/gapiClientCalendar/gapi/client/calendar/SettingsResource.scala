package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonPageToken
import typingsJapgolly.gapiClientCalendar.AnonSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: AnonSetting): Request_[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: AnonPageToken): Request_[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: AnonPageToken): Request_[Channel]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: AnonSetting => CallbackTo[Request_[Setting]],
    list: AnonPageToken => CallbackTo[Request_[Settings]],
    watch: AnonPageToken => CallbackTo[Request_[Channel]]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonSetting) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonPageToken) => list(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonPageToken) => watch(t0).runNow()))
    __obj.asInstanceOf[SettingsResource]
  }
}

