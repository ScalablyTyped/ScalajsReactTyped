package typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibilitySmoothingConfig extends StObject {
  
  var alpha: Double
}
object VisibilitySmoothingConfig {
  
  inline def apply(alpha: Double): VisibilitySmoothingConfig = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilitySmoothingConfig]
  }
  
  extension [Self <: VisibilitySmoothingConfig](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
