package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.grommet.anon.Indicator
import typingsJapgolly.grommet.anon.Message
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxProps
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.Omit
import typingsJapgolly.grommet.es6UtilsMod.PlaceHolderType
import typingsJapgolly.grommet.grommetStrings.placeholder
import typingsJapgolly.grommet.grommetStrings.required
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsFormFieldMod {
  
  @JSImport("grommet/es6/components/FormField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormField[T](p: FormFieldExtendedProps & T): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormField")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'placeholder' | 'required'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait FormFieldExtendedProps
    extends StObject
       with FormFieldProps
  object FormFieldExtendedProps {
    
    inline def apply(): FormFieldExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldExtendedProps]
    }
  }
  
  trait FormFieldProps extends StObject {
    
    var component: js.UndefOr[Any] = js.undefined
    
    var contentProps: js.UndefOr[BoxProps] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String | Node] = js.undefined
    
    var help: js.UndefOr[String | Node] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String | Node] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[String]] = js.undefined
    
    var pad: js.UndefOr[Boolean] = js.undefined
    
    // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
    var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
    
    var required: js.UndefOr[Boolean | Indicator] = js.undefined
    
    var validate: js.UndefOr[
        Message | (js.Function1[/* repeated */ Any, Any]) | (js.Array[Message | (js.Function1[/* repeated */ Any, Any])])
      ] = js.undefined
  }
  object FormFieldProps {
    
    inline def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    extension [Self <: FormFieldProps](x: Self) {
      
      inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContentProps(value: BoxProps): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String | Node): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHelp(value: String | Node): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHelpVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setHelpVdomElement(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setInfo(value: String | Node): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoNull: Self = StObject.set(x, "info", null)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setInfoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "info", js.Array(value*))
      
      inline def setInfoVdomElement(value: VdomElement): Self = StObject.set(x, "info", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean | Indicator): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidate(
        value: Message | (js.Function1[/* repeated */ Any, Any]) | (js.Array[Message | (js.Function1[/* repeated */ Any, Any])])
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: (Message | (js.Function1[/* repeated */ Any, Any]))*): Self = StObject.set(x, "validate", js.Array(value*))
    }
  }
  
  type inputProps = Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    placeholder | required
  ]
}
