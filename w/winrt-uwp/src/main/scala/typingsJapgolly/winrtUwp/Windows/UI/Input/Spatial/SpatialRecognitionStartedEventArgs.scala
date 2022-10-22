package typingsJapgolly.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialRecognitionStartedEventArgs extends StObject {
  
  var interactionSourceKind: Any
  
  /* unmapped type */
  var isGesturePossible: Any
  
  /* unmapped type */
  var tryGetPointerPose: Any
}
object SpatialRecognitionStartedEventArgs {
  
  inline def apply(interactionSourceKind: Any, isGesturePossible: Any, tryGetPointerPose: Any): SpatialRecognitionStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isGesturePossible = isGesturePossible.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionStartedEventArgs]
  }
  
  extension [Self <: SpatialRecognitionStartedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
    
    inline def setIsGesturePossible(value: Any): Self = StObject.set(x, "isGesturePossible", value.asInstanceOf[js.Any])
    
    inline def setTryGetPointerPose(value: Any): Self = StObject.set(x, "tryGetPointerPose", value.asInstanceOf[js.Any])
  }
}
