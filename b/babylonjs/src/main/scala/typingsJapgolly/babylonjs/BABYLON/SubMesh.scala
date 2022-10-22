package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMesh
  extends StObject
     with ICullable {
  
  /**
    * Returns true if this submesh covers the entire parent mesh
    * @ignorenaming
    */
  def IsGlobal: Boolean = js.native
  
  /** @internal */
  var _alphaIndex: Double = js.native
  
  /* private */ var _boundingInfo: Any = js.native
  
  /**
    * @internal
    */
  def _checkCollision(collider: Collider): Boolean = js.native
  
  /* private */ var _currentMaterial: Any = js.native
  
  /** @internal */
  var _distanceToCamera: Double = js.native
  
  /** @internal */
  def _drawWrapper: DrawWrapper = js.native
  
  /** @internal */
  def _drawWrapperOverride: Nullable[DrawWrapper] = js.native
  
  /** @internal */
  var _drawWrappers: js.Array[DrawWrapper] = js.native
  
  /* private */ var _engine: Any = js.native
  
  /**
    * @internal
    */
  def _getDrawWrapper(): js.UndefOr[DrawWrapper] = js.native
  def _getDrawWrapper(passId: Double): js.UndefOr[DrawWrapper] = js.native
  def _getDrawWrapper(passId: Double, createIfNotExisting: Boolean): js.UndefOr[DrawWrapper] = js.native
  def _getDrawWrapper(passId: Unit, createIfNotExisting: Boolean): js.UndefOr[DrawWrapper] = js.native
  
  /**
    * @internal
    */
  def _getLinesIndexBuffer(indices: IndicesArray, engine: Engine): DataBuffer = js.native
  
  /** @internal */
  var _id: Double = js.native
  
  /**
    * @internal
    */
  /* private */ var _intersectLines: Any = js.native
  
  /**
    * @internal
    */
  /* private */ var _intersectTriangles: Any = js.native
  
  /**
    * @internal
    */
  /* private */ var _intersectUnIndexedLines: Any = js.native
  
  /**
    * @internal
    */
  /* private */ var _intersectUnIndexedTriangles: Any = js.native
  
  /* private */ var _isMultiMaterial: Any = js.native
  
  /** @internal */
  var _lastColliderTransformMatrix: Nullable[Matrix] = js.native
  
  /** @internal */
  var _lastColliderWorldVertices: Nullable[js.Array[Vector3]] = js.native
  
  /* private */ var _linesIndexBuffer: Any = js.native
  
  /** @internal */
  var _linesIndexCount: Double = js.native
  
  /* private */ var _mainDrawWrapperOverride: Any = js.native
  
  /* private */ var _mesh: Any = js.native
  
  /** @internal */
  def _projectOnTrianglesToRef(
    vector: Vector3,
    positions: js.Array[Vector3],
    indices: IndicesArray,
    step: Double,
    checkStopper: Boolean,
    ref: Vector3
  ): Double = js.native
  
  /** @internal */
  def _projectOnUnIndexedTrianglesToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double = js.native
  
  /** @internal */
  def _rebuild(): Unit = js.native
  
  /**
    * @internal
    */
  def _removeDrawWrapper(passId: Double): Unit = js.native
  def _removeDrawWrapper(passId: Double, disposeWrapper: Boolean): Unit = js.native
  
  /** @internal */
  var _renderId: Double = js.native
  
  /* private */ var _renderingMesh: Any = js.native
  
  /**
    * @internal
    */
  def _setMainDrawWrapperOverride(wrapper: Nullable[DrawWrapper]): Unit = js.native
  
  /** @internal */
  var _trianglePlanes: js.Array[Plane] = js.native
  
  /** @internal */
  var _wasDispatched: Boolean = js.native
  
  /**
    * Checks if the submesh intersects with a ray
    * @param ray defines the ray to test
    * @returns true is the passed ray intersects the submesh bounding box
    */
  def canIntersects(ray: Ray): Boolean = js.native
  
  /**
    * Creates a new submesh from the passed mesh
    * @param newMesh defines the new hosting mesh
    * @param newRenderingMesh defines an optional rendering mesh
    * @returns the new submesh
    */
  def clone(newMesh: AbstractMesh): SubMesh = js.native
  def clone(newMesh: AbstractMesh, newRenderingMesh: Mesh): SubMesh = js.native
  
  /**
    * Release associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets associated (main) effect (possibly the effect override if defined)
    */
  def effect: Nullable[Effect] = js.native
  
  /**
    * Returns the submesh BoundingInfo object
    * @returns current bounding info (or mesh's one if the submesh is global)
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * Gets the class name
    * @returns the string "SubMesh".
    */
  def getClassName(): String = js.native
  
  /**
    * Returns the effective mesh of the submesh
    * @returns the effective mesh (could be different from parent mesh)
    */
  def getEffectiveMesh(): AbstractMesh = js.native
  
  /**
    * Returns the submesh material
    * @param getDefaultMaterial Defines whether or not to get the default material if nothing has been defined.
    * @returns null or the current material
    */
  def getMaterial(): Nullable[Material] = js.native
  def getMaterial(getDefaultMaterial: Boolean): Nullable[Material] = js.native
  
  /**
    * Returns the mesh of the current submesh
    * @returns the parent mesh
    */
  def getMesh(): AbstractMesh = js.native
  
  /**
    * Returns the rendering mesh of the submesh
    * @returns the rendering mesh (could be different from parent mesh)
    */
  def getRenderingMesh(): Mesh = js.native
  
  /**
    * Returns the replacement mesh of the submesh
    * @returns the replacement mesh (could be different from parent mesh)
    */
  def getReplacementMesh(): Nullable[AbstractMesh] = js.native
  
  /** indices count */
  var indexCount: Double = js.native
  
  /** index start */
  var indexStart: Double = js.native
  
  /**
    * Intersects current submesh with a ray
    * @param ray defines the ray to test
    * @param positions defines mesh's positions array
    * @param indices defines mesh's indices array
    * @param fastCheck defines if the first intersection will be used (and not the closest)
    * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
    * @returns intersection info or null if no intersection
    */
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray): Nullable[IntersectionInfo] = js.native
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray, fastCheck: Boolean): Nullable[IntersectionInfo] = js.native
  def intersects(
    ray: Ray,
    positions: js.Array[Vector3],
    indices: IndicesArray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate
  ): Nullable[IntersectionInfo] = js.native
  def intersects(
    ray: Ray,
    positions: js.Array[Vector3],
    indices: IndicesArray,
    fastCheck: Unit,
    trianglePredicate: TrianglePickingPredicate
  ): Nullable[IntersectionInfo] = js.native
  
  /**
    * Gets material defines used by the effect associated to the sub mesh
    */
  def materialDefines: Nullable[MaterialDefines] = js.native
  /**
    * Sets material defines used by the effect associated to the sub mesh
    */
  def materialDefines_=(defines: Nullable[MaterialDefines]): Unit = js.native
  
  /** the material index to use */
  var materialIndex: Double = js.native
  
  /**
    * Projects a point on this submesh and stores the result in "ref"
    *
    * @param vector point to project
    * @param positions defines mesh's positions array
    * @param indices defines mesh's indices array
    * @param ref vector that will store the result
    * @returns distance from the point and the submesh, or -1 if the mesh rendering mode doesn't support projections
    */
  def projectToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double = js.native
  
  /**
    * Sets a new updated BoundingInfo object to the submesh
    * @param data defines an optional position array to use to determine the bounding info
    * @returns the SubMesh
    */
  def refreshBoundingInfo(): SubMesh = js.native
  def refreshBoundingInfo(data: Nullable[FloatArray]): SubMesh = js.native
  
  /**
    * Renders the submesh
    * @param enableAlphaMode defines if alpha needs to be used
    * @returns the submesh
    */
  def render(enableAlphaMode: Boolean): SubMesh = js.native
  
  /**
    * Resets the draw wrappers cache
    * @param passId If provided, releases only the draw wrapper corresponding to this render pass id
    */
  def resetDrawCache(): Unit = js.native
  def resetDrawCache(passId: Double): Unit = js.native
  
  /**
    * Sets the submesh BoundingInfo
    * @param boundingInfo defines the new bounding info to use
    * @returns the SubMesh
    */
  def setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = js.native
  
  /**
    * Sets associated effect (effect used to render this submesh)
    * @param effect defines the effect to associate with
    * @param defines defines the set of defines used to compile this effect
    * @param materialContext material context associated to the effect
    * @param resetContext true to reset the draw context
    */
  def setEffect(effect: Nullable[Effect]): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: Unit, resetContext: Boolean): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: IMaterialContext): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: IMaterialContext, resetContext: Boolean): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines]): Unit = js.native
  def setEffect(
    effect: Nullable[Effect],
    defines: Nullable[String | MaterialDefines],
    materialContext: Unit,
    resetContext: Boolean
  ): Unit = js.native
  def setEffect(
    effect: Nullable[Effect],
    defines: Nullable[String | MaterialDefines],
    materialContext: IMaterialContext
  ): Unit = js.native
  def setEffect(
    effect: Nullable[Effect],
    defines: Nullable[String | MaterialDefines],
    materialContext: IMaterialContext,
    resetContext: Boolean
  ): Unit = js.native
  
  /**
    * Updates the submesh BoundingInfo
    * @param world defines the world matrix to use to update the bounding info
    * @returns the submesh
    */
  def updateBoundingInfo(world: DeepImmutable[Matrix]): SubMesh = js.native
  
  /** vertices count */
  var verticesCount: Double = js.native
  
  /** vertex index start */
  var verticesStart: Double = js.native
}
