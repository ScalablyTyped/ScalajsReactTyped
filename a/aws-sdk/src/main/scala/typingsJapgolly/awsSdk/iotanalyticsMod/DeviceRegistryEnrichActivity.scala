package typingsJapgolly.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceRegistryEnrichActivity extends js.Object {
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName = js.native
  /**
    * The name of the 'deviceRegistryEnrich' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
  /**
    * The ARN of the role that allows access to the device's registry information.
    */
  var roleArn: RoleArn = js.native
  /**
    * The name of the IoT device whose registry information is added to the message.
    */
  var thingName: AttributeName = js.native
}

object DeviceRegistryEnrichActivity {
  @scala.inline
  def apply(
    attribute: AttributeName,
    name: ActivityName,
    roleArn: RoleArn,
    thingName: AttributeName,
    next: ActivityName = null
  ): DeviceRegistryEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRegistryEnrichActivity]
  }
}

