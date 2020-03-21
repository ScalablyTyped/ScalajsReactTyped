package typingsJapgolly.sparseBitfield.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.memoryPager.mod.PagerInstance
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitFieldInstance extends js.Object {
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  val pages: PagerInstance
  /**
    * Get the value of a bit.
    */
  def get(index: Double): Boolean
  /**
    * Get the value of a byte.
    */
  def getByte(index: Double): Double
  /**
    * Set a bit to true or false.
    */
  def set(index: Double, value: Boolean): Boolean
  /**
    * Set a byte to a new value.
    */
  def setByte(index: Double, byte: Double): Boolean
  /**
    * Get a single buffer representing the entire bitfield.
    */
  def toBuffer(): Buffer
}

object BitFieldInstance {
  @scala.inline
  def apply(
    get: Double => CallbackTo[Boolean],
    getByte: Double => CallbackTo[Double],
    pages: PagerInstance,
    set: (Double, Boolean) => CallbackTo[Boolean],
    setByte: (Double, Double) => CallbackTo[Boolean],
    toBuffer: CallbackTo[Buffer]
  ): BitFieldInstance = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getByte")(js.Any.fromFunction1((t0: scala.Double) => getByte(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => set(t0, t1).runNow()))
    __obj.updateDynamic("setByte")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setByte(t0, t1).runNow()))
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.asInstanceOf[BitFieldInstance]
  }
}

