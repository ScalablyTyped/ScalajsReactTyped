package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSMBFileShareInput extends js.Object {
  /**
    * A list of users in the Active Directory that will be granted administrator privileges on the file share. These users can do all file operations as the super-user.   Use this option very carefully, because any user in this list can do anything they like on the file share, regardless of file permissions. 
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.native
  /**
    * The authentication method that users use to access the file share. Valid values are ActiveDirectory or GuestAccess. The default is ActiveDirectory.
    */
  var Authentication: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Authentication] = js.native
  /**
    * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
    */
  var ClientToken: typingsJapgolly.awsSdk.storagegatewayMod.ClientToken = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Possible values are S3_STANDARD, S3_STANDARD_IA, or S3_ONEZONE_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  /**
    * The Amazon Resource Name (ARN) of the file gateway on which you want to create a file share.
    */
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, and otherwise to false. The default value is true.
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[FileShareUserList] = js.native
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ARN of the backed storage used for storing file data. 
    */
  var LocationARN: typingsJapgolly.awsSdk.storagegatewayMod.LocationARN = js.native
  /**
    * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
    */
  var ObjectACL: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.ObjectACL] = js.native
  /**
    * A value that sets the write status of a file share. This value is true if the write status is read-only, and otherwise false.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs. Otherwise the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration. 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage. 
    */
  var Role: typingsJapgolly.awsSdk.storagegatewayMod.Role = js.native
  /**
    * Set this value to "true to enable ACL (access control list) on the SMB file share. Set it to "false" to map file and directory permissions to the POSIX permissions. For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html in the Storage Gateway User Guide.
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of up to 50 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. For example @group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.native
}

object CreateSMBFileShareInput {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    LocationARN: LocationARN,
    Role: Role,
    AdminUserList: FileShareUserList = null,
    Authentication: Authentication = null,
    DefaultStorageClass: StorageClass = null,
    GuessMIMETypeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    InvalidUserList: FileShareUserList = null,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    ObjectACL: ObjectACL = null,
    ReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    RequesterPays: js.UndefOr[scala.Boolean] = js.undefined,
    SMBACLEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: Tags = null,
    ValidUserList: FileShareUserList = null
  ): CreateSMBFileShareInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], LocationARN = LocationARN.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    if (AdminUserList != null) __obj.updateDynamic("AdminUserList")(AdminUserList.asInstanceOf[js.Any])
    if (Authentication != null) __obj.updateDynamic("Authentication")(Authentication.asInstanceOf[js.Any])
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled.asInstanceOf[js.Any])
    if (InvalidUserList != null) __obj.updateDynamic("InvalidUserList")(InvalidUserList.asInstanceOf[js.Any])
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted.asInstanceOf[js.Any])
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey.asInstanceOf[js.Any])
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays.asInstanceOf[js.Any])
    if (!js.isUndefined(SMBACLEnabled)) __obj.updateDynamic("SMBACLEnabled")(SMBACLEnabled.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (ValidUserList != null) __obj.updateDynamic("ValidUserList")(ValidUserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSMBFileShareInput]
  }
}

