package typingsJapgolly.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.SAPBroadphase")
@js.native
open class SAPBroadphase ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.SAPBroadphase {
  def this(world: typingsJapgolly.cannon.CANNON.World) = this()
  
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
/* static members */
object SAPBroadphase {
  
  @JSGlobal("CANNON.SAPBroadphase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBounds(bi: typingsJapgolly.cannon.CANNON.Body, bj: typingsJapgolly.cannon.CANNON.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBounds")(bi.asInstanceOf[js.Any], bj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkBounds(bi: typingsJapgolly.cannon.CANNON.Body, bj: typingsJapgolly.cannon.CANNON.Body, axisIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBounds")(bi.asInstanceOf[js.Any], bj.asInstanceOf[js.Any], axisIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def insertionSortX(a: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortX")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def insertionSortY(a: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortY")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def insertionSortZ(a: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortZ")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
