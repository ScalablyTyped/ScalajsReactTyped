package typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Talent Solution API
  *
  * Cloud Talent Solution provides the capability to create, read, update, and
  * delete job postings, as well as search jobs based on keywords and filters.
  *
  * @example
  * const {google} = require('googleapis');
  * const jobs = google.jobs('v3p1beta1');
  *
  * @namespace jobs
  * @type {Function}
  * @version v3p1beta1
  * @variation v3p1beta1
  * @param {object=} options Options for Jobs
  */
@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Jobs")
@js.native
class Jobs protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

