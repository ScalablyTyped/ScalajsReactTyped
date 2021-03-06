package typingsJapgolly.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud TPU API
  *
  * TPU API provides customers with access to Google TPU technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const tpu = google.tpu('v1alpha1');
  *
  * @namespace tpu
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Tpu
  */
@JSImport("googleapis/build/src/apis/tpu/v1alpha1", "tpu_v1alpha1.Tpu")
@js.native
class Tpu protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

