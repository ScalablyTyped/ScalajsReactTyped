package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSecurityGroupResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}

object CreateCacheSecurityGroupResult {
  @scala.inline
  def apply(CacheSecurityGroup: CacheSecurityGroup = null): CreateCacheSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroup != null) __obj.updateDynamic("CacheSecurityGroup")(CacheSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSecurityGroupResult]
  }
}

