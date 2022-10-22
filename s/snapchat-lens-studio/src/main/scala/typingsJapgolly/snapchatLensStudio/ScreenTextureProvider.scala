package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Texture providing the current Render Target being rendered. Lens Studio v3.0+ */
trait ScreenTextureProvider
  extends StObject
     with TextureProvider
object ScreenTextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean
  ): ScreenTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[ScreenTextureProvider]
  }
}
