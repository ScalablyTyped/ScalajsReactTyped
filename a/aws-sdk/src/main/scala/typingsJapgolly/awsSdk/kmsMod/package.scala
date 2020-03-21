package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kmsMod {
  type AWSAccountIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_PKCS1_V1_5
    - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type AlgorithmSpec = typingsJapgolly.awsSdk.kmsMod._AlgorithmSpec | java.lang.String
  type AliasList = js.Array[typingsJapgolly.awsSdk.kmsMod.AliasListEntry]
  type AliasNameType = java.lang.String
  type ArnType = java.lang.String
  type BooleanType = scala.Boolean
  type CiphertextType = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kmsMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kmsMod.ClientApiVersions
  type CloudHsmClusterIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_CREDENTIALS
    - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_ERRORS
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_CLOUDHSM_HSMS
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_LOCKED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_LOGGED_IN
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
    - java.lang.String
  */
  type ConnectionErrorCodeType = typingsJapgolly.awsSdk.kmsMod._ConnectionErrorCodeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTING
    - java.lang.String
  */
  type ConnectionStateType = typingsJapgolly.awsSdk.kmsMod._ConnectionStateType | java.lang.String
  type CustomKeyStoreIdType = java.lang.String
  type CustomKeyStoreNameType = java.lang.String
  type CustomKeyStoresList = js.Array[typingsJapgolly.awsSdk.kmsMod.CustomKeyStoresListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_3072
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - java.lang.String
  */
  type CustomerMasterKeySpec = typingsJapgolly.awsSdk.kmsMod._CustomerMasterKeySpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_3072
    - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P256
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P384
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P521
    - typingsJapgolly.awsSdk.awsSdkStrings.ECC_SECG_P256K1
    - java.lang.String
  */
  type DataKeyPairSpec = typingsJapgolly.awsSdk.kmsMod._DataKeyPairSpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES_256
    - typingsJapgolly.awsSdk.awsSdkStrings.AES_128
    - java.lang.String
  */
  type DataKeySpec = typingsJapgolly.awsSdk.kmsMod._DataKeySpec | java.lang.String
  type DateType = js.Date
  type DescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
    - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
    - java.lang.String
  */
  type EncryptionAlgorithmSpec = typingsJapgolly.awsSdk.kmsMod._EncryptionAlgorithmSpec | java.lang.String
  type EncryptionAlgorithmSpecList = js.Array[typingsJapgolly.awsSdk.kmsMod.EncryptionAlgorithmSpec]
  type EncryptionContextKey = java.lang.String
  type EncryptionContextType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kmsMod.EncryptionContextValue]
  type EncryptionContextValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_MATERIAL_EXPIRES
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
    - java.lang.String
  */
  type ExpirationModelType = typingsJapgolly.awsSdk.kmsMod._ExpirationModelType | java.lang.String
  type GrantIdType = java.lang.String
  type GrantList = js.Array[typingsJapgolly.awsSdk.kmsMod.GrantListEntry]
  type GrantNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Decrypt
    - typingsJapgolly.awsSdk.awsSdkStrings.Encrypt
    - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKey
    - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyWithoutPlaintext
    - typingsJapgolly.awsSdk.awsSdkStrings.ReEncryptFrom
    - typingsJapgolly.awsSdk.awsSdkStrings.ReEncryptTo
    - typingsJapgolly.awsSdk.awsSdkStrings.Sign_
    - typingsJapgolly.awsSdk.awsSdkStrings.Verify
    - typingsJapgolly.awsSdk.awsSdkStrings.GetPublicKey
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateGrant
    - typingsJapgolly.awsSdk.awsSdkStrings.RetireGrant
    - typingsJapgolly.awsSdk.awsSdkStrings.DescribeKey
    - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyPair
    - typingsJapgolly.awsSdk.awsSdkStrings.GenerateDataKeyPairWithoutPlaintext
    - java.lang.String
  */
  type GrantOperation = typingsJapgolly.awsSdk.kmsMod._GrantOperation | java.lang.String
  type GrantOperationList = js.Array[typingsJapgolly.awsSdk.kmsMod.GrantOperation]
  type GrantTokenList = js.Array[typingsJapgolly.awsSdk.kmsMod.GrantTokenType]
  type GrantTokenType = java.lang.String
  type KeyIdType = java.lang.String
  type KeyList = js.Array[typingsJapgolly.awsSdk.kmsMod.KeyListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER
    - java.lang.String
  */
  type KeyManagerType = typingsJapgolly.awsSdk.kmsMod._KeyManagerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.PendingDeletion
    - typingsJapgolly.awsSdk.awsSdkStrings.PendingImport
    - typingsJapgolly.awsSdk.awsSdkStrings.Unavailable_
    - java.lang.String
  */
  type KeyState = typingsJapgolly.awsSdk.kmsMod._KeyState | java.lang.String
  type KeyStorePasswordType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_VERIFY
    - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
    - java.lang.String
  */
  type KeyUsageType = typingsJapgolly.awsSdk.kmsMod._KeyUsageType | java.lang.String
  type LimitType = scala.Double
  type MarkerType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RAW
    - typingsJapgolly.awsSdk.awsSdkStrings.DIGEST
    - java.lang.String
  */
  type MessageType = typingsJapgolly.awsSdk.kmsMod._MessageType | java.lang.String
  type NumberOfBytesType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_KMS
    - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CLOUDHSM
    - java.lang.String
  */
  type OriginType = typingsJapgolly.awsSdk.kmsMod._OriginType | java.lang.String
  type PendingWindowInDaysType = scala.Double
  type PlaintextType = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kmsMod.Blob | java.lang.String
  type PolicyNameList = js.Array[typingsJapgolly.awsSdk.kmsMod.PolicyNameType]
  type PolicyNameType = java.lang.String
  type PolicyType = java.lang.String
  type PrincipalIdType = java.lang.String
  type PublicKeyType = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kmsMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_256
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_384
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PSS_SHA_512
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_256
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_384
    - typingsJapgolly.awsSdk.awsSdkStrings.RSASSA_PKCS1_V1_5_SHA_512
    - typingsJapgolly.awsSdk.awsSdkStrings.ECDSA_SHA_256
    - typingsJapgolly.awsSdk.awsSdkStrings.ECDSA_SHA_384
    - typingsJapgolly.awsSdk.awsSdkStrings.ECDSA_SHA_512
    - java.lang.String
  */
  type SigningAlgorithmSpec = typingsJapgolly.awsSdk.kmsMod._SigningAlgorithmSpec | java.lang.String
  type SigningAlgorithmSpecList = js.Array[typingsJapgolly.awsSdk.kmsMod.SigningAlgorithmSpec]
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.kmsMod.TagKeyType]
  type TagKeyType = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.kmsMod.Tag]
  type TagValueType = java.lang.String
  type TrustAnchorCertificateType = java.lang.String
  type WrappingKeySpec = typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kmsMod._apiVersion | java.lang.String
}
