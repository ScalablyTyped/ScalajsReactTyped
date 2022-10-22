package typingsJapgolly.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_PKCS1_V1_5
  - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
  - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
  - java.lang.String
*/
type AlgorithmSpec = _AlgorithmSpec | String

type AliasList = js.Array[AliasListEntry]

type AliasNameType = String

type ArnType = String

type BooleanType = Boolean

type CiphertextType = Buffer | js.typedarray.Uint8Array | Blob | String

type CloudHsmClusterIdType = String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET
  - java.lang.String
*/
type ConnectionErrorCodeType = _ConnectionErrorCodeType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONNECTING
  - java.lang.String
*/
type ConnectionStateType = _ConnectionStateType | String

type CustomKeyStoreIdType = String

type CustomKeyStoreNameType = String

type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_3072
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_224
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_256
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_384
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_512
  - typingsJapgolly.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type CustomerMasterKeySpec = _CustomerMasterKeySpec | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_3072
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typingsJapgolly.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type DataKeyPairSpec = _DataKeyPairSpec | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AES_256
  - typingsJapgolly.awsSdk.awsSdkStrings.AES_128
  - java.lang.String
*/
type DataKeySpec = _DataKeySpec | String

type DateType = js.Date

type DescriptionType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
  - typingsJapgolly.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
  - typingsJapgolly.awsSdk.awsSdkStrings.SM2PKE
  - java.lang.String
*/
type EncryptionAlgorithmSpec = _EncryptionAlgorithmSpec | String

type EncryptionAlgorithmSpecList = js.Array[EncryptionAlgorithmSpec]

type EncryptionContextKey = String

type EncryptionContextType = StringDictionary[EncryptionContextValue]

type EncryptionContextValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_MATERIAL_EXPIRES
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
  - java.lang.String
*/
type ExpirationModelType = _ExpirationModelType | String

type GrantIdType = String

type GrantList = js.Array[GrantListEntry]

type GrantNameType = String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.GenerateMac
  - typingsJapgolly.awsSdk.awsSdkStrings.VerifyMac
  - java.lang.String
*/
type GrantOperation = _GrantOperation | String

type GrantOperationList = js.Array[GrantOperation]

type GrantTokenList = js.Array[GrantTokenType]

type GrantTokenType = String

type KeyIdType = String

type KeyList = js.Array[KeyListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER
  - java.lang.String
*/
type KeyManagerType = _KeyManagerType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_2048
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_3072
  - typingsJapgolly.awsSdk.awsSdkStrings.RSA_4096
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P256
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P384
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_NIST_P521
  - typingsJapgolly.awsSdk.awsSdkStrings.ECC_SECG_P256K1
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_224
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_256
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_384
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_512
  - typingsJapgolly.awsSdk.awsSdkStrings.SM2
  - java.lang.String
*/
type KeySpec = _KeySpec | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingDeletion
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingImport
  - typingsJapgolly.awsSdk.awsSdkStrings.PendingReplicaDeletion
  - typingsJapgolly.awsSdk.awsSdkStrings.Unavailable_
  - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
  - java.lang.String
*/
type KeyState = _KeyState | String

type KeyStorePasswordType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_VERIFY
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPT_DECRYPT
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERATE_VERIFY_MAC
  - java.lang.String
*/
type KeyUsageType = _KeyUsageType | String

type LimitType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_SHA_224
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_SHA_256
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_SHA_384
  - typingsJapgolly.awsSdk.awsSdkStrings.HMAC_SHA_512
  - java.lang.String
*/
type MacAlgorithmSpec = _MacAlgorithmSpec | String

type MacAlgorithmSpecList = js.Array[MacAlgorithmSpec]

type MarkerType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RAW
  - typingsJapgolly.awsSdk.awsSdkStrings.DIGEST
  - java.lang.String
*/
type MessageType = _MessageType | String

type MultiRegionKeyList = js.Array[MultiRegionKey]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIMARY
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
type MultiRegionKeyType = _MultiRegionKeyType | String

type NullableBooleanType = Boolean

type NumberOfBytesType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_KMS
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CLOUDHSM
  - java.lang.String
*/
type OriginType = _OriginType | String

type PendingWindowInDaysType = Double

type PlaintextType = Buffer | js.typedarray.Uint8Array | Blob | String

type PolicyNameList = js.Array[PolicyNameType]

type PolicyNameType = String

type PolicyType = String

type PrincipalIdType = String

type PublicKeyType = Buffer | js.typedarray.Uint8Array | Blob | String

type RegionType = String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.SM2DSA
  - java.lang.String
*/
type SigningAlgorithmSpec = _SigningAlgorithmSpec | String

type SigningAlgorithmSpecList = js.Array[SigningAlgorithmSpec]

type TagKeyList = js.Array[TagKeyType]

type TagKeyType = String

type TagList = js.Array[Tag]

type TagValueType = String

type TrustAnchorCertificateType = String

type WrappingKeySpec = RSA_2048 | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
