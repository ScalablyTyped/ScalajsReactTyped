package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.ec2Mod.Boolean
import typingsJapgolly.awsSdk.ec2Mod.FilterList
import typingsJapgolly.awsSdk.ec2Mod.InstanceIdStringList
import typingsJapgolly.awsSdk.ec2Mod.Integer
import typingsJapgolly.awsSdk.ec2Mod.String
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeInstanceStatusRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeInstanceStatusReq extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    availability-zone - The Availability Zone of the instance.    event.code - The code for the scheduled event (instance-reboot | system-reboot | system-maintenance | instance-retirement | instance-stop).    event.description - A description of the event.    event.instance-event-id - The ID of the event whose date and time you are modifying.    event.not-after - The latest end time for the scheduled event (for example, 2014-09-15T17:15:20.000Z).    event.not-before - The earliest start time for the scheduled event (for example, 2014-09-15T17:15:20.000Z).    event.not-before-deadline - The deadline for starting the event (for example, 2014-09-15T17:15:20.000Z).    instance-state-code - The code for the instance state, as a 16-bit unsigned integer. The high byte is used for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).    instance-state-name - The state of the instance (pending | running | shutting-down | terminated | stopping | stopped).    instance-status.reachability - Filters on instance status where the name is reachability (passed | failed | initializing | insufficient-data).    instance-status.status - The status of the instance (ok | impaired | initializing | insufficient-data | not-applicable).    system-status.reachability - Filters on system status where the name is reachability (passed | failed | initializing | insufficient-data).    system-status.status - The system status of the instance (ok | impaired | initializing | insufficient-data | not-applicable).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * When true, includes the health status for all instances. When false, includes the health status for running instances only. Default: false 
    */
  var IncludeAllInstances: js.UndefOr[Boolean] = js.native
  /**
    * The instance IDs. Default: Describes all your instances. Constraints: Maximum 100 explicitly specified instance IDs.
    */
  var InstanceIds: js.UndefOr[InstanceIdStringList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000. You cannot specify this parameter and the instance IDs parameter in the same call.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

