package typingsJapgolly.googleapis.libraryagentV1Mod.libraryagentV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Library Agent API
  *
  * A simple Google Example Library API.
  *
  * @example
  * const {google} = require('googleapis');
  * const libraryagent = google.libraryagent('v1');
  *
  * @namespace libraryagent
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Libraryagent
  */
@JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Libraryagent")
@js.native
class Libraryagent protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var shelves: ResourceShelves = js.native
}

