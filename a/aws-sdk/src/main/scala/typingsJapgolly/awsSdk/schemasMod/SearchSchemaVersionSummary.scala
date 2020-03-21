package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemaVersionSummary extends js.Object {
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
}

object SearchSchemaVersionSummary {
  @scala.inline
  def apply(CreatedDate: js.Date = null, SchemaVersion: string = null): SearchSchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemaVersionSummary]
  }
}

