package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Layer} to calculate the "sort distance" for a {@link MeshInstance},
  * which determines its place in the render order.
  *
  * @callback CalculateSortDistanceCallback
  * @param {MeshInstance} meshInstance - The mesh instance.
  * @param {Vec3} cameraPosition - The position of the camera.
  * @param {Vec3} cameraForward - The forward vector of the camera.
  */
/**
  * An instance of a {@link Mesh}. A single mesh can be referenced by many mesh instances that can
  * have different transforms and materials.
  */
@js.native
trait MeshInstance extends StObject {
  
  var _aabb: Any = js.native
  
  var _aabbVer: Double = js.native
  
  /**
    * An array of bind groups, storing uniforms per pass. This has 1:1 relation with the _shades array,
    * and is indexed by the shader pass constant as well.
    *
    * @type {Array<BindGroup>}
    * @ignore
    */
  var _bindGroups: js.Array[BindGroup] = js.native
  
  var _calculateSortDistance: Any = js.native
  
  /**
    * @type {BoundingBox}
    * @private
    */
  /* private */ var _customAabb: Any = js.native
  
  def _isVisible(camera: Any): Any = js.native
  
  var _key: js.Array[Double] = js.native
  
  var _layer: Any = js.native
  
  var _lightHash: Double = js.native
  
  /**
    * @type {Material}
    * @private
    */
  /* private */ var _material: Any = js.native
  
  var _mesh: Mesh = js.native
  
  /**
    * @type {MorphInstance}
    * @private
    */
  /* private */ var _morphInstance: Any = js.native
  
  var _noDepthDrawGl1: Boolean = js.native
  
  var _receiveShadow: Boolean = js.native
  
  /** @private */
  /* private */ var _renderStyle: Any = js.native
  
  var _screenSpace: Boolean = js.native
  
  def _setupSkinUpdate(): Unit = js.native
  
  /**
    * An array of shaders used by the mesh instance, indexed by the shader pass constant (SHADER_FORWARD..)
    *
    * @type {Array<Shader>}
    * @ignore
    */
  var _shader: js.Array[Shader] = js.native
  
  var _shaderDefs: Double = js.native
  
  /**
    * @type {SkinInstance}
    * @private
    */
  /* private */ var _skinInstance: Any = js.native
  
  var _staticLightList: Any = js.native
  
  var _staticSource: Any = js.native
  
  var _updateAabb: Boolean = js.native
  
  var _updateAabbFunc: Any = js.native
  
  def aabb: Any = js.native
  /**
    * The world space axis-aligned bounding box for this mesh instance.
    *
    * @type {BoundingBox}
    */
  def aabb_=(arg: Any): Unit = js.native
  
  def calculateSortDistance: Any = js.native
  /**
    * In some circumstances mesh instances are sorted by a distance calculation to determine their
    * rendering order. Set this callback to override the default distance calculation, which gives
    * the dot product of the camera forward vector and the vector between the camera position and
    * the center of the mesh instance's axis-aligned bounding box. This option can be particularly
    * useful for rendering transparent meshes in a better order than default.
    *
    * @type {CalculateSortDistanceCallback}
    */
  def calculateSortDistance_=(arg: Any): Unit = js.native
  
  var castShadow: Boolean = js.native
  
  def clearParameters(): Unit = js.native
  
  /**
    * Clear the internal shader array.
    *
    * @ignore
    */
  def clearShaders(): Unit = js.native
  
  /**
    * Controls whether the mesh instance can be culled by frustum culling
    * ({@link CameraComponent#frustumCulling}).
    *
    * @type {boolean}
    */
  var cull: Boolean = js.native
  
  /**
    * Deletes a shader parameter on a mesh instance.
    *
    * @param {string} name - The name of the parameter to delete.
    */
  def deleteParameter(name: String): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def destroyBindGroups(): Unit = js.native
  
  /**
    * Use this value to affect rendering order of mesh instances. Only used when mesh
    * instances are added to a {@link Layer} with {@link Layer#opaqueSortMode} or
    * {@link Layer#transparentSortMode} (depending on the material) set to
    * {@link SORTMODE_MANUAL}.
    *
    * @type {number}
    */
  var drawOrder: Double = js.native
  
  def ensureMaterial(device: Any): Unit = js.native
  
  var flipFaces: Boolean = js.native
  
  /**
    * @param {GraphicsDevice} device - The graphics device.
    * @param {number} pass - Shader pass number.
    * @returns {BindGroup} - The mesh bind group.
    * @ignore
    */
  def getBindGroup(device: GraphicsDevice, pass: Double): BindGroup = js.native
  
  /**
    * Retrieves the specified shader parameter from a mesh instance.
    *
    * @param {string} name - The name of the parameter to query.
    * @returns {object} The named parameter.
    */
  def getParameter(name: String): js.Object = js.native
  
  def getParameters(): js.Object = js.native
  
  def instancingCount: Double = js.native
  /**
    * Number of instances when using hardware instancing to render the mesh.
    *
    * @type {number}
    */
  def instancingCount_=(arg: Double): Unit = js.native
  
  var instancingData: InstancingData = js.native
  
  var isStatic: Boolean = js.native
  
  var isVisibleFunc: Any = js.native
  
