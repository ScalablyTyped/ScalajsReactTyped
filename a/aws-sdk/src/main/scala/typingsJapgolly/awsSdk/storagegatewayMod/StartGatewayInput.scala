package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartGatewayInput extends js.Object {
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object StartGatewayInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): StartGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartGatewayInput]
  }
}

