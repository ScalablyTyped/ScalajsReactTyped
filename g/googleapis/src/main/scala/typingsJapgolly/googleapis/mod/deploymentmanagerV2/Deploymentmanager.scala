package typingsJapgolly.googleapis.mod.deploymentmanagerV2

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Deployment Manager API
  *
  * Declares, configures, and deploys complex solutions on Google Cloud
  * Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis", "deploymentmanager_v2.Deploymentmanager")
@js.native
class Deploymentmanager protected ()
  extends typingsJapgolly.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

