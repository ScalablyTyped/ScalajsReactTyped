package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonPageToken
import typingsJapgolly.gapiClientAppengine.AnonPp
import typingsJapgolly.gapiClientAppengine.AnonPrettyPrint
import typingsJapgolly.gapiClientAppengine.AnonQuotaUser
import typingsJapgolly.gapiClientAppengine.AnonServicesId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  var instances: InstancesResource
  /** Deploys code and resource files to a new version. */
  def create(request: AnonPp): Request_[Operation]
  /** Deletes an existing Version resource. */
  def delete(request: AnonPrettyPrint): Request_[Operation]
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(request: AnonQuotaUser): Request_[Version]
  /** Lists the versions of a service. */
  def list(request: AnonPageToken): Request_[ListVersionsResponse]
  /**
    * Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the
    * version resource uses:
    * serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):  For Version
    * resources that use basic scaling, manual scaling, or run in  the App Engine flexible environment.
    * instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):  For Version
    * resources that run in the App Engine standard environment.
    * automatic_scaling.min_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine standard environment.
    * automatic_scaling.max_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine standard environment.
    * automatic_scaling.min_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.max_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.cool_down_period_sec
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.cpu_utilization.target_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    */
  def patch(request: AnonServicesId): Request_[Operation]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: AnonPp => CallbackTo[Request_[Operation]],
    delete: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    get: AnonQuotaUser => CallbackTo[Request_[Version]],
    instances: InstancesResource,
    list: AnonPageToken => CallbackTo[Request_[ListVersionsResponse]],
    patch: AnonServicesId => CallbackTo[Request_[Operation]]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonPp) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonPageToken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonServicesId) => patch(t0).runNow()))
    __obj.asInstanceOf[VersionsResource]
  }
}

