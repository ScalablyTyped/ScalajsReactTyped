package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  var disabled: Boolean
  
  def onChange(): Any
  
  var step: Double
  
  var useAmPm: AmPmOptions
  
  var useNativeInteraction: Boolean
  
  var value: Any
}
object Step {
  
  inline def apply(
    disabled: Boolean,
    onChange: CallbackTo[Any],
    step: Double,
    useAmPm: AmPmOptions,
    useNativeInteraction: Boolean,
    value: Any
  ): Step = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = onChange.toJsFn, step = step.asInstanceOf[js.Any], useAmPm = useAmPm.asInstanceOf[js.Any], useNativeInteraction = useNativeInteraction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: CallbackTo[Any]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setUseAmPm(value: AmPmOptions): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
    
    inline def setUseNativeInteraction(value: Boolean): Self = StObject.set(x, "useNativeInteraction", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
