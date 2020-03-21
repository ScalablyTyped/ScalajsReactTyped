package typingsJapgolly.synaptic.mod.Network

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimized extends js.Object {
  var memory: scala.scalajs.js.typedarray.Float64Array
  def ownership(memoryBuffer: scala.scalajs.js.typedarray.Float64Array): Unit
}

object Optimized {
  @scala.inline
  def apply(
    memory: scala.scalajs.js.typedarray.Float64Array,
    ownership: scala.scalajs.js.typedarray.Float64Array => Callback
  ): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any])
    __obj.updateDynamic("ownership")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Float64Array) => ownership(t0).runNow()))
    __obj.asInstanceOf[Optimized]
  }
}

