package typingsJapgolly.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableReference extends js.Object {
  /**
    * [Required] The ID of the dataset containing this table.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the project containing this table.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the table. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024
    * characters.
    */
  var tableId: js.UndefOr[String] = js.native
}

object SchemaTableReference {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, tableId: String = null): SchemaTableReference = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableReference]
  }
}

