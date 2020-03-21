package typingsJapgolly.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeFromDatasetRequest extends js.Object {
  /**
    * The name of the dataset from which to unsubcribe.
    */
  var DatasetName: typingsJapgolly.awsSdk.cognitosyncMod.DatasetName = js.native
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: typingsJapgolly.awsSdk.cognitosyncMod.DeviceId = js.native
  /**
    * Unique ID for this identity.
    */
  var IdentityId: typingsJapgolly.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which this identity belongs.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object UnsubscribeFromDatasetRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnsubscribeFromDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeFromDatasetRequest]
  }
}

