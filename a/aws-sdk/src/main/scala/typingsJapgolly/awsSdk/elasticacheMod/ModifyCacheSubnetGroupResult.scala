package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCacheSubnetGroupResult extends js.Object {
  var CacheSubnetGroup: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}

object ModifyCacheSubnetGroupResult {
  @scala.inline
  def apply(CacheSubnetGroup: CacheSubnetGroup = null): ModifyCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroup != null) __obj.updateDynamic("CacheSubnetGroup")(CacheSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
  }
}

