package typingsJapgolly.libp2pCrypto

import typingsJapgolly.libp2pCrypto.distSrcKeysInterfaceMod.ECDHKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysEphemeralKeysMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/ephemeral-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(curve: String): js.Promise[ECDHKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(curve.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ECDHKey]]
}
