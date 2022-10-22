package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.cullingBoundingInfoMod.BoundingInfo
import typingsJapgolly.babylonjs.lightsDirectionalLightMod.DirectionalLight
import typingsJapgolly.babylonjs.lightsShadowsShadowGeneratorMod.ShadowGenerator
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh
import typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsShadowsCascadedShadowGeneratorMod {
  
  @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator")
  @js.native
  open class CascadedShadowGenerator protected () extends ShadowGenerator {
    /**
      * Creates a Cascaded Shadow Generator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each directional light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/cascadedShadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The directional light object generating the shadows.
      * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      */
    def this(mapSize: Double, light: DirectionalLight) = this()
    def this(mapSize: Double, light: DirectionalLight, usefulFloatFirst: Boolean) = this()
    
    /* private */ var _autoCalcDepthBounds: Any = js.native
    
    /* protected */ def _bindCustomEffectForRenderSubMeshForShadowMap(subMesh: SubMesh, effect: Effect): Unit = js.native
    
    /* protected */ var _breaksAreDirty: Boolean = js.native
    
    /* private */ var _cascadeBlendPercentage: Any = js.native
    
    /* private */ var _cascadeMaxExtents: Any = js.native
    
    /* private */ var _cascadeMinExtents: Any = js.native
    
    /* private */ var _cascades: Any = js.native
    
    /* private */ var _computeCascadeFrustum: Any = js.native
    
    /* private */ var _computeFrustumInWorldSpace: Any = js.native
    
    /* private */ var _computeMatrices: Any = js.native
    
    /* protected */ def _computeShadowCastersBoundingInfo(): Unit = js.native
    
    /* private */ var _currentLayer: Any = js.native
    
    /* protected */ var _debug: Boolean = js.native
    
    /* private */ var _depthClamp: Any = js.native
    
    /* private */ var _depthCorrection: Any = js.native
    
    /* private */ var _depthReducer: Any = js.native
    
    /* private */ var _depthRenderer: Any = js.native
    
    /* private */ var _freezeShadowCastersBoundingInfo: Any = js.native
    
    /* private */ var _freezeShadowCastersBoundingInfoObservable: Any = js.native
    
    /* private */ var _frustumCenter: Any = js.native
    
    /* private */ var _frustumCornersWorldSpace: Any = js.native
    
    /* private */ var _frustumLengths: Any = js.native
    
    /* protected */ def _isReadyCustomDefines(defines: Any): Unit = js.native
    
    /* private */ var _lambda: Any = js.native
    
    /* private */ var _lightSizeUVCorrection: Any = js.native
    
    /* protected */ var _maxDistance: Double = js.native
    
    /* protected */ var _minDistance: Double = js.native
    
    /* private */ var _numCascades: Any = js.native
    
    /* private */ var _projectionMatrices: Any = js.native
    
    /* protected */ def _recreateSceneUBOs(): Unit = js.native
    
    /* private */ var _scbiMax: Any = js.native
    
    /* private */ var _scbiMin: Any = js.native
    
    /* private */ var _shadowCameraPos: Any = js.native
    
    /* protected */ var _shadowCastersBoundingInfo: BoundingInfo = js.native
    
    /* private */ var _shadowMaxZ: Any = js.native
    
    /* private */ var _splitFrustum: Any = js.native
    
    /* private */ var _transformMatrices: Any = js.native
    
    /* private */ var _transformMatricesAsArray: Any = js.native
    
    /* private */ var _viewMatrices: Any = js.native
    
    /* private */ var _viewSpaceFrustumsZ: Any = js.native
    
    /**
      * Gets or sets the autoCalcDepthBounds property.
      *
      * When enabled, a depth rendering pass is first performed (with an internally created depth renderer or with the one
      * you provide by calling setDepthRenderer). Then, a min/max reducing is applied on the depth map to compute the
      * minimal and maximal depth of the map and those values are used as inputs for the setMinMaxDistance() function.
      * It can greatly enhance the shadow quality, at the expense of more GPU works.
      * When using this option, you should increase the value of the lambda parameter, and even set it to 1 for best results.
      */
    def autoCalcDepthBounds: Boolean = js.native
    
    /**
      * Defines the refresh rate of the min/max computation used when autoCalcDepthBounds is set to true
      * Use 0 to compute just once, 1 to compute on every frame, 2 to compute every two frames and so on...
      * Note that if you provided your own depth renderer through a call to setDepthRenderer, you are responsible
      * for setting the refresh rate on the renderer yourself!
      */
    def autoCalcDepthBoundsRefreshRate: Double = js.native
    def autoCalcDepthBoundsRefreshRate_=(value: Double): Unit = js.native
    
    def autoCalcDepthBounds_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets the percentage of blending between two cascades (value between 0. and 1.).
      * It defaults to 0.1 (10% blending).
      */
    def cascadeBlendPercentage: Double = js.native
    def cascadeBlendPercentage_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the debug flag.
      * When enabled, the cascades are materialized by different colors on the screen.
      */
    def debug: Boolean = js.native
    def debug_=(dbg: Boolean): Unit = js.native
    
    /**
      * Gets or sets the depth clamping value.
      *
      * When enabled, it improves the shadow quality because the near z plane of the light frustum don't need to be adjusted
      * to account for the shadow casters far away.
      *
      * Note that this property is incompatible with PCSS filtering, so it won't be used in that case.
      */
    def depthClamp: Boolean = js.native
    def depthClamp_=(value: Boolean): Unit = js.native
    
    /**
      * Enables or disables the shadow casters bounding info computation.
      * If your shadow casters don't move, you can disable this feature.
      * If it is enabled, the bounding box computation is done every frame.
      */
    def freezeShadowCastersBoundingInfo: Boolean = js.native
    def freezeShadowCastersBoundingInfo_=(freeze: Boolean): Unit = js.native
    
    /**
      * Gets a cascade maximum extents
      * @param cascadeIndex index of the cascade
      * @returns the maximum cascade extents
      */
    def getCascadeMaxExtents(cascadeIndex: Double): Nullable[Vector3] = js.native
    
    /**
      * Gets a cascade minimum extents
      * @param cascadeIndex index of the cascade
      * @returns the minimum cascade extents
      */
    def getCascadeMinExtents(cascadeIndex: Double): Nullable[Vector3] = js.native
    
    /**
      * Gets the projection matrix corresponding to a given cascade
      * @param cascadeNum cascade to retrieve the projection matrix from
      * @returns the cascade projection matrix
      */
    def getCascadeProjectionMatrix(cascadeNum: Double): Nullable[Matrix] = js.native
    
    /**
      * Gets the transformation matrix corresponding to a given cascade
      * @param cascadeNum cascade to retrieve the transformation matrix from
      * @returns the cascade transformation matrix
      */
    def getCascadeTransformMatrix(cascadeNum: Double): Nullable[Matrix] = js.native
    
    /**
      * Gets the view matrix corresponding to a given cascade
      * @param cascadeNum cascade to retrieve the view matrix from
      * @returns the cascade view matrix
      */
    def getCascadeViewMatrix(cascadeNum: Double): Nullable[Matrix] = js.native
    
    /**
      * Gets or set the lambda parameter.
      * This parameter is used to split the camera frustum and create the cascades.
      * It's a value between 0. and 1.: If 0, the split is a uniform split of the frustum, if 1 it is a logarithmic split.
      * For all values in-between, it's a linear combination of the uniform and logarithm split algorithm.
      */
    def lambda: Double = js.native
    def lambda_=(value: Double): Unit = js.native
    
    /** Gets the maximal distance used in the cascade break computation */
    def maxDistance: Double = js.native
    
    /** Gets the minimal distance used in the cascade break computation */
    def minDistance: Double = js.native
    
    /**
      * Gets or set the number of cascades used by the CSM.
      */
    def numCascades: Double = js.native
    def numCascades_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the actual darkness of the soft shadows while using PCSS filtering (value between 0. and 1.)
      */
    var penumbraDarkness: Double = js.native
    
    /**
      * Sets the depth renderer to use when autoCalcDepthBounds is enabled.
      *
      * Note that if no depth renderer is set, a new one will be automatically created internally when necessary.
      *
      * You should call this function if you already have a depth renderer enabled in your scene, to avoid
      * doing multiple depth rendering each frame. If you provide your own depth renderer, make sure it stores linear depth!
      * @param depthRenderer The depth renderer to use when autoCalcDepthBounds is enabled. If you pass null or don't call this function at all, a depth renderer will be automatically created
      */
    def setDepthRenderer(depthRenderer: Nullable[DepthRenderer]): Unit = js.native
    
    /**
      * Sets the minimal and maximal distances to use when computing the cascade breaks.
      *
      * The values of min / max are typically the depth zmin and zmax values of your scene, for a given frame.
      * If you don't know these values, simply leave them to their defaults and don't call this function.
      * @param min minimal distance for the breaks (default to 0.)
      * @param max maximal distance for the breaks (default to 1.)
      */
    def setMinMaxDistance(min: Double, max: Double): Unit = js.native
    
    /**
      * Gets or sets the shadow casters bounding info.
      * If you provide your own shadow casters bounding info, first enable freezeShadowCastersBoundingInfo
      * so that the system won't overwrite the bounds you provide
      */
    def shadowCastersBoundingInfo: BoundingInfo = js.native
    def shadowCastersBoundingInfo_=(boundingInfo: BoundingInfo): Unit = js.native
    
    /**
      * Gets the shadow max z distance. It's the limit beyond which shadows are not displayed.
      * It defaults to camera.maxZ
      */
    def shadowMaxZ: Double = js.native
    /**
      * Sets the shadow max z distance.
      */
    def shadowMaxZ_=(value: Double): Unit = js.native
    
    /**
      * Create the cascade breaks according to the lambda, shadowMaxZ and min/max distance properties, as well as the camera near and far planes.
      * This function is automatically called when updating lambda, shadowMaxZ and min/max distances, however you should call it yourself if
      * you change the camera near/far planes!
      */
    def splitFrustum(): Unit = js.native
    
    /**
      * Sets this to true if you want that the edges of the shadows don't "swimm" / "shimmer" when rotating the camera.
      * The trade off is that you lose some precision in the shadow rendering when enabling this setting.
      */
    var stabilizeCascades: Boolean = js.native
  }
  /* static members */
  object CascadedShadowGenerator {
    
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the CSM class
      */
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator.DEFAULT_CASCADES_COUNT")
    @js.native
    val DEFAULT_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the maximum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator.MAX_CASCADES_COUNT")
    @js.native
    val MAX_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the minimum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator.MIN_CASCADES_COUNT")
    @js.native
    val MIN_CASCADES_COUNT: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @returns The parsed shadow generator
      */
    inline def Parse(parsedShadowGenerator: Any, scene: Scene): ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ShadowGenerator]
    
    @JSImport("babylonjs/Lights/Shadows/cascadedShadowGenerator", "CascadedShadowGenerator._FrustumCornersNDCSpace")
    @js.native
    val _FrustumCornersNDCSpace: Any = js.native
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
