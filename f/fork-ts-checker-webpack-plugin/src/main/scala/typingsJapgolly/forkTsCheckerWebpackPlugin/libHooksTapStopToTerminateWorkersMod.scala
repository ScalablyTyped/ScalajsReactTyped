package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcRpcWorkerMod.RpcWorker
import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcMethod
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapStopToTerminateWorkersMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-stop-to-terminate-workers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapStopToTerminateWorkers(
    compiler: Compiler,
    getIssuesWorker: RpcWorker[RpcMethod],
    getDependenciesWorker: RpcWorker[RpcMethod],
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapStopToTerminateWorkers")(compiler.asInstanceOf[js.Any], getIssuesWorker.asInstanceOf[js.Any], getDependenciesWorker.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
