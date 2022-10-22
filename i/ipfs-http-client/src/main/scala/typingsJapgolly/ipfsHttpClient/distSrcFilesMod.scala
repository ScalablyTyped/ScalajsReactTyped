package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.Chmod
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesMod {
  
  @JSImport("ipfs-http-client/dist/src/files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFiles(config: Options): Chmod = ^.asInstanceOf[js.Dynamic].applyDynamic("createFiles")(config.asInstanceOf[js.Any]).asInstanceOf[Chmod]
}
