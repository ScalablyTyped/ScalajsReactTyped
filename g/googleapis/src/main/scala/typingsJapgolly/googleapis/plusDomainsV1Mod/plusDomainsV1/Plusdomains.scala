package typingsJapgolly.googleapis.plusDomainsV1Mod.plusDomainsV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google+ Domains API
  *
  * Builds on top of the Google+ platform for Google Apps Domains.
  *
  * @example
  * const {google} = require('googleapis');
  * const plusDomains = google.plusDomains('v1');
  *
  * @namespace plusDomains
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Plusdomains
  */
@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Plusdomains")
@js.native
class Plusdomains protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: ResourceActivities = js.native
  var audiences: ResourceAudiences = js.native
  var circles: ResourceCircles = js.native
  var comments: ResourceComments = js.native
  var context: APIRequestContext = js.native
  var media: ResourceMedia = js.native
  var people: ResourcePeople = js.native
}

