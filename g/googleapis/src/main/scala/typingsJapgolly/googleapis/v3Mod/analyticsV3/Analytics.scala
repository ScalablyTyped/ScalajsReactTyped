package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v3');
  *
  * @namespace analytics
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Analytics")
@js.native
class Analytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var data: ResourceData = js.native
  var management: ResourceManagement = js.native
  var metadata: ResourceMetadata = js.native
  var provisioning: ResourceProvisioning = js.native
  var userDeletion: ResourceUserdeletion = js.native
}

