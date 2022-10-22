package typingsJapgolly.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeToDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to subcribe to.
    */
  var DatasetName: typingsJapgolly.awsSdk.clientsCognitosyncMod.DatasetName
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: typingsJapgolly.awsSdk.clientsCognitosyncMod.DeviceId
  
  /**
    * Unique ID for this identity.
    */
  var IdentityId: typingsJapgolly.awsSdk.clientsCognitosyncMod.IdentityId
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which the identity belongs.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.clientsCognitosyncMod.IdentityPoolId
}
object SubscribeToDatasetRequest {
  
  inline def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): SubscribeToDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToDatasetRequest]
  }
  
  extension [Self <: SubscribeToDatasetRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
