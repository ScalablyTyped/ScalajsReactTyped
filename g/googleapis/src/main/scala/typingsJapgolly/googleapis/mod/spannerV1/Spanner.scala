package typingsJapgolly.googleapis.mod.spannerV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Spanner API
  *
  * Cloud Spanner is a managed, mission-critical, globally consistent and
  * scalable relational database service.
  *
  * @example
  * const {google} = require('googleapis');
  * const spanner = google.spanner('v1');
  *
  * @namespace spanner
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Spanner
  */
@JSImport("googleapis", "spanner_v1.Spanner")
@js.native
class Spanner protected ()
  extends typingsJapgolly.googleapis.spannerV1Mod.spannerV1.Spanner {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

