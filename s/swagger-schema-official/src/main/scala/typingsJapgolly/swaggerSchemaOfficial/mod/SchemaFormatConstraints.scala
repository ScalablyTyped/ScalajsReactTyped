package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swaggerSchemaOfficial.mod.GenericFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.IntegerFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.NumberFormat
  - typingsJapgolly.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends js.Object

object SchemaFormatConstraints {
  @scala.inline
  def GenericFormat(format: String = null, `type`: ParameterType = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def IntegerFormat(`type`: integer, format: int32 | int64 = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def NumberFormat(`type`: number, format: float | double = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def StringFormat(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

