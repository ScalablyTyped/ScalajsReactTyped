package typingsJapgolly.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessInput extends js.Object {
  /**
    * A unique identifier for a fleet that contains the instance you want access to. You can use either the fleet ID or ARN value. The fleet can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status may be accessible for a short time before they are deleted.
    */
  var FleetId: typingsJapgolly.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A unique identifier for an instance you want to get access to. You can access an instance in any status.
    */
  var InstanceId: typingsJapgolly.awsSdk.gameliftMod.InstanceId = js.native
}

object GetInstanceAccessInput {
  @scala.inline
  def apply(FleetId: FleetId, InstanceId: InstanceId): GetInstanceAccessInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceAccessInput]
  }
}

