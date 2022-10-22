package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadPhase extends StObject {
  
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body]
  
  def boundingSphereCheck(bodyA: Body, bodyB: Body): Boolean
  
  def collisionPairs(world: World, p1: js.Array[Body], p2: js.Array[Body]): Unit
  
  var dirty: Boolean
  
  def doBoundingBoxBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  
  def doBoundingSphereBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  
  def intersectionTest(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  
  def makePairsUnique(pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  
  def needBroadphaseCollision(bodyA: Body, bodyB: Body): Boolean
  
  def setWorld(world: World): Unit
  
  var useBoundingBoxes: Boolean
  
  var world: World
}
object BroadPhase {
  
  inline def apply(
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Callback,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Callback,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Callback,
    needBroadphaseCollision: (Body, Body) => Boolean,
    setWorld: World => Callback,
    useBoundingBoxes: Boolean,
    world: World
  ): BroadPhase = {
    val __obj = js.Dynamic.literal(aabbQuery = js.Any.fromFunction3(aabbQuery), boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3((t0: World, t1: js.Array[Body], t2: js.Array[Body]) => (collisionPairs(t0, t1, t2)).runNow()), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (doBoundingBoxBroadphase(t0, t1, t2, t3)).runNow()), doBoundingSphereBroadphase = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (doBoundingSphereBroadphase(t0, t1, t2, t3)).runNow()), intersectionTest = js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (intersectionTest(t0, t1, t2, t3)).runNow()), makePairsUnique = js.Any.fromFunction2((t0: js.Array[Body], t1: js.Array[Body]) => (makePairsUnique(t0, t1)).runNow()), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), setWorld = js.Any.fromFunction1((t0: World) => setWorld(t0).runNow()), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadPhase]
  }
  
  extension [Self <: BroadPhase](x: Self) {
    
    inline def setAabbQuery(value: (World, AABB, js.Array[Body]) => js.Array[Body]): Self = StObject.set(x, "aabbQuery", js.Any.fromFunction3(value))
    
    inline def setBoundingSphereCheck(value: (Body, Body) => Boolean): Self = StObject.set(x, "boundingSphereCheck", js.Any.fromFunction2(value))
    
    inline def setCollisionPairs(value: (World, js.Array[Body], js.Array[Body]) => Callback): Self = StObject.set(x, "collisionPairs", js.Any.fromFunction3((t0: World, t1: js.Array[Body], t2: js.Array[Body]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDoBoundingBoxBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Callback): Self = StObject.set(x, "doBoundingBoxBroadphase", js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDoBoundingSphereBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Callback): Self = StObject.set(x, "doBoundingSphereBroadphase", js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setIntersectionTest(value: (Body, Body, js.Array[Body], js.Array[Body]) => Callback): Self = StObject.set(x, "intersectionTest", js.Any.fromFunction4((t0: Body, t1: Body, t2: js.Array[Body], t3: js.Array[Body]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setMakePairsUnique(value: (js.Array[Body], js.Array[Body]) => Callback): Self = StObject.set(x, "makePairsUnique", js.Any.fromFunction2((t0: js.Array[Body], t1: js.Array[Body]) => (value(t0, t1)).runNow()))
    
    inline def setNeedBroadphaseCollision(value: (Body, Body) => Boolean): Self = StObject.set(x, "needBroadphaseCollision", js.Any.fromFunction2(value))
    
    inline def setSetWorld(value: World => Callback): Self = StObject.set(x, "setWorld", js.Any.fromFunction1((t0: World) => value(t0).runNow()))
    
    inline def setUseBoundingBoxes(value: Boolean): Self = StObject.set(x, "useBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}
