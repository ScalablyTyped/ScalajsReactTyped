package typingsJapgolly.googleapis.composerV1beta1Mod.composerV1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Composer API
  *
  * Manages Apache Airflow environments on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const composer = google.composer('v1beta1');
  *
  * @namespace composer
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Composer
  */
@JSImport("googleapis/build/src/apis/composer/v1beta1", "composer_v1beta1.Composer")
@js.native
class Composer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

