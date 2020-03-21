package typingsJapgolly.gapiClientSiteverification.gapi.client.siteverification

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSiteverification.AnonAlt
import typingsJapgolly.gapiClientSiteverification.AnonFields
import typingsJapgolly.gapiClientSiteverification.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Get the most current data for a website or domain. */
  def get(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: AnonFields): Request_[SiteVerificationWebResourceGettokenResponse]
  /** Attempt verification of a website or domain. */
  def insert(request: AnonKey): Request_[SiteVerificationWebResourceResource]
  /** Get the list of your verified websites and domains. */
  def list(request: AnonFields): Request_[SiteVerificationWebResourceListResponse]
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
  /** Modify the list of owners for your website or domain. */
  def update(request: AnonAlt): Request_[SiteVerificationWebResourceResource]
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[SiteVerificationWebResourceResource]],
    getToken: AnonFields => CallbackTo[Request_[SiteVerificationWebResourceGettokenResponse]],
    insert: AnonKey => CallbackTo[Request_[SiteVerificationWebResourceResource]],
    list: AnonFields => CallbackTo[Request_[SiteVerificationWebResourceListResponse]],
    patch: AnonAlt => CallbackTo[Request_[SiteVerificationWebResourceResource]],
    update: AnonAlt => CallbackTo[Request_[SiteVerificationWebResourceResource]]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("getToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonFields) => getToken(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSiteverification.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[WebResourceResource]
  }
}

