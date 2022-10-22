package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNFSFileShareInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.AuditDestinationARN] = js.undefined
  
  /**
    * Specifies refresh cache information for the file share.
    */
  var CacheAttributes: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * The list of clients that are allowed to access the S3 File Gateway. The list must contain either valid IP addresses or valid CIDR blocks.
    */
  var ClientList: js.UndefOr[FileShareClientList] = js.undefined
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is S3_STANDARD. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the file share to be updated.
    */
  var FileShareARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileShareARN
  
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN, or if an access point or access point alias is used. 
    */
  var FileShareName: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileShareName] = js.undefined
  
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  
  /**
    * The default values for the file share. Optional.
    */
  var NFSFileShareDefaults: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.NFSFileShareDefaults] = js.undefined
  
  /**
    * The notification policy of the file share. SettlingTimeInSeconds controls the number of seconds to wait after the last point in time a client wrote to a file before generating an ObjectUploaded notification. Because clients can make many small writes to files, it's best to set this parameter for as long as possible to avoid generating multiple notifications for the same file in a small time period.   SettlingTimeInSeconds has no effect on the timing of the object uploading to Amazon S3, only the timing of the notification.  The following example sets NotificationPolicy on with SettlingTimeInSeconds set to 60.  {\"Upload\": {\"SettlingTimeInSeconds\": 60}}  The following example sets NotificationPolicy off.  {} 
    */
  var NotificationPolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.NotificationPolicy] = js.undefined
  
  /**
    * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway puts objects into. The default value is private.
    */
  var ObjectACL: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.ObjectACL] = js.undefined
  
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user mapped to anonymous user. Valid values are the following:    RootSquash: Only root is mapped to anonymous user.    NoSquash: No one is mapped to anonymous user.    AllSquash: Everyone is mapped to anonymous user.  
    */
  var Squash: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Squash] = js.undefined
}
object UpdateNFSFileShareInput {
  
  inline def apply(FileShareARN: FileShareARN): UpdateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareInput]
  }
  
  extension [Self <: UpdateNFSFileShareInput](x: Self) {
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setClientList(value: FileShareClientList): Self = StObject.set(x, "ClientList", value.asInstanceOf[js.Any])
    
    inline def setClientListUndefined: Self = StObject.set(x, "ClientList", js.undefined)
    
    inline def setClientListVarargs(value: IPV4AddressCIDR*): Self = StObject.set(x, "ClientList", js.Array(value*))
    
    inline def setDefaultStorageClass(value: StorageClass): Self = StObject.set(x, "DefaultStorageClass", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageClassUndefined: Self = StObject.set(x, "DefaultStorageClass", js.undefined)
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareName(value: FileShareName): Self = StObject.set(x, "FileShareName", value.asInstanceOf[js.Any])
    
    inline def setFileShareNameUndefined: Self = StObject.set(x, "FileShareName", js.undefined)
    
    inline def setGuessMIMETypeEnabled(value: Boolean): Self = StObject.set(x, "GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    inline def setGuessMIMETypeEnabledUndefined: Self = StObject.set(x, "GuessMIMETypeEnabled", js.undefined)
    
    inline def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setNFSFileShareDefaults(value: NFSFileShareDefaults): Self = StObject.set(x, "NFSFileShareDefaults", value.asInstanceOf[js.Any])
    
    inline def setNFSFileShareDefaultsUndefined: Self = StObject.set(x, "NFSFileShareDefaults", js.undefined)
    
    inline def setNotificationPolicy(value: NotificationPolicy): Self = StObject.set(x, "NotificationPolicy", value.asInstanceOf[js.Any])
    
    inline def setNotificationPolicyUndefined: Self = StObject.set(x, "NotificationPolicy", js.undefined)
    
    inline def setObjectACL(value: ObjectACL): Self = StObject.set(x, "ObjectACL", value.asInstanceOf[js.Any])
    
    inline def setObjectACLUndefined: Self = StObject.set(x, "ObjectACL", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    inline def setSquash(value: Squash): Self = StObject.set(x, "Squash", value.asInstanceOf[js.Any])
    
    inline def setSquashUndefined: Self = StObject.set(x, "Squash", js.undefined)
  }
}
