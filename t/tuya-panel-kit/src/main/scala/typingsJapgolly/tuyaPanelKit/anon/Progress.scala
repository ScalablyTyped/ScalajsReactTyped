package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  /**
    * Animated node representing the progress value of the next screen.
    */
  var progress: AnimatedInterpolation[Double | String]
}
object Progress {
  
  inline def apply(progress: AnimatedInterpolation[Double | String]): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
