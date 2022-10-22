package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlUseFormControlMod {
  
  @JSImport("@material-ui/core/FormControl/useFormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[FormControlState]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.error
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.margin
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.required
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.variant
  */
  trait ContextFromPropsKey extends StObject
  object ContextFromPropsKey {
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typingsJapgolly.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.error]
    
    inline def fullWidth: typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def hiddenLabel: typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel = "hiddenLabel".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.hiddenLabel]
    
    inline def margin: typingsJapgolly.materialUiCore.materialUiCoreStrings.margin = "margin".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.margin]
    
    inline def required: typingsJapgolly.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.required]
    
    inline def variant: typingsJapgolly.materialUiCore.materialUiCoreStrings.variant = "variant".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.variant]
  }
  
  /* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, @material-ui/core.@material-ui/core/FormControl/useFormControl.ContextFromPropsKey> */
  trait FormControlState extends StObject {
    
    var adornedStart: Boolean
    
    var disabled: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    var fullWidth: js.UndefOr[Any] = js.undefined
    
    var hiddenLabel: js.UndefOr[Any] = js.undefined
    
    var margin: js.UndefOr[Any] = js.undefined
    
    def onBlur(): Unit
    
    def onEmpty(): Unit
    
    def onFilled(): Unit
    
    def onFocus(): Unit
    
    var required: js.UndefOr[Any] = js.undefined
    
    var variant: js.UndefOr[Any] = js.undefined
  }
  object FormControlState {
    
    inline def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: Callback,
      onEmpty: Callback,
      onFilled: Callback,
      onFocus: Callback
    ): FormControlState = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onEmpty = onEmpty.toJsFn, onFilled = onFilled.toJsFn, onFocus = onFocus.toJsFn)
      __obj.asInstanceOf[FormControlState]
    }
    
    extension [Self <: FormControlState](x: Self) {
      
      inline def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Any): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHiddenLabel(value: Any): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      inline def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
      
      inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnEmpty(value: Callback): Self = StObject.set(x, "onEmpty", value.toJsFn)
      
      inline def setOnFilled(value: Callback): Self = StObject.set(x, "onFilled", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setRequired(value: Any): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setVariant(value: Any): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
