package typingsJapgolly.awsCryptoIe11Detection

import typingsJapgolly.awsCryptoIe11Detection.buildMsSubtleCryptoMod.Ie11DigestAlgorithm
import typingsJapgolly.awsCryptoIe11Detection.buildMsSubtleCryptoMod.KeyUsage
import typingsJapgolly.awsCryptoIe11Detection.buildMsSubtleCryptoMod._Ie11EncryptionAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsCryptoIe11DetectionStrings {
  
  @js.native
  sealed trait `AES-CBC`
    extends StObject
       with _Ie11EncryptionAlgorithm
  inline def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  
  @js.native
  sealed trait `AES-GCM`
    extends StObject
       with _Ie11EncryptionAlgorithm
  inline def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  
  @js.native
  sealed trait HMAC extends StObject
  inline def HMAC: HMAC = "HMAC".asInstanceOf[HMAC]
  
  @js.native
  sealed trait `RSA-OAEP`
    extends StObject
       with _Ie11EncryptionAlgorithm
  inline def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @js.native
  sealed trait `RSAES-PKCS1-v1_5` extends StObject
  inline def `RSAES-PKCS1-v1_5`: `RSAES-PKCS1-v1_5` = "RSAES-PKCS1-v1_5".asInstanceOf[`RSAES-PKCS1-v1_5`]
  
  @js.native
  sealed trait `SHA-1`
    extends StObject
       with Ie11DigestAlgorithm
  inline def `SHA-1`: `SHA-1` = "SHA-1".asInstanceOf[`SHA-1`]
  
  @js.native
  sealed trait `SHA-256`
    extends StObject
       with Ie11DigestAlgorithm
  inline def `SHA-256`: `SHA-256` = "SHA-256".asInstanceOf[`SHA-256`]
  
  @js.native
  sealed trait `SHA-384`
    extends StObject
       with Ie11DigestAlgorithm
  inline def `SHA-384`: `SHA-384` = "SHA-384".asInstanceOf[`SHA-384`]
  
  @js.native
  sealed trait decrypt
    extends StObject
       with KeyUsage
  inline def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  
  @js.native
  sealed trait derive
    extends StObject
       with KeyUsage
  inline def derive: derive = "derive".asInstanceOf[derive]
  
  @js.native
  sealed trait encrypt
    extends StObject
       with KeyUsage
  inline def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  
  @js.native
  sealed trait importKey
    extends StObject
       with KeyUsage
  inline def importKey: importKey = "importKey".asInstanceOf[importKey]
  
  @js.native
  sealed trait sign
    extends StObject
       with KeyUsage
  inline def sign: sign = "sign".asInstanceOf[sign]
  
  @js.native
  sealed trait unwrapKey
    extends StObject
       with KeyUsage
  inline def unwrapKey: unwrapKey = "unwrapKey".asInstanceOf[unwrapKey]
  
  @js.native
  sealed trait verify
    extends StObject
       with KeyUsage
  inline def verify: verify = "verify".asInstanceOf[verify]
  
  @js.native
  sealed trait wrapKey
    extends StObject
       with KeyUsage
  inline def wrapKey: wrapKey = "wrapKey".asInstanceOf[wrapKey]
}
