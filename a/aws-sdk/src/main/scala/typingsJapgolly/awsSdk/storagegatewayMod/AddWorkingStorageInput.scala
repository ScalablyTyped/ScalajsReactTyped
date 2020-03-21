package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddWorkingStorageInput extends js.Object {
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: typingsJapgolly.awsSdk.storagegatewayMod.DiskIds = js.native
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object AddWorkingStorageInput {
  @scala.inline
  def apply(DiskIds: DiskIds, GatewayARN: GatewayARN): AddWorkingStorageInput = {
    val __obj = js.Dynamic.literal(DiskIds = DiskIds.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddWorkingStorageInput]
  }
}

