package typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `GetBinding()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse extends js.Object {
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A URL to which the platform may proxy requests for the address sent with
    * bind_resource.route
    */
  var route_service_url: js.UndefOr[String] = js.native
  /**
    * From where to read system logs.
    */
  var syslog_drain_url: js.UndefOr[String] = js.native
  /**
    * An array of configuration for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse {
  @scala.inline
  def apply(
    credentials: StringDictionary[js.Any] = null,
    description: String = null,
    route_service_url: String = null,
    syslog_drain_url: String = null,
    volume_mounts: js.Array[StringDictionary[_]] = null
  ): SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (route_service_url != null) __obj.updateDynamic("route_service_url")(route_service_url.asInstanceOf[js.Any])
    if (syslog_drain_url != null) __obj.updateDynamic("syslog_drain_url")(syslog_drain_url.asInstanceOf[js.Any])
    if (volume_mounts != null) __obj.updateDynamic("volume_mounts")(volume_mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1GetBindingResponse]
  }
}

