package typingsJapgolly.fluxxor.mod

import typingsJapgolly.eventemitter3.mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store
  extends EventEmitter[String | js.Symbol] {
  def bindActions(args: (String | js.Function)*): Unit = js.native
  def bindActions(args: js.Array[String | js.Function]): Unit = js.native
  def waitFor(stores: js.Array[String], fn: js.Function): Unit = js.native
}

