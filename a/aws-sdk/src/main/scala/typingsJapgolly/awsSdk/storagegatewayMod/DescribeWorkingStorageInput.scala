package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkingStorageInput extends js.Object {
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DescribeWorkingStorageInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeWorkingStorageInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeWorkingStorageInput]
  }
}

