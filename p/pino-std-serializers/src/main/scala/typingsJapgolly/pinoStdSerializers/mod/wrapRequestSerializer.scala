package typingsJapgolly.pinoStdSerializers.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "wrapRequestSerializer")
@js.native
object wrapRequestSerializer extends js.Object {
  def apply(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
}

