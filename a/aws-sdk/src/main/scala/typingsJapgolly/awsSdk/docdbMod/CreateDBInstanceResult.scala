package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.DBInstance] = js.native
}

object CreateDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): CreateDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBInstanceResult]
  }
}

