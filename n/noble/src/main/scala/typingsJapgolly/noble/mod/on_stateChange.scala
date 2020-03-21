package typingsJapgolly.noble.mod

import typingsJapgolly.noble.nobleStrings.stateChange
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "on")
@js.native
object on_stateChange extends js.Object {
  def apply(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
}

