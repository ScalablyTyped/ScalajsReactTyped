package typingsJapgolly.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
trait SceneAnalyzedEventArgs extends StObject {
  
  /** Gets the result frame from the scene analysis operation. */
  var resultFrame: SceneAnalysisEffectFrame
}
object SceneAnalyzedEventArgs {
  
  inline def apply(resultFrame: SceneAnalysisEffectFrame): SceneAnalyzedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalyzedEventArgs]
  }
  
  extension [Self <: SceneAnalyzedEventArgs](x: Self) {
    
    inline def setResultFrame(value: SceneAnalysisEffectFrame): Self = StObject.set(x, "resultFrame", value.asInstanceOf[js.Any])
  }
}
