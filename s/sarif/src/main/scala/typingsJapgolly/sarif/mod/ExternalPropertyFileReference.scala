package typingsJapgolly.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFileReference extends js.Object {
  /**
    * A stable, unique identifer for the external property file in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * A non-negative integer specifying the number of items contained in the external property file.
    */
  var itemCount: js.UndefOr[Double] = js.undefined
  /**
    * The location of the external property file.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external property file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ExternalPropertyFileReference {
  @scala.inline
  def apply(
    guid: String = null,
    itemCount: Int | Double = null,
    location: ArtifactLocation = null,
    properties: PropertyBag = null
  ): ExternalPropertyFileReference = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalPropertyFileReference]
  }
}

