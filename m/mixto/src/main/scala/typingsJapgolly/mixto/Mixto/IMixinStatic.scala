package typingsJapgolly.mixto.Mixto

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMixinStatic extends js.Object {
  def extend(`object`: js.Any): Unit
  def includeInto(constructor: js.Any): Unit
}

object IMixinStatic {
  @scala.inline
  def apply(extend: js.Any => Callback, includeInto: js.Any => Callback): IMixinStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: js.Any) => extend(t0).runNow()))
    __obj.updateDynamic("includeInto")(js.Any.fromFunction1((t0: js.Any) => includeInto(t0).runNow()))
    __obj.asInstanceOf[IMixinStatic]
  }
}

