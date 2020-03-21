package typingsJapgolly.googleapis.mod.kgsearchV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Knowledge Graph Search API
  *
  * Searches the Google Knowledge Graph for entities.
  *
  * @example
  * const {google} = require('googleapis');
  * const kgsearch = google.kgsearch('v1');
  *
  * @namespace kgsearch
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Kgsearch
  */
@JSImport("googleapis", "kgsearch_v1.Kgsearch")
@js.native
class Kgsearch protected ()
  extends typingsJapgolly.googleapis.kgsearchV1Mod.kgsearchV1.Kgsearch {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

