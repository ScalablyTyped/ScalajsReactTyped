package typingsJapgolly.typesettable

import japgolly.scalajs.react.Callback
import typingsJapgolly.typesettable.writerMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: Callback, write: (String, Double, IXAlign, Double, Double) => Callback): AnonDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction5((t0: java.lang.String, t1: scala.Double, t2: typingsJapgolly.typesettable.writerMod.IXAlign, t3: scala.Double, t4: scala.Double) => write(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[AnonDestroy]
  }
}

