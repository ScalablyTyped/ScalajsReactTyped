package typingsJapgolly.next

import typingsJapgolly.next.distBuildWebpackLoadersNextServerlessLoaderUtilsMod.ServerlessHandlerCtx
import typingsJapgolly.next.distServerBaseHttpNodeMod.NodeNextRequest
import typingsJapgolly.next.distServerBaseHttpNodeMod.NodeNextResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextServerlessLoaderApiHandlerMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-serverless-loader/api-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApiHandler(ctx: ServerlessHandlerCtx): js.Function2[
    /* rawReq */ NodeNextRequest | IncomingMessage, 
    /* rawRes */ NodeNextResponse | ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiHandler")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* rawReq */ NodeNextRequest | IncomingMessage, 
    /* rawRes */ NodeNextResponse | ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ]]
}
