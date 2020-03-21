package typingsJapgolly.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Job entry with metadata inside SearchJobsResponse.
  */
@js.native
trait SchemaMatchingJob extends js.Object {
  /**
    * Commute information which is generated based on specified  CommuteFilter.
    */
  var commuteInfo: js.UndefOr[SchemaCommuteInfo] = js.native
  /**
    * Job resource that matches the specified SearchJobsRequest.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * A summary of the job with core information that&#39;s displayed on the
    * search results listing page.
    */
  var jobSummary: js.UndefOr[String] = js.native
  /**
    * Contains snippets of text from the Job.job_title field most closely
    * matching a search query&#39;s keywords, if available. The matching query
    * keywords are enclosed in HTML bold tags.
    */
  var jobTitleSnippet: js.UndefOr[String] = js.native
  /**
    * Contains snippets of text from the Job.description and similar fields
    * that most closely match a search query&#39;s keywords, if available. All
    * HTML tags in the original fields are stripped when returned in this
    * field, and matching query keywords are enclosed in HTML bold tags.
    */
  var searchTextSnippet: js.UndefOr[String] = js.native
}

object SchemaMatchingJob {
  @scala.inline
  def apply(
    commuteInfo: SchemaCommuteInfo = null,
    job: SchemaJob = null,
    jobSummary: String = null,
    jobTitleSnippet: String = null,
    searchTextSnippet: String = null
  ): SchemaMatchingJob = {
    val __obj = js.Dynamic.literal()
    if (commuteInfo != null) __obj.updateDynamic("commuteInfo")(commuteInfo.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (jobSummary != null) __obj.updateDynamic("jobSummary")(jobSummary.asInstanceOf[js.Any])
    if (jobTitleSnippet != null) __obj.updateDynamic("jobTitleSnippet")(jobTitleSnippet.asInstanceOf[js.Any])
    if (searchTextSnippet != null) __obj.updateDynamic("searchTextSnippet")(searchTextSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMatchingJob]
  }
}

