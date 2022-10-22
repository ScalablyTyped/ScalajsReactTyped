package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.PrefixString
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVariableInputMod {
  
  @JSImport("wix-style-react/dist/types/VariableInput", JSImport.Default)
  @js.native
  open class default () extends VariableInput
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/VariableInput.VariableInputSize ]: wix-style-react.wix-style-react/dist/types/VariableInput.VariableInputSize} */
  object SIZE {
    
    @JSImport("wix-style-react/dist/types/VariableInput", "SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/VariableInput", "SIZE.large")
    @js.native
    def large: VariableInputSize = js.native
    inline def large_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("large")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VariableInput", "SIZE.medium")
    @js.native
    def medium: VariableInputSize = js.native
    inline def medium_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VariableInput", "SIZE.small")
    @js.native
    def small: VariableInputSize = js.native
    inline def small_=(x: VariableInputSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("small")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait VariableInput
    extends PureComponent[VariableInputProps, js.Object, Any] {
    
    def insertVariable(key: String): Unit = js.native
    
    def setValue(key: String): Unit = js.native
  }
  
  trait VariableInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[VariableInputSize] = js.undefined
    
    var status: js.UndefOr[StatusIndicatorState] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var variableParser: js.UndefOr[js.Function1[/* value */ String, String | Boolean]] = js.undefined
    
    var variableTemplate: js.UndefOr[PrefixString] = js.undefined
  }
  object VariableInputProps {
    
    inline def apply(): VariableInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableInputProps]
    }
    
    extension [Self <: VariableInputProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOnBlur(value: /* value */ String => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* value */ String => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSubmit(value: /* value */ String => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: VariableInputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: StatusIndicatorState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVariableParser(value: /* value */ String => String | Boolean): Self = StObject.set(x, "variableParser", js.Any.fromFunction1(value))
      
      inline def setVariableParserUndefined: Self = StObject.set(x, "variableParser", js.undefined)
      
      inline def setVariableTemplate(value: PrefixString): Self = StObject.set(x, "variableTemplate", value.asInstanceOf[js.Any])
      
      inline def setVariableTemplateUndefined: Self = StObject.set(x, "variableTemplate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait VariableInputSize extends StObject
  object VariableInputSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
}
