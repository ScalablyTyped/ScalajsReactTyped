package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typings.yandexDashMaps.yandexDashMapsMod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ trait IBasePolygonGeometry extends IBaseGeometry {
  def contains(position: js.Array[Double]): Boolean
  def freeze(): IFreezable
  def get(index: Double): js.Array[js.Array[Double]]
  def getChildGeometry(index: Double): ILinearRingGeometryAccess
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]]
  def getFillRule(): String
  def getLength(): Double
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  def isFrozen(): Boolean
  def remove(index: Double): ILinearRingGeometryAccess
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess
  def setFillRule(fillRule: String): IPolygonGeometryAccess
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess]
  def unfreeze(): IFreezable
}

object IBasePolygonGeometry {
  @scala.inline
  def apply(
    contains: js.Array[Double] => CallbackTo[Boolean],
    events: IEventManager,
    freeze: CallbackTo[IFreezable],
    get: Double => CallbackTo[js.Array[js.Array[Double]]],
    getBounds: CallbackTo[js.Array[js.Array[Double]] | Null],
    getChildGeometry: Double => CallbackTo[ILinearRingGeometryAccess],
    getClosest: js.Array[Double] => CallbackTo[js.Object],
    getCoordinates: CallbackTo[js.Array[js.Array[js.Array[Double]]]],
    getFillRule: CallbackTo[String],
    getLength: CallbackTo[Double],
    getType: CallbackTo[String],
    insert: (Double, js.Array[js.Array[Double]]) => CallbackTo[IPolygonGeometryAccess],
    isFrozen: CallbackTo[Boolean],
    remove: Double => CallbackTo[ILinearRingGeometryAccess],
    set: (Double, js.Array[js.Array[Double]]) => CallbackTo[IPolygonGeometryAccess],
    setCoordinates: js.Array[js.Array[js.Array[Double]]] => CallbackTo[IPolygonGeometryAccess],
    setFillRule: String => CallbackTo[IPolygonGeometryAccess],
    splice: (Double, Double) => CallbackTo[js.Array[ILinearRingGeometryAccess]],
    unfreeze: CallbackTo[IFreezable]
  ): IBasePolygonGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => contains(t0).runNow()))
    __obj.updateDynamic("freeze")(freeze.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getBounds")(getBounds.toJsFn)
    __obj.updateDynamic("getChildGeometry")(js.Any.fromFunction1((t0: scala.Double) => getChildGeometry(t0).runNow()))
    __obj.updateDynamic("getClosest")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => getClosest(t0).runNow()))
    __obj.updateDynamic("getCoordinates")(getCoordinates.toJsFn)
    __obj.updateDynamic("getFillRule")(getFillRule.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: js.Array[js.Array[scala.Double]]) => insert(t0, t1).runNow()))
    __obj.updateDynamic("isFrozen")(isFrozen.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: js.Array[js.Array[scala.Double]]) => set(t0, t1).runNow()))
    __obj.updateDynamic("setCoordinates")(js.Any.fromFunction1((t0: js.Array[js.Array[js.Array[scala.Double]]]) => setCoordinates(t0).runNow()))
    __obj.updateDynamic("setFillRule")(js.Any.fromFunction1((t0: java.lang.String) => setFillRule(t0).runNow()))
    __obj.updateDynamic("splice")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => splice(t0, t1).runNow()))
    __obj.updateDynamic("unfreeze")(unfreeze.toJsFn)
    __obj.asInstanceOf[IBasePolygonGeometry]
  }
}

