package typingsJapgolly.googleapis.mod.bloggerV2

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blogger API
  *
  * API for access to the data within Blogger.
  *
  * @example
  * const {google} = require('googleapis');
  * const blogger = google.blogger('v2');
  *
  * @namespace blogger
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Blogger
  */
@JSImport("googleapis", "blogger_v2.Blogger")
@js.native
class Blogger protected ()
  extends typingsJapgolly.googleapis.bloggerV2Mod.bloggerV2.Blogger {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

