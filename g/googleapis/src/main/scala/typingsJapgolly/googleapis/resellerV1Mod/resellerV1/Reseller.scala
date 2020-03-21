package typingsJapgolly.googleapis.resellerV1Mod.resellerV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enterprise Apps Reseller API
  *
  * Creates and manages your customers and their subscriptions.
  *
  * @example
  * const {google} = require('googleapis');
  * const reseller = google.reseller('v1');
  *
  * @namespace reseller
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Reseller
  */
@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Reseller")
@js.native
class Reseller protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var customers: ResourceCustomers = js.native
  var resellernotify: ResourceResellernotify = js.native
  var subscriptions: ResourceSubscriptions = js.native
}

