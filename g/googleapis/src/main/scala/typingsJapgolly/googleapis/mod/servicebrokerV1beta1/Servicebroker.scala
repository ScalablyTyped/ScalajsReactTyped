package typingsJapgolly.googleapis.mod.servicebrokerV1beta1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1beta1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis", "servicebroker_v1beta1.Servicebroker")
@js.native
class Servicebroker protected ()
  extends typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1.Servicebroker {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

