package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShape extends js.Object {
  def contains(position: js.Array[Double]): Boolean
  def equals(shape: IShape): Boolean
  def getBounds(): js.Array[js.Array[Double]] | Null
  def getGeometry(): IPixelGeometry
  def getType(): String
  def scale(factor: Double): IShape
  def shift(offset: js.Array[Double]): IShape
}

object IShape {
  @scala.inline
  def apply(
    contains: js.Array[Double] => CallbackTo[Boolean],
    equals: IShape => CallbackTo[Boolean],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getGeometry: CallbackTo[IPixelGeometry],
    getType: CallbackTo[String],
    scale: Double => CallbackTo[IShape],
    shift: js.Array[Double] => CallbackTo[IShape]
  ): IShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => contains(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IShape) => equals(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getGeometry")(getGeometry.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => shift(t0).runNow()))
    __obj.asInstanceOf[IShape]
  }
}

