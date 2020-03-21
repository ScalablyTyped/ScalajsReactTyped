package typingsJapgolly.thrift.mod

import typingsJapgolly.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createServer")
@js.native
object createServer extends js.Object {
  def apply[TProcessor, THandler](processor: TProcessorConstructor[TProcessor, THandler], handler: THandler): Server | typingsJapgolly.node.tlsMod.Server = js.native
  def apply[TProcessor, THandler](
    processor: TProcessorConstructor[TProcessor, THandler],
    handler: THandler,
    options: ServerOptions[TProcessor, THandler]
  ): Server | typingsJapgolly.node.tlsMod.Server = js.native
}

