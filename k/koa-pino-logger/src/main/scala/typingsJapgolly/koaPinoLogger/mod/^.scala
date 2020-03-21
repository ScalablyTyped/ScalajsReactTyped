package typingsJapgolly.koaPinoLogger.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.pino.mod.DestinationStream
import typingsJapgolly.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options, stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
  def apply(stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
}

