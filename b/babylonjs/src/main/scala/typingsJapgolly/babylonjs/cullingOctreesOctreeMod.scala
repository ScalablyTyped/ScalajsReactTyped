package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.cullingOctreesOctreeBlockMod.OctreeBlock
import typingsJapgolly.babylonjs.cullingRayMod.Ray
import typingsJapgolly.babylonjs.mathsMathDotplaneMod.Plane
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh
import typingsJapgolly.babylonjs.miscSmartArrayMod.SmartArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cullingOctreesOctreeMod {
  
  @JSImport("babylonjs/Culling/Octrees/octree", "Octree")
  @js.native
  open class Octree[T] protected () extends StObject {
    /**
      * Creates a octree
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param creationFunc function to be used to instantiate the octree
      * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
      * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
      */
    def this(creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit]) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit],
      maxBlockCapacity: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit],
      maxBlockCapacity: Double,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit],
      maxBlockCapacity: Unit,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
    
    /* private */ var _creationFunc: Any = js.native
    
    /* private */ var _maxBlockCapacity: Any = js.native
    
    /* private */ var _selectionContent: Any = js.native
    
    /**
      * Adds a mesh to the octree
      * @param entry Mesh to add to the octree
      */
    def addMesh(entry: T): Unit = js.native
    
    /**
      * Blocks within the octree containing objects
      */
    var blocks: js.Array[OctreeBlock[T]] = js.native
    
    /**
      * Content stored in the octree
      */
    var dynamicContent: js.Array[T] = js.native
    
    /**
      * Test if the octree intersect with the given bounding sphere and if yes, then add its content to the selection array
      * @param sphereCenter defines the bounding sphere center
      * @param sphereRadius defines the bounding sphere radius
      * @param allowDuplicate defines if the selection array can contains duplicated entries
      * @returns an array of objects that intersect the sphere
      */
    def intersects(sphereCenter: Vector3, sphereRadius: Double): SmartArray[T] = js.native
    def intersects(sphereCenter: Vector3, sphereRadius: Double, allowDuplicate: Boolean): SmartArray[T] = js.native
    
    /**
      * Test if the octree intersect with the given ray and if yes, then add its content to resulting array
      * @param ray defines the ray to test with
      * @returns array of intersected objects
      */
    def intersectsRay(ray: Ray): SmartArray[T] = js.native
    
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    var maxDepth: Double = js.native
    
    /**
      * Remove an element from the octree
      * @param entry defines the element to remove
      */
    def removeMesh(entry: T): Unit = js.native
    
    /**
      * Selects an array of meshes within the frustum
      * @param frustumPlanes The frustum planes to use which will select all meshes within it
      * @param allowDuplicate If duplicate objects are allowed in the resulting object array
      * @returns array of meshes within the frustum
      */
    def select(frustumPlanes: js.Array[Plane]): SmartArray[T] = js.native
    def select(frustumPlanes: js.Array[Plane], allowDuplicate: Boolean): SmartArray[T] = js.native
    
    /**
      * Updates the octree by adding blocks for the passed in meshes within the min and max world parameters
      * @param worldMin worldMin for the octree blocks var blockSize = new Vector3((worldMax.x - worldMin.x) / 2, (worldMax.y - worldMin.y) / 2, (worldMax.z - worldMin.z) / 2);
      * @param worldMax worldMax for the octree blocks var blockSize = new Vector3((worldMax.x - worldMin.x) / 2, (worldMax.y - worldMin.y) / 2, (worldMax.z - worldMin.z) / 2);
      * @param entries meshes to be added to the octree blocks
      */
    def update(worldMin: Vector3, worldMax: Vector3, entries: js.Array[T]): Unit = js.native
  }
  /* static members */
  object Octree {
    
    @JSImport("babylonjs/Culling/Octrees/octree", "Octree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds a mesh into the octree block if it intersects the block
      * @param entry
      * @param block
      */
    inline def CreationFuncForMeshes(entry: AbstractMesh, block: OctreeBlock[AbstractMesh]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Adds a submesh into the octree block if it intersects the block
      * @param entry
      * @param block
      */
    inline def CreationFuncForSubMeshes(entry: SubMesh, block: OctreeBlock[SubMesh]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForSubMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
