package typingsJapgolly.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlWrapperOptions extends StObject {
  
  var containerId: String
  
  var controlType: String
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var state: js.UndefOr[js.Object] = js.undefined
}
object ControlWrapperOptions {
  
  inline def apply(containerId: String, controlType: String): ControlWrapperOptions = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlWrapperOptions]
  }
  
  extension [Self <: ControlWrapperOptions](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
