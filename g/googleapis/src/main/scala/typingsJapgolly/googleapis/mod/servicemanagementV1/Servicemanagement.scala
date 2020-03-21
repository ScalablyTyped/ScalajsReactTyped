package typingsJapgolly.googleapis.mod.servicemanagementV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Management API
  *
  * Google Service Management allows service producers to publish their
  * services on Google Cloud Platform so that they can be discovered and used
  * by service consumers.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicemanagement = google.servicemanagement('v1');
  *
  * @namespace servicemanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicemanagement
  */
@JSImport("googleapis", "servicemanagement_v1.Servicemanagement")
@js.native
class Servicemanagement protected ()
  extends typingsJapgolly.googleapis.servicemanagementV1Mod.servicemanagementV1.Servicemanagement {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

