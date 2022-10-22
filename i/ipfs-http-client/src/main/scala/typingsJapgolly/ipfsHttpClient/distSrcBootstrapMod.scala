package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.Add
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBootstrapMod {
  
  @JSImport("ipfs-http-client/dist/src/bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBootstrap(config: Options): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("createBootstrap")(config.asInstanceOf[js.Any]).asInstanceOf[Add]
}
