package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.DBInstance] = js.native
}

object StopDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): StopDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBInstanceResult]
  }
}

