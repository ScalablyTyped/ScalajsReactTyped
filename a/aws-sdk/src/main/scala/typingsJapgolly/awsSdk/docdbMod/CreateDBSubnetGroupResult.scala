package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.DBSubnetGroup] = js.native
}

object CreateDBSubnetGroupResult {
  @scala.inline
  def apply(DBSubnetGroup: DBSubnetGroup = null): CreateDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSubnetGroupResult]
  }
}

