package typingsJapgolly.googleapis.licensingV1Mod.licensingV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enterprise License Manager API
  *
  * Views and manages licenses for your domain.
  *
  * @example
  * const {google} = require('googleapis');
  * const licensing = google.licensing('v1');
  *
  * @namespace licensing
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Licensing
  */
@JSImport("googleapis/build/src/apis/licensing/v1", "licensing_v1.Licensing")
@js.native
class Licensing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var licenseAssignments: ResourceLicenseassignments = js.native
}

