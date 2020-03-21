package typingsJapgolly.expressSocketIoSession.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-socket.io-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(expressSessionMiddleware: RequestHandler[ParamsDictionary]): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary],
    cookieParserMiddleware: RequestHandler[ParamsDictionary]
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary],
    cookieParserMiddleware: RequestHandler[ParamsDictionary],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  def apply(expressSessionMiddleware: RequestHandler[ParamsDictionary], options: SharedSessionOptions): SocketIoSharedSessionMiddleware = js.native
}

