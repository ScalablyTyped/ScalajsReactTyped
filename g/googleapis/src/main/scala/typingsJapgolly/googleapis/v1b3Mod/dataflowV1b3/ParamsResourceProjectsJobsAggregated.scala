package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobsAggregated extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The kind of filter to use.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * If there are many jobs, limit response to at most this many. The actual
    * number of jobs returned will be the lesser of max_responses and an
    * unspecified server-defined limit.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Set this to the 'next_page_token' field of a previous response to request
    * additional results in a long list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project which owns the jobs.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Level of information requested in response. Default is
    * `JOB_VIEW_SUMMARY`.
    */
  var view: js.UndefOr[String] = js.native
}

