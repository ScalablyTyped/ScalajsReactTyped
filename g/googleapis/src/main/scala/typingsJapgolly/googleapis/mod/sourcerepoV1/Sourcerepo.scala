package typingsJapgolly.googleapis.mod.sourcerepoV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Source Repositories API
  *
  * Accesses source code repositories hosted by Google.
  *
  * @example
  * const {google} = require('googleapis');
  * const sourcerepo = google.sourcerepo('v1');
  *
  * @namespace sourcerepo
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Sourcerepo
  */
@JSImport("googleapis", "sourcerepo_v1.Sourcerepo")
@js.native
class Sourcerepo protected ()
  extends typingsJapgolly.googleapis.sourcerepoV1Mod.sourcerepoV1.Sourcerepo {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

