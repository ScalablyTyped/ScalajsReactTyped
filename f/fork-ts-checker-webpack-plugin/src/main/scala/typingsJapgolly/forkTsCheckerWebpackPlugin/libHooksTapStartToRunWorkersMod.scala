package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libPluginConfigMod.ForkTsCheckerWebpackPluginConfig
import typingsJapgolly.forkTsCheckerWebpackPlugin.libPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcRpcWorkerMod.RpcWorker
import typingsJapgolly.forkTsCheckerWebpackPlugin.libTypescriptWorkerGetDependenciesWorkerMod.GetDependenciesWorker
import typingsJapgolly.forkTsCheckerWebpackPlugin.libTypescriptWorkerGetIssuesWorkerMod.GetIssuesWorker
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksTapStartToRunWorkersMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tap-start-to-run-workers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tapStartToRunWorkers(
    compiler: Compiler,
    getIssuesWorker: RpcWorker[GetIssuesWorker],
    getDependenciesWorker: RpcWorker[GetDependenciesWorker],
    config: ForkTsCheckerWebpackPluginConfig,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tapStartToRunWorkers")(compiler.asInstanceOf[js.Any], getIssuesWorker.asInstanceOf[js.Any], getDependenciesWorker.asInstanceOf[js.Any], config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
