package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeStepInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeStepInputwaiterWa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: typingsJapgolly.awsSdk.emrMod.ClusterId = js.native
  /**
    * The identifier of the step to describe.
    */
  var StepId: typingsJapgolly.awsSdk.emrMod.StepId = js.native
}

