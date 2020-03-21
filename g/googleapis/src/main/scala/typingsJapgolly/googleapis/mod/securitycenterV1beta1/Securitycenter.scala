package typingsJapgolly.googleapis.mod.securitycenterV1beta1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center API
  *
  * Cloud Security Command Center API provides access to temporal views of
  * assets and findings within an organization.
  *
  * @example
  * const {google} = require('googleapis');
  * const securitycenter = google.securitycenter('v1beta1');
  *
  * @namespace securitycenter
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Securitycenter
  */
@JSImport("googleapis", "securitycenter_v1beta1.Securitycenter")
@js.native
class Securitycenter protected ()
  extends typingsJapgolly.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1.Securitycenter {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

