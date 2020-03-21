package typingsJapgolly.googleapis.tagmanagerV1Mod.tagmanagerV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tag Manager API
  *
  * Accesses Tag Manager accounts and containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const tagmanager = google.tagmanager('v1');
  *
  * @namespace tagmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tagmanager
  */
@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Tagmanager")
@js.native
class Tagmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: ResourceAccounts = js.native
  var context: APIRequestContext = js.native
}

