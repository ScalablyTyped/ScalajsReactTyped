package typingsJapgolly.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algo {
  type AES = typingsJapgolly.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type DES = typingsJapgolly.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type MD5 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type PBKDF2 = typingsJapgolly.cryptojs.CryptoJS.algo.EvpKDF
  type RC4 = typingsJapgolly.cryptojs.CryptoJS.lib.StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = typingsJapgolly.cryptojs.CryptoJS.algo.RC4
  type RIPEMD160 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type Rabbit = typingsJapgolly.cryptojs.CryptoJS.lib.StreamCipher
  type RabbitLegacy = typingsJapgolly.cryptojs.CryptoJS.lib.StreamCipher
  type SHA1 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type SHA224 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type SHA256 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type SHA3 = typingsJapgolly.cryptojs.CryptoJS.lib.IHasher[typingsJapgolly.cryptojs.CryptoJS.algo.ISHA3Cfg]
  type SHA384 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type SHA512 = typingsJapgolly.cryptojs.CryptoJS.lib.Hasher
  type TripleDES = typingsJapgolly.cryptojs.CryptoJS.algo.IBlockCipherImpl
}
