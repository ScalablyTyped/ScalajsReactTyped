package typingsJapgolly.node

import typingsJapgolly.node.NodeJS.Timer
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", JSImport.Namespace)
@js.native
object domainMod extends js.Object {
  @js.native
  class Domain ()
    extends EventEmitter
       with typingsJapgolly.node.NodeJS.Domain {
    var members: js.Array[EventEmitter | Timer] = js.native
    def add(emitter: EventEmitter): Unit = js.native
    def enter(): Unit = js.native
    def exit(): Unit = js.native
    def remove(emitter: EventEmitter): Unit = js.native
  }
  
  def create(): Domain = js.native
}

