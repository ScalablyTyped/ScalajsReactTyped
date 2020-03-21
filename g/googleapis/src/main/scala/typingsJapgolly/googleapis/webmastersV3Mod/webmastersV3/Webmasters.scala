package typingsJapgolly.googleapis.webmastersV3Mod.webmastersV3

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search Console API
  *
  * View Google Search Console data for your verified sites.
  *
  * @example
  * const {google} = require('googleapis');
  * const webmasters = google.webmasters('v3');
  *
  * @namespace webmasters
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Webmasters
  */
@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Webmasters")
@js.native
class Webmasters protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var searchanalytics: ResourceSearchanalytics = js.native
  var sitemaps: ResourceSitemaps = js.native
  var sites: ResourceSites = js.native
  var urlcrawlerrorscounts: ResourceUrlcrawlerrorscounts = js.native
  var urlcrawlerrorssamples: ResourceUrlcrawlerrorssamples = js.native
}

