package typingsJapgolly.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCryptoKeyEncryptorAesMod {
  
  @JSImport("kdbxweb/dist/types/crypto/key-encryptor-aes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encrypt(credentials: js.typedarray.Uint8Array, key: js.typedarray.ArrayBuffer, rounds: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(credentials.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def encrypt(credentials: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, rounds: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(credentials.asInstanceOf[js.Any], key.asInstanceOf[js.Any], rounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
