package typingsJapgolly.googleapis.androidpublisherV1Mod.androidpublisherV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Developer API
  *
  * Accesses Android application developers&#39; Google Play accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const androidpublisher = google.androidpublisher('v1');
  *
  * @namespace androidpublisher
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Androidpublisher
  */
@JSImport("googleapis/build/src/apis/androidpublisher/v1", "androidpublisher_v1.Androidpublisher")
@js.native
class Androidpublisher protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var purchases: ResourcePurchases = js.native
}

