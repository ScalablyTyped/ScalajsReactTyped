package typingsJapgolly.thrift.mod

import typingsJapgolly.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createWebServer")
@js.native
object createWebServer extends js.Object {
  def apply[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): Server | typingsJapgolly.node.tlsMod.Server = js.native
}

