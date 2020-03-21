package typingsJapgolly.googleapis.mod.cloudiotV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud IoT API
  *
  * Registers and manages IoT (Internet of Things) devices that connect to the
  * Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudiot = google.cloudiot('v1');
  *
  * @namespace cloudiot
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudiot
  */
@JSImport("googleapis", "cloudiot_v1.Cloudiot")
@js.native
class Cloudiot protected ()
  extends typingsJapgolly.googleapis.cloudiotV1Mod.cloudiotV1.Cloudiot {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

