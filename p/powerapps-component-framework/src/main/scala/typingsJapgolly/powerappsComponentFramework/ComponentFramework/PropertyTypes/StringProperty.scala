package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.StringMetadata
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type starts from SingleLine
		 */
trait StringProperty extends Property {
  var attributes: js.UndefOr[StringMetadata] = js.undefined
  @JSName("raw")
  var raw_StringProperty: String | Null
}

object StringProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: StringMetadata = null,
    formatted: String = null,
    raw: String = null,
    security: SecurityValues = null
  ): StringProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringProperty]
  }
}

