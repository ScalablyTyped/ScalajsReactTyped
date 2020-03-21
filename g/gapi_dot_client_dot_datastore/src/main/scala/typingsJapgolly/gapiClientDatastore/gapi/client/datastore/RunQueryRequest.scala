package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryRequest extends js.Object {
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.undefined
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition.
    * This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.undefined
  /** The query to run. */
  var query: js.UndefOr[Query] = js.undefined
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}

object RunQueryRequest {
  @scala.inline
  def apply(
    gqlQuery: GqlQuery = null,
    partitionId: PartitionId = null,
    query: Query = null,
    readOptions: ReadOptions = null
  ): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (gqlQuery != null) __obj.updateDynamic("gqlQuery")(gqlQuery.asInstanceOf[js.Any])
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunQueryRequest]
  }
}

