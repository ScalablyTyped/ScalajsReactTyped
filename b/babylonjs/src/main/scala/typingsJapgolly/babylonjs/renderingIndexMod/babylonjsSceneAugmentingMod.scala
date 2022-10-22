package typingsJapgolly.babylonjs.renderingIndexMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @internal (Backing field) */
    var _boundingBoxRenderer: typingsJapgolly.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /** @internal (Backing field) */
    var _depthPeelingRenderer: Nullable[typingsJapgolly.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
    /** @internal (Backing field) */
    var _depthRenderer: StringDictionary[typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer] = js.native
    
    /** @internal */
    var _edgeRenderLineShader: Nullable[ShaderMaterial] = js.native
    
    /** @internal (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    
    /** @internal (Backing field) */
    var _geometryBufferRenderer: Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    
    /** @internal */
    var _outlineRenderer: typingsJapgolly.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /** @internal */
    var _useOrderIndependentTransparency: Boolean = js.native
    
    /**
      * The depth peeling renderer
      */
    var depthPeelingRenderer: Nullable[typingsJapgolly.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
    /**
      * Disables a depth renderer for a given camera
      * @param camera The camera to disable the depth renderer on (default: scene's active camera)
      */
    def disableDepthRenderer(): Unit = js.native
    def disableDepthRenderer(camera: Nullable[Camera]): Unit = js.native
    
    /**
      * Disables the GeometryBufferRender associated with the scene
      */
    def disableGeometryBufferRenderer(): Unit = js.native
    
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera]): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[Camera], storeNonLinearDepth: Unit, force32bitsFloat: Boolean): typingsJapgolly.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    def enableGeometryBufferRenderer(ratio: Double, depthFormat: Double): Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    def enableGeometryBufferRenderer(ratio: Unit, depthFormat: Double): Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[
        typingsJapgolly.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer
      ] = js.native
    
    /**
      * Gets the bounding box renderer associated with the scene
      * @returns a BoundingBoxRenderer
      */
    def getBoundingBoxRenderer(): typingsJapgolly.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): typingsJapgolly.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /**
      * Flag to indicate if we want to use order independent transparency, despite the performance hit
      */
    var useOrderIndependentTransparency: Boolean = js.native
  }
}
