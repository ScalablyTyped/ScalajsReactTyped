package typingsJapgolly.sipJs.apiMod

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.sipJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "_makeEmitter")
@js.native
object makeEmitter extends js.Object {
  def apply[T](eventEmitter: EventEmitter): Emitter[T] = js.native
  def apply[T](eventEmitter: EventEmitter, eventName: String): Emitter[T] = js.native
}

