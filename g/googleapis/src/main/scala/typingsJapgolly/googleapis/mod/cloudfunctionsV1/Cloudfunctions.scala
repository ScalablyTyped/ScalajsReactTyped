package typingsJapgolly.googleapis.mod.cloudfunctionsV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Functions API
  *
  * Manages lightweight user-provided functions executed in response to events.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudfunctions = google.cloudfunctions('v1');
  *
  * @namespace cloudfunctions
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudfunctions
  */
@JSImport("googleapis", "cloudfunctions_v1.Cloudfunctions")
@js.native
class Cloudfunctions protected ()
  extends typingsJapgolly.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.Cloudfunctions {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

