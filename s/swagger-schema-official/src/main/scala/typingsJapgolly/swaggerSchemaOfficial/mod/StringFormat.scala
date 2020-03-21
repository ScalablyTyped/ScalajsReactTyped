package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.undefined
  var `type`: string
}

object StringFormat {
  @scala.inline
  def apply(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
}

