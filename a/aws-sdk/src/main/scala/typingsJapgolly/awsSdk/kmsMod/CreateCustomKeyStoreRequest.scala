package typingsJapgolly.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomKeyStoreRequest extends js.Object {
  /**
    * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: CloudHsmClusterIdType = js.native
  /**
    * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
    */
  var CustomKeyStoreName: CustomKeyStoreNameType = js.native
  /**
    * Enter the password of the  kmsuser crypto user (CU) account in the specified AWS CloudHSM cluster. AWS KMS logs into the cluster as this user to manage key material on your behalf. The password must be a string of 7 to 32 characters. Its value is case sensitive. This parameter tells AWS KMS the kmsuser account password; it does not change the password in the AWS CloudHSM cluster.
    */
  var KeyStorePassword: KeyStorePasswordType = js.native
  /**
    * Enter the content of the trust anchor certificate for the cluster. This is the content of the customerCA.crt file that you created when you initialized the cluster.
    */
  var TrustAnchorCertificate: TrustAnchorCertificateType = js.native
}

object CreateCustomKeyStoreRequest {
  @scala.inline
  def apply(
    CloudHsmClusterId: CloudHsmClusterIdType,
    CustomKeyStoreName: CustomKeyStoreNameType,
    KeyStorePassword: KeyStorePasswordType,
    TrustAnchorCertificate: TrustAnchorCertificateType
  ): CreateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CloudHsmClusterId = CloudHsmClusterId.asInstanceOf[js.Any], CustomKeyStoreName = CustomKeyStoreName.asInstanceOf[js.Any], KeyStorePassword = KeyStorePassword.asInstanceOf[js.Any], TrustAnchorCertificate = TrustAnchorCertificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCustomKeyStoreRequest]
  }
}

