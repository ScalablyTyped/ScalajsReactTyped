package typingsJapgolly.libp2pCrypto

import typingsJapgolly.libp2pCrypto.anon.Digest
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA1
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA256
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHmacMod {
  
  @JSImport("@libp2p/crypto/dist/src/hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(hash: SHA1 | SHA256 | SHA512, secret: js.typedarray.Uint8Array): js.Promise[Digest] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hash.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Digest]]
}
