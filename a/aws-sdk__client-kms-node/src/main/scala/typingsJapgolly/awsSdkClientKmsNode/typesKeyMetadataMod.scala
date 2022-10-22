package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS_KMS
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CUSTOMER
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Disabled
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ENCRYPT_DECRYPT
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.EXTERNAL
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Enabled
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_EXPIRES
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingDeletion
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingImport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyMetadataMod {
  
  trait KeyMetadata extends StObject {
    
    /**
      * <p>The twelve-digit account ID of the AWS account that owns the CMK.</p>
      */
    var AWSAccountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the CMK. For examples, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.</p>
      */
    var Arn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time when the CMK was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
      */
    var DeletionDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The description of the CMK.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true, otherwise it is false.</p>
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise this value is omitted.</p>
      */
    var ExpirationModel: js.UndefOr[KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String] = js.undefined
    
    /**
      * <p>The globally unique identifier for the CMK.</p>
      */
    var KeyId: String
    
    /**
      * <p>The CMK's manager. CMKs are either customer managed or AWS managed. For more information about the difference, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var KeyManager: js.UndefOr[AWS | CUSTOMER | String] = js.undefined
    
    /**
      * <p>The state of the CMK.</p> <p>For more information about how key state affects the use of a CMK, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
      */
    var KeyState: js.UndefOr[Enabled | Disabled | PendingDeletion | PendingImport | String] = js.undefined
    
    /**
      * <p>The cryptographic operations for which you can use the CMK. Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a> operations.</p>
      */
    var KeyUsage: js.UndefOr[ENCRYPT_DECRYPT | String] = js.undefined
    
    /**
      * <p>The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management infrastructure or the CMK lacks key material.</p>
      */
    var Origin: js.UndefOr[AWS_KMS | EXTERNAL | String] = js.undefined
    
    /**
      * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
      */
    var ValidTo: js.UndefOr[js.Date | String | Double] = js.undefined
  }
  object KeyMetadata {
    
    inline def apply(KeyId: String): KeyMetadata = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyMetadata]
    }
    
    extension [Self <: KeyMetadata](x: Self) {
      
      inline def setAWSAccountId(value: String): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
      
      inline def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
      
      inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
      
      inline def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setDeletionDate(value: js.Date | String | Double): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
      
      inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setExpirationModel(value: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
      
      inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyManager(value: AWS | CUSTOMER | String): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
      
      inline def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
      
      inline def setKeyState(value: Enabled | Disabled | PendingDeletion | PendingImport | String): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
      
      inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
      
      inline def setKeyUsage(value: ENCRYPT_DECRYPT | String): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
      
      inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
      
      inline def setOrigin(value: AWS_KMS | EXTERNAL | String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
      
      inline def setValidTo(value: js.Date | String | Double): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
      
      inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
    }
  }
  
  trait UnmarshalledKeyMetadata
    extends StObject
       with KeyMetadata {
    
    /**
      * <p>The date and time when the CMK was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
      */
    @JSName("DeletionDate")
    var DeletionDate_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
      */
    @JSName("ValidTo")
    var ValidTo_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledKeyMetadata {
    
    inline def apply(KeyId: String): UnmarshalledKeyMetadata = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledKeyMetadata]
    }
    
    extension [Self <: UnmarshalledKeyMetadata](x: Self) {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
      
      inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
      
      inline def setValidTo(value: js.Date): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
      
      inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
    }
  }
}
