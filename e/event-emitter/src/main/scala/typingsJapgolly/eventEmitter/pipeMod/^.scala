package typingsJapgolly.eventEmitter.pipeMod

import typingsJapgolly.eventEmitter.mod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-emitter/pipe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(source: Emitter, target: Emitter): EmitterPipe = js.native
  def apply(source: Emitter, target: Emitter, emitMethodName: String): EmitterPipe = js.native
  def apply(source: Emitter, target: Emitter, emitMethodName: js.Symbol): EmitterPipe = js.native
}

