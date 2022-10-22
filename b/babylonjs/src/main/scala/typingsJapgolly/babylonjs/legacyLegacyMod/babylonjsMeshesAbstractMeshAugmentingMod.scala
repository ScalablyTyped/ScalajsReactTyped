package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesAbstractMeshAugmentingMod {
  
  @js.native
  trait AbstractMesh extends StObject {
    
    /**
      * Backing filed
      * @internal
      */
    var __occlusionDataStorage: typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage = js.native
    
    /** @internal */
    var _disposePhysicsObserver: Nullable[
        typingsJapgolly.babylonjs.miscObservableMod.Observer[typingsJapgolly.babylonjs.nodeMod.Node]
      ] = js.native
    
    /**
      * Access property
      * @internal
      */
    var _occlusionDataStorage: typingsJapgolly.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage = js.native
    
    /** @internal */
    var _physicsImpostor: Nullable[typingsJapgolly.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor] = js.native
    
    /** @internal (Backing field) */
    var _renderOutline: Boolean = js.native
    
    /** @internal (Backing field) */
    var _renderOverlay: Boolean = js.native
    
    /** @internal (Backing field) */
    var _showBoundingBox: Boolean = js.native
    
    /**
      * @internal
      * Backing Field
      */
    var _submeshesOctree: typingsJapgolly.babylonjs.cullingOctreesOctreeMod.Octree[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh] = js.native
    
    /** Apply a physic impulse to the mesh
      * @param force defines the force to apply
      * @param contactPoint defines where to apply the force
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
      */
    def applyImpulse(
      force: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      contactPoint: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
    ): typingsJapgolly.babylonjs.physicsPhysicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    
    /**
      * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
      * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
      * @param maxCapacity defines the maximum size of each block (64 by default)
      * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
      * @returns the new octree
      * @see https://www.babylonjs-playground.com/#NA4OQ#12
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    def createOrUpdateSubmeshesOctree(): typingsJapgolly.babylonjs.cullingOctreesOctreeMod.Octree[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: Double): typingsJapgolly.babylonjs.cullingOctreesOctreeMod.Octree[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): typingsJapgolly.babylonjs.cullingOctreesOctreeMod.Octree[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh] = js.native
    def createOrUpdateSubmeshesOctree(maxCapacity: Unit, maxDepth: Double): typingsJapgolly.babylonjs.cullingOctreesOctreeMod.Octree[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh] = js.native
    
    /**
      * Gets the edgesRenderer associated with the mesh
      */
    var edgesRenderer: Nullable[typingsJapgolly.babylonjs.renderingEdgesRendererMod.EdgesRenderer] = js.native
    
    /**
      * Flag to force rendering the mesh even if occluded
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var forceRenderingWhenOccluded: Boolean = js.native
    
    /**
      * Gets the current physics impostor
      * @see https://doc.babylonjs.com/features/physics_engine
      * @returns a physics impostor or null
      */
    def getPhysicsImpostor(): Nullable[typingsJapgolly.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor] = js.native
    
    /**
      * Object used to store instanced buffers defined by user
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      */
    var instancedBuffers: org.scalablytyped.runtime.StringDictionary[Any] = js.native
    
    /**
      * Gets or sets whether the mesh is occluded or not, it is used also to set the initial state of the mesh to be occluded or not
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOccluded: Boolean = js.native
    
    /**
      * Flag to check the progress status of the query
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOcclusionQueryInProgress: Boolean = js.native
    
    /**
      * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionQueryAlgorithmType: Double = js.native
    
    /**
      * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retrieved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decides to show or hide the object.
      * The default value is -1 which means don't break the query and wait till the result
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionRetryCount: Double = js.native
    
    /**
      * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
      * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query within the Mesh.
      * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
      * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionType: Double = js.native
    
    /**
      * Gets or sets impostor used for physic simulation
      * @see https://doc.babylonjs.com/features/physics_engine
      */
    var physicsImpostor: Nullable[typingsJapgolly.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor] = js.native
    
    /**
      * Gets or sets a boolean indicating if the outline must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#3
      */
    var renderOutline: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the overlay must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#2
      */
    var renderOverlay: Boolean = js.native
    
    /**
      * Creates a physic joint between two meshes
      * @param otherMesh defines the other mesh to use
      * @param pivot1 defines the pivot to use on this mesh
      * @param pivot2 defines the pivot to use on the other mesh
      * @param options defines additional options (can be plugin dependent)
      * @returns the current mesh
      * @see https://www.babylonjs-playground.com/#0BS5U0#0
      */
    def setPhysicsLinkWith(
      otherMesh: Mesh,
      pivot1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      pivot2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
    ): typingsJapgolly.babylonjs.physicsPhysicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    def setPhysicsLinkWith(
      otherMesh: Mesh,
      pivot1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      pivot2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
      options: Any
    ): typingsJapgolly.babylonjs.physicsPhysicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    
    /**
      * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
      */
    var showBoundingBox: Boolean = js.native
  }
}
