package typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotScheduleAssociationArgs extends js.Object {
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: Input[String] = js.native
}

object SnapshotScheduleAssociationArgs {
  @scala.inline
  def apply(clusterIdentifier: Input[String], scheduleIdentifier: Input[String]): SnapshotScheduleAssociationArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], scheduleIdentifier = scheduleIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotScheduleAssociationArgs]
  }
}

