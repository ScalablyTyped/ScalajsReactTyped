package typingsJapgolly.inversifyLoggerMiddleware

import typingsJapgolly.inversify.interfacesMod.interfaces.Middleware
import typingsJapgolly.inversifyLoggerMiddleware.interfacesMod.interfaces.LogEntry
import typingsJapgolly.inversifyLoggerMiddleware.interfacesMod.interfaces.LoggerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-logger-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def makeLoggerMiddleware(): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings): Middleware = js.native
  def makeLoggerMiddleware(settings: LoggerSettings, renderer: js.Function1[/* out */ LogEntry, Unit]): Middleware = js.native
  def textSerializer(entry: LogEntry): String = js.native
}

