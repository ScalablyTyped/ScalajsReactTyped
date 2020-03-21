package typingsJapgolly.workerRpc

import typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.Dispatcher
import typingsJapgolly.workerRpc.rpcProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  
  @js.native
  object RpcProvider extends js.Object {
    @js.native
    object MessageType extends js.Object {
      /* 2 */ val internal: typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      /* 1 */ val rpc: typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      /* 0 */ val signal: typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.workerRpc.rpcProviderMod.RpcProvider.MessageType with Double] = js.native
    }
    
  }
  
}

