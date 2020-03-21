package typingsJapgolly.googleapis.mod.dnsV2beta1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud DNS API
  *
  * Configures and serves authoritative DNS records.
  *
  * @example
  * const {google} = require('googleapis');
  * const dns = google.dns('v2beta1');
  *
  * @namespace dns
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis", "dns_v2beta1.Dns")
@js.native
class Dns protected ()
  extends typingsJapgolly.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

