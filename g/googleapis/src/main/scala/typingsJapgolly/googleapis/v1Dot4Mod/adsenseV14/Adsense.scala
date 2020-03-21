package typingsJapgolly.googleapis.v1Dot4Mod.adsenseV14

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AdSense Management API
  *
  * Accesses AdSense publishers&#39; inventory and generates performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adsense = google.adsense('v1.4');
  *
  * @namespace adsense
  * @type {Function}
  * @version v1.4
  * @variation v1.4
  * @param {object=} options Options for Adsense
  */
@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Adsense")
@js.native
class Adsense protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: ResourceAccounts = js.native
  var adclients: ResourceAdclients = js.native
  var adunits: ResourceAdunits = js.native
  var alerts: ResourceAlerts = js.native
  var context: APIRequestContext = js.native
  var customchannels: ResourceCustomchannels = js.native
  var metadata: ResourceMetadata = js.native
  var payments: ResourcePayments = js.native
  var reports: ResourceReports = js.native
  var savedadstyles: ResourceSavedadstyles = js.native
  var urlchannels: ResourceUrlchannels = js.native
}

