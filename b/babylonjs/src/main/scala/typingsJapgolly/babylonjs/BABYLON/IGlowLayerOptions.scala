package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGlowLayerOptions extends StObject {
  
  /**
    * Defines the blend mode used by the merge
    */
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: Double
  
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  
  /**
    * Forces the merge step to be done in ldr (clamp values > 1)
    */
  var ldrMerge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enforces a fixed size texture to ensure resize independent blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double
  
  /**
    * Enable MSAA by choosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[Double] = js.undefined
  
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double
}
object IGlowLayerOptions {
  
  inline def apply(blurKernelSize: Double, mainTextureRatio: Double, renderingGroupId: Double): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any], camera = null)
    __obj.asInstanceOf[IGlowLayerOptions]
  }
  
  extension [Self <: IGlowLayerOptions](x: Self) {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    inline def setBlurKernelSize(value: Double): Self = StObject.set(x, "blurKernelSize", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setLdrMerge(value: Boolean): Self = StObject.set(x, "ldrMerge", value.asInstanceOf[js.Any])
    
    inline def setLdrMergeUndefined: Self = StObject.set(x, "ldrMerge", js.undefined)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setMainTextureSamples(value: Double): Self = StObject.set(x, "mainTextureSamples", value.asInstanceOf[js.Any])
    
    inline def setMainTextureSamplesUndefined: Self = StObject.set(x, "mainTextureSamples", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
  }
}
