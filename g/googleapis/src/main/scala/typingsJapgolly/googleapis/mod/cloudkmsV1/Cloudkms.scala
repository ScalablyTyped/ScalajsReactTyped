package typingsJapgolly.googleapis.mod.cloudkmsV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Key Management Service (KMS) API
  *
  * Manages keys and performs cryptographic operations in a central cloud
  * service, for direct use by other cloud resources and applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudkms = google.cloudkms('v1');
  *
  * @namespace cloudkms
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudkms
  */
@JSImport("googleapis", "cloudkms_v1.Cloudkms")
@js.native
class Cloudkms protected ()
  extends typingsJapgolly.googleapis.cloudkmsV1Mod.cloudkmsV1.Cloudkms {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

