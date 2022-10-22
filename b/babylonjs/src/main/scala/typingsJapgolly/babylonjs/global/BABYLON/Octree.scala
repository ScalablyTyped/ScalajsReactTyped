package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Octree")
@js.native
open class Octree[T] protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    * @param creationFunc function to be used to instantiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ typingsJapgolly.babylonjs.BABYLON.OctreeBlock[T], Unit]) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typingsJapgolly.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typingsJapgolly.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typingsJapgolly.babylonjs.BABYLON.OctreeBlock[T], Unit],
    maxBlockCapacity: Unit,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}
/* static members */
object Octree {
  
  @JSGlobal("BABYLON.Octree")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a mesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForMeshes(
    entry: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    block: typingsJapgolly.babylonjs.BABYLON.OctreeBlock[typingsJapgolly.babylonjs.BABYLON.AbstractMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Adds a submesh into the octree block if it intersects the block
    * @param entry
    * @param block
    */
  inline def CreationFuncForSubMeshes(
    entry: typingsJapgolly.babylonjs.BABYLON.SubMesh,
    block: typingsJapgolly.babylonjs.BABYLON.OctreeBlock[typingsJapgolly.babylonjs.BABYLON.SubMesh]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForSubMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
