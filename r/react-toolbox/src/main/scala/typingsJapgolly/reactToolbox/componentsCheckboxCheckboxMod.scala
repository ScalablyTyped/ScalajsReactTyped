package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCheckboxCheckboxMod {
  
  @JSImport("react-toolbox/components/checkbox/Checkbox", JSImport.Default)
  @js.native
  open class default protected () extends Checkbox {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/checkbox/Checkbox", "Checkbox")
  @js.native
  open class Checkbox protected ()
    extends Component[CheckboxProps, js.Object, Any] {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: Any) = this()
  }
  
  trait CheckboxProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Value for the checkbox, can be true or false.
      * @default false
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If true, the checkbox shown as disabled and cannot be modified.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text label to attach next to the checkbox element.
      */
    var label: js.UndefOr[Node] = js.undefined
    
    /**
      * The name of the field to set in the input checkbox.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback called when the checkbox is blurred.
      */
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the checkbox value is changed.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CheckboxTheme] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTheme(value: CheckboxTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CheckboxTheme extends StObject {
    
    /**
      * Used as root in the check element.
      */
    var check: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the check element when it's checked.
      */
    var checked: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the component is disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used as the root class of the component.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the input element.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the ripple component.
      */
    var ripple: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the text label.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object CheckboxTheme {
    
    inline def apply(): CheckboxTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxTheme]
    }
    
    extension [Self <: CheckboxTheme](x: Self) {
      
      inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
