package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactJoyride.anon.Arialabel
import typingsJapgolly.reactJoyride.anon.Ariamodal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipRenderProps
  extends StObject
     with BeaconRenderProps {
  
  var backProps: Arialabel
  
  var closeProps: Arialabel
  
  var primaryProps: Arialabel
  
  var skipProps: Arialabel
  
  var tooltipProps: Ariamodal
}
object TooltipRenderProps {
  
  inline def apply(
    backProps: Arialabel,
    closeProps: Arialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: Arialabel,
    setTooltipRef: Callback,
    size: Double,
    skipProps: Arialabel,
    step: Step,
    tooltipProps: Ariamodal
  ): TooltipRenderProps = {
    val __obj = js.Dynamic.literal(backProps = backProps.asInstanceOf[js.Any], closeProps = closeProps.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], primaryProps = primaryProps.asInstanceOf[js.Any], setTooltipRef = setTooltipRef.toJsFn, size = size.asInstanceOf[js.Any], skipProps = skipProps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipRenderProps]
  }
  
  extension [Self <: TooltipRenderProps](x: Self) {
    
    inline def setBackProps(value: Arialabel): Self = StObject.set(x, "backProps", value.asInstanceOf[js.Any])
    
    inline def setCloseProps(value: Arialabel): Self = StObject.set(x, "closeProps", value.asInstanceOf[js.Any])
    
    inline def setPrimaryProps(value: Arialabel): Self = StObject.set(x, "primaryProps", value.asInstanceOf[js.Any])
    
    inline def setSkipProps(value: Arialabel): Self = StObject.set(x, "skipProps", value.asInstanceOf[js.Any])
    
    inline def setTooltipProps(value: Ariamodal): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
  }
}
