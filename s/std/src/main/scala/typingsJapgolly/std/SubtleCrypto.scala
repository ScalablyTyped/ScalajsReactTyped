package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.jwk
import typingsJapgolly.std.stdStrings.pkcs8
import typingsJapgolly.std.stdStrings.raw
import typingsJapgolly.std.stdStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto). */
@js.native
trait SubtleCrypto extends js.Object {
  def decrypt(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: java.lang.String, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: ConcatParams, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: DhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfCtrParams, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def deriveKey(
    algorithm: java.lang.String | org.scalajs.dom.crypto.EcdhKeyDeriveParams | org.scalajs.dom.crypto.DhKeyDeriveParams | org.scalajs.dom.crypto.ConcatParams | org.scalajs.dom.crypto.HkdfCtrParams | org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String | org.scalajs.dom.crypto.AesDerivedKeyParams | org.scalajs.dom.crypto.HmacImportParams | org.scalajs.dom.crypto.ConcatParams | org.scalajs.dom.crypto.HkdfCtrParams | org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def digest(
    algorithm: java.lang.String,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def digest(
    algorithm: Algorithm,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def exportKey(format: java.lang.String, key: org.scalajs.dom.crypto.CryptoKey): js.Thenable[org.scalajs.dom.crypto.JsonWebKey | scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: org.scalajs.dom.crypto.CryptoKey): js.Thenable[org.scalajs.dom.crypto.JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: org.scalajs.dom.crypto.CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: org.scalajs.dom.crypto.CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: org.scalajs.dom.crypto.CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def generateKey(algorithm: java.lang.String, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKeyPair | org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(algorithm: DhKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(
    algorithm: RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def sign(
    algorithm: java.lang.String,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AesCmacParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: EcdsaParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: RsaPssParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[org.scalajs.dom.crypto.CryptoKey] = js.native
  def verify(
    algorithm: java.lang.String,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: AesCmacParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: EcdsaParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: RsaPssParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: java.lang.String): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: Algorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
}

@JSGlobal("SubtleCrypto")
@js.native
object SubtleCrypto extends Instantiable0[SubtleCrypto]

