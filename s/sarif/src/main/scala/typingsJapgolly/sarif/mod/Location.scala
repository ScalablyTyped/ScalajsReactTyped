package typingsJapgolly.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * A set of regions relevant to the location.
    */
  var annotations: js.UndefOr[js.Array[Region]] = js.undefined
  /**
    * Value that distinguishes this location from all other locations within a single result object.
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * The logical locations associated with the result.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.undefined
  /**
    * A message relevant to the location.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Identifies the artifact and region.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of objects that describe relationships between this location and others.
    */
  var relationships: js.UndefOr[js.Array[LocationRelationship]] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    annotations: js.Array[Region] = null,
    id: Int | Double = null,
    logicalLocations: js.Array[LogicalLocation] = null,
    message: Message = null,
    physicalLocation: PhysicalLocation = null,
    properties: PropertyBag = null,
    relationships: js.Array[LocationRelationship] = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logicalLocations != null) __obj.updateDynamic("logicalLocations")(logicalLocations.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (physicalLocation != null) __obj.updateDynamic("physicalLocation")(physicalLocation.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

