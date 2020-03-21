package typingsJapgolly.googleapis.mod.indexingV3

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indexing API
  *
  * Notifies Google when your web pages change.
  *
  * @example
  * const {google} = require('googleapis');
  * const indexing = google.indexing('v3');
  *
  * @namespace indexing
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Indexing
  */
@JSImport("googleapis", "indexing_v3.Indexing")
@js.native
class Indexing protected ()
  extends typingsJapgolly.googleapis.indexingV3Mod.indexingV3.Indexing {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

