package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to enable MFA.
    */
  var DirectoryId: typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typingsJapgolly.awsSdk.directoryserviceMod.RadiusSettings = js.native
}

object EnableRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): EnableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RadiusSettings = RadiusSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableRadiusRequest]
  }
}

