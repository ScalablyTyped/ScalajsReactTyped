package typingsJapgolly.googleapis.mod.cloudprofilerV2

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Profiler API
  *
  * Manages continuous profiling information.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprofiler = google.cloudprofiler('v2');
  *
  * @namespace cloudprofiler
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudprofiler
  */
@JSImport("googleapis", "cloudprofiler_v2.Cloudprofiler")
@js.native
class Cloudprofiler protected ()
  extends typingsJapgolly.googleapis.cloudprofilerV2Mod.cloudprofilerV2.Cloudprofiler {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

