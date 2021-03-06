package typingsJapgolly.googleapis.redisV1beta1Mod.redisV1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Memorystore for Redis API
  *
  * Creates and manages Redis instances on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const redis = google.redis('v1beta1');
  *
  * @namespace redis
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Redis
  */
@JSImport("googleapis/build/src/apis/redis/v1beta1", "redis_v1beta1.Redis")
@js.native
class Redis protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

