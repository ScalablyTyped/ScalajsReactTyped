package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for Texture Providers that crop an input texture. */
trait CropTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Input texture to crop. */
  var inputTexture: Texture
}
object CropTextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    inputTexture: Texture,
    isOfType: String => Boolean
  ): CropTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[CropTextureProvider]
  }
  
  extension [Self <: CropTextureProvider](x: Self) {
    
    inline def setInputTexture(value: Texture): Self = StObject.set(x, "inputTexture", value.asInstanceOf[js.Any])
  }
}
