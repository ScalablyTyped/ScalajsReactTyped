package typingsJapgolly.googleapis.storagetransferV1Mod.storagetransferV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Storage Transfer API
  *
  * Transfers data from external data sources to a Google Cloud Storage bucket
  * or between Google Cloud Storage buckets.
  *
  * @example
  * const {google} = require('googleapis');
  * const storagetransfer = google.storagetransfer('v1');
  *
  * @namespace storagetransfer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storagetransfer
  */
@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Storagetransfer")
@js.native
class Storagetransfer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var googleServiceAccounts: ResourceGoogleserviceaccounts = js.native
  var transferJobs: ResourceTransferjobs = js.native
  var transferOperations: ResourceTransferoperations = js.native
}

