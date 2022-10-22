package typingsJapgolly.web3ProvidersIpc

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.web3CoreHelpers.mod.IpcProviderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-providers-ipc", "IpcProvider")
  @js.native
  open class IpcProvider protected () extends IpcProviderBase {
    def this(path: String, net: Server) = this()
  }
}
