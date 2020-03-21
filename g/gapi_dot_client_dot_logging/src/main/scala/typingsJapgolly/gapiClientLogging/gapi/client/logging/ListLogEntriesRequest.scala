package typingsJapgolly.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogEntriesRequest extends js.Object {
  /**
    * Optional. A filter that chooses which log entries to return. See Advanced Logs Filters. Only log entries that match the filter are returned. An empty
    * filter matches all log entries in the resources listed in resource_names. Referencing a parent resource that is not listed in resource_names will cause
    * the filter to return no results. The maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * Optional. How the results should be sorted. Presently, the only permitted values are "timestamp asc" (default) and "timestamp desc". The first option
    * returns entries in order of increasing values of LogEntry.timestamp (oldest first), and the second option returns entries in order of decreasing
    * timestamps (newest first). Entries with equal timestamps are returned in order of their insert_id values.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /**
    * Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of next_page_token in the response
    * indicates that more results might be available.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional. If present, then retrieve the next batch of results from the preceding call to this method. page_token must be the value of next_page_token
    * from the previous response. The values of other method parameters should be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * Deprecated. Use resource_names instead. One or more project identifiers or project numbers from which to retrieve log entries. Example:
    * "my-project-1A". If present, these project identifiers are converted to resource name format and added to the list of resources in resource_names.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Required. Names of one or more parent resources from which to retrieve log entries:
    * "projects/[PROJECT_ID]"
    * "organizations/[ORGANIZATION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]"
    * "folders/[FOLDER_ID]"
    * Projects listed in the project_ids field are added to this list.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ListLogEntriesRequest {
  @scala.inline
  def apply(
    filter: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    projectIds: js.Array[String] = null,
    resourceNames: js.Array[String] = null
  ): ListLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (projectIds != null) __obj.updateDynamic("projectIds")(projectIds.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogEntriesRequest]
  }
}

