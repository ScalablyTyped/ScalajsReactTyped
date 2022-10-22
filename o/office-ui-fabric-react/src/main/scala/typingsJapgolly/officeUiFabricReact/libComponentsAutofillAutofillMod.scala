package typingsJapgolly.officeUiFabricReact

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofill
import typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofillProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAutofillAutofillMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
  @js.native
  open class Autofill protected ()
    extends Component[IAutofillProps, IAutofillState, Any]
       with IAutofill {
    def this(props: IAutofillProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MAutofill(nextProps: IAutofillProps): Unit = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _autoFillEnabled: Any = js.native
    
    /* private */ var _doesTextStartWith: Any = js.native
    
    /* private */ var _getCurrentInputValue: Any = js.native
    
    /**
      * Returns a string that should be used as the display value.
      * It evaluates this based on whether or not the suggested value starts with the input value
      * and whether or not autofill is enabled.
      * @param inputValue - the value that the input currently has.
      * @param suggestedDisplayValue - the possible full value
      */
    /* private */ var _getDisplayValue: Any = js.native
    
    /* private */ var _inputElement: Any = js.native
    
    /* private */ var _isComposing: Any = js.native
    
    /* private */ var _notifyInputChange: Any = js.native
    
    /* private */ var _onChanged: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onCompositionEnd: Any = js.native
    
    /* private */ var _onCompositionStart: Any = js.native
    
    /* private */ var _onCompositionUpdate: Any = js.native
    
    /* private */ var _onInputChanged: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /**
      * Attempts to enable autofill. Whether or not autofill is enabled depends on the input value,
      * whether or not any text is selected, and only if the new input value is longer than the old input value.
      * Autofill should never be set to true if the value is composing. Once compositionEnd is called, then
      * it should be completed.
      * See https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent for more information on composition.
      * @param newValue - new input value
      * @param oldValue - old input value
      * @param isComposing - if true then the text is actively being composed and it has not completed.
      * @param isComposed - if the text is a composed text value.
      */
    /* private */ var _tryEnableAutofill: Any = js.native
    
    /**
      * Updates the current input value as well as getting a new display value.
      * @param newValue - The new value from the input
      */
    /* private */ var _updateValue: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /**
      * Clear all text in the input. Sets value to '';
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAutofill(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAutofill(): Unit = js.native
    
    /**
      * The current index of the cursor in the input area. Returns -1 if the input element
      * is not ready.
      */
    /* CompleteClass */
    var cursorLocation: Double | Null = js.native
    
    /**
      * Focus the input element.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /**
      * The current input element.
      */
    /* CompleteClass */
    var inputElement: HTMLInputElement | Null = js.native
    
    /**
      * A boolean for whether or not there is a value selected in the input area.
      */
    /* CompleteClass */
    var isValueSelected: Boolean = js.native
    
    /**
      * the current index of where the selection ends. Returns -1 if the input element
      * is not ready.
      */
    /* CompleteClass */
    var selectionEnd: Double | Null = js.native
    
    /**
      * The current index of where the selection starts. Returns -1 if the input element
      * is not ready.
      */
    /* CompleteClass */
    var selectionStart: Double | Null = js.native
    
    /**
      * The current text value that the user has entered.
      */
    /* CompleteClass */
    var value: String = js.native
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "BaseAutoFill")
  @js.native
  open class BaseAutoFill protected () extends Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  trait IAutofillState extends StObject {
    
    var displayValue: js.UndefOr[String] = js.undefined
  }
  object IAutofillState {
    
    inline def apply(): IAutofillState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAutofillState]
    }
    
    extension [Self <: IAutofillState](x: Self) {
      
      inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    }
  }
}
