package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourcePolicy extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * Resource policy for instacnes for placement configuration.
    */
  var groupPlacementPolicy: js.UndefOr[SchemaResourcePolicyGroupPlacementPolicy] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#resource_policies for
    * resource policies.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The resource name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * Resource policy for persistent disks for creating snapshots.
    */
  var snapshotSchedulePolicy: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicy] = js.native
  /**
    * Resource policy applicable to VMs for infrastructure maintenance.
    */
  var vmMaintenancePolicy: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicy] = js.native
}

object SchemaResourcePolicy {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    groupPlacementPolicy: SchemaResourcePolicyGroupPlacementPolicy = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    snapshotSchedulePolicy: SchemaResourcePolicySnapshotSchedulePolicy = null,
    vmMaintenancePolicy: SchemaResourcePolicyVmMaintenancePolicy = null
  ): SchemaResourcePolicy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (groupPlacementPolicy != null) __obj.updateDynamic("groupPlacementPolicy")(groupPlacementPolicy.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (snapshotSchedulePolicy != null) __obj.updateDynamic("snapshotSchedulePolicy")(snapshotSchedulePolicy.asInstanceOf[js.Any])
    if (vmMaintenancePolicy != null) __obj.updateDynamic("vmMaintenancePolicy")(vmMaintenancePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicy]
  }
}

