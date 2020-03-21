package typingsJapgolly.gapiClientWebmasters.gapi.client.webmasters

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientWebmasters.AnonAlt
import typingsJapgolly.gapiClientWebmasters.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesResource extends js.Object {
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(request: AnonAlt): Request_[Unit]
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves information about specific site. */
  def get(request: AnonAlt): Request_[WmxSite]
  /** Lists the user's Search Console sites. */
  def list(request: AnonKey): Request_[SitesListResponse]
}

object SitesResource {
  @scala.inline
  def apply(
    add: AnonAlt => CallbackTo[Request_[Unit]],
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[WmxSite]],
    list: AnonKey => CallbackTo[Request_[SitesListResponse]]
  ): SitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonAlt) => add(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebmasters.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[SitesResource]
  }
}

