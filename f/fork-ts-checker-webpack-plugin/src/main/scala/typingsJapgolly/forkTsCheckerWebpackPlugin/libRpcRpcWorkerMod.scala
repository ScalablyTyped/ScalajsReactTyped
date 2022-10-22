package typingsJapgolly.forkTsCheckerWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcMethod
import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcRemoteMethod
import typingsJapgolly.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRpcRpcWorkerMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRpcWorker[T /* <: RpcMethod */](modulePath: String, data: Any): RpcWorker[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcWorker")(modulePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[RpcWorker[T]]
  inline def createRpcWorker[T /* <: RpcMethod */](modulePath: String, data: Any, memoryLimit: Double): RpcWorker[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRpcWorker")(modulePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], memoryLimit.asInstanceOf[js.Any])).asInstanceOf[RpcWorker[T]]
  
  inline def getRpcWorkerData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRpcWorkerData")().asInstanceOf[Any]
  
  type RpcWorker[T /* <: RpcMethod */] = RpcWorkerBase & RpcRemoteMethod[T]
  
  trait RpcWorkerBase extends StObject {
    
    def connect(): Unit
    
    val connected: Boolean
    
    val process: js.UndefOr[ChildProcess] = js.undefined
    
    def terminate(): Unit
  }
  object RpcWorkerBase {
    
    inline def apply(connect: Callback, connected: Boolean, terminate: Callback): RpcWorkerBase = {
      val __obj = js.Dynamic.literal(connect = connect.toJsFn, connected = connected.asInstanceOf[js.Any], terminate = terminate.toJsFn)
      __obj.asInstanceOf[RpcWorkerBase]
    }
    
    extension [Self <: RpcWorkerBase](x: Self) {
      
      inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
    }
  }
}
