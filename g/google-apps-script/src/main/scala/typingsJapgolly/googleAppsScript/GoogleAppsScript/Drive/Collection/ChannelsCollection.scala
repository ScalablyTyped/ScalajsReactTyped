package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsCollection extends js.Object {
  // Stop watching resources through this channel
  def stop(resource: Channel): Unit
}

object ChannelsCollection {
  @scala.inline
  def apply(stop: Channel => Callback): ChannelsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel) => stop(t0).runNow()))
    __obj.asInstanceOf[ChannelsCollection]
  }
}

