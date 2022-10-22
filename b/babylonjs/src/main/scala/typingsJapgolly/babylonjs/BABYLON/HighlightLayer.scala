package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightLayer
  extends StObject
     with EffectLayer {
  
  /* private */ var _blurTexture: Any = js.native
  
  /**
    * Force the stencil to the normal expected value for none glowing parts
    * @param mesh
    */
  /* private */ var _defaultStencilReference: Any = js.native
  
  /* private */ var _downSamplePostprocess: Any = js.native
  
  /* private */ var _excludedMeshes: Any = js.native
  
  /* private */ var _horizontalBlurPostprocess: Any = js.native
  
  /* private */ var _instanceGlowingMeshStencilReference: Any = js.native
  
  /* private */ var _meshes: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /**
    * Returns true if the mesh should render, otherwise false.
    * @param mesh The mesh to render
    * @returns true if it should render otherwise false
    */
  /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
  
  /* private */ var _verticalBlurPostprocess: Any = js.native
  
  /**
    * Add a mesh in the exclusion list to prevent it to impact or being impacted by the highlight layer.
    * @param mesh The mesh to exclude from the highlight layer
    */
  def addExcludedMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Add a mesh in the highlight layer in order to make it glow with the chosen color.
    * @param mesh The mesh to highlight
    * @param color The color of the highlight
    * @param glowEmissiveOnly Extract the glow from the emissive texture
    */
  def addMesh(mesh: Mesh, color: Color3): Unit = js.native
  def addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean): Unit = js.native
  
  /**
    * Gets the horizontal size of the blur.
    */
  def blurHorizontalSize: Double = js.native
  /**
    * Specifies the horizontal size of the blur.
    */
  def blurHorizontalSize_=(value: Double): Unit = js.native
  
  /**
    * Gets the vertical size of the blur.
    */
  def blurVerticalSize: Double = js.native
  /**
    * Specifies the vertical size of the blur.
    */
  def blurVerticalSize_=(value: Double): Unit = js.native
  
  /**
    * Specifies whether or not the inner glow is ACTIVE in the layer.
    */
  var innerGlow: Boolean = js.native
  
  /**
    * An event triggered when the highlight layer has been blurred.
    */
  var onAfterBlurObservable: Observable[HighlightLayer] = js.native
  
  /**
    * An event triggered when the highlight layer is being blurred.
    */
  var onBeforeBlurObservable: Observable[HighlightLayer] = js.native
  
  /**
    * Specifies whether or not the outer glow is ACTIVE in the layer.
    */
  var outerGlow: Boolean = js.native
  
  /**
    * Remove all the meshes currently referenced in the highlight layer
    */
  def removeAllMeshes(): Unit = js.native
  
  /**
    * Remove a mesh from the exclusion list to let it impact or being impacted by the highlight layer.
    * @param mesh The mesh to highlight
    */
  def removeExcludedMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Remove a mesh from the highlight layer in order to make it stop glowing.
    * @param mesh The mesh to highlight
    */
  def removeMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Serializes this Highlight layer
    * @returns a serialized Highlight layer object
    */
  @JSName("serialize")
  def serialize_MHighlightLayer(): Any = js.native
}
