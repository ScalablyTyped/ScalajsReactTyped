package typingsJapgolly.web3Net

import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.web3Core.mod.NetworkBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-net", "Network")
  @js.native
  open class Network () extends NetworkBase {
    def this(provider: typingsJapgolly.web3Core.mod.provider) = this()
    def this(provider: typingsJapgolly.web3Core.mod.provider, net: Socket) = this()
  }
}
