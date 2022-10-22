package typingsJapgolly.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallBackProps extends StObject {
  
  var action: String
  
  var controlled: Boolean
  
  var index: Double
  
  var lifecycle: String
  
  var size: Double
  
  var status: valueof[typingsJapgolly.reactJoyride.mod.status]
  
  var step: Step
  
  var `type`: String
}
object CallBackProps {
  
  inline def apply(
    action: String,
    controlled: Boolean,
    index: Double,
    lifecycle: String,
    size: Double,
    status: valueof[status],
    step: Step,
    `type`: String
  ): CallBackProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallBackProps]
  }
  
  extension [Self <: CallBackProps](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setControlled(value: Boolean): Self = StObject.set(x, "controlled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: String): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: valueof[status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
