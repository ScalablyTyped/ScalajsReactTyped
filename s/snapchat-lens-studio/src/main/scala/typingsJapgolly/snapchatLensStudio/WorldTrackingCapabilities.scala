package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about whether certain world tracking features are supported by the device. */
trait WorldTrackingCapabilities
  extends StObject
     with ScriptObject {
  
  /** Returns true if the device supports scene reconstruction. */
  var sceneReconstructionSupported: Boolean
}
object WorldTrackingCapabilities {
  
  inline def apply(
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    sceneReconstructionSupported: Boolean
  ): WorldTrackingCapabilities = {
    val __obj = js.Dynamic.literal(getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), sceneReconstructionSupported = sceneReconstructionSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldTrackingCapabilities]
  }
  
  extension [Self <: WorldTrackingCapabilities](x: Self) {
    
    inline def setSceneReconstructionSupported(value: Boolean): Self = StObject.set(x, "sceneReconstructionSupported", value.asInstanceOf[js.Any])
  }
}
