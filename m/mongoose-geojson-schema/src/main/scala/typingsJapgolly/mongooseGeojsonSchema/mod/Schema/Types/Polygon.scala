package typingsJapgolly.mongooseGeojsonSchema.mod.Schema.Types

import typingsJapgolly.mongoose.mod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "Schema.Types.Polygon")
@js.native
class Polygon protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSImport("mongoose", "Schema.Types.Polygon")
@js.native
object Polygon extends js.Object {
  var schemaName: typingsJapgolly.mongooseGeojsonSchema.mongooseGeojsonSchemaStrings.Polygon = js.native
}

