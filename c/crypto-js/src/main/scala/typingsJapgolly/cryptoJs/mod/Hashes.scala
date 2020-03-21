package typingsJapgolly.cryptoJs.mod

import typingsJapgolly.cryptoJs.AnonAES
import typingsJapgolly.cryptoJs.AnonAnsiX923
import typingsJapgolly.cryptoJs.AnonBase64
import typingsJapgolly.cryptoJs.AnonCBC
import typingsJapgolly.cryptoJs.AnonHex
import typingsJapgolly.cryptoJs.AnonWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hashes extends js.Object {
  var AES: CipherHelper = js.native
  var DES: CipherHelper = js.native
  var EvpKDF: CipherHelper = js.native
  var RC4: CipherHelper = js.native
  var RC4Drop: CipherHelper = js.native
  var Rabbit: CipherHelper = js.native
  var RabbitLegacy: CipherHelper = js.native
  var TripleDES: CipherHelper = js.native
  var algo: AnonAES = js.native
  var enc: AnonBase64 = js.native
  var format: AnonHex = js.native
  var lib: AnonWordArray = js.native
  var mode: AnonCBC = js.native
  var pad: AnonAnsiX923 = js.native
  def HmacMD5(message: String): WordArray = js.native
  def HmacMD5(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacMD5(message: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray): WordArray = js.native
  def HmacMD5(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String): WordArray = js.native
  def HmacRIPEMD160(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String): WordArray = js.native
  def HmacSHA1(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray): WordArray = js.native
  def HmacSHA1(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String): WordArray = js.native
  def HmacSHA224(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray): WordArray = js.native
  def HmacSHA224(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String): WordArray = js.native
  def HmacSHA256(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray): WordArray = js.native
  def HmacSHA256(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String): WordArray = js.native
  def HmacSHA3(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray): WordArray = js.native
  def HmacSHA3(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String): WordArray = js.native
  def HmacSHA384(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray): WordArray = js.native
  def HmacSHA384(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String): WordArray = js.native
  def HmacSHA512(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray): WordArray = js.native
  def HmacSHA512(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, options: js.Any*): WordArray = js.native
  def MD5(message: String): WordArray = js.native
  def MD5(message: String, key: String, options: js.Any*): WordArray = js.native
  def MD5(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def MD5(message: String, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray): WordArray = js.native
  def MD5(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, options: js.Any*): WordArray = js.native
  def PBKDF2(message: String): WordArray = js.native
  def PBKDF2(message: String, key: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def PBKDF2(message: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray): WordArray = js.native
  def PBKDF2(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String): WordArray = js.native
  def RIPEMD160(message: String, key: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray): WordArray = js.native
  def RIPEMD160(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA1(message: String): WordArray = js.native
  def SHA1(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA1(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA1(message: String, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray): WordArray = js.native
  def SHA1(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA224(message: String): WordArray = js.native
  def SHA224(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA224(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA224(message: String, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray): WordArray = js.native
  def SHA224(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA256(message: String): WordArray = js.native
  def SHA256(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA256(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA256(message: String, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray): WordArray = js.native
  def SHA256(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA3(message: String): WordArray = js.native
  def SHA3(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA3(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA3(message: String, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray): WordArray = js.native
  def SHA3(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA384(message: String): WordArray = js.native
  def SHA384(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA384(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA384(message: String, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray): WordArray = js.native
  def SHA384(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, options: js.Any*): WordArray = js.native
  def SHA512(message: String): WordArray = js.native
  def SHA512(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA512(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA512(message: String, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray): WordArray = js.native
  def SHA512(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, options: js.Any*): WordArray = js.native
}

