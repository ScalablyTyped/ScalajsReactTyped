package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heightfield
  extends StObject
     with Shape {
  
  var cacheEnabled: Boolean
  
  var data: js.Array[js.Array[Double]]
  
  var elementSize: Double
  
  def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit
  
  def getIndexOfPosition(x: Double, y: Double, result: js.Array[Any], clamp: Boolean): Boolean
  
  def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[Any]): Unit
  
  var maxValue: Double
  
  var minValue: Double
  
  var pillarConvex: ConvexPolyhedron
  
  var pillarOffset: Vec3
  
  def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit
  
  def update(): Unit
  
  def updateMaxValue(): Unit
  
  def updateMinValue(): Unit
}
object Heightfield {
  
  inline def apply(
    boundingSphereRadius: Double,
    cacheEnabled: Boolean,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    data: js.Array[js.Array[Double]],
    elementSize: Double,
    getConvexTrianglePillar: (Double, Double, Boolean) => Callback,
    getIndexOfPosition: (Double, Double, js.Array[Any], Boolean) => Boolean,
    getRectMinMax: (Double, Double, Double, Double, js.Array[Any]) => Callback,
    id: Double,
    maxValue: Double,
    minValue: Double,
    pillarConvex: ConvexPolyhedron,
    pillarOffset: Vec3,
    setHeightValueAtIndex: (Double, Double, Double) => Callback,
    `type`: Double,
    update: Callback,
    updateBoundingSphereRadius: CallbackTo[Double],
    updateMaxValue: Callback,
    updateMinValue: Callback,
    volume: CallbackTo[Double]
  ): Heightfield = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], getConvexTrianglePillar = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (getConvexTrianglePillar(t0, t1, t2)).runNow()), getIndexOfPosition = js.Any.fromFunction4(getIndexOfPosition), getRectMinMax = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.Array[Any]) => (getRectMinMax(t0, t1, t2, t3, t4)).runNow()), id = id.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pillarConvex = pillarConvex.asInstanceOf[js.Any], pillarOffset = pillarOffset.asInstanceOf[js.Any], setHeightValueAtIndex = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setHeightValueAtIndex(t0, t1, t2)).runNow()), update = update.toJsFn, updateBoundingSphereRadius = updateBoundingSphereRadius.toJsFn, updateMaxValue = updateMaxValue.toJsFn, updateMinValue = updateMinValue.toJsFn, volume = volume.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightfield]
  }
  
  extension [Self <: Heightfield](x: Self) {
    
    inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setElementSize(value: Double): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    inline def setGetConvexTrianglePillar(value: (Double, Double, Boolean) => Callback): Self = StObject.set(x, "getConvexTrianglePillar", js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetIndexOfPosition(value: (Double, Double, js.Array[Any], Boolean) => Boolean): Self = StObject.set(x, "getIndexOfPosition", js.Any.fromFunction4(value))
    
    inline def setGetRectMinMax(value: (Double, Double, Double, Double, js.Array[Any]) => Callback): Self = StObject.set(x, "getRectMinMax", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.Array[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setPillarConvex(value: ConvexPolyhedron): Self = StObject.set(x, "pillarConvex", value.asInstanceOf[js.Any])
    
    inline def setPillarOffset(value: Vec3): Self = StObject.set(x, "pillarOffset", value.asInstanceOf[js.Any])
    
    inline def setSetHeightValueAtIndex(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setHeightValueAtIndex", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setUpdateMaxValue(value: Callback): Self = StObject.set(x, "updateMaxValue", value.toJsFn)
    
    inline def setUpdateMinValue(value: Callback): Self = StObject.set(x, "updateMinValue", value.toJsFn)
  }
}
