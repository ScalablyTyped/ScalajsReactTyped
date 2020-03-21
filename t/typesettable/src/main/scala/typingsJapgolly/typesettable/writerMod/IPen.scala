package typingsJapgolly.typesettable.writerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPen extends js.Object {
  /**
    * Called once all the lines have been written
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called once for each line of text in the block.
    *
    * `xOffset` and `yOffset` are assumed to be in an independent text-aligned
    * coordinate space.
    */
  def write(line: String, width: Double, anchor: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object IPen {
  @scala.inline
  def apply(
    write: (String, Double, IXAlign, Double, Double) => Callback,
    destroy: js.UndefOr[Callback] = js.undefined
  ): IPen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction5((t0: java.lang.String, t1: scala.Double, t2: typingsJapgolly.typesettable.writerMod.IXAlign, t3: scala.Double, t4: scala.Double) => write(t0, t1, t2, t3, t4).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    __obj.asInstanceOf[IPen]
  }
}

