package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.checkbox
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesCheckboxCheckboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[CheckboxProps, js.Object, Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentClassP[CheckboxProps & js.Object] = js.native
  
  trait CheckboxProps
    extends StObject
       with StrictCheckboxProps
       with /* key */ StringDictionary[Any]
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
  }
  
  trait StrictCheckboxProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** Removes padding for a label. Auto applied when there is no label. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    /** A unique identifier. */
    @JSName("id")
    var id_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** The text of the associated label element. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.undefined
    
    /**
      * Called when the user attempts to change the checked state.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed checked/indeterminate state.
      */
    @JSName("onChange")
    var onChange_StrictCheckboxProps: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the checkbox or label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onClick")
    var onClick_StrictCheckboxProps: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the user presses down on the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onMouseDown")
    var onMouseDown_StrictCheckboxProps: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the user releases the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onMouseUp")
    var onMouseUp_StrictCheckboxProps: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    /** Format as a radio element. This means it is an exclusive option. */
    var radio: js.UndefOr[Boolean] = js.undefined
    
    /** Format to emphasize the current selection state. */
    var slider: js.UndefOr[Boolean] = js.undefined
    
    /** A checkbox can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
    
    /** Format to show an on or off choice. */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    /** HTML input type, either checkbox or radio. */
    @JSName("type")
    var type_StrictCheckboxProps: js.UndefOr[checkbox | radio] = js.undefined
    
    /** The HTML input value. */
    @JSName("value")
    var value_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
  }
  object StrictCheckboxProps {
    
    inline def apply(): StrictCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCheckboxProps]
    }
    
    extension [Self <: StrictCheckboxProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction3(
        value: (/* component */ ElementType, HtmlLabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseDown(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseUp(value: (/* event */ ReactMouseEventFrom[HTMLInputElement], /* data */ CheckboxProps) => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLInputElement], t1: /* data */ CheckboxProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setType(value: checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentClassP[CheckboxProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesCheckboxCheckboxMod.foo` */
  override def _to: ComponentClassP[CheckboxProps & js.Object] = default
}
