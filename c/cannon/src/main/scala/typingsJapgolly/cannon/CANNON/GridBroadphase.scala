package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridBroadphase
  extends StObject
     with BroadPhase {
  
  var aabbMax: Vec3
  
  var aabbMin: Vec3
  
  var bins: js.Array[Any]
  
  var nx: Double
  
  var ny: Double
  
  var nz: Double
}
object GridBroadphase {
  
  inline def apply(
    aabbMax: Vec3,
    aabbMin: Vec3,
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    bins: js.Array[Any],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Callback,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Callback,
    needBroadphaseCollision: (Body, Body) => Boolean,
    nx: Double,
    ny: Double,
    nz: Double,
    setWorld: World => Callback,
    useBoundingBoxes: Boolean,
    world: World
  ): GridBroadphase = {
    val __obj = js.Dynamic.literal(aabbMax = aabbMax.asInstanceOf[js.Any], aabbMin = aabbMin.asInstanceOf[js.Any], aabbQuery = js.Any.fromFunction3(aabbQuery), bins = bins.asInstanceOf[js.Any], boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3((t0: World, t1: js.Array[Body], t2: js.Array[Body]) => (collisionPairs(t0, t1, t2)).runNow()), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (doBoundingBoxBroadphase(t0, t1, t2, t3)).runNow()), doBoundingSphereBroadphase = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (doBoundingSphereBroadphase(t0, t1, t2, t3)).runNow()), intersectionTest = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (intersectionTest(t0, t1, t2, t3)).runNow()), makePairsUnique = js.Any.fromFunction2((t0: js.Array[Body], t1: js.Array[Body]) => (makePairsUnique(t0, t1)).runNow()), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), nx = nx.asInstanceOf[js.Any], ny = ny.asInstanceOf[js.Any], nz = nz.asInstanceOf[js.Any], setWorld = js.Any.fromFunction1((t0: World) => setWorld(t0).runNow()), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBroadphase]
  }
  
  extension [Self <: GridBroadphase](x: Self) {
    
    inline def setAabbMax(value: Vec3): Self = StObject.set(x, "aabbMax", value.asInstanceOf[js.Any])
    
    inline def setAabbMin(value: Vec3): Self = StObject.set(x, "aabbMin", value.asInstanceOf[js.Any])
    
    inline def setBins(value: js.Array[Any]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsVarargs(value: Any*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setNx(value: Double): Self = StObject.set(x, "nx", value.asInstanceOf[js.Any])
    
    inline def setNy(value: Double): Self = StObject.set(x, "ny", value.asInstanceOf[js.Any])
    
    inline def setNz(value: Double): Self = StObject.set(x, "nz", value.asInstanceOf[js.Any])
  }
}
