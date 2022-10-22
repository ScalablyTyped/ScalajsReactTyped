package typingsJapgolly.expoDevServer

import typingsJapgolly.expoDevServer.anon.Body
import typingsJapgolly.expoDevServer.anon.Compiler
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWebpackSymbolicateMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/webpack/symbolicateMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSymbolicateMiddleware(hasProjectRootLoggerCompiler: Compiler): js.Function2[
    /* req */ IncomingMessage & Body, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[ServerResponse[IncomingMessage]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolicateMiddleware")(hasProjectRootLoggerCompiler.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* req */ IncomingMessage & Body, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[ServerResponse[IncomingMessage]]
  ]]
}
