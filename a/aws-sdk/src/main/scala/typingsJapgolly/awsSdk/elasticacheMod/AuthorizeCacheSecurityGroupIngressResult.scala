package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}

object AuthorizeCacheSecurityGroupIngressResult {
  @scala.inline
  def apply(CacheSecurityGroup: CacheSecurityGroup = null): AuthorizeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroup != null) __obj.updateDynamic("CacheSecurityGroup")(CacheSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
  }
}

