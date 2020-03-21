package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudkms.AnonAccesstoken
import typingsJapgolly.gapiClientCloudkms.AnonAlt
import typingsJapgolly.gapiClientCloudkms.AnonBearertoken
import typingsJapgolly.gapiClientCloudkms.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersionsResource extends js.Object {
  /**
    * Create a new CryptoKeyVersion in a CryptoKey.
    *
    * The server will assign the next sequential id. If unset,
    * state will be set to
    * ENABLED.
    */
  def create(request: AnonAccesstoken): Request_[CryptoKeyVersion]
  /**
    * Schedule a CryptoKeyVersion for destruction.
    *
    * Upon calling this method, CryptoKeyVersion.state will be set to
    * DESTROY_SCHEDULED
    * and destroy_time will be set to a time 24
    * hours in the future, at which point the state
    * will be changed to
    * DESTROYED, and the key
    * material will be irrevocably destroyed.
    *
    * Before the destroy_time is reached,
    * RestoreCryptoKeyVersion may be called to reverse the process.
    */
  def destroy(request: AnonAlt): Request_[CryptoKeyVersion]
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: AnonAlt): Request_[CryptoKeyVersion]
  /** Lists CryptoKeyVersions. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeyVersionsResponse]
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: AnonCallback): Request_[CryptoKeyVersion]
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: AnonAlt): Request_[CryptoKeyVersion]
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[CryptoKeyVersion]],
    destroy: AnonAlt => CallbackTo[Request_[CryptoKeyVersion]],
    get: AnonAlt => CallbackTo[Request_[CryptoKeyVersion]],
    list: AnonBearertoken => CallbackTo[Request_[ListCryptoKeyVersionsResponse]],
    patch: AnonCallback => CallbackTo[Request_[CryptoKeyVersion]],
    restore: AnonAlt => CallbackTo[Request_[CryptoKeyVersion]]
  ): CryptoKeyVersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => destroy(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonCallback) => patch(t0).runNow()))
    __obj.updateDynamic("restore")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudkms.AnonAlt) => restore(t0).runNow()))
    __obj.asInstanceOf[CryptoKeyVersionsResource]
  }
}

