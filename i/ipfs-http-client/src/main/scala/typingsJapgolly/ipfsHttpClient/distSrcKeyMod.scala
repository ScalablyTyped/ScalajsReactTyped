package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.Gen
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyMod {
  
  @JSImport("ipfs-http-client/dist/src/key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createKey(config: Options): Gen = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(config.asInstanceOf[js.Any]).asInstanceOf[Gen]
}
