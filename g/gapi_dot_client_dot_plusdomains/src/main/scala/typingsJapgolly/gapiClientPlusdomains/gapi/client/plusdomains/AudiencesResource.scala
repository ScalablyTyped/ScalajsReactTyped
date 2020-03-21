package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesResource extends js.Object {
  /** List all of the audiences to which a user can share. */
  def list(request: AnonFields): Request_[AudiencesFeed]
}

object AudiencesResource {
  @scala.inline
  def apply(list: AnonFields => CallbackTo[Request_[AudiencesFeed]]): AudiencesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[AudiencesResource]
  }
}