  def key: Double = js.native
  def key_=(arg: Double): Unit = js.native
  
  def layer: Any = js.native
  def layer_=(arg: Any): Unit = js.native
  
  def mask: Double = js.native
  /**
    * Mask controlling which {@link LightComponent}s light this mesh instance, which
    * {@link CameraComponent} sees it and in which {@link Layer} it is rendered. Defaults to 1.
    *
    * @type {number}
    */
  def mask_=(arg: Double): Unit = js.native
  
  def material: Material = js.native
  /**
    * The material used by this mesh instance.
    *
    * @type {Material}
    */
  def material_=(arg: Material): Unit = js.native
  
  def mesh: Mesh = js.native
  /**
    * The graphics mesh being instanced.
    *
    * @type {Mesh}
    */
  def mesh_=(arg: Mesh): Unit = js.native
  
  def morphInstance: MorphInstance = js.native
  /**
    * The morph instance managing morphing of this mesh instance, or null if morphing is not used.
    *
    * @type {MorphInstance}
    */
  def morphInstance_=(arg: MorphInstance): Unit = js.native
  
  /**
    * The graph node defining the transform for this instance.
    *
    * @type {GraphNode}
    */
  var node: GraphNode = js.native
  
  /**
    * True if the mesh instance is pickable by the {@link Picker}. Defaults to true.
    *
    * @type {boolean}
    * @ignore
    */
  var pick: Boolean = js.native
  
  def receiveShadow: Boolean = js.native
  def receiveShadow_=(arg: Boolean): Unit = js.native
  
  def renderStyle: Double = js.native
  /**
    * The render style of the mesh instance. Can be:
    *
    * - {@link RENDERSTYLE_SOLID}
    * - {@link RENDERSTYLE_WIREFRAME}
    * - {@link RENDERSTYLE_POINTS}
    *
    * Defaults to {@link RENDERSTYLE_SOLID}.
    *
    * @type {number}
    */
  def renderStyle_=(arg: Double): Unit = js.native
  
  def screenSpace: Boolean = js.native
  def screenSpace_=(arg: Boolean): Unit = js.native
  
  def setCustomAabb(aabb: Any): Unit = js.native
  
  /**
    * Sets up {@link MeshInstance} to be rendered using Hardware Instancing.
    *
    * @param {VertexBuffer|null} vertexBuffer - Vertex buffer to hold per-instance vertex data
    * (usually world matrices). Pass null to turn off hardware instancing.
    */
  def setInstancing(): Unit = js.native
  def setInstancing(vertexBuffer: VertexBuffer): Unit = js.native
  
  def setLightmapped(value: Any): Unit = js.native
  
  def setParameter(name: String, data: js.Array[Double]): Unit = js.native
  def setParameter(name: String, data: js.Array[Double], passFlags: Double): Unit = js.native
  /**
    * Sets a shader parameter on a mesh instance. Note that this parameter will take precedence
    * over parameter of the same name if set on Material this mesh instance uses for rendering.
    *
    * @param {string} name - The name of the parameter to set.
    * @param {number|number[]|Texture} data - The value for the specified parameter.
    * @param {number} [passFlags] - Mask describing which passes the material should be included
    * in.
    */
  def setParameter(name: String, data: Double): Unit = js.native
  def setParameter(name: String, data: Double, passFlags: Double): Unit = js.native
  def setParameter(name: String, data: Texture): Unit = js.native
  def setParameter(name: String, data: Texture, passFlags: Double): Unit = js.native
  
  def setParameters(device: Any, passFlag: Any): Unit = js.native
  
  def setRealtimeLightmap(name: Any, texture: Any): Unit = js.native
  
  def skinInstance: SkinInstance = js.native
  /**
    * The skin instance managing skinning of this mesh instance, or null if skinning is not used.
    *
    * @type {SkinInstance}
    */
  def skinInstance_=(arg: SkinInstance): Unit = js.native
  
  var stencilBack: Any = js.native
  
  var stencilFront: Any = js.native
  
  def updateKey(): Unit = js.native
  
  /**
    * Obtain a shader variant required to render the mesh instance within specified pass.
    *
    * @param {Scene} scene - The scene.
    * @param {number} pass - The render pass.
    * @param {any} staticLightList - List of static lights.
    * @param {any} sortedLights - Array of arrays of lights.
    * @param {UniformBufferFormat} viewUniformFormat - THe format of the view uniform buffer.
    * @param {BindGroupFormat} viewBindGroupFormat - The format of the view bind group.
    * @ignore
    */
  def updatePassShader(
    scene: Scene_,
    pass: Double,
    staticLightList: Any,
    sortedLights: Any,
    viewUniformFormat: UniformBufferFormat,
    viewBindGroupFormat: BindGroupFormat
  ): Unit = js.native
  
  /**
    * Enable rendering for this mesh instance. Use visible property to enable/disable
    * rendering without overhead of removing from scene. But note that the mesh instance is
    * still in the hierarchy and still in the draw call list.
    *
    * @type {boolean}
    */
  var visible: Boolean = js.native
  
  /**
    * Read this value in {@link Layer#onPostCull} to determine if the object is actually going
    * to be rendered.
    *
    * @type {boolean}
    */
  var visibleThisFrame: Boolean = js.native
}
