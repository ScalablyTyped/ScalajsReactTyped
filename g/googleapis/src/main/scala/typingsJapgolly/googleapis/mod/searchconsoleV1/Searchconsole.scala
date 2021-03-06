package typingsJapgolly.googleapis.mod.searchconsoleV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Search Console URL Testing Tools API
  *
  * Provides tools for running validation tests against single URLs
  *
  * @example
  * const {google} = require('googleapis');
  * const searchconsole = google.searchconsole('v1');
  *
  * @namespace searchconsole
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Searchconsole
  */
@JSImport("googleapis", "searchconsole_v1.Searchconsole")
@js.native
class Searchconsole protected ()
  extends typingsJapgolly.googleapis.searchconsoleV1Mod.searchconsoleV1.Searchconsole {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

