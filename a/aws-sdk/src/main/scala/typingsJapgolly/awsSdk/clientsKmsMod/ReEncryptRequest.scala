package typingsJapgolly.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReEncryptRequest extends StObject {
  
  /**
    * Ciphertext of the data to reencrypt.
    */
  var CiphertextBlob: CiphertextType
  
  /**
    * Specifies the encryption algorithm that KMS will use to reecrypt the data after it has decrypted it. The default value, SYMMETRIC_DEFAULT, represents the encryption algorithm used for symmetric encryption KMS keys. This parameter is required only when the destination KMS key is an asymmetric KMS key.
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * Specifies that encryption context to use when the reencrypting the data. A destination encryption context is valid only when the destination KMS key is a symmetric encryption KMS key. The standard ciphertext format for asymmetric KMS keys does not include fields for metadata. An encryption context is a collection of non-secret key-value pairs that represent additional authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended. For more information, see Encryption context in the Key Management Service Developer Guide.
    */
  var DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  
  /**
    * A unique identifier for the KMS key that is used to reencrypt the data. Specify a symmetric encryption KMS key or an asymmetric KMS key with a KeyUsage value of ENCRYPT_DECRYPT. To find the KeyUsage value of a KMS key, use the DescribeKey operation. To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var DestinationKeyId: KeyIdType
  
  /**
    * A list of grant tokens. Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  
  /**
    * Specifies the encryption algorithm that KMS will use to decrypt the ciphertext before it is reencrypted. The default value, SYMMETRIC_DEFAULT, represents the algorithm used for symmetric encryption KMS keys. Specify the same algorithm that was used to encrypt the ciphertext. If you specify a different algorithm, the decrypt attempt fails. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key.
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * Specifies the encryption context to use to decrypt the ciphertext. Enter the same encryption context that was used to encrypt the ciphertext. An encryption context is a collection of non-secret key-value pairs that represent additional authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact case-sensitive match) encryption context to decrypt the data. An encryption context is supported only on operations with symmetric encryption KMS keys. On operations with symmetric encryption KMS keys, an encryption context is optional, but it is strongly recommended. For more information, see Encryption context in the Key Management Service Developer Guide.
    */
  var SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  
  /**
    * Specifies the KMS key that KMS will use to decrypt the ciphertext before it is re-encrypted. Enter a key ID of the KMS key that was used to encrypt the ciphertext. If you identify a different KMS key, the ReEncrypt operation throws an IncorrectKeyException. This parameter is required only when the ciphertext was encrypted under an asymmetric KMS key. If you used a symmetric encryption KMS key, KMS can get the KMS key from metadata that it adds to the symmetric ciphertext blob. However, it is always recommended as a best practice. This practice ensures that you use the KMS key that you intend. To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a KMS key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.undefined
}
object ReEncryptRequest {
  
  inline def apply(CiphertextBlob: CiphertextType, DestinationKeyId: KeyIdType): ReEncryptRequest = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReEncryptRequest]
  }
  
  extension [Self <: ReEncryptRequest](x: Self) {
    
    inline def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "DestinationEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionAlgorithmUndefined: Self = StObject.set(x, "DestinationEncryptionAlgorithm", js.undefined)
    
    inline def setDestinationEncryptionContext(value: EncryptionContextType): Self = StObject.set(x, "DestinationEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionContextUndefined: Self = StObject.set(x, "DestinationEncryptionContext", js.undefined)
    
    inline def setDestinationKeyId(value: KeyIdType): Self = StObject.set(x, "DestinationKeyId", value.asInstanceOf[js.Any])
    
    inline def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "SourceEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionAlgorithmUndefined: Self = StObject.set(x, "SourceEncryptionAlgorithm", js.undefined)
    
    inline def setSourceEncryptionContext(value: EncryptionContextType): Self = StObject.set(x, "SourceEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionContextUndefined: Self = StObject.set(x, "SourceEncryptionContext", js.undefined)
    
    inline def setSourceKeyId(value: KeyIdType): Self = StObject.set(x, "SourceKeyId", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyIdUndefined: Self = StObject.set(x, "SourceKeyId", js.undefined)
  }
}
