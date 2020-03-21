package typingsJapgolly.googleapis.runV1Mod.runV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Run API
  *
  * Deploy and manage user provided container images that scale automatically
  * based on HTTP traffic.
  *
  * @example
  * const {google} = require('googleapis');
  * const run = google.run('v1');
  *
  * @namespace run
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Run
  */
@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Run")
@js.native
class Run protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

