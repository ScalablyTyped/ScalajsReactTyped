package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.AesKeyGenParams
import org.scalajs.dom.Algorithm
import org.scalajs.dom.CryptoKeyPair
import org.scalajs.dom.EcKeyGenParams
import org.scalajs.dom.HmacKeyGenParams
import org.scalajs.dom.JsonWebKey
import org.scalajs.dom.KeyFormat
import org.scalajs.dom.KeyUsage
import org.scalajs.dom.Pbkdf2Params
import org.scalajs.dom.RsaHashedKeyGenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "ProviderCrypto")
@js.native
open class ProviderCrypto () extends StObject {
  
  def checkAlgorithmName(algorithm: Algorithm): Unit = js.native
  
  def checkAlgorithmParams(algorithm: Algorithm): Unit = js.native
  
  def checkCryptoKey(key: org.scalajs.dom.CryptoKey): Unit = js.native
  def checkCryptoKey(key: org.scalajs.dom.CryptoKey, keyUsage: KeyUsage): Unit = js.native
  
  def checkDecrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): Unit = js.native
  def checkDecrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkDeriveBits(
    algorithm: Algorithm,
    baseKey: org.scalajs.dom.CryptoKey,
    length: Double,
    options: Unit,
    args: Any*
  ): Unit = js.native
  def checkDeriveBits(
    algorithm: Algorithm,
    baseKey: org.scalajs.dom.CryptoKey,
    length: Double,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkDerivedKeyParams(algorithm: Algorithm): Unit = js.native
  
  def checkDigest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer): Unit = js.native
  
  def checkEncrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): Unit = js.native
  def checkEncrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): Unit = js.native
  
  def checkExportKey(format: KeyFormat, key: org.scalajs.dom.CryptoKey, args: Any*): Unit = js.native
  
  def checkGenerateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): Unit = js.native
  
  def checkGenerateKeyParams(algorithm: Algorithm): Unit = js.native
  
  def checkHashAlgorithm(algorithm: Algorithm, hashAlgorithms: js.Array[String]): Unit = js.native
  
  def checkImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): Unit = js.native
  def checkImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): Unit = js.native
  
  def checkImportParams(algorithm: Algorithm): Unit = js.native
  
  def checkKeyData(format: KeyFormat, keyData: Any): Unit = js.native
  
  def checkKeyFormat(format: Any): Unit = js.native
  
  def checkKeyUsages(usages: KeyUsages, allowed: KeyUsages): Unit = js.native
  
  def checkRequiredProperty(data: js.Object, propName: String): Unit = js.native
  
  def checkSign(algorithm: Algorithm, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): Unit = js.native
  
  def checkVerify(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): Unit = js.native
  
  def decrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveBits(
    algorithm: Algorithm,
    baseKey: org.scalajs.dom.CryptoKey,
    length: Double,
    options: Unit,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(
    algorithm: Algorithm,
    baseKey: org.scalajs.dom.CryptoKey,
    length: Double,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def digest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: Unit,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    options: IProviderCheckOptions,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def exportKey(format: KeyFormat, key: org.scalajs.dom.CryptoKey, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair | org.scalajs.dom.CryptoKey] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  
  def importKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def importKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  /**
    * Name of the algorithm
    */
  val name: String = js.native
  
  def onDecrypt(algorithm: Algorithm, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onDeriveBits(algorithm: Algorithm, baseKey: org.scalajs.dom.CryptoKey, length: Double, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onDigest(algorithm: Algorithm, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: Algorithm, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onExportKey(format: KeyFormat, key: org.scalajs.dom.CryptoKey, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: Algorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair | org.scalajs.dom.CryptoKey] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  def onSign(algorithm: Algorithm, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
  
  /* protected */ def prepareData(data: Any): js.typedarray.ArrayBuffer = js.native
  
  def sign(algorithm: Algorithm, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Key usages for secret key or key pair
    */
  val usages: ProviderKeyUsages = js.native
  
  def verify(
    algorithm: Algorithm,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
