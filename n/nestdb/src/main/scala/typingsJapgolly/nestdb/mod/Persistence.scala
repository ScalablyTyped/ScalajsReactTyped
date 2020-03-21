package typingsJapgolly.nestdb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def compactDatafile(): Unit
  def setAutocompactionInterval(interval: Double): Unit
  def stopAutocompaction(): Unit
}

object Persistence {
  @scala.inline
  def apply(
    compactDatafile: Callback,
    setAutocompactionInterval: Double => Callback,
    stopAutocompaction: Callback
  ): Persistence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compactDatafile")(compactDatafile.toJsFn)
    __obj.updateDynamic("setAutocompactionInterval")(js.Any.fromFunction1((t0: scala.Double) => setAutocompactionInterval(t0).runNow()))
    __obj.updateDynamic("stopAutocompaction")(stopAutocompaction.toJsFn)
    __obj.asInstanceOf[Persistence]
  }
}

