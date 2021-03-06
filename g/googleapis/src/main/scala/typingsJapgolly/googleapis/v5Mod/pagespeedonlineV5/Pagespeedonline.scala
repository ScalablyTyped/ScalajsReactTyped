package typingsJapgolly.googleapis.v5Mod.pagespeedonlineV5

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PageSpeed Insights API
  *
  * Analyzes the performance of a web page and provides tailored suggestions to
  * make that page faster.
  *
  * @example
  * const {google} = require('googleapis');
  * const pagespeedonline = google.pagespeedonline('v5');
  *
  * @namespace pagespeedonline
  * @type {Function}
  * @version v5
  * @variation v5
  * @param {object=} options Options for Pagespeedonline
  */
@JSImport("googleapis/build/src/apis/pagespeedonline/v5", "pagespeedonline_v5.Pagespeedonline")
@js.native
class Pagespeedonline protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pagespeedapi: ResourcePagespeedapi = js.native
}

