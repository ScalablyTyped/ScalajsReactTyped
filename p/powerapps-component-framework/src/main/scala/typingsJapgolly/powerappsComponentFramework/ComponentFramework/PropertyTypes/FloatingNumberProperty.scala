package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.FloatingNumberMetadata
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is FP
		 */
trait FloatingNumberProperty extends NumberProperty {
  @JSName("attributes")
  var attributes_FloatingNumberProperty: js.UndefOr[FloatingNumberMetadata] = js.undefined
}

object FloatingNumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: FloatingNumberMetadata = null,
    formatted: String = null,
    raw: Int | Double = null,
    security: SecurityValues = null
  ): FloatingNumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingNumberProperty]
  }
}

