package typingsJapgolly.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchRotateOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object PinchRotateOptions {
  
  inline def apply(): PinchRotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchRotateOptions]
  }
  
  extension [Self <: PinchRotateOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
