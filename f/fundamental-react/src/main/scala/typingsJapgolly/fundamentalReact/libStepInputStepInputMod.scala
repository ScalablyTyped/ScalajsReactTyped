package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialStepInputProps
import typingsJapgolly.fundamentalReact.anon.State
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapStepInpu
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.StepInput
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepInputStepInputMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> & {  displayName :'StepInput'} */
  object default {
    
    inline def apply(props: StepInputProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: StepInputProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialStepInputProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialStepInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.displayName")
    @js.native
    def displayName: js.UndefOr[StepInput | String] = js.native
    inline def displayName_=(x: js.UndefOr[StepInput | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/StepInput/StepInput", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapStepInpu] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapStepInpu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait StepInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var localizedText: js.UndefOr[Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* stepValue */ Double, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object StepInputProps {
    
    inline def apply(): StepInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepInputProps]
    }
    
    extension [Self <: StepInputProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLocalizedText(value: Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setOnChange(value: /* stepValue */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* stepValue */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
