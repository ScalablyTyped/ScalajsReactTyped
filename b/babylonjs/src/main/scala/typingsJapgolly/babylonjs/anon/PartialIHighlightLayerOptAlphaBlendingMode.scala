package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Camera
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IHighlightLayerOptions> */
trait PartialIHighlightLayerOptAlphaBlendingMode extends StObject {
  
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  
  var blurHorizontalSize: js.UndefOr[Double] = js.undefined
  
  var blurTextureSizeRatio: js.UndefOr[Double] = js.undefined
  
  var blurVerticalSize: js.UndefOr[Double] = js.undefined
  
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  
  var isStroke: js.UndefOr[Boolean] = js.undefined
  
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}
object PartialIHighlightLayerOptAlphaBlendingMode {
  
  inline def apply(): PartialIHighlightLayerOptAlphaBlendingMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIHighlightLayerOptAlphaBlendingMode]
  }
  
  extension [Self <: PartialIHighlightLayerOptAlphaBlendingMode](x: Self) {
    
    inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
    
    inline def setBlurHorizontalSize(value: Double): Self = StObject.set(x, "blurHorizontalSize", value.asInstanceOf[js.Any])
    
    inline def setBlurHorizontalSizeUndefined: Self = StObject.set(x, "blurHorizontalSize", js.undefined)
    
    inline def setBlurTextureSizeRatio(value: Double): Self = StObject.set(x, "blurTextureSizeRatio", value.asInstanceOf[js.Any])
    
    inline def setBlurTextureSizeRatioUndefined: Self = StObject.set(x, "blurTextureSizeRatio", js.undefined)
    
    inline def setBlurVerticalSize(value: Double): Self = StObject.set(x, "blurVerticalSize", value.asInstanceOf[js.Any])
    
    inline def setBlurVerticalSizeUndefined: Self = StObject.set(x, "blurVerticalSize", js.undefined)
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setIsStroke(value: Boolean): Self = StObject.set(x, "isStroke", value.asInstanceOf[js.Any])
    
    inline def setIsStrokeUndefined: Self = StObject.set(x, "isStroke", js.undefined)
    
    inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
    
    inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
    
    inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
    
    inline def setMainTextureRatioUndefined: Self = StObject.set(x, "mainTextureRatio", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
  }
}
