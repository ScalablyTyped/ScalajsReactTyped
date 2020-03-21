package typingsJapgolly.opossum.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.opossum.opossumStrings.snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends EventEmitter {
  var stats: Stats = js.native
  var window: Window = js.native
  @JSName("on")
  def on_snapshot(event: snapshot, listener: js.Function1[/* snapshot */ Stats, Unit]): this.type = js.native
}

