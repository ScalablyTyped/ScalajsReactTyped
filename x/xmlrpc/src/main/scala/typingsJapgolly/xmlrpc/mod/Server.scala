package typingsJapgolly.xmlrpc.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.xmlrpc.xmlrpcStrings.NotFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends EventEmitter {
  var httpServer: typingsJapgolly.node.httpMod.Server | typingsJapgolly.node.httpsMod.Server = js.native
  def on(eventName: String, callback: ServerFunction): this.type = js.native
  @JSName("on")
  def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
}

