package typingsJapgolly.googleapis.mod.dnsV1

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
  * const dns = google.dns('v1');
  *
  * @namespace dns
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis", "dns_v1.Dns")
@js.native
class Dns protected ()
  extends typingsJapgolly.googleapis.dnsV1Mod.dnsV1.Dns {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

