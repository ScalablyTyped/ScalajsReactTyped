package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterCapacityInfo extends js.Object {
  /**
    * The current capacity of the DB cluster.
    */
  var CurrentCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that specifies the capacity that the DB cluster scales to next.
    */
  var PendingCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object DBClusterCapacityInfo {
  @scala.inline
  def apply(
    CurrentCapacity: Int | scala.Double = null,
    DBClusterIdentifier: String = null,
    PendingCapacity: Int | scala.Double = null,
    SecondsBeforeTimeout: Int | scala.Double = null,
    TimeoutAction: String = null
  ): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    if (CurrentCapacity != null) __obj.updateDynamic("CurrentCapacity")(CurrentCapacity.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (PendingCapacity != null) __obj.updateDynamic("PendingCapacity")(PendingCapacity.asInstanceOf[js.Any])
    if (SecondsBeforeTimeout != null) __obj.updateDynamic("SecondsBeforeTimeout")(SecondsBeforeTimeout.asInstanceOf[js.Any])
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
}

