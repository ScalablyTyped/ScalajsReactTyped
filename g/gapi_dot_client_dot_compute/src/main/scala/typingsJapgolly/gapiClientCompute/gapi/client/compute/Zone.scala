package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  /** [Output Only] Available cpu/platform selections for the zone. */
  var availableCpuPlatforms: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] The deprecation status associated with this zone. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] Textual description of the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#zone for zones. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Full URL reference to the region which hosts the zone. */
  var region: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] Status of the zone, either UP or DOWN. */
  var status: js.UndefOr[String] = js.undefined
}

object Zone {
  @scala.inline
  def apply(
    availableCpuPlatforms: js.Array[String] = null,
    creationTimestamp: String = null,
    deprecated: DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    status: String = null
  ): Zone = {
    val __obj = js.Dynamic.literal()
    if (availableCpuPlatforms != null) __obj.updateDynamic("availableCpuPlatforms")(availableCpuPlatforms.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zone]
  }
}

