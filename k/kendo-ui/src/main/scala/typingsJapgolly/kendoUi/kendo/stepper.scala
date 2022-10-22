package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepper {
  
  trait Step
    extends StObject
       with Class {
    
    def deselect(): Unit
    
    def enable(value: Boolean): Unit
    
    def getEnabled(): Boolean
    
    def getIndex(): Double
    
    def getSelectable(): Boolean
    
    def getSelected(): Boolean
    
    var options: StepOptions
    
    def select(): Unit
    
    def setPrevious(value: Boolean): Unit
    
    def setValid(value: Boolean): Unit
  }
  object Step {
    
    inline def apply(
      deselect: Callback,
      enable: Boolean => Callback,
      getEnabled: CallbackTo[Boolean],
      getIndex: CallbackTo[Double],
      getSelectable: CallbackTo[Boolean],
      getSelected: CallbackTo[Boolean],
      options: StepOptions,
      select: Callback,
      setPrevious: Boolean => Callback,
      setValid: Boolean => Callback
    ): Step = {
      val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, enable = js.Any.fromFunction1((t0: Boolean) => enable(t0).runNow()), getEnabled = getEnabled.toJsFn, getIndex = getIndex.toJsFn, getSelectable = getSelectable.toJsFn, getSelected = getSelected.toJsFn, options = options.asInstanceOf[js.Any], select = select.toJsFn, setPrevious = js.Any.fromFunction1((t0: Boolean) => setPrevious(t0).runNow()), setValid = js.Any.fromFunction1((t0: Boolean) => setValid(t0).runNow()))
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setDeselect(value: Callback): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setEnable(value: Boolean => Callback): Self = StObject.set(x, "enable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnabled", value.toJsFn)
      
      inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
      
      inline def setGetSelectable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSelectable", value.toJsFn)
      
      inline def setGetSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSelected", value.toJsFn)
      
      inline def setOptions(value: StepOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
      
      inline def setSetPrevious(value: Boolean => Callback): Self = StObject.set(x, "setPrevious", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetValid(value: Boolean => Callback): Self = StObject.set(x, "setValid", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait StepOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var iconTemplate: js.UndefOr[String | js.Function] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var indicatorVisible: js.UndefOr[Boolean] = js.undefined
    
    var isFirstStep: js.UndefOr[Boolean] = js.undefined
    
    var isLastStep: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelVisible: js.UndefOr[Boolean] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var successIcon: js.UndefOr[String] = js.undefined
  }
  object StepOptions {
    
    inline def apply(): StepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOptions]
    }
    
    extension [Self <: StepOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconTemplate(value: String | js.Function): Self = StObject.set(x, "iconTemplate", value.asInstanceOf[js.Any])
      
      inline def setIconTemplateUndefined: Self = StObject.set(x, "iconTemplate", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndicatorVisible(value: Boolean): Self = StObject.set(x, "indicatorVisible", value.asInstanceOf[js.Any])
      
      inline def setIndicatorVisibleUndefined: Self = StObject.set(x, "indicatorVisible", js.undefined)
      
      inline def setIsFirstStep(value: Boolean): Self = StObject.set(x, "isFirstStep", value.asInstanceOf[js.Any])
      
      inline def setIsFirstStepUndefined: Self = StObject.set(x, "isFirstStep", js.undefined)
      
      inline def setIsLastStep(value: Boolean): Self = StObject.set(x, "isLastStep", value.asInstanceOf[js.Any])
      
      inline def setIsLastStepUndefined: Self = StObject.set(x, "isLastStep", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVisible(value: Boolean): Self = StObject.set(x, "labelVisible", value.asInstanceOf[js.Any])
      
      inline def setLabelVisibleUndefined: Self = StObject.set(x, "labelVisible", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuccessIcon(value: String): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      inline def setSuccessIconUndefined: Self = StObject.set(x, "successIcon", js.undefined)
    }
  }
}
