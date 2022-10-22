package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "BroadPhase")
@js.native
open class BroadPhase ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.BroadPhase {
  
  /* CompleteClass */
  override def aabbQuery(
    world: typingsJapgolly.cannon.CANNON.World,
    aabb: typingsJapgolly.cannon.CANNON.AABB,
    result: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): js.Array[typingsJapgolly.cannon.CANNON.Body] = js.native
  
  /* CompleteClass */
  override def boundingSphereCheck(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body): Boolean = js.native
  
  /* CompleteClass */
  override def collisionPairs(
    world: typingsJapgolly.cannon.CANNON.World,
    p1: js.Array[typingsJapgolly.cannon.CANNON.Body],
    p2: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  var dirty: Boolean = js.native
  
  /* CompleteClass */
  override def doBoundingBoxBroadphase(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pairs1: js.Array[typingsJapgolly.cannon.CANNON.Body],
    pairs2: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  override def doBoundingSphereBroadphase(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pairs1: js.Array[typingsJapgolly.cannon.CANNON.Body],
    pairs2: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  override def intersectionTest(
    bodyA: typingsJapgolly.cannon.CANNON.Body,
    bodyB: typingsJapgolly.cannon.CANNON.Body,
    pairs1: js.Array[typingsJapgolly.cannon.CANNON.Body],
    pairs2: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  override def makePairsUnique(
    pairs1: js.Array[typingsJapgolly.cannon.CANNON.Body],
    pairs2: js.Array[typingsJapgolly.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  override def needBroadphaseCollision(bodyA: typingsJapgolly.cannon.CANNON.Body, bodyB: typingsJapgolly.cannon.CANNON.Body): Boolean = js.native
  
  /* CompleteClass */
  override def setWorld(world: typingsJapgolly.cannon.CANNON.World): Unit = js.native
  
  /* CompleteClass */
  var useBoundingBoxes: Boolean = js.native
  
  /* CompleteClass */
  var world: typingsJapgolly.cannon.CANNON.World = js.native
}
