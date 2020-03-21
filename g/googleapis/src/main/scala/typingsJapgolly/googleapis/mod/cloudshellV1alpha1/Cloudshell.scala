package typingsJapgolly.googleapis.mod.cloudshellV1alpha1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Shell API
  *
  * Allows users to start, configure, and connect to interactive shell sessions
  * running in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudshell = google.cloudshell('v1alpha1');
  *
  * @namespace cloudshell
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Cloudshell
  */
@JSImport("googleapis", "cloudshell_v1alpha1.Cloudshell")
@js.native
class Cloudshell protected ()
  extends typingsJapgolly.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

