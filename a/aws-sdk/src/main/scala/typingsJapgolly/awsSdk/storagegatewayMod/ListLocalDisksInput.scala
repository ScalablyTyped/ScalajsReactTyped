package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLocalDisksInput extends js.Object {
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object ListLocalDisksInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): ListLocalDisksInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListLocalDisksInput]
  }
}

