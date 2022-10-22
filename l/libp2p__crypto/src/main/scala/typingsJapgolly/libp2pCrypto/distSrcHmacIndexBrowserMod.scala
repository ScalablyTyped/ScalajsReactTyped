package typingsJapgolly.libp2pCrypto

import typingsJapgolly.libp2pCrypto.anon.Length
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA1
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA256
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHmacIndexBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/hmac/index-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(hashType: SHA1 | SHA256 | SHA512, secret: js.typedarray.Uint8Array): js.Promise[Length] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hashType.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Length]]
}
