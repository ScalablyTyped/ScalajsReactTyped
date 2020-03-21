package typingsJapgolly.googleapis.groupsmigrationV1Mod.groupsmigrationV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups Migration API
  *
  * Groups Migration Api.
  *
  * @example
  * const {google} = require('googleapis');
  * const groupsmigration = google.groupsmigration('v1');
  *
  * @namespace groupsmigration
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Groupsmigration
  */
@JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Groupsmigration")
@js.native
class Groupsmigration protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var archive: ResourceArchive = js.native
  var context: APIRequestContext = js.native
}

