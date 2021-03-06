package typingsJapgolly.googleapis.runtimeconfigV1Mod.runtimeconfigV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Runtime Configuration API
  *
  * The Runtime Configurator allows you to dynamically configure and expose
  * variables through Google Cloud Platform. In addition, you can also set
  * Watchers and Waiters that will watch for changes to your data and return
  * based on certain conditions.
  *
  * @example
  * const {google} = require('googleapis');
  * const runtimeconfig = google.runtimeconfig('v1');
  *
  * @namespace runtimeconfig
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Runtimeconfig
  */
@JSImport("googleapis/build/src/apis/runtimeconfig/v1", "runtimeconfig_v1.Runtimeconfig")
@js.native
class Runtimeconfig protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
}

