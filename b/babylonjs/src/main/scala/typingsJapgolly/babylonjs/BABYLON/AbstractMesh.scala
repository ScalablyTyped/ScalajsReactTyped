package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.anon.FreezeWorldMatrix
import typingsJapgolly.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMesh
  extends StObject
     with TransformNode
     with IDisposable
     with ICullable
     with IGetSetVerticesData {
  
  /**
    * Backing filed
    * @internal
    */
  var __occlusionDataStorage: OcclusionDataStorage = js.native
  
  /**
    * @internal
    */
  def _activate(renderId: Double, intermediateRendering: Boolean): Boolean = js.native
  
  /** @internal */
  var _bonesTransformMatrices: Nullable[js.typedarray.Float32Array] = js.native
  
  /* protected */ var _boundingInfo: Nullable[BoundingInfo] = js.native
  
  /* protected */ var _boundingInfoIsDirty: Boolean = js.native
  
  /* protected */ def _buildUniformLayout(): Unit = js.native
  
  /**
    * @internal
    */
  def _checkCollision(collider: Collider): AbstractMesh = js.native
  
  /** @internal */
  def _checkOcclusionQuery(): Boolean = js.native
  
  /**
    * @internal
    */
  def _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh = js.native
  
  /** @internal */
  var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
  
  /** @internal */
  var _edgesRenderer: Nullable[IEdgesRenderer] = js.native
  
  /** @internal */
  def _freeze(): Unit = js.native
  
  /** @internal */
  def _generatePointsArray(): Boolean = js.native
  
  /**
    * Internal function to get buffer data and possibly apply morphs and normals
    * @param applySkeleton
    * @param applyMorph
    * @param data
    * @param kind the kind of data you want. Can be Normal or Position
    */
  /* private */ var _getData: Any = js.native
  
  /**
    * @internal
    */
  def _getPositionData(applySkeleton: Boolean, applyMorph: Boolean): Nullable[FloatArray] = js.native
  
  /** @internal */
  /* private */ var _initFacetData: Any = js.native
  
  /** @internal */
  var _internalAbstractMeshDataInfo: InternalAbstractMeshDataInfo = js.native
  
  /** @internal */
  var _intersectionsInProgress: js.Array[AbstractMesh] = js.native
  
  /** @internal */
  var _lightSources: js.Array[Light] = js.native
  
  /** @internal */
  def _markSubMeshesAsAttributesDirty(): Unit = js.native
  
  /* private */ var _markSubMeshesAsDirty: Any = js.native
  
  /**
    * @internal
    */
  def _markSubMeshesAsLightDirty(): Unit = js.native
  def _markSubMeshesAsLightDirty(dispose: Boolean): Unit = js.native
  
  /** @internal */
  def _markSubMeshesAsMiscDirty(): Unit = js.native
  
  /** @internal */
  var _masterMesh: Nullable[AbstractMesh] = js.native
  
  /**
    * Access property
    * @internal
    */
  var _occlusionDataStorage: OcclusionDataStorage = js.native
  
  /** @internal */
  var _occlusionQuery: Nullable[WebGLQuery | Double] = js.native
  
  /* private */ var _onCollisionPositionChange: Any = js.native
  
  /** @internal */
  var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
  
  /** @internal */
  def _positions: Nullable[js.Array[Vector3]] = js.native
  
  /** @internal */
  def _postActivate(): Unit = js.native
  
  /** @internal */
  def _preActivate(): Unit = js.native
  
  /**
    * @internal
    */
  def _preActivateForIntermediateRendering(renderId: Double): Unit = js.native
  
  /**
    * @internal
    */
  def _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh = js.native
  
  /**
    * @internal
    */
  def _rebuild(): Unit = js.native
  def _rebuild(dispose: Boolean): Unit = js.native
  
  /**
    * @internal
    */
  def _refreshBoundingInfo(data: Nullable[FloatArray], bias: Nullable[Vector2]): Unit = js.native
  
  /**
    * @internal
    */
  def _removeLightSource(light: Light, dispose: Boolean): Unit = js.native
  
  /** @internal */
  var _renderId: Double = js.native
  
  /** @internal (Backing field) */
  var _renderOutline: Boolean = js.native
  
  /** @internal (Backing field) */
  var _renderOverlay: Boolean = js.native
  
  /** @internal */
  var _renderingGroup: Nullable[RenderingGroup] = js.native
  
  /**
    * @internal
    */
  def _resyncLightSource(light: Light): Unit = js.native
  
  /** @internal */
  def _resyncLightSources(): Unit = js.native
  
  /** @internal */
  def _shouldConvertRHS(): Boolean = js.native
  
  /** @internal (Backing field) */
  var _showBoundingBox: Boolean = js.native
  
  /**
    * @internal
    * Backing Field
    */
  var _submeshesOctree: Octree[SubMesh] = js.native
  
  /** @internal */
  def _syncGeometryWithMorphTargetManager(): Unit = js.native
  
  /** @internal */
  var _transformMatrixTexture: Nullable[RawTexture] = js.native
  
  /** @internal */
  def _unBindEffect(): Unit = js.native
  
  /** @internal */
  def _unFreeze(): Unit = js.native
  
  /** @internal */
  var _unIndexed: Boolean = js.native
  
  /**
    * The current mesh uniform buffer.
    * @internal Internal use only.
    */
  var _uniformBuffer: UniformBuffer = js.native
  
  /** @internal */
  def _updateBoundingInfo(): AbstractMesh = js.native
  
  /**
    * @internal
    */
  def _updateSubMeshesBoundingInfo(matrix: DeepImmutable[Matrix]): AbstractMesh = js.native
  
  /** @internal */
  var _waitingData: FreezeWorldMatrix = js.native
  
  /** @internal */
  var _waitingMaterialId: Nullable[String] = js.native
  
  /**
    * Gets or sets the current action manager
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions
    */
  var actionManager: Nullable[AbstractActionManager] = js.native
  
  /**
    * Adds the passed mesh as a child to the current mesh
    * @param mesh defines the child mesh
    * @param preserveScalingSign if true, keep scaling sign of child. Otherwise, scaling sign might change.
    * @returns the current mesh
    */
  def addChild(mesh: AbstractMesh): AbstractMesh = js.native
  def addChild(mesh: AbstractMesh, preserveScalingSign: Boolean): AbstractMesh = js.native
  
  /**
    * Align the mesh with a normal
    * @param normal defines the normal to use
    * @param upDirection can be used to redefined the up vector to use (will use the (0, 1, 0) by default)
    * @returns the current mesh
    */
  def alignWithNormal(normal: Vector3): AbstractMesh = js.native
  def alignWithNormal(normal: Vector3, upDirection: Vector3): AbstractMesh = js.native
  
  /** Gets or sets the alpha index used to sort transparent meshes
    * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#alpha-index
    */
  var alphaIndex: Double = js.native
  
  /**
    * True if the mesh must be rendered in any case (this will shortcut the frustum clipping phase)
    */
  var alwaysSelectAsActiveMesh: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh will allow fog to be rendered on it (true by default) */
  def applyFog: Boolean = js.native
  def applyFog_=(value: Boolean): Unit = js.native
  
  /** Apply a physic impulse to the mesh
    * @param force defines the force to apply
    * @param contactPoint defines where to apply the force
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
    */
  def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
  
  /**
    * Gets or sets the baked vertex animation manager
    * @see https://doc.babylonjs.com/divingDeeper/animation/baked_texture_animations
    */
  def bakedVertexAnimationManager: Nullable[IBakedVertexAnimationManager] = js.native
  def bakedVertexAnimationManager_=(value: Nullable[IBakedVertexAnimationManager]): Unit = js.native
  
  /**
    * Creates a new bounding info for the mesh
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    * @returns the new bounding info
    */
  def buildBoundingInfo(minimum: DeepImmutable[Vector3], maximum: DeepImmutable[Vector3]): BoundingInfo = js.native
  def buildBoundingInfo(
    minimum: DeepImmutable[Vector3],
    maximum: DeepImmutable[Vector3],
    worldMatrix: DeepImmutable[Matrix]
  ): BoundingInfo = js.native
  
  /**
    * Calculate relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the new displacement vector
    */
  def calcMovePOV(amountRight: Double, amountUp: Double, amountForward: Double): Vector3 = js.native
  
  /**
    * Calculate relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward.
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the new rotation vector
    */
  def calcRotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Vector3 = js.native
  
  /**
    * Gets or sets a boolean indicating that this mesh can be used in the collision engine
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  def checkCollisions: Boolean = js.native
  def checkCollisions_=(collisionEnabled: Boolean): Unit = js.native
  
  /**
    * Gets Collider object used to compute collisions (not physics)
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  def collider: Nullable[Collider] = js.native
  
  /**
    * Gets or sets the current collision group mask (-1 by default).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  def collisionGroup: Double = js.native
  def collisionGroup_=(mask: Double): Unit = js.native
  
  /**
    * Gets or sets a collision mask used to mask collisions (default is -1).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  def collisionMask: Double = js.native
  def collisionMask_=(mask: Double): Unit = js.native
  
  /**
    * Gets or sets a collision response flag (default is true).
    * when collisionResponse is false, events are still triggered but colliding entity has no response
    * This helps creating trigger volume when user wants collision feedback events but not position/velocity
    * to respond to the collision.
    */
  def collisionResponse: Boolean = js.native
  def collisionResponse_=(response: Boolean): Unit = js.native
  
  /** number of collision detection tries. Change this value if not all collisions are detected and handled properly */
  def collisionRetryCount: Double = js.native
  def collisionRetryCount_=(retryCount: Double): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that bone animations must be computed by the CPU (false by default)
    */
  def computeBonesUsingShaders: Boolean = js.native
  def computeBonesUsingShaders_=(value: Boolean): Unit = js.native
  
  /**
    * Creates new normals data for the mesh
    * @param updatable defines if the normal vertex buffer must be flagged as updatable
    * @returns the current mesh
    */
  def createNormals(updatable: Boolean): AbstractMesh = js.native
  
  /**
    * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
    * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
    * @param maxCapacity defines the maximum size of each block (64 by default)
    * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
    * @returns the new octree
    * @see https://www.babylonjs-playground.com/#NA4OQ#12
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    */
  def createOrUpdateSubmeshesOctree(): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Unit, maxDepth: Double): Octree[SubMesh] = js.native
  
  /**
    * The culling strategy to use to check whether the mesh must be rendered or not.
    * This value can be changed at any time and will be used on the next render mesh selection.
    * The possible values are :
    * - AbstractMesh.CULLINGSTRATEGY_STANDARD
    * - AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY
    * Please read each static variable documentation to get details about the culling process.
    * */
  var cullingStrategy: Double = js.native
  
  /**
    * Gets or sets the orientation for POV movement & rotation
    */
  var definedFacingForward: Boolean = js.native
  
  /**
    * Disables the mesh edge rendering mode
    * @returns the currentAbstractMesh
    */
  def disableEdgesRendering(): AbstractMesh = js.native
  
  /**
    * Disables the feature FacetData and frees the related memory
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def disableFacetData(): AbstractMesh = js.native
  
  /**
    * Releases resources associated with this node.
    * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
    * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the bounding info does not need to be kept in sync (for performance reason)
    */
  var doNotSyncBoundingInfo: Boolean = js.native
  
  /**
    * Defines edge color used when edgesRenderer is enabled
    * @see https://www.babylonjs-playground.com/#10OJSG#13
    */
  var edgesColor: Color4 = js.native
  
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer] = js.native
  
  /**
    * Defines edge width used when edgesRenderer is enabled
    * @see https://www.babylonjs-playground.com/#10OJSG#13
    */
  var edgesWidth: Double = js.native
  
  /**
    * Gets or sets the ellipsoid used to impersonate this mesh when using collision engine (default is (0.5, 1, 0.5))
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoid: Vector3 = js.native
  
  /**
    * Gets or sets the ellipsoid offset used to impersonate this mesh when using collision engine (default is (0, 0, 0))
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoidOffset: Vector3 = js.native
  
  /** When enabled, decompose picking matrices for better precision with large values for mesh position and scling */
  def enableDistantPicking: Boolean = js.native
  def enableDistantPicking_=(value: Boolean): Unit = js.native
  
  /**
    * Enables the edge rendering mode on the mesh.
    * This mode makes the mesh edges visible
    * @param epsilon defines the maximal distance between two angles to detect a face
    * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
    * @param options options to the edge renderer
    * @returns the currentAbstractMesh
    * @see https://www.babylonjs-playground.com/#19O9TU#0
    */
  def enableEdgesRendering(): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean, options: IEdgesRendererOptions): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Unit, options: IEdgesRendererOptions): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean, options: IEdgesRendererOptions): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Unit, options: IEdgesRendererOptions): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating that pointer move events must be supported on this mesh (false by default)
    */
  var enablePointerMoveEvents: Boolean = js.native
  
  /**
    * The location (Vector3) where the facet depth sort must be computed from.
    * By default, the active camera position.
    * Used only when facet depth sort is enabled
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  def facetDepthSortFrom: Vector3 = js.native
  def facetDepthSortFrom_=(location: Vector3): Unit = js.native
  
  /**
    * Gets the number of facets in the mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  def facetNb: Double = js.native
  
  /**
    * Flag to force rendering the mesh even if occluded
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var forceRenderingWhenOccluded: Boolean = js.native
  
  /**
    * Returns the mesh BoundingInfo object or creates a new one and returns if it was undefined.
    * Note that it returns a shallow bounding of the mesh (i.e. it does not include children).
    * To get the full bounding of all children, call `getHierarchyBoundingVectors` instead.
    * @returns a BoundingInfo
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @param projected sets as the (x,y,z) world projection on the facet
    * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
    * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
    * @returns the face index if found (or null instead)
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
  
  /**
    * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @param projected sets as the (x,y,z) local projection on the facet
    * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
    * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
    * @returns the face index if found (or null instead)
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
  
  /**
    * This function returns all of the particle systems in the scene that use the mesh as an emitter.
    * @returns an array of particle systems in the scene that use the mesh as an emitter
    */
  def getConnectedParticleSystems(): js.Array[IParticleSystem] = js.native
  
  /**
    * Returns the object "parameter" set with all the expected parameters for facetData computation by ComputeNormals()
    * @returns the parameters
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetDataParameters(): Any = js.native
  
  /**
    * Returns the facetLocalNormals array.
    * The normals are expressed in the mesh local spac
    * @returns an array of Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalNormals(): js.Array[Vector3] = js.native
  
  /**
    * Returns the facetLocalPartitioning array
    * @returns an array of array of numbers
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPartitioning(): js.Array[js.Array[Double]] = js.native
  
  /**
    * Returns the facetLocalPositions array.
    * The facet positions are expressed in the mesh local space
    * @returns an array of Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPositions(): js.Array[Vector3] = js.native
  
  /**
    * Returns the i-th facet normal in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormal(i: Double): Vector3 = js.native
  
  /**
    * Sets the reference Vector3 with the i-th facet normal in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormalToRef(i: Double, ref: Vector3): this.type = js.native
  
  /**
    * Returns the i-th facet position in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPosition(i: Double): Vector3 = js.native
  
  /**
    * Sets the reference Vector3 with the i-th facet position in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPositionToRef(i: Double, ref: Vector3): AbstractMesh = js.native
  
  /**
    * Returns the facets (in an array) in the same partitioning block than the one the passed coordinates are located (expressed in the mesh local system)
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the array of facet indexes
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetsAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[js.Array[Double]] = js.native
  
  /**
    * Returns the mesh itself by default. Implemented by child classes
    * @param camera defines the camera to use to pick the right LOD level
    * @returns the currentAbstractMesh
    */
  def getLOD(camera: Camera): Nullable[AbstractMesh] = js.native
  
  /**
    * Gets the material used to render the mesh in a specific render pass
    * @param renderPassId render pass id
    * @returns material used for the render pass. If no specific material is used for this render pass, undefined is returned (meaning mesh.material is used for this pass)
    */
  def getMaterialForRenderPass(renderPassId: Double): js.UndefOr[Material] = js.native
  
  /**
    * Gets the mesh uniform buffer.
    * @returns the uniform buffer of the mesh.
    */
  def getMeshUniformBuffer(): UniformBuffer = js.native
  
  /**
    * Get the normals vertex data and optionally apply skeleton and morphing.
    * @param applySkeleton defines whether to apply the skeleton
    * @param applyMorph  defines whether to apply the morph target
    * @returns the normals data
    */
  def getNormalsData(): Nullable[FloatArray] = js.native
  def getNormalsData(applySkeleton: Boolean): Nullable[FloatArray] = js.native
  def getNormalsData(applySkeleton: Boolean, applyMorph: Boolean): Nullable[FloatArray] = js.native
  def getNormalsData(applySkeleton: Unit, applyMorph: Boolean): Nullable[FloatArray] = js.native
  
  /**
    * Gets the current physics impostor
    * @see https://doc.babylonjs.com/features/physics_engine
    * @returns a physics impostor or null
    */
  def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
  
  /**
    * Get the position vertex data and optionally apply skeleton and morphing.
    * @param applySkeleton defines whether to apply the skeleton
    * @param applyMorph  defines whether to apply the morph target
    * @param data defines the position data to apply the skeleton and morph to
    * @returns the position data
    */
  def getPositionData(): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Boolean): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Boolean, applyMorph: Boolean): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Boolean, applyMorph: Boolean, data: Nullable[FloatArray]): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Boolean, applyMorph: Unit, data: Nullable[FloatArray]): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Unit, applyMorph: Boolean): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Unit, applyMorph: Boolean, data: Nullable[FloatArray]): Nullable[FloatArray] = js.native
  def getPositionData(applySkeleton: Unit, applyMorph: Unit, data: Nullable[FloatArray]): Nullable[FloatArray] = js.native
  
  /**
    * Returns a positive integer : the total number of indices in this mesh geometry.
    * @returns the number of indices or zero if the mesh has no geometry.
    */
  def getTotalIndices(): Double = js.native
  
  /**
    * Returns 0 by default. Implemented by child classes
    * @returns an integer
    */
  def getTotalVertices(): Double = js.native
  
  /**
    * Returns true if there is already a bounding info
    */
  def hasBoundingInfo: Boolean = js.native
  
  /**
    * Gets a boolean indicating if this mesh has instances
    */
  def hasInstances: Boolean = js.native
  
  /**
    * Gets a boolean indicating if this mesh has thin instances
    */
  def hasThinInstances: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh contains vertex color data with alpha values */
  def hasVertexAlpha: Boolean = js.native
  def hasVertexAlpha_=(value: Boolean): Unit = js.native
  
  /**
    * Object used to store instanced buffers defined by user
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    */
  var instancedBuffers: org.scalablytyped.runtime.StringDictionary[Any] = js.native
  
  /**
    * Checks if the passed Ray intersects with the mesh
    * @param ray defines the ray to use
    * @param fastCheck defines if fast mode (but less precise) must be used (false by default)
    * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
    * @param onlyBoundingInfo defines a boolean indicating if picking should only happen using bounding info (false by default)
    * @param worldToUse defines the world matrix to use to get the world coordinate of the intersection point
    * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
    * @returns the picking info
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    */
  def intersects(ray: Ray): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: Unit, onlyBoundingInfo: Boolean): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: Unit,
    onlyBoundingInfo: Boolean,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: Unit,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: Unit,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: Unit,
    onlyBoundingInfo: Unit,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: Unit, onlyBoundingInfo: Unit, worldToUse: Matrix): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: Unit,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Boolean): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: Unit,
    onlyBoundingInfo: Boolean,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Boolean, worldToUse: Matrix): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: Unit,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: Unit,
    onlyBoundingInfo: Unit,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Unit, worldToUse: Matrix): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: Unit,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: TrianglePickingPredicate, onlyBoundingInfo: Boolean): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Unit,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Unit,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  
  /**
    * True if the mesh intersects another mesh or a SolidParticle object
    * @param mesh defines a target mesh or SolidParticle to test
    * @param precise Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
    * @param includeDescendants Can be set to true to test if the mesh defined in parameters intersects with the current mesh or any child meshes
    * @returns true if there is an intersection
    */
  def intersectsMesh(mesh: AbstractMesh): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Boolean): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Unit, includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: Unit, includeDescendants: Boolean): Boolean = js.native
  
  /**
    * Returns true if the passed point (Vector3) is inside the mesh bounding box
    * @param point defines the point to test
    * @returns true if there is an intersection
    */
  def intersectsPoint(point: Vector3): Boolean = js.native
  
  /**
    * Gets a boolean indicating if this mesh is an instance or a regular mesh
    */
  def isAnInstance: Boolean = js.native
  
  /**
    * Returns true if the mesh is blocked. Implemented by child classes
    */
  def isBlocked: Boolean = js.native
  
  /** Gets or sets a boolean indicating if the mesh must be considered as a ray blocker for lens flares (false by default)
    * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var isBlocker: Boolean = js.native
  
  /**
    * gets a boolean indicating if facetData is enabled
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  def isFacetDataEnabled: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh can be near grabbed. Default is false
    */
  var isNearGrabbable: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh can be near picked. Default is false
    */
  var isNearPickable: Boolean = js.native
  
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
    * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
    */
  var isPickable: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh is visible (renderable). Default is true
    */
  var isVisible: Boolean = js.native
  
  /**
    * Gets or sets the current layer mask (default is 0x0FFFFFFF)
    * @see https://doc.babylonjs.com/divingDeeper/cameras/layerMasksAndMultiCam
    */
  def layerMask: Double = js.native
  def layerMask_=(value: Double): Unit = js.native
  
  /** Gets the list of lights affecting that mesh */
  def lightSources: js.Array[Light] = js.native
  
  /** Gets or sets current material */
  def material: Nullable[Material] = js.native
  def material_=(value: Nullable[Material]): Unit = js.native
  
  /**
    * Gets or sets the morph target manager
    * @see https://doc.babylonjs.com/how_to/how_to_use_morphtargets
    */
  def morphTargetManager: Nullable[MorphTargetManager] = js.native
  def morphTargetManager_=(value: Nullable[MorphTargetManager]): Unit = js.native
  
  /**
    * Perform relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the current mesh
    */
  def movePOV(amountRight: Double, amountUp: Double, amountForward: Double): AbstractMesh = js.native
  
  /**
    * Move the mesh using collision engine
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    * @param displacement defines the requested displacement vector
    * @returns the current mesh
    */
  def moveWithCollisions(displacement: Vector3): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating that the facets must be depth sorted on next call to `updateFacetData()`.
    * Works only for updatable meshes.
    * Doesn't work with multi-materials
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  def mustDepthSortFacets: Boolean = js.native
  def mustDepthSortFacets_=(sort: Boolean): Unit = js.native
  
  /** Gets or sets the number of allowed bone influences per vertex (4 by default) */
  def numBoneInfluencers: Double = js.native
  def numBoneInfluencers_=(value: Double): Unit = js.native
  
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
    * An event triggered when this mesh collides with another one
    */
  var onCollideObservable: Observable[AbstractMesh] = js.native
  
  /** Set a function to call when this mesh collides with another one */
  def onCollide_=(callback: js.Function1[/* collidedMesh */ js.UndefOr[this.type], Unit]): Unit = js.native
  
  /**
    * An event triggered when the collision's position changes
    */
  var onCollisionPositionChangeObservable: Observable[Vector3] = js.native
  
  /** Set a function to call when the collision's position changes */
  def onCollisionPositionChange_=(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * An event triggered when material is changed
    */
  var onMaterialChangedObservable: Observable[AbstractMesh] = js.native
  
  /**
    * An event triggered when the mesh is rebuilt.
    */
  var onRebuildObservable: Observable[AbstractMesh] = js.native
  
  /** Defines color to use when rendering outline */
  var outlineColor: Color3 = js.native
  
  /** Define width to use when rendering outline */
  var outlineWidth: Double = js.native
  
  /** Defines alpha to use when rendering overlay */
  var overlayAlpha: Double = js.native
  
  /** Defines color to use when rendering overlay */
  var overlayColor: Color3 = js.native
  
  /**
    * The ratio (float) to apply to the bounding box size to set to the partitioning space.
    * Ex : 1.01 (default) the partitioning space is 1% bigger than the bounding box
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  def partitioningBBoxRatio: Double = js.native
  def partitioningBBoxRatio_=(ratio: Double): Unit = js.native
  
  /**
    * Gets or set the number (integer) of subdivisions per axis in the partitioning space
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  def partitioningSubdivisions: Double = js.native
  def partitioningSubdivisions_=(nb: Double): Unit = js.native
  
  /**
    * Gets or sets impostor used for physic simulation
    * @see https://doc.babylonjs.com/features/physics_engine
    */
  var physicsImpostor: Nullable[PhysicsImpostor] = js.native
  
  /**
    * Gets or sets the property which disables the test that is checking that the mesh under the pointer is the same than the previous time we tested for it (default: false).
    * Set this property to true if you want thin instances picking to be reported accurately when moving over the mesh.
    * Note that setting this property to true will incur some performance penalties when dealing with pointer events for this mesh so use it sparingly.
    */
  def pointerOverDisableMeshTesting: Boolean = js.native
  def pointerOverDisableMeshTesting_=(disable: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that this mesh can receive realtime shadows
    * @see https://doc.babylonjs.com/babylon101/shadows
    */
  def receiveShadows: Boolean = js.native
  def receiveShadows_=(value: Boolean): Unit = js.native
  
  /**
    * This method recomputes and sets a new BoundingInfo to the mesh unless it is locked.
    * This means the mesh underlying bounding box and sphere are recomputed.
    * @param applySkeleton defines whether to apply the skeleton before computing the bounding info
    * @param applyMorph  defines whether to apply the morph target before computing the bounding info
    * @returns the current mesh
    */
  def refreshBoundingInfo(): AbstractMesh = js.native
  def refreshBoundingInfo(applySkeleton: Boolean): AbstractMesh = js.native
  def refreshBoundingInfo(applySkeleton: Boolean, applyMorph: Boolean): AbstractMesh = js.native
  def refreshBoundingInfo(applySkeleton: Unit, applyMorph: Boolean): AbstractMesh = js.native
  
  /**
    * Disposes all the submeshes of the current meshnp
    * @returns the current mesh
    */
  def releaseSubMeshes(): AbstractMesh = js.native
  
  /**
    * Removes the passed mesh from the current mesh children list
    * @param mesh defines the child mesh
    * @param preserveScalingSign if true, keep scaling sign of child. Otherwise, scaling sign might change.
    * @returns the current mesh
    */
  def removeChild(mesh: AbstractMesh): AbstractMesh = js.native
  def removeChild(mesh: AbstractMesh, preserveScalingSign: Boolean): AbstractMesh = js.native
  
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
    * Specifies the rendering group id for this mesh (0 by default)
    * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
    */
  def renderingGroupId: Double = js.native
  def renderingGroupId_=(value: Double): Unit = js.native
  
  /**
    * Resets the draw wrappers cache for all submeshes of this abstract mesh
    * @param passId If provided, releases only the draw wrapper corresponding to this render pass id
    */
  def resetDrawCache(): Unit = js.native
  def resetDrawCache(passId: Double): Unit = js.native
  
  /**
    * Perform relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the current mesh
    */
  def rotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): AbstractMesh = js.native
  
  /**
    * Overwrite the current bounding info
    * @param boundingInfo defines the new bounding info
    * @returns the current mesh
    */
  def setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh = js.native
  
  /**
    * Sets the material to be used to render the mesh in a specific render pass
    * @param renderPassId render pass id
    * @param material material to use for this render pass. If undefined is passed, no specific material will be used for this render pass but the regular material will be used instead (mesh.material)
    */
  def setMaterialForRenderPass(renderPassId: Double): Unit = js.native
  def setMaterialForRenderPass(renderPassId: Double, material: Material): Unit = js.native
  
  /**
    * Creates a physic joint between two meshes
    * @param otherMesh defines the other mesh to use
    * @param pivot1 defines the pivot to use on this mesh
    * @param pivot2 defines the pivot to use on the other mesh
    * @param options defines additional options (can be plugin dependent)
    * @returns the current mesh
    * @see https://www.babylonjs-playground.com/#0BS5U0#0
    */
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): AbstractMesh = js.native
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: Any): AbstractMesh = js.native
  
  /**
    * Sets the vertex data of the mesh geometry for the requested `kind`.
    * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
    * Note that a new underlying VertexBuffer object is created each call.
    * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
    * @param kind defines vertex data kind:
    * * VertexBuffer.PositionKind
    * * VertexBuffer.UVKind
    * * VertexBuffer.UV2Kind
    * * VertexBuffer.UV3Kind
    * * VertexBuffer.UV4Kind
    * * VertexBuffer.UV5Kind
    * * VertexBuffer.UV6Kind
    * * VertexBuffer.ColorKind
    * * VertexBuffer.MatricesIndicesKind
    * * VertexBuffer.MatricesIndicesExtraKind
    * * VertexBuffer.MatricesWeightsKind
    * * VertexBuffer.MatricesWeightsExtraKind
    * @param data defines the data source
    * @param updatable defines if the data must be flagged as updatable (or static)
    * @param stride defines the vertex stride (size of an entire vertex). Can be null and in this case will be deduced from vertex data kind
    * @returns the current mesh
    */
  def setVerticesData(kind: String, data: FloatArray): AbstractMesh = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Boolean, stride: Double): AbstractMesh = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Unit, stride: Double): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean = js.native
  
  /** Gets or sets a boolean indicating that bounding boxes of subMeshes must be rendered as well (false by default) */
  var showSubMeshesBoundingBox: Boolean = js.native
  
  def skeleton: Nullable[Skeleton] = js.native
  /**
    * Gets or sets a skeleton to apply skinning transformations
    * @see https://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  def skeleton_=(value: Nullable[Skeleton]): Unit = js.native
  
  /**
    * Gets or sets the list of subMeshes
    * @see https://doc.babylonjs.com/how_to/multi_materials
    */
  var subMeshes: js.Array[SubMesh] = js.native
  
  /**
    * Gets or sets current surrounding meshes (null by default).
    *
    * By default collision detection is tested against every mesh in the scene.
    * It is possible to set surroundingMeshes to a defined list of meshes and then only these specified
    * meshes will be tested for the collision.
    *
    * Note: if set to an empty array no collision will happen when this mesh is moved.
    */
  def surroundingMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  def surroundingMeshes_=(meshes: Nullable[js.Array[AbstractMesh]]): Unit = js.native
  
  def toString(fullDetails: Boolean): String = js.native
  
  /**
    * Transfer the mesh values to its UBO.
    * @param world The world matrix associated with the mesh
    */
  def transferToEffect(world: Matrix): Unit = js.native
  
  /**
    * Updates the mesh facetData arrays and the internal partitioning when the mesh is morphed or updated.
    * This method can be called within the render loop.
    * You don't need to call this method by yourself in the render loop when you update/morph a mesh with the methods CreateXXX() as they automatically manage this computation
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def updateFacetData(): AbstractMesh = js.native
  
  /**
    * Updates the AbstractMesh indices array
    * @param indices defines the data source
    * @param offset defines the offset in the index buffer where to store the new data (can be null)
    * @param gpuMemoryOnly defines a boolean indicating that only the GPU memory must be updated leaving the CPU version of the indices unchanged (false by default)
    * @returns the current mesh
    */
  def updateIndices(indices: IndicesArray): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: Double): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: Double, gpuMemoryOnly: Boolean): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: Unit, gpuMemoryOnly: Boolean): AbstractMesh = js.native
  
  /** Gets a boolean indicating if this mesh has skinning data and an attached skeleton */
  def useBones: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes collision (true by default) */
  var useOctreeForCollisions: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes picking (true by default) */
  var useOctreeForPicking: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes selection (true by default) */
  var useOctreeForRenderingSelection: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh needs to use vertex color data to render (if this kind of vertex data is available in the geometry) */
  def useVertexColors: Boolean = js.native
  def useVertexColors_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  def visibility: Double = js.native
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  def visibility_=(value: Double): Unit = js.native
}
