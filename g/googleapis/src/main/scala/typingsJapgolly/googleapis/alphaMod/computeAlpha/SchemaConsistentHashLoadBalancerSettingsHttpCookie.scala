package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information about the HTTP Cookie on which the hash function is based
  * for load balancing policies that use a consistent hash.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettingsHttpCookie extends js.Object {
  /**
    * Name of the cookie.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Path to set for the cookie.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Lifetime of the cookie.
    */
  var ttl: js.UndefOr[SchemaDuration] = js.native
}

object SchemaConsistentHashLoadBalancerSettingsHttpCookie {
  @scala.inline
  def apply(name: String = null, path: String = null, ttl: SchemaDuration = null): SchemaConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettingsHttpCookie]
  }
}

