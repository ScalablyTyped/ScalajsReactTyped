package typingsJapgolly.mongooseGeojsonSchema.mod.Schema.Types

import typingsJapgolly.mongoose.mod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "Schema.Types.GeometryCollection")
@js.native
class GeometryCollection protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSImport("mongoose", "Schema.Types.GeometryCollection")
@js.native
object GeometryCollection extends js.Object {
  var schemaName: typingsJapgolly.mongooseGeojsonSchema.mongooseGeojsonSchemaStrings.GeometryCollection = js.native
}

