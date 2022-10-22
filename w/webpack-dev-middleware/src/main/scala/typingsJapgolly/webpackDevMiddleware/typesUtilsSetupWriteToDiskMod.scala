package typingsJapgolly.webpackDevMiddleware

import typingsJapgolly.webpackDevMiddleware.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsSetupWriteToDiskMod {
  
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").MultiCompiler} MultiCompiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    */
  inline def apply[Request_1 /* <: typingsJapgolly.node.httpMod.IncomingMessage */, Response_1 /* <: typingsJapgolly.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): Unit = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("webpack-dev-middleware/types/utils/setupWriteToDisk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Compilation = typingsJapgolly.webpack.mod.Compilation
  
  type Compiler = typingsJapgolly.webpack.mod.Compiler
  
  type IncomingMessage = typingsJapgolly.webpackDevMiddleware.mod.IncomingMessage
  
  type MultiCompiler = typingsJapgolly.webpack.mod.MultiCompiler
  
  type ServerResponse = typingsJapgolly.webpackDevMiddleware.mod.ServerResponse
}
