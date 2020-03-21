package typingsJapgolly.expressPinoLogger.mod

import typingsJapgolly.pino.mod.DestinationStream
import typingsJapgolly.pinoHttp.mod.HttpLogger
import typingsJapgolly.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}

