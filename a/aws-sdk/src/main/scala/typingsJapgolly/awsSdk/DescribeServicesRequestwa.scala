package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.ecsMod.ServiceFieldList
import typingsJapgolly.awsSdk.ecsMod.String
import typingsJapgolly.awsSdk.ecsMod.StringList
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecs.DescribeServicesRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeServicesRequestwa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the service or services you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Specifies whether you want to see the resource tags for the service. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[ServiceFieldList] = js.native
  /**
    * A list of services to describe. You may specify up to 10 services to describe in a single operation.
    */
  var services: StringList = js.native
}

