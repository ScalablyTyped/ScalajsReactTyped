package typingsJapgolly.nodeResque.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Connection")
@js.native
class Connection protected () extends EventEmitter {
  def this(options: ConnectionOptions) = this()
  def connect(): js.Promise[Unit] = js.native
  def end(): js.Promise[Unit] = js.native
}

