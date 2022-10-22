package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Texture Provider giving a cropped region of the input texture, calculated based on face position. Can be accessed using Texture.control on a FaceCropTexture asset. For more information, see the
  * Crop Textures guide.
  */
trait FaceCropTextureProvider
  extends StObject
     with CropTextureProvider {
  
  /** Ratio of the mouth position on the cropped texture. Value ranges from 0 to 1, with 0 having no effect and 1 centering the image on the mouth. */
  var faceCenterMouthWeight: Double
  
  /** Index of the face being tracked. */
  var faceIndex: Double
  
  /** Scaling of the cropped texture. */
  var textureScale: vec2
}
object FaceCropTextureProvider {
  
  inline def apply(
    faceCenterMouthWeight: Double,
    faceIndex: Double,
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    inputTexture: Texture,
    isOfType: String => Boolean,
    textureScale: vec2
  ): FaceCropTextureProvider = {
    val __obj = js.Dynamic.literal(faceCenterMouthWeight = faceCenterMouthWeight.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), textureScale = textureScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceCropTextureProvider]
  }
  
  extension [Self <: FaceCropTextureProvider](x: Self) {
    
    inline def setFaceCenterMouthWeight(value: Double): Self = StObject.set(x, "faceCenterMouthWeight", value.asInstanceOf[js.Any])
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setTextureScale(value: vec2): Self = StObject.set(x, "textureScale", value.asInstanceOf[js.Any])
  }
}
