package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a BigQuery connector used by the job.
  */
@js.native
trait SchemaBigQueryIODetails extends js.Object {
  /**
    * Dataset accessed in the connection.
    */
  var dataset: js.UndefOr[String] = js.native
  /**
    * Project accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Query used to access data in the connection.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Table accessed in the connection.
    */
  var table: js.UndefOr[String] = js.native
}

object SchemaBigQueryIODetails {
  @scala.inline
  def apply(dataset: String = null, projectId: String = null, query: String = null, table: String = null): SchemaBigQueryIODetails = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigQueryIODetails]
  }
}

