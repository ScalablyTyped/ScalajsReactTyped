package typingsJapgolly.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Error Reporting API
  *
  * Groups and counts similar errors from cloud services and applications,
  * reports new errors, and provides access to error groups and their
  * associated errors.
  *
  * @example
  * const {google} = require('googleapis');
  * const clouderrorreporting = google.clouderrorreporting('v1beta1');
  *
  * @namespace clouderrorreporting
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Clouderrorreporting
  */
@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Clouderrorreporting")
@js.native
class Clouderrorreporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

