package typingsJapgolly.brorand.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: typingsJapgolly.brorand.mod.rand
  def generate(len: Double): Buffer | scala.scalajs.js.typedarray.Uint8Array
}

object RandInstance {
  @scala.inline
  def apply(generate: Double => CallbackTo[Buffer | scala.scalajs.js.typedarray.Uint8Array], rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(rand = rand.asInstanceOf[js.Any])
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: scala.Double) => generate(t0).runNow()))
    __obj.asInstanceOf[RandInstance]
  }
}

