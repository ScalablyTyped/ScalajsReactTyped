package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): Boolean
  def getMetaData(): js.Object
  def scale(factor: Double): IPixelGeometry
  def shift(offset: js.Array[Double]): IPixelGeometry
}

object IPixelGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => CallbackTo[Boolean],
    events: IEventManager,
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getMetaData: CallbackTo[js.Object],
    getType: CallbackTo[String],
    scale: Double => CallbackTo[IPixelGeometry],
    shift: js.Array[Double] => CallbackTo[IPixelGeometry]
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IPixelGeometry) => equals(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getMetaData")(getMetaData.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => shift(t0).runNow()))
    __obj.asInstanceOf[IPixelGeometry]
  }
}

