package typingsJapgolly.googleapis.mod.firebaserulesV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Firebase Rules API
  *
  * Creates and manages rules that determine when a Firebase Rules-enabled
  * service should permit a request.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebaserules = google.firebaserules('v1');
  *
  * @namespace firebaserules
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebaserules
  */
@JSImport("googleapis", "firebaserules_v1.Firebaserules")
@js.native
class Firebaserules protected ()
  extends typingsJapgolly.googleapis.firebaserulesV1Mod.firebaserulesV1.Firebaserules {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

