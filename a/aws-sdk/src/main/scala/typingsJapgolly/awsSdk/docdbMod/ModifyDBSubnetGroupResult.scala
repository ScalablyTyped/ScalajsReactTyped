package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.DBSubnetGroup] = js.native
}

object ModifyDBSubnetGroupResult {
  @scala.inline
  def apply(DBSubnetGroup: DBSubnetGroup = null): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
}

