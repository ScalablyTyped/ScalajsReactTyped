package typingsJapgolly.googleapis.mod.dnsV1beta2

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
  * const dns = google.dns('v1beta2');
  *
  * @namespace dns
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis", "dns_v1beta2.Dns")
@js.native
class Dns protected ()
  extends typingsJapgolly.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

