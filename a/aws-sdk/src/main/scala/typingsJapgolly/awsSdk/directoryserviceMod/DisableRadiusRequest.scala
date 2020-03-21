package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to disable MFA.
    */
  var DirectoryId: typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DisableRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DisableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableRadiusRequest]
  }
}

