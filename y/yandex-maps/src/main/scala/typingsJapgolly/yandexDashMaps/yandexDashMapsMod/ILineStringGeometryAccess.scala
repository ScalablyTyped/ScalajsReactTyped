package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineStringGeometryAccess extends IFreezable {
  def get(index: Double): js.Array[Double]
  def getChildGeometry(index: Double): IPointGeometryAccess
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  def getCoordinates(): js.Array[js.Array[Double]]
  def getLength(): Double
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  def remove(index: Double): js.Array[Double]
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess
  def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess
  def splice(index: Double, length: Double): js.Array[js.Array[Double]]
}

object ILineStringGeometryAccess {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: CallbackTo[IFreezable],
    get: Double => CallbackTo[js.Array[Double]],
    getChildGeometry: Double => CallbackTo[IPointGeometryAccess],
    getClosest: js.Array[Double] => CallbackTo[js.Object],
    getCoordinates: CallbackTo[js.Array[js.Array[Double]]],
    getLength: CallbackTo[Double],
    insert: (Double, js.Array[js.Array[Double]]) => CallbackTo[ILineStringGeometryAccess],
    isFrozen: CallbackTo[Boolean],
    remove: Double => CallbackTo[js.Array[Double]],
    set: (Double, js.Array[Double]) => CallbackTo[ILineStringGeometryAccess],
    setCoordinates: js.Array[Double] => CallbackTo[ILineStringGeometryAccess],
    splice: (Double, Double) => CallbackTo[js.Array[js.Array[Double]]],
    unfreeze: CallbackTo[IFreezable]
  ): ILineStringGeometryAccess = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("freeze")(freeze.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getChildGeometry")(js.Any.fromFunction1((t0: scala.Double) => getChildGeometry(t0).runNow()))
    __obj.updateDynamic("getClosest")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => getClosest(t0).runNow()))
    __obj.updateDynamic("getCoordinates")(getCoordinates.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: js.Array[js.Array[scala.Double]]) => insert(t0, t1).runNow()))
    __obj.updateDynamic("isFrozen")(isFrozen.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: js.Array[scala.Double]) => set(t0, t1).runNow()))
    __obj.updateDynamic("setCoordinates")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => setCoordinates(t0).runNow()))
    __obj.updateDynamic("splice")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => splice(t0, t1).runNow()))
    __obj.updateDynamic("unfreeze")(unfreeze.toJsFn)
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
}

