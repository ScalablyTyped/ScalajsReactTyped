package typingsJapgolly.tether.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
trait Tether extends js.Object {
  def destroy(): Unit
  def disable(): Unit
  def enable(): Unit
  def position(): Unit
  def setOptions(options: ITetherOptions): Unit
}

object Tether {
  @scala.inline
  def apply(
    destroy: Callback,
    disable: Callback,
    enable: Callback,
    position: Callback,
    setOptions: ITetherOptions => Callback
  ): Tether = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("position")(position.toJsFn)
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.tether.mod.ITetherOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Tether]
  }
}

