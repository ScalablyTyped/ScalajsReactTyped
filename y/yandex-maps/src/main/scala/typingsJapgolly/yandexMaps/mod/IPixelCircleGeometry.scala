package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelCircleGeometry extends IPixelGeometry {
  def getCoordinates(): js.Array[Double]
  def getRadius(): Double
}

object IPixelCircleGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => CallbackTo[Boolean],
    events: IEventManager,
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getCoordinates: CallbackTo[js.Array[Double]],
    getMetaData: CallbackTo[js.Object],
    getRadius: CallbackTo[Double],
    getType: CallbackTo[String],
    scale: Double => CallbackTo[IPixelGeometry],
    shift: js.Array[Double] => CallbackTo[IPixelGeometry]
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.yandexMaps.mod.IPixelGeometry) => equals(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getCoordinates")(getCoordinates.toJsFn)
    __obj.updateDynamic("getMetaData")(getMetaData.toJsFn)
    __obj.updateDynamic("getRadius")(getRadius.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => shift(t0).runNow()))
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
}

