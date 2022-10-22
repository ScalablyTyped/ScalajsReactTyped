package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a segmentation texture and its placement using information provided by Object tracking. */
trait ObjectTrackingTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Index of the tracked object to use for segmentation. */
  var objectIndex: Double
}
object ObjectTrackingTextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean,
    objectIndex: Double
  ): ObjectTrackingTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType), objectIndex = objectIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTrackingTextureProvider]
  }
  
  extension [Self <: ObjectTrackingTextureProvider](x: Self) {
    
    inline def setObjectIndex(value: Double): Self = StObject.set(x, "objectIndex", value.asInstanceOf[js.Any])
  }
}
