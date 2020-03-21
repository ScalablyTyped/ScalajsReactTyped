package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpower extends js.Object {
  def releaseKeepAwake(): Unit
  def requestKeepAwake(level: String): Unit
}

object Typeofpower {
  @scala.inline
  def apply(releaseKeepAwake: Callback, requestKeepAwake: String => Callback): Typeofpower = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("releaseKeepAwake")(releaseKeepAwake.toJsFn)
    __obj.updateDynamic("requestKeepAwake")(js.Any.fromFunction1((t0: java.lang.String) => requestKeepAwake(t0).runNow()))
    __obj.asInstanceOf[Typeofpower]
  }
}

