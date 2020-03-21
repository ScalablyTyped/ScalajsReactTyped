package typingsJapgolly.gapiClientCloudiot.gapi.client.cloudiot

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudiot.AnonBearertoken
import typingsJapgolly.gapiClientCloudiot.AnonCallback
import typingsJapgolly.gapiClientCloudiot.AnonFields
import typingsJapgolly.gapiClientCloudiot.AnonKey
import typingsJapgolly.gapiClientCloudiot.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: AnonBearertoken): Request_[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets a device registry configuration. */
  def get(request: AnonCallback): Request_[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonKey): Request_[Policy]
  /** Lists device registries. */
  def list(request: AnonOauthtoken): Request_[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: AnonFields): Request_[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonKey): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonKey): Request_[TestIamPermissionsResponse]
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[DeviceRegistry]],
    delete: AnonCallback => CallbackTo[Request_[js.Object]],
    devices: DevicesResource,
    get: AnonCallback => CallbackTo[Request_[DeviceRegistry]],
    getIamPolicy: AnonKey => CallbackTo[Request_[Policy]],
    list: AnonOauthtoken => CallbackTo[Request_[ListDeviceRegistriesResponse]],
    patch: AnonFields => CallbackTo[Request_[DeviceRegistry]],
    setIamPolicy: AnonKey => CallbackTo[Request_[Policy]],
    testIamPermissions: AnonKey => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonCallback) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonKey) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonKey) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonKey) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[RegistriesResource]
  }
}

