package typingsJapgolly.googleapis.v2beta2Mod.cloudtasksV2beta2

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Tasks API
  *
  * Manages the execution of large numbers of distributed requests.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtasks = google.cloudtasks('v2beta2');
  *
  * @namespace cloudtasks
  * @type {Function}
  * @version v2beta2
  * @variation v2beta2
  * @param {object=} options Options for Cloudtasks
  */
@JSImport("googleapis/build/src/apis/cloudtasks/v2beta2", "cloudtasks_v2beta2.Cloudtasks")
@js.native
class Cloudtasks protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

