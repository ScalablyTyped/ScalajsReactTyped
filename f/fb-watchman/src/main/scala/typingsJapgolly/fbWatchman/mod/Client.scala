package typingsJapgolly.fbWatchman.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fb-watchman", "Client")
@js.native
class Client () extends EventEmitter {
  def this(options: ClientOptions) = this()
  def cancelCommands(why: String): Unit = js.native
  def capabilityCheck(caps: Capabilities, done: doneCallback): Unit = js.native
  def command(args: js.Any, done: doneCallback): Unit = js.native
  def connect(): Unit = js.native
  def end(): Unit = js.native
  def sendNextCommand(): Unit = js.native
}

