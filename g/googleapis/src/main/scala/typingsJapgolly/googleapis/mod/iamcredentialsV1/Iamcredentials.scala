package typingsJapgolly.googleapis.mod.iamcredentialsV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IAM Service Account Credentials API
  *
  * Creates short-lived, limited-privilege credentials for IAM service
  * accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const iamcredentials = google.iamcredentials('v1');
  *
  * @namespace iamcredentials
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Iamcredentials
  */
@JSImport("googleapis", "iamcredentials_v1.Iamcredentials")
@js.native
class Iamcredentials protected ()
  extends typingsJapgolly.googleapis.iamcredentialsV1Mod.iamcredentialsV1.Iamcredentials {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

