package typingsJapgolly.googleapis.mod.adexchangebuyerV12

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ad Exchange Buyer API
  *
  * Accesses your bidding-account information, submits creatives for
  * validation, finds available direct deals, and retrieves performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adexchangebuyer = google.adexchangebuyer('v1.2');
  *
  * @namespace adexchangebuyer
  * @type {Function}
  * @version v1.2
  * @variation v1.2
  * @param {object=} options Options for Adexchangebuyer
  */
@JSImport("googleapis", "adexchangebuyer_v1_2.Adexchangebuyer")
@js.native
class Adexchangebuyer protected ()
  extends typingsJapgolly.googleapis.v12Mod.adexchangebuyerV12.Adexchangebuyer {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

