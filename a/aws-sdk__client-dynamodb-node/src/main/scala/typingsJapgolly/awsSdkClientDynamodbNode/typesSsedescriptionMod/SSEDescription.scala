package typingsJapgolly.awsSdkClientDynamodbNode.typesSsedescriptionMod

import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AES256
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLING
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLING
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KMS
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEDescription extends js.Object {
  /**
    * <p>The KMS master key ARN used for the KMS encryption.</p>
    */
  var KMSMasterKeyArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service.</p> </li> </ul>
    */
  var SSEType: js.UndefOr[AES256 | KMS | String] = js.undefined
  /**
    * <p>The current state of server-side encryption:</p> <ul> <li> <p> <code>ENABLING</code> - Server-side encryption is being enabled.</p> </li> <li> <p> <code>ENABLED</code> - Server-side encryption is enabled.</p> </li> <li> <p> <code>DISABLING</code> - Server-side encryption is being disabled.</p> </li> <li> <p> <code>DISABLED</code> - Server-side encryption is disabled.</p> </li> <li> <p> <code>UPDATING</code> - Server-side encryption is being updated.</p> </li> </ul>
    */
  var Status: js.UndefOr[ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String] = js.undefined
}

object SSEDescription {
  @scala.inline
  def apply(
    KMSMasterKeyArn: String = null,
    SSEType: AES256 | KMS | String = null,
    Status: ENABLING | ENABLED | DISABLING | DISABLED | UPDATING | String = null
  ): SSEDescription = {
    val __obj = js.Dynamic.literal()
    if (KMSMasterKeyArn != null) __obj.updateDynamic("KMSMasterKeyArn")(KMSMasterKeyArn.asInstanceOf[js.Any])
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEDescription]
  }
}

