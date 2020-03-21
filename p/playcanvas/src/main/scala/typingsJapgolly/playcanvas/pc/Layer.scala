package typingsJapgolly.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Layer
  * @classdesc Layer represents a renderable subset of the scene. It can contain a list of mesh instances, lights and cameras,
  * their render settings and also defines custom callbacks before, after or during rendering.
  * Layers are organized inside {@link pc.LayerComposition} in a desired order.
  * @description Create a new layer.
  * @param {object} options - Object for passing optional arguments. These arguments are the same as properties of the Layer.
  * @property {boolean} enabled Enable the layer. Disabled layers are skipped. Defaults to true.
  * @property {string} name Name of the layer. Can be used in {@link pc.LayerComposition#getLayerByName}.
  * @property {number} opaqueSortMode Defines the method used for sorting opaque (that is, not semi-transparent) mesh instances before rendering.
  * Possible values are:
  *
  * * {@link pc.SORTMODE_NONE}
  * * {@link pc.SORTMODE_MANUAL}
  * * {@link pc.SORTMODE_MATERIALMESH}
  * * {@link pc.SORTMODE_BACK2FRONT}
  * * {@link pc.SORTMODE_FRONT2BACK}
  *
  * Defaults to pc.SORTMODE_MATERIALMESH.
  * @property {number} transparentSortMode Defines the method used for sorting semi-transparent mesh instances before rendering.
  * Possible values are:
  *
  * * {@link pc.SORTMODE_NONE}
  * * {@link pc.SORTMODE_MANUAL}
  * * {@link pc.SORTMODE_MATERIALMESH}
  * * {@link pc.SORTMODE_BACK2FRONT}
  * * {@link pc.SORTMODE_FRONT2BACK}
  *
  * Defaults to pc.SORTMODE_BACK2FRONT.
  * @property {pc.RenderTarget} renderTarget Render target to which rendering is performed. If not set, will render simply to the screen.
  * @property {number} shaderPass A type of shader to use during rendering. Possible values are:
  *
  * * {@link pc.SHADER_FORWARD}
  * * {@link pc.SHADER_FORWARDHDR}
  * * {@link pc.SHADER_DEPTH}
  * * Your own custom value. Should be in 19 - 31 range. Use {@link pc.StandardMaterial#onUpdateShader} to apply shader modifications based on this value.
  *
  * Defaults to pc.SHADER_FORWARD.
  * @property {boolean} passThrough Tells that this layer is simple and needs to just render a bunch of mesh instances without lighting, skinning and morphing (faster).
  *
  * @property {boolean} overrideClear Defines if layer should use camera clear parameters (true) or ignore them and use {@link pc.Layer#clearColor}, {@link pc.Layer#clearColorBuffer},
  * {@link pc.Layer#clearDepthBuffer} and {@link pc.Layer#clearStencilBuffer}.
  * @property {pc.Color} clearColor The color used to clear the canvas to before each camera starts to render.
  * @property {boolean} clearColorBuffer If true cameras will clear the color buffer to the color set in clearColor.
  * @property {boolean} clearDepthBuffer If true cameras will clear the depth buffer.
  * @property {boolean} clearStencilBuffer If true cameras will clear the stencil buffer.
  *
  * @property {pc.Layer} layerReference Make this layer render the same mesh instances that another layer does instead of having its own mesh instance list.
  * Both layers must share cameras. Frustum culling is only performed for one layer.
  * @property {Function} cullingMask Visibility mask that interacts with {@link pc.MeshInstance#mask}.
  * @property {Function} onEnable Custom function that is called after the layer has been enabled.
  * This happens when:
  *
  * * The layer is created with {@link pc.Layer#enabled} set to true (which is the default value).
  * * {@link pc.Layer#enabled} was changed from false to true
  * * {@link pc.Layer#incrementCounter} was called and incremented the counter above zero.
  *
  * Useful for allocating resources this layer will use (e.g. creating render targets).
  * @property {Function} onDisable Custom function that is called after the layer has been disabled.
  * This happens when:
  *
  * * {@link pc.Layer#enabled} was changed from true to false
  * * {@link pc.Layer#decrementCounter} was called and set the counter to zero.
  *
  * @property {Function} onPreCull Custom function that is called before visibility culling is performed for this layer.
  * Useful, for example, if you want to modify camera projection while still using the same camera and make frustum culling work correctly with it
  * (see {@link pc.CameraComponent#calculateTransform} and {@link pc.CameraComponent#calculateProjection}).
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPostCull Custom function that is called after visibiliy culling is performed for this layer.
  * Useful for reverting changes done in {@link pc.Layer#onPreCull} and determining final mesh instance visibility (see {@link pc.MeshInstance#visibleThisFrame}).
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPreRender Custom function that is called before this layer is rendered.
  * Useful, for example, for reacting on screen size changes.
  * This function is called before the first occurrence of this layer in {@link pc.LayerComposition}.
  * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPreRenderOpaque Custom function that is called before opaque mesh instances (not semi-transparent) in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPreRenderTransparent Custom function that is called before semi-transparent mesh instances in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPostRender Custom function that is called after this layer is rendered.
  * Useful to revert changes made in {@link pc.Layer#onPreRender} or performing some processing on {@link pc.Layer#renderTarget}.
  * This function is called after the last occurrence of this layer in {@link pc.LayerComposition}.
  * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPostRenderOpaque Custom function that is called after opaque mesh instances (not semi-transparent) in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onPostRenderTransparent Custom function that is called after semi-transparent mesh instances in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property {Function} onDrawCall Custom function that is called before every mesh instance in this layer is rendered.
  * It is not recommended to set this function when rendering many objects every frame due to performance reasons.
  * @property {number} id A unique ID of the layer.
  * Layer IDs are stored inside {@link pc.ModelComponent#layers}, {@link pc.CameraComponent#layers}, {@link pc.LightComponent#layers} and {@link pc.ElementComponent#layers} instead of names.
  * Can be used in {@link pc.LayerComposition#getLayerById}.
  */
@JSGlobal("pc.Layer")
@js.native
class Layer protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    * The color used to clear the canvas to before each camera starts to render.
    */
  var clearColor: Color = js.native
  /**
    * If true cameras will clear the color buffer to the color set in clearColor.
    */
  var clearColorBuffer: Boolean = js.native
  /**
    * If true cameras will clear the depth buffer.
    */
  var clearDepthBuffer: Boolean = js.native
  /**
    * If true cameras will clear the stencil buffer.
    */
  var clearStencilBuffer: Boolean = js.native
  /**
    * Enable the layer. Disabled layers are skipped. Defaults to true.
    */
  var enabled: Boolean = js.native
  /**
    * A unique ID of the layer.
    * Layer IDs are stored inside {@link pc.ModelComponent#layers}, {@link pc.CameraComponent#layers}, {@link pc.LightComponent#layers} and {@link pc.ElementComponent#layers} instead of names.
    * Can be used in {@link pc.LayerComposition#getLayerById}.
    */
  var id: Double = js.native
  /**
    * Make this layer render the same mesh instances that another layer does instead of having its own mesh instance list.
    * Both layers must share cameras. Frustum culling is only performed for one layer.
    */
  var layerReference: Layer = js.native
  /**
    * Name of the layer. Can be used in {@link pc.LayerComposition#getLayerByName}.
    */
  var name: String = js.native
  /**
    * Defines the method used for sorting opaque (that is, not semi-transparent) mesh instances before rendering.
    * Possible values are:
    * * {@link pc.SORTMODE_NONE}
    * * {@link pc.SORTMODE_MANUAL}
    * * {@link pc.SORTMODE_MATERIALMESH}
    * * {@link pc.SORTMODE_BACK2FRONT}
    * * {@link pc.SORTMODE_FRONT2BACK}
    * Defaults to pc.SORTMODE_MATERIALMESH.
    */
  var opaqueSortMode: Double = js.native
  /**
    * Defines if layer should use camera clear parameters (true) or ignore them and use {@link pc.Layer#clearColor}, {@link pc.Layer#clearColorBuffer},
    * {@link pc.Layer#clearDepthBuffer} and {@link pc.Layer#clearStencilBuffer}.
    */
  var overrideClear: Boolean = js.native
  /**
    * Tells that this layer is simple and needs to just render a bunch of mesh instances without lighting, skinning and morphing (faster).
    */
  var passThrough: Boolean = js.native
  /**
    * Render target to which rendering is performed. If not set, will render simply to the screen.
    */
  var renderTarget: RenderTarget = js.native
  /**
    * A type of shader to use during rendering. Possible values are:
    * * {@link pc.SHADER_FORWARD}
    * * {@link pc.SHADER_FORWARDHDR}
    * * {@link pc.SHADER_DEPTH}
    * * Your own custom value. Should be in 19 - 31 range. Use {@link pc.StandardMaterial#onUpdateShader} to apply shader modifications based on this value.
    * Defaults to pc.SHADER_FORWARD.
    */
  var shaderPass: Double = js.native
  /**
    * Defines the method used for sorting semi-transparent mesh instances before rendering.
    * Possible values are:
    * * {@link pc.SORTMODE_NONE}
    * * {@link pc.SORTMODE_MANUAL}
    * * {@link pc.SORTMODE_MATERIALMESH}
    * * {@link pc.SORTMODE_BACK2FRONT}
    * * {@link pc.SORTMODE_FRONT2BACK}
    * Defaults to pc.SORTMODE_BACK2FRONT.
    */
  var transparentSortMode: Double = js.native
  /**
    * @function
    * @name pc.Layer#addCamera
    * @description Adds a camera to this layer.
    * @param {pc.CameraComponent} camera - A {@link pc.CameraComponent}.
    */
  def addCamera(camera: CameraComponent): Unit = js.native
  /**
    * @function
    * @name pc.Layer#addLight
    * @description Adds a light to this layer.
    * @param {pc.LightComponent} light - A {@link pc.LightComponent}.
    */
  def addLight(light: LightComponent): Unit = js.native
  /**
    * @function
    * @name pc.Layer#addMeshInstances
    * @description Adds an array of mesh instances to this layer.
    * @param {pc.MeshInstance[]} meshInstances - Array of {@link pc.MeshInstance}.
    * @param {boolean} [skipShadowCasters] - Set it to true if you don't want these mesh instances to cast shadows in this layer.
    */
  def addMeshInstances(meshInstances: js.Array[MeshInstance]): Unit = js.native
  def addMeshInstances(meshInstances: js.Array[MeshInstance], skipShadowCasters: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.Layer#addShadowCasters
    * @description Adds an array of mesh instances to this layer, but only as shadow casters (they will not be rendered anywhere, but only cast shadows on other objects).
    * @param {pc.MeshInstance[]} meshInstances - Array of {@link pc.MeshInstance}.
    */
  def addShadowCasters(meshInstances: js.Array[MeshInstance]): Unit = js.native
  /**
    * @function
    * @name pc.Layer#clearCameras
    * @description Removes all cameras from this layer.
    */
  def clearCameras(): Unit = js.native
  /**
    * @function
    * @name pc.Layer#clearLights
    * @description Removes all lights from this layer.
    */
  def clearLights(): Unit = js.native
  /**
    * @function
    * @name pc.Layer#clearMeshInstances
    * @description Removes all mesh instances from this layer.
    * @param {boolean} [skipShadowCasters] - Set it to true if you want to still cast shadows from removed mesh instances or if they never did cast shadows before.
    */
  def clearMeshInstances(): Unit = js.native
  def clearMeshInstances(skipShadowCasters: Boolean): Unit = js.native
  /**
    * Visibility mask that interacts with {@link pc.MeshInstance#mask}.
    */
  def cullingMask(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after the layer has been disabled.
    * This happens when:
    * * {@link pc.Layer#enabled} was changed from true to false
    * * {@link pc.Layer#decrementCounter} was called and set the counter to zero.
    */
  def onDisable(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called before every mesh instance in this layer is rendered.
    * It is not recommended to set this function when rendering many objects every frame due to performance reasons.
    */
  def onDrawCall(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after the layer has been enabled.
    * This happens when:
    * * The layer is created with {@link pc.Layer#enabled} set to true (which is the default value).
    * * {@link pc.Layer#enabled} was changed from false to true
    * * {@link pc.Layer#incrementCounter} was called and incremented the counter above zero.
    * Useful for allocating resources this layer will use (e.g. creating render targets).
    */
  def onEnable(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after visibiliy culling is performed for this layer.
    * Useful for reverting changes done in {@link pc.Layer#onPreCull} and determining final mesh instance visibility (see {@link pc.MeshInstance#visibleThisFrame}).
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPostCull(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after this layer is rendered.
    * Useful to revert changes made in {@link pc.Layer#onPreRender} or performing some processing on {@link pc.Layer#renderTarget}.
    * This function is called after the last occurrence of this layer in {@link pc.LayerComposition}.
    * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPostRender(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after opaque mesh instances (not semi-transparent) in this layer are rendered.
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPostRenderOpaque(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called after semi-transparent mesh instances in this layer are rendered.
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPostRenderTransparent(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called before visibility culling is performed for this layer.
    * Useful, for example, if you want to modify camera projection while still using the same camera and make frustum culling work correctly with it
    * (see {@link pc.CameraComponent#calculateTransform} and {@link pc.CameraComponent#calculateProjection}).
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPreCull(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called before this layer is rendered.
    * Useful, for example, for reacting on screen size changes.
    * This function is called before the first occurrence of this layer in {@link pc.LayerComposition}.
    * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPreRender(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called before opaque mesh instances (not semi-transparent) in this layer are rendered.
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPreRenderOpaque(params: js.Any*): js.Any = js.native
  /**
    * Custom function that is called before semi-transparent mesh instances in this layer are rendered.
    * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
    */
  def onPreRenderTransparent(params: js.Any*): js.Any = js.native
  /**
    * @function
    * @name pc.Layer#removeCamera
    * @description Removes a camera from this layer.
    * @param {pc.CameraComponent} camera - A {@link pc.CameraComponent}.
    */
  def removeCamera(camera: CameraComponent): Unit = js.native
  /**
    * @function
    * @name pc.Layer#removeLight
    * @description Removes a light from this layer.
    * @param {pc.LightComponent} light - A {@link pc.LightComponent}.
    */
  def removeLight(light: LightComponent): Unit = js.native
  /**
    * @function
    * @name pc.Layer#removeMeshInstances
    * @description Removes multiple mesh instances from this layer.
    * @param {pc.MeshInstance[]} meshInstances - Array of {@link pc.MeshInstance}. If they were added to this layer, they will be removed.
    * @param {boolean} [skipShadowCasters] - Set it to true if you want to still cast shadows from removed mesh instances or if they never did cast shadows before.
    */
  def removeMeshInstances(meshInstances: js.Array[MeshInstance]): Unit = js.native
  def removeMeshInstances(meshInstances: js.Array[MeshInstance], skipShadowCasters: Boolean): Unit = js.native
  /**
    * @function
    * @name pc.Layer#removeShadowCasters
    * @description Removes multiple mesh instances from the shadow casters list of this layer, meaning they will stop casting shadows.
    * @param {pc.MeshInstance[]} meshInstances - Array of {@link pc.MeshInstance}. If they were added to this layer, they will be removed.
    */
  def removeShadowCasters(meshInstances: js.Array[MeshInstance]): Unit = js.native
}

