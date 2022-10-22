package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeaconRenderProps extends StObject {
  
  var continuous: Boolean
  
  var index: Double
  
  var isLastStep: Boolean
  
  def setTooltipRef(): Unit
  
  var size: Double
  
  var step: Step
}
object BeaconRenderProps {
  
  inline def apply(
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    setTooltipRef: Callback,
    size: Double,
    step: Step
  ): BeaconRenderProps = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], setTooltipRef = setTooltipRef.toJsFn, size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeaconRenderProps]
  }
  
  extension [Self <: BeaconRenderProps](x: Self) {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsLastStep(value: Boolean): Self = StObject.set(x, "isLastStep", value.asInstanceOf[js.Any])
    
    inline def setSetTooltipRef(value: Callback): Self = StObject.set(x, "setTooltipRef", value.toJsFn)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
