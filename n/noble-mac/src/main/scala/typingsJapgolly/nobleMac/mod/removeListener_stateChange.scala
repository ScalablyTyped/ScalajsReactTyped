package typingsJapgolly.nobleMac.mod

import typingsJapgolly.nobleMac.nobleMacStrings.stateChange
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble-mac", "removeListener")
@js.native
object removeListener_stateChange extends js.Object {
  def apply(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
}

