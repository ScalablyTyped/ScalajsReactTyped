package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolygonGeometryAccess
  extends StObject
     with IFreezable {
  
  def contains(position: js.Array[Double]): Boolean
  
  def get(index: Double): js.Array[js.Array[Double]]
  
  def getChildGeometry(index: Double): ILinearRingGeometryAccess
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]]
  
  def getFillRule(): String
  
  def getLength(): Double
  
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  
  def remove(index: Double): ILinearRingGeometryAccess
  
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess
  
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess
  
  def setFillRule(fillRule: String): IPolygonGeometryAccess
  
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess]
}
object IPolygonGeometryAccess {
  
  inline def apply(
    contains: js.Array[Double] => Boolean,
    events: IEventManager[js.Object],
    freeze: CallbackTo[IFreezable],
    get: Double => js.Array[js.Array[Double]],
    getChildGeometry: Double => ILinearRingGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: CallbackTo[js.Array[js.Array[js.Array[Double]]]],
    getFillRule: CallbackTo[String],
    getLength: CallbackTo[Double],
    insert: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    isFrozen: CallbackTo[Boolean],
    remove: Double => ILinearRingGeometryAccess,
    set: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess,
    setFillRule: String => IPolygonGeometryAccess,
    splice: (Double, Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: CallbackTo[IFreezable]
  ): IPolygonGeometryAccess = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], freeze = freeze.toJsFn, get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = getCoordinates.toJsFn, getFillRule = getFillRule.toJsFn, getLength = getLength.toJsFn, insert = js.Any.fromFunction2(insert), isFrozen = isFrozen.toJsFn, remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = unfreeze.toJsFn)
    __obj.asInstanceOf[IPolygonGeometryAccess]
  }
  
  extension [Self <: IPolygonGeometryAccess](x: Self) {
    
    inline def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGet(value: Double => js.Array[js.Array[Double]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetChildGeometry(value: Double => ILinearRingGeometryAccess): Self = StObject.set(x, "getChildGeometry", js.Any.fromFunction1(value))
    
    inline def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setGetFillRule(value: CallbackTo[String]): Self = StObject.set(x, "getFillRule", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setInsert(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setRemove(value: Double => ILinearRingGeometryAccess): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetCoordinates(value: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSetFillRule(value: String => IPolygonGeometryAccess): Self = StObject.set(x, "setFillRule", js.Any.fromFunction1(value))
    
    inline def setSplice(value: (Double, Double) => js.Array[ILinearRingGeometryAccess]): Self = StObject.set(x, "splice", js.Any.fromFunction2(value))
  }
}
