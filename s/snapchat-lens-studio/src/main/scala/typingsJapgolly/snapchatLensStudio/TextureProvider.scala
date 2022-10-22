package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base class for specialized Texture providers. Can be accessed through Texture.control. */
trait TextureProvider
  extends StObject
     with ScriptObject {
  
  /** Returns the texture’s aspect ratio, which is calculated as width / height. */
  def getAspect(): Double
  
  /** Returns the height of the texture in pixels. */
  def getHeight(): Double
  
  /** Returns the width of the texture in pixels. */
  def getWidth(): Double
}
object TextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean
  ): TextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TextureProvider]
  }
  
  extension [Self <: TextureProvider](x: Self) {
    
    inline def setGetAspect(value: CallbackTo[Double]): Self = StObject.set(x, "getAspect", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
