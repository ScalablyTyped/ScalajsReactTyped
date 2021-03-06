package typingsJapgolly.googleapis.plusV1Mod.plusV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google+ API
  *
  * Builds on top of the Google+ platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const plus = google.plus('v1');
  *
  * @namespace plus
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Plus
  */
@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Plus")
@js.native
class Plus protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: ResourceActivities = js.native
  var comments: ResourceComments = js.native
  var context: APIRequestContext = js.native
  var people: ResourcePeople = js.native
}

