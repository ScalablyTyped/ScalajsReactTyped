package typingsJapgolly.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date and time when a secret was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the RecoveryWindowInDays parameter of the  DeleteSecret  operation.
    */
  var DeletedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * The ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is encrypted with the Amazon Web Services managed key aws/secretsmanager, this field is omitted.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been retrieved in the Region.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret hasn't ever rotated.
    */
  var LastRotatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, /prod/databases/dbserver1 could represent the secret for a server named dbserver1 in the folder databases in the folder prod. 
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * Returns the name of the service that created the secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.undefined
  
  /**
    * The Region where Secrets Manager originated the secret.
    */
  var PrimaryRegion: js.UndefOr[RegionType] = js.undefined
  
  /**
    * Indicates whether automatic, scheduled rotation is enabled for this secret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined
  
  /**
    * The ARN of an Amazon Web Services Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to  RotateSecret .
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined
  
  /**
    * A structure that defines the rotation configuration for the secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.undefined
  
  /**
    * A list of all of the currently assigned SecretVersionStage staging labels and the SecretVersionId attached to each one. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any SecretVersionStage is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined
  
  /**
    * The list of user-defined tags associated with the secret. To add tags to a secret, use  TagResource . To remove tags, use  UntagResource .
    */
  var Tags: js.UndefOr[TagListType] = js.undefined
}
object SecretListEntry {
  
  inline def apply(): SecretListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretListEntry]
  }
  
  extension [Self <: SecretListEntry](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDeletedDate(value: js.Date): Self = StObject.set(x, "DeletedDate", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateUndefined: Self = StObject.set(x, "DeletedDate", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastAccessedDate(value: js.Date): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
    inline def setLastChangedDate(value: js.Date): Self = StObject.set(x, "LastChangedDate", value.asInstanceOf[js.Any])
    
    inline def setLastChangedDateUndefined: Self = StObject.set(x, "LastChangedDate", js.undefined)
    
    inline def setLastRotatedDate(value: js.Date): Self = StObject.set(x, "LastRotatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastRotatedDateUndefined: Self = StObject.set(x, "LastRotatedDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwningService(value: OwningServiceType): Self = StObject.set(x, "OwningService", value.asInstanceOf[js.Any])
    
    inline def setOwningServiceUndefined: Self = StObject.set(x, "OwningService", js.undefined)
    
    inline def setPrimaryRegion(value: RegionType): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegionUndefined: Self = StObject.set(x, "PrimaryRegion", js.undefined)
    
    inline def setRotationEnabled(value: RotationEnabledType): Self = StObject.set(x, "RotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "RotationEnabled", js.undefined)
    
    inline def setRotationLambdaARN(value: RotationLambdaARNType): Self = StObject.set(x, "RotationLambdaARN", value.asInstanceOf[js.Any])
    
    inline def setRotationLambdaARNUndefined: Self = StObject.set(x, "RotationLambdaARN", js.undefined)
    
    inline def setRotationRules(value: RotationRulesType): Self = StObject.set(x, "RotationRules", value.asInstanceOf[js.Any])
    
    inline def setRotationRulesUndefined: Self = StObject.set(x, "RotationRules", js.undefined)
    
    inline def setSecretVersionsToStages(value: SecretVersionsToStagesMapType): Self = StObject.set(x, "SecretVersionsToStages", value.asInstanceOf[js.Any])
    
    inline def setSecretVersionsToStagesUndefined: Self = StObject.set(x, "SecretVersionsToStages", js.undefined)
    
    inline def setTags(value: TagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
