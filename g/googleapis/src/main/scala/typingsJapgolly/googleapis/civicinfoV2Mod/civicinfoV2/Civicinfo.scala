package typingsJapgolly.googleapis.civicinfoV2Mod.civicinfoV2

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Civic Information API
  *
  * Provides polling places, early vote locations, contest data, election
  * officials, and government representatives for U.S. residential addresses.
  *
  * @example
  * const {google} = require('googleapis');
  * const civicinfo = google.civicinfo('v2');
  *
  * @namespace civicinfo
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Civicinfo
  */
@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Civicinfo")
@js.native
class Civicinfo protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var divisions: ResourceDivisions = js.native
  var elections: ResourceElections = js.native
  var representatives: ResourceRepresentatives = js.native
}

