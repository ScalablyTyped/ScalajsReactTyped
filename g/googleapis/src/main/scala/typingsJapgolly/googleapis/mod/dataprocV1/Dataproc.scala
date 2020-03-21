package typingsJapgolly.googleapis.mod.dataprocV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Dataproc API
  *
  * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataproc = google.dataproc('v1');
  *
  * @namespace dataproc
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Dataproc
  */
@JSImport("googleapis", "dataproc_v1.Dataproc")
@js.native
class Dataproc protected ()
  extends typingsJapgolly.googleapis.dataprocV1Mod.dataprocV1.Dataproc {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

