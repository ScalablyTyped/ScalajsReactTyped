package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineStringGeometryAccess
  extends StObject
     with IFreezable {
  
  def get(index: Double): js.Array[Double]
  
  def getChildGeometry(index: Double): IPointGeometryAccess
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[Double]]
  
  def getLength(): Double
  
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  
  def remove(index: Double): js.Array[Double]
  
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess
  
  def splice(index: Double, length: Double): js.Array[js.Array[Double]]
}
object ILineStringGeometryAccess {
  
  inline def apply(
    events: IEventManager[js.Object],
    freeze: CallbackTo[IFreezable],
    get: Double => js.Array[Double],
    getChildGeometry: Double => IPointGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: CallbackTo[js.Array[js.Array[Double]]],
    getLength: CallbackTo[Double],
    insert: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess,
    isFrozen: CallbackTo[Boolean],
    remove: Double => js.Array[Double],
    set: (Double, js.Array[Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[js.Array[Double]] => ILineStringGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: CallbackTo[IFreezable]
  ): ILineStringGeometryAccess = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = freeze.toJsFn, get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = getCoordinates.toJsFn, getLength = getLength.toJsFn, insert = js.Any.fromFunction2(insert), isFrozen = isFrozen.toJsFn, remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = unfreeze.toJsFn)
    __obj.asInstanceOf[ILineStringGeometryAccess]
  }
  
  extension [Self <: ILineStringGeometryAccess](x: Self) {
    
    inline def setGet(value: Double => js.Array[Double]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetChildGeometry(value: Double => IPointGeometryAccess): Self = StObject.set(x, "getChildGeometry", js.Any.fromFunction1(value))
    
    inline def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    inline def setGetCoordinates(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setInsert(value: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setRemove(value: Double => js.Array[Double]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Double, js.Array[Double]) => ILineStringGeometryAccess): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetCoordinates(value: js.Array[js.Array[Double]] => ILineStringGeometryAccess): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1(value))
    
    inline def setSplice(value: (Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "splice", js.Any.fromFunction2(value))
  }
}
