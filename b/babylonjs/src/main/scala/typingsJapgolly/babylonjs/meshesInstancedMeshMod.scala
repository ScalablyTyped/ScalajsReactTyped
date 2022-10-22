package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.anon.Data
import typingsJapgolly.babylonjs.anon.NewSourcedMesh
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.nodeMod.Node
import typingsJapgolly.babylonjs.typesMod.IndicesArray
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesInstancedMeshMod {
  
  @JSImport("babylonjs/Meshes/instancedMesh", "InstancedMesh")
  @js.native
  open class InstancedMesh protected () extends AbstractMesh {
    def this(name: String, source: Mesh) = this()
    
    /* private */ var _billboardWorldMatrix: Any = js.native
    
    /* private */ var _currentLOD: Any = js.native
    
    /** @internal */
    var _distanceToCamera: Double = js.native
    
    /** @internal */
    var _indexInSourceMeshInstanceArray: Double = js.native
    
    /** @internal */
    var _previousWorldMatrix: Nullable[Matrix] = js.native
    
    def _removeLightSource(): Unit = js.native
    
    def _resyncLightSource(): Unit = js.native
    
    /* private */ var _sourceMesh: Any = js.native
    
    /** @internal */
    def _syncSubMeshes(): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh from the current mesh.
      *
      * Returns the clone.
      * @param name the cloned mesh name
      * @param newParent the optional Node to parent the clone to.
      * @param doNotCloneChildren if `true` the model children aren't cloned.
      * @param newSourceMesh if set this mesh will be used as the source mesh instead of ths instance's one
      * @returns the clone
      */
    def clone(name: String): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Boolean, newSourceMesh: Mesh): InstancedMesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Unit, newSourceMesh: Mesh): InstancedMesh = js.native
    
    /**
      * Creates a new InstancedMesh object from the mesh model.
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      * @param name defines the name of the new instance
      * @returns a new InstancedMesh
      */
    def createInstance(name: String): InstancedMesh = js.native
    
    def instantiateHierarchy(newParent: Unit, options: NewSourcedMesh): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Unit,
      options: NewSourcedMesh,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    def instantiateHierarchy(newParent: Nullable[TransformNode], options: NewSourcedMesh): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Nullable[TransformNode],
      options: NewSourcedMesh,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    
    /**
      * Sets the mesh indices.
      * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
      * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
      * This method creates a new index buffer each call.
      * Returns the Mesh.
      * @param indices
      * @param totalVertices
      */
    def setIndices(indices: IndicesArray): Mesh = js.native
    
    /**
      * The source mesh of the instance
      */
    def sourceMesh: Mesh = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Object used to store instanced buffers defined by user
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        */
      var instancedBuffers: StringDictionary[Any]
    }
    object AbstractMesh {
      
      inline def apply(instancedBuffers: StringDictionary[Any]): typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      extension [Self <: typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh](x: Self) {
        
        inline def setInstancedBuffers(value: StringDictionary[Any]): Self = StObject.set(x, "instancedBuffers", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    trait Mesh extends StObject {
      
      /**
        * Invalidate VertexArrayObjects belonging to the mesh (but not to the Geometry of the mesh).
        */
      def _invalidateInstanceVertexArrayObject(): Unit
      
      /** @internal */
      var _userInstancedBuffersStorage: Data
      
      /**
        * true to use the edge renderer for all instances of this mesh
        */
      var edgesShareWithInstances: Boolean
      
      /**
        * Register a custom buffer that will be instanced
        * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
        * @param kind defines the buffer kind
        * @param stride defines the stride in floats
        */
      def registerInstancedBuffer(kind: String, stride: Double): Unit
    }
    object Mesh {
      
      inline def apply(
        _invalidateInstanceVertexArrayObject: Callback,
        _userInstancedBuffersStorage: Data,
        edgesShareWithInstances: Boolean,
        registerInstancedBuffer: (String, Double) => Callback
      ): typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = {
        val __obj = js.Dynamic.literal(_invalidateInstanceVertexArrayObject = _invalidateInstanceVertexArrayObject.toJsFn, _userInstancedBuffersStorage = _userInstancedBuffersStorage.asInstanceOf[js.Any], edgesShareWithInstances = edgesShareWithInstances.asInstanceOf[js.Any], registerInstancedBuffer = js.Any.fromFunction2((t0: String, t1: Double) => (registerInstancedBuffer(t0, t1)).runNow()))
        __obj.asInstanceOf[typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh]
      }
      
      extension [Self <: typingsJapgolly.babylonjs.meshesInstancedMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh](x: Self) {
        
        inline def setEdgesShareWithInstances(value: Boolean): Self = StObject.set(x, "edgesShareWithInstances", value.asInstanceOf[js.Any])
        
        inline def setRegisterInstancedBuffer(value: (String, Double) => Callback): Self = StObject.set(x, "registerInstancedBuffer", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
        
        inline def set_invalidateInstanceVertexArrayObject(value: Callback): Self = StObject.set(x, "_invalidateInstanceVertexArrayObject", value.toJsFn)
        
        inline def set_userInstancedBuffersStorage(value: Data): Self = StObject.set(x, "_userInstancedBuffersStorage", value.asInstanceOf[js.Any])
      }
    }
  }
}
