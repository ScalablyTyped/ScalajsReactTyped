package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableAlarmActionsInput extends js.Object {
  /**
    * The names of the alarms.
    */
  var AlarmNames: typingsJapgolly.awsSdk.cloudwatchMod.AlarmNames = js.native
}

object DisableAlarmActionsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): DisableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableAlarmActionsInput]
  }
}

