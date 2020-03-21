package typingsJapgolly.googleapis.iamV1Mod.iamV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity and Access Management (IAM) API
  *
  * Manages identity and access control for Google Cloud Platform resources,
  * including the creation of service accounts, which you can use to
  * authenticate to Google and make API calls.
  *
  * @example
  * const {google} = require('googleapis');
  * const iam = google.iam('v1');
  *
  * @namespace iam
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Iam
  */
@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Iam")
@js.native
class Iam protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var iamPolicies: ResourceIampolicies = js.native
  var organizations: ResourceOrganizations = js.native
  var permissions: ResourcePermissions = js.native
  var projects: ResourceProjects = js.native
  var roles: ResourceRoles = js.native
}

