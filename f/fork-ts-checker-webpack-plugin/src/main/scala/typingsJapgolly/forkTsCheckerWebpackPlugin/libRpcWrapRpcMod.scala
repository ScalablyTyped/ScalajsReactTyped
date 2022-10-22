package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.forkTsCheckerWebpackPlugin.libRpcTypesMod.RpcRemoteMethod
import typingsJapgolly.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRpcWrapRpcMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/wrap-rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapRpc[T /* <: js.Function1[/* repeated */ Any, Any] */](childProcess: ChildProcess): RpcRemoteMethod[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRpc")(childProcess.asInstanceOf[js.Any]).asInstanceOf[RpcRemoteMethod[T]]
}
