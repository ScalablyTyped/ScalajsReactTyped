package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquery.AnonAllUsers
import typingsJapgolly.gapiClientBigquery.AnonFields
import typingsJapgolly.gapiClientBigquery.AnonJobId
import typingsJapgolly.gapiClientBigquery.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: AnonJobId): Request_[JobCancelResponse]
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: AnonJobId): Request_[Job]
  /** Retrieves the results of a query job. */
  def getQueryResults(request: AnonKey): Request_[GetQueryResultsResponse]
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: AnonFields): Request_[Job]
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: AnonAllUsers): Request_[JobList]
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: AnonFields): Request_[QueryResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonJobId => CallbackTo[Request_[JobCancelResponse]],
    get: AnonJobId => CallbackTo[Request_[Job]],
    getQueryResults: AnonKey => CallbackTo[Request_[GetQueryResultsResponse]],
    insert: AnonFields => CallbackTo[Request_[Job]],
    list: AnonAllUsers => CallbackTo[Request_[JobList]],
    query: AnonFields => CallbackTo[Request_[QueryResponse]]
  ): JobsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonJobId) => cancel(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonJobId) => get(t0).runNow()))
    __obj.updateDynamic("getQueryResults")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonKey) => getQueryResults(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonAllUsers) => list(t0).runNow()))
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquery.AnonFields) => query(t0).runNow()))
    __obj.asInstanceOf[JobsResource]
  }
}

