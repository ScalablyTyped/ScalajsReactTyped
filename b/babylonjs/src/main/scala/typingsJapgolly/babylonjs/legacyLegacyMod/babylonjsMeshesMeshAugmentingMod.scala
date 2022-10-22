package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.anon.Data
import typingsJapgolly.babylonjs.anon.DeepImmutableObjectMatrix
import typingsJapgolly.babylonjs.anon.Sizes
import typingsJapgolly.babylonjs.meshesMeshSimplificationMod.ISimplificationSettings
import typingsJapgolly.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesMeshAugmentingMod {
  
  @js.native
  trait Mesh extends StObject {
    
    /**
      * Invalidate VertexArrayObjects belonging to the mesh (but not to the Geometry of the mesh).
      */
    def _invalidateInstanceVertexArrayObject(): Unit = js.native
    
    /** @internal */
    def _thinInstanceCreateMatrixBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], staticBuffer: Boolean): typingsJapgolly.babylonjs.buffersBufferMod.Buffer = js.native
    
    /** @internal */
    def _thinInstanceInitializeUserStorage(): Unit = js.native
    
    /** @internal */
    def _thinInstanceUpdateBufferSize(kind: String): Unit = js.native
    def _thinInstanceUpdateBufferSize(kind: String, numInstances: Double): Unit = js.native
    
    /** @internal */
    var _userInstancedBuffersStorage: Data = js.native
    
    /** @internal */
    var _userThinInstanceBuffersStorage: Sizes = js.native
    
    /**
      * true to use the edge renderer for all instances of this mesh
      */
    var edgesShareWithInstances: Boolean = js.native
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
      * @returns an array of IParticleSystem
      */
    def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
      * @returns an array of IParticleSystem
      */
    def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    
    /**
      * Register a custom buffer that will be instanced
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      * @param kind defines the buffer kind
      * @param stride defines the stride in floats
      */
    def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
    
    /**
      * Sets the mesh material by the material or multiMaterial `id` property
      * @param id is a string identifying the material or the multiMaterial
      * @returns the current mesh
      * @deprecated Please use MeshBuilder instead Please use setMaterialById instead
      */
    def setMaterialByID(id: String): typingsJapgolly.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
    /**
      * Simplify the mesh according to the given array of settings.
      * Function will return immediately and will simplify async
      * @param settings a collection of simplification settings
      * @param parallelProcessing should all levels calculate parallel or one after the other
      * @param simplificationType the type of simplification to run
      * @param successCallback optional success callback to be called after the simplification finished processing all settings
      * @returns the current mesh
      */
    def simplify(settings: js.Array[ISimplificationSettings]): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: Unit,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsJapgolly.babylonjs.meshesMeshSimplificationMod.SimplificationType
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsJapgolly.babylonjs.meshesMeshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: Unit,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: typingsJapgolly.babylonjs.meshesMeshSimplificationMod.SimplificationType
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: typingsJapgolly.babylonjs.meshesMeshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsJapgolly.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix]): Double = js.native
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix], refresh: Boolean): Double = js.native
    /**
      * Creates a new thin instance
      * @param matrix the matrix or array of matrices (position, rotation, scale) of the thin instance(s) to create
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number. If you pass an array of matrices, other instance indexes are index+1, index+2, etc
      */
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix): Double = js.native
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix, refresh: Boolean): Double = js.native
    
    /**
      * Adds the transformation (matrix) of the current mesh as a thin instance
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number
      */
    def thinInstanceAddSelf(): Double = js.native
    def thinInstanceAddSelf(refresh: Boolean): Double = js.native
    
    /**
      * Synchronize the gpu buffers with a thin instance buffer. Call this method if you update later on the buffers passed to thinInstanceSetBuffer
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      */
    def thinInstanceBufferUpdated(kind: String): Unit = js.native
    
    /**
      * Gets / sets the number of thin instances to display. Note that you can't set a number higher than what the underlying buffer can handle.
      */
    var thinInstanceCount: Double = js.native
    
    /**
      * Gets or sets a boolean defining if we want picking to pick thin instances as well
      */
    var thinInstanceEnablePicking: Boolean = js.native
    
    /**
      * Gets the list of world matrices
      * @returns an array containing all the world matrices from the thin instances
      */
    def thinInstanceGetWorldMatrices(): js.Array[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix] = js.native
    
    /**
      * Applies a partial update to a buffer directly on the GPU
      * Note that the buffer located on the CPU is NOT updated! It's up to you to update it (or not) with the same data you pass to this method
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      * @param data the data to set in the GPU buffer
      * @param offset the offset in the GPU buffer where to update the data
      */
    def thinInstancePartialBufferUpdate(kind: String, data: js.typedarray.Float32Array, offset: Double): Unit = js.native
    
    /**
      * Refreshes the bounding info, taking into account all the thin instances defined
      * @param forceRefreshParentInfo true to force recomputing the mesh bounding info and use it to compute the aggregated bounding info
      * @param applySkeleton defines whether to apply the skeleton before computing the bounding info
      * @param applyMorph  defines whether to apply the morph target before computing the bounding info
      */
    def thinInstanceRefreshBoundingInfo(): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Boolean, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Unit, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Boolean, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Unit, applyMorph: Boolean): Unit = js.native
    
    /**
      * Registers a custom attribute to be used with thin instances
      * @param kind name of the attribute
      * @param stride size in floats of the attribute
      */
    def thinInstanceRegisterAttribute(kind: String, stride: Double): Unit = js.native
    
    /**
      * Sets the value of a custom attribute for a thin instance
      * @param kind name of the attribute
      * @param index index of the thin instance
      * @param value value to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double]): Unit = js.native
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double], refresh: Boolean): Unit = js.native
    
    /**
      * Sets a buffer to be used with thin instances. This method is a faster way to setup multiple instances than calling thinInstanceAdd repeatedly
      * @param kind name of the attribute. Use "matrix" to setup the buffer of matrices
      * @param buffer buffer to set
      * @param stride size in floats of each value of the buffer
      * @param staticBuffer indicates that the buffer is static, so that you won't change it after it is set (better performances - false by default)
      */
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array]): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Double): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Double, staticBuffer: Boolean): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Unit, staticBuffer: Boolean): Unit = js.native
    
    /**
      * Sets the matrix of a thin instance
      * @param index index of the thin instance
      * @param matrix matrix to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetMatrixAt(index: Double, matrix: DeepImmutableObjectMatrix): Unit = js.native
    def thinInstanceSetMatrixAt(index: Double, matrix: DeepImmutableObjectMatrix, refresh: Boolean): Unit = js.native
  }
}
