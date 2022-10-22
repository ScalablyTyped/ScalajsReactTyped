package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.Apply
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigProfilesMod {
  
  @JSImport("ipfs-http-client/dist/src/config/profiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProfiles(config: Options): Apply = ^.asInstanceOf[js.Dynamic].applyDynamic("createProfiles")(config.asInstanceOf[js.Any]).asInstanceOf[Apply]
}
