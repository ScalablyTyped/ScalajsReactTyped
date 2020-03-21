package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSecurityGroupMessage extends js.Object {
  /**
    * A list of cache security groups. Each element in the list contains detailed information about one group.
    */
  var CacheSecurityGroups: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.CacheSecurityGroups] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroups: CacheSecurityGroups = null, Marker: String = null): CacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroups != null) __obj.updateDynamic("CacheSecurityGroups")(CacheSecurityGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSecurityGroupMessage]
  }
}

