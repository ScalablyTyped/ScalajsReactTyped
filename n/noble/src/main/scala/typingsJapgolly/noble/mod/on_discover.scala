package typingsJapgolly.noble.mod

import typingsJapgolly.noble.nobleStrings.discover
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "on")
@js.native
object on_discover extends js.Object {
  def apply(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
}

