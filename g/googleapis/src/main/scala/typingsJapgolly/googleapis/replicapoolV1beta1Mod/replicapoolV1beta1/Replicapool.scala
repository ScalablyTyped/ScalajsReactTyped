package typingsJapgolly.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replica Pool API
  *
  * The Replica Pool API allows users to declaratively provision and manage
  * groups of Google Compute Engine instances based on a common template.
  *
  * @example
  * const {google} = require('googleapis');
  * const replicapool = google.replicapool('v1beta1');
  *
  * @namespace replicapool
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Replicapool
  */
@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Replicapool")
@js.native
class Replicapool protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pools: ResourcePools = js.native
  var replicas: ResourceReplicas = js.native
}

