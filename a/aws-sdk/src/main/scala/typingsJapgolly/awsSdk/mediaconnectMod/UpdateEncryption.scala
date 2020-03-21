package typingsJapgolly.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEncryption extends js.Object {
  /**
    * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
    */
  var Algorithm: js.UndefOr[typingsJapgolly.awsSdk.mediaconnectMod.Algorithm] = js.native
  /**
    * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.native
  /**
    * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var DeviceId: js.UndefOr[string] = js.native
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[typingsJapgolly.awsSdk.mediaconnectMod.KeyType] = js.native
  /**
    * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Region: js.UndefOr[string] = js.native
  /**
    * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
    */
  var SecretArn: js.UndefOr[string] = js.native
  /**
    * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Url: js.UndefOr[string] = js.native
}

object UpdateEncryption {
  @scala.inline
  def apply(
    Algorithm: Algorithm = null,
    ConstantInitializationVector: string = null,
    DeviceId: string = null,
    KeyType: KeyType = null,
    Region: string = null,
    ResourceId: string = null,
    RoleArn: string = null,
    SecretArn: string = null,
    Url: string = null
  ): UpdateEncryption = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId.asInstanceOf[js.Any])
    if (KeyType != null) __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEncryption]
  }
}

