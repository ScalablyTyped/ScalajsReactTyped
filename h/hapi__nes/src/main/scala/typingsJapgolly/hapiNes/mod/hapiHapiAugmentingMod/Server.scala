package typingsJapgolly.hapiNes.mod.hapiHapiAugmentingMod

import typingsJapgolly.hapiNes.mod.ServerBroadcastOptions
import typingsJapgolly.hapiNes.mod.ServerEachSocketOptions
import typingsJapgolly.hapiNes.mod.ServerPublishOptions
import typingsJapgolly.hapiNes.mod.ServerSubscriptionOptions
import typingsJapgolly.hapiNes.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def broadcast(message: js.Any): Unit = js.native
  def broadcast(message: js.Any, options: ServerBroadcastOptions): Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit], options: ServerEachSocketOptions): Unit = js.native
  def publish(path: String, message: js.Any): Unit = js.native
  def publish(path: String, message: js.Any, options: ServerPublishOptions): Unit = js.native
  def subscription(path: String): Unit = js.native
  def subscription(path: String, options: ServerSubscriptionOptions): Unit = js.native
}

