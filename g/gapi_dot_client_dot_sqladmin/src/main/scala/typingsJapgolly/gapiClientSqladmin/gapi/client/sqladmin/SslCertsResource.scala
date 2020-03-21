package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonFields
import typingsJapgolly.gapiClientSqladmin.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: AnonFields): Request_[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: AnonPrettyPrint): Request_[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: AnonPrettyPrint): Request_[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: AnonFields): Request_[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: AnonFields): Request_[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: AnonFields => CallbackTo[Request_[SslCert]],
    delete: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    get: AnonPrettyPrint => CallbackTo[Request_[SslCert]],
    insert: AnonFields => CallbackTo[Request_[SslCertsInsertResponse]],
    list: AnonFields => CallbackTo[Request_[SslCertsListResponse]]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createEphemeral")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => createEphemeral(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[SslCertsResource]
  }
}

