package typingsJapgolly.webpackDevMiddleware

import typingsJapgolly.webpackDevMiddleware.mod.Context
import typingsJapgolly.webpackDevMiddleware.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareMod {
  
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("./index.js").Context<Request, Response>} context
    * @return {import("./index.js").Middleware<Request, Response>}
    */
  inline def apply[Request_1 /* <: typingsJapgolly.node.httpMod.IncomingMessage */, Response_1 /* <: typingsJapgolly.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): Middleware[Request_1, Response_1] = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Middleware[Request_1, Response_1]]
  
  @JSImport("webpack-dev-middleware/types/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IncomingMessage = typingsJapgolly.webpackDevMiddleware.mod.IncomingMessage
  
  type NextFunction = typingsJapgolly.webpackDevMiddleware.mod.NextFunction
  
  type ServerResponse = typingsJapgolly.webpackDevMiddleware.mod.ServerResponse
}
