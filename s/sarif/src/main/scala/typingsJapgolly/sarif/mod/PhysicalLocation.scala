package typingsJapgolly.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalLocation extends js.Object {
  /**
    * The address of the location.
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * The location of the artifact.
    */
  var artifactLocation: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Specifies a portion of the artifact that encloses the region. Allows a viewer to display additional context
    * around the region.
    */
  var contextRegion: js.UndefOr[Region] = js.undefined
  /**
    * Key/value pairs that provide additional information about the physical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Specifies a portion of the artifact.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object PhysicalLocation {
  @scala.inline
  def apply(
    address: Address = null,
    artifactLocation: ArtifactLocation = null,
    contextRegion: Region = null,
    properties: PropertyBag = null,
    region: Region = null
  ): PhysicalLocation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (artifactLocation != null) __obj.updateDynamic("artifactLocation")(artifactLocation.asInstanceOf[js.Any])
    if (contextRegion != null) __obj.updateDynamic("contextRegion")(contextRegion.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalLocation]
  }
}

