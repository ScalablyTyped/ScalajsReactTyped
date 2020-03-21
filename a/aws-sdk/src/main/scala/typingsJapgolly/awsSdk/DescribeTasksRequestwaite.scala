package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.ecsMod.String
import typingsJapgolly.awsSdk.ecsMod.StringList
import typingsJapgolly.awsSdk.ecsMod.TaskFieldList
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecs.DescribeTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTasksRequestwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task or tasks to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the task or tasks you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Specifies whether you want to see the resource tags for the task. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskFieldList] = js.native
  /**
    * A list of up to 100 task IDs or full ARN entries.
    */
  var tasks: StringList = js.native
}

