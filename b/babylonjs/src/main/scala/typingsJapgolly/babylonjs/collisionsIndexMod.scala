package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsIndexMod {
  
  @JSImport("babylonjs/Collisions/index", "Collider")
  @js.native
  open class Collider ()
    extends typingsJapgolly.babylonjs.collisionsColliderMod.Collider
  /* static members */
  object Collider {
    
    @JSImport("babylonjs/Collisions/index", "Collider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If true, it check for double sided faces and only returns 1 collision instead of 2
      */
    @JSImport("babylonjs/Collisions/index", "Collider.DoubleSidedCheck")
    @js.native
    def DoubleSidedCheck: Boolean = js.native
    inline def DoubleSidedCheck_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleSidedCheck")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Collisions/index", "DefaultCollisionCoordinator")
  @js.native
  open class DefaultCollisionCoordinator ()
    extends typingsJapgolly.babylonjs.collisionsCollisionCoordinatorMod.DefaultCollisionCoordinator
  
  @JSImport("babylonjs/Collisions/index", "IntersectionInfo")
  @js.native
  open class IntersectionInfo protected ()
    extends typingsJapgolly.babylonjs.collisionsIntersectionInfoMod.IntersectionInfo {
    def this(bu: Nullable[Double], bv: Nullable[Double], distance: Double) = this()
  }
  
  @JSImport("babylonjs/Collisions/index", "_MeshCollisionData")
  @js.native
  open class MeshCollisionData ()
    extends typingsJapgolly.babylonjs.collisionsMeshCollisionDataMod.MeshCollisionData
  
  @JSImport("babylonjs/Collisions/index", "PickingInfo")
  @js.native
  open class PickingInfo ()
    extends typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo
}
