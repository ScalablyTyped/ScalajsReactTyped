package typingsJapgolly.libp2pCrypto

import typingsJapgolly.libp2pCrypto.anon.K1
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.Blowfish
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA1
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA256
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA512
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.`AES-128`
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.`AES-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysKeyStretcherMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/key-stretcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyStretcher(
    cipherType: `AES-128` | `AES-256` | Blowfish,
    hash: SHA1 | SHA256 | SHA512,
    secret: js.typedarray.Uint8Array
  ): js.Promise[K1] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyStretcher")(cipherType.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[K1]]
}
