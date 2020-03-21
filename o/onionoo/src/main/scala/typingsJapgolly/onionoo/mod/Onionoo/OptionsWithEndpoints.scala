package typingsJapgolly.onionoo.mod.Onionoo

import typingsJapgolly.got.mod.Cache
import typingsJapgolly.onionoo.onionooBooleans.`false`
import typingsJapgolly.onionoo.onionooStrings.bandwidth
import typingsJapgolly.onionoo.onionooStrings.clients
import typingsJapgolly.onionoo.onionooStrings.details
import typingsJapgolly.onionoo.onionooStrings.summary
import typingsJapgolly.onionoo.onionooStrings.uptime
import typingsJapgolly.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithEndpoints extends Options {
  /**
    * Array of endpoints to be returned as methods on the `Onionoo` instance.
    * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
    */
  var endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime]
}

object OptionsWithEndpoints {
  @scala.inline
  def apply(
    endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime],
    baseUrl: String = null,
    cache: Cache | `false` = null
  ): OptionsWithEndpoints = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEndpoints]
  }
}

