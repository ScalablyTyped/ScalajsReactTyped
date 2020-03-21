package typingsJapgolly.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServerRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typingsJapgolly.awsSdk.transferMod.ServerId = js.native
}

object DescribeServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): DescribeServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeServerRequest]
  }
}

