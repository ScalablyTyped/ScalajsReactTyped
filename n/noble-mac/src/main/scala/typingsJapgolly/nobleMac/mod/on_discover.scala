package typingsJapgolly.nobleMac.mod

import typingsJapgolly.nobleMac.nobleMacStrings.discover
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "on")
@js.native
object on_discover extends js.Object {
  def apply(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
}

