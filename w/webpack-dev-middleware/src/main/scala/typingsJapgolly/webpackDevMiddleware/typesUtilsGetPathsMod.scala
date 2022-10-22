package typingsJapgolly.webpackDevMiddleware

import typingsJapgolly.webpackDevMiddleware.anon.OutputPath
import typingsJapgolly.webpackDevMiddleware.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsGetPathsMod {
  
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Stats} Stats */
  /** @typedef {import("webpack").MultiStats} MultiStats */
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    */
  inline def apply[Request_1 /* <: typingsJapgolly.node.httpMod.IncomingMessage */, Response_1 /* <: typingsJapgolly.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): js.Array[OutputPath] = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[OutputPath]]
  
  @JSImport("webpack-dev-middleware/types/utils/getPaths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Compiler = typingsJapgolly.webpack.mod.Compiler
  
  type IncomingMessage = typingsJapgolly.webpackDevMiddleware.mod.IncomingMessage
  
  type MultiStats = typingsJapgolly.webpack.mod.MultiStats
  
  type ServerResponse = typingsJapgolly.webpackDevMiddleware.mod.ServerResponse
  
  type Stats = typingsJapgolly.webpack.mod.Stats
}
