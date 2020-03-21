package typingsJapgolly.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replica extends js.Object {
  /**
    * The Region where the replica needs to be created.
    */
  var RegionName: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.RegionName] = js.native
}

object Replica {
  @scala.inline
  def apply(RegionName: RegionName = null): Replica = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replica]
  }
}

