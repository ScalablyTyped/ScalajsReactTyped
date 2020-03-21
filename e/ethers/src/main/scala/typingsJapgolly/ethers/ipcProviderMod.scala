package typingsJapgolly.ethers

import typingsJapgolly.ethers.jsonRpcProviderMod.JsonRpcProvider
import typingsJapgolly.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/ipc-provider", JSImport.Namespace)
@js.native
object ipcProviderMod extends js.Object {
  @js.native
  class IpcProvider protected () extends JsonRpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
    val path: String = js.native
  }
  
}

