package typingsJapgolly.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lib {
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = typingsJapgolly.cryptojs.CryptoJS.lib.IStreamCipher[typingsJapgolly.cryptojs.CryptoJS.lib.IBlockCipherCfg]
  type Cipher = typingsJapgolly.cryptojs.CryptoJS.lib.ICipher[js.Object]
  type CipherHelper = typingsJapgolly.cryptojs.CryptoJS.lib.ICipherHelper[js.Object]
  type Hasher = typingsJapgolly.cryptojs.CryptoJS.lib.IHasher[js.Object]
  type HasherHelper = typingsJapgolly.cryptojs.CryptoJS.lib.IHasherHelper[js.Object]
  type PasswordBasedCipher = typingsJapgolly.cryptojs.CryptoJS.lib.IPasswordBasedCipher[typingsJapgolly.cryptojs.CryptoJS.lib.IPasswordBasedCipherCfg]
  type SerializableCipher = typingsJapgolly.cryptojs.CryptoJS.lib.ISerializableCipher[typingsJapgolly.cryptojs.CryptoJS.lib.ISerializableCipherCfg]
  type SomeArray = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array
  type StreamCipher = typingsJapgolly.cryptojs.CryptoJS.lib.IStreamCipher[js.Object]
}
