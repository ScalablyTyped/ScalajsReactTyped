package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSecurityGroupResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.DBSecurityGroup] = js.native
}

object CreateDBSecurityGroupResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): CreateDBSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSecurityGroupResult]
  }
}

