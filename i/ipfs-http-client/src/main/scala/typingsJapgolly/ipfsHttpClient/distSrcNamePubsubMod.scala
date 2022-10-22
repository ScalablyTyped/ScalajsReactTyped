package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.Cancel
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamePubsubMod {
  
  @JSImport("ipfs-http-client/dist/src/name/pubsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPubsub(config: Options): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("createPubsub")(config.asInstanceOf[js.Any]).asInstanceOf[Cancel]
}
