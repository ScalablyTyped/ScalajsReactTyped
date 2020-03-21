package typingsJapgolly.googleapis.cloudidentityV1Mod.cloudidentityV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Identity API
  *
  * API for provisioning and managing identity resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudidentity = google.cloudidentity('v1');
  *
  * @namespace cloudidentity
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudidentity
  */
@JSImport("googleapis/build/src/apis/cloudidentity/v1", "cloudidentity_v1.Cloudidentity")
@js.native
class Cloudidentity protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var groups: ResourceGroups = js.native
}

