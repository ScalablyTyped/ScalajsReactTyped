package typingsJapgolly.gapiClientLogging.gapi.client.logging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLogging.AnonBearertoken
import typingsJapgolly.gapiClientLogging.AnonKey
import typingsJapgolly.gapiClientLogging.AnonOauthtoken
import typingsJapgolly.gapiClientLogging.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinksResource extends js.Object {
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's
    * writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: AnonKey): Request_[LogSink]
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(request: AnonOauthtoken): Request_[js.Object]
  /** Gets a sink. */
  def get(request: AnonOauthtoken): Request_[LogSink]
  /** Lists sinks. */
  def list(request: AnonBearertoken): Request_[ListSinksResponse]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def patch(request: AnonPp): Request_[LogSink]
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter. The updated sink
    * might also have a new writer_identity; see the unique_writer_identity field.
    */
  def update(request: AnonPp): Request_[LogSink]
}

object SinksResource {
  @scala.inline
  def apply(
    create: AnonKey => CallbackTo[Request_[LogSink]],
    delete: AnonOauthtoken => CallbackTo[Request_[js.Object]],
    get: AnonOauthtoken => CallbackTo[Request_[LogSink]],
    list: AnonBearertoken => CallbackTo[Request_[ListSinksResponse]],
    patch: AnonPp => CallbackTo[Request_[LogSink]],
    update: AnonPp => CallbackTo[Request_[LogSink]]
  ): SinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonKey) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonPp) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLogging.AnonPp) => update(t0).runNow()))
    __obj.asInstanceOf[SinksResource]
  }
}

