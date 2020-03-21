package typingsJapgolly.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Bigtable Admin API
  *
  * Administer your Cloud Bigtable tables and instances.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigtableadmin = google.bigtableadmin('v2');
  *
  * @namespace bigtableadmin
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Bigtableadmin
  */
@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Bigtableadmin")
@js.native
class Bigtableadmin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
  var projects: ResourceProjects = js.native
}

