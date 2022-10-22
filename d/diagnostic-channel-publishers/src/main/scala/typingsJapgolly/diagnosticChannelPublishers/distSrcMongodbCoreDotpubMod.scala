package typingsJapgolly.diagnosticChannelPublishers

import typingsJapgolly.diagnosticChannel.distSrcPatchRequireMod.IModulePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMongodbCoreDotpubMod {
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb-core.pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  @JSImport("diagnostic-channel-publishers/dist/src/mongodb-core.pub", "mongoCore")
  @js.native
  val mongoCore: IModulePatcher = js.native
}
