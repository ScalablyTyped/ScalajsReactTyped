package typingsJapgolly.pinoHttp.mod

import typingsJapgolly.pino.mod.DestinationStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}

