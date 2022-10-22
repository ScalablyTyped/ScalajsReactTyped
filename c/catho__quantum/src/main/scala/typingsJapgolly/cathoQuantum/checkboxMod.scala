package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.anon.Checked
import typingsJapgolly.cathoQuantum.anon.ColorsSpacing
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.button
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.checkbox
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@catho/quantum/Checkbox", "Checkbox")
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
  
  @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
  @js.native
  open class CheckboxGroup protected ()
    extends Component[CheckboxGroupProps, js.Object, Any] {
    def this(props: CheckboxGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxGroupProps, context: Any) = this()
  }
  /* static members */
  object CheckboxGroup {
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Button")
    @js.native
    def Button: CheckboxButton = js.native
    inline def Button_=(x: CheckboxButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Checkbox", "CheckboxGroup.Checkbox")
    @js.native
    def Checkbox: CheckboxType = js.native
    inline def Checkbox_=(x: CheckboxType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Checkbox")(x.asInstanceOf[js.Any])
  }
  
  type CheckboxButton = ComponentType[CheckboxButtonProps]
  
  trait CheckboxButtonProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckboxButtonProps {
    
    inline def apply(name: String): CheckboxButtonProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxButtonProps]
    }
    
    extension [Self <: CheckboxButtonProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: neutral | primary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxGroupProps extends StObject {
    
    var children: js.UndefOr[
        js.Array[typingsJapgolly.react.mod.global.JSX.Element] | typingsJapgolly.react.mod.global.JSX.Element
      ] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* items */ js.UndefOr[Options], 
          /* event */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChangeEvent<HTMLInputElement> */ Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var theme: js.UndefOr[ColorsSpacing] = js.undefined
    
    var `type`: checkbox | button
  }
  object CheckboxGroupProps {
    
    inline def apply(`type`: checkbox | button): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    extension [Self <: CheckboxGroupProps](x: Self) {
      
      inline def setChildren(
        value: js.Array[typingsJapgolly.react.mod.global.JSX.Element] | typingsJapgolly.react.mod.global.JSX.Element
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: typingsJapgolly.react.mod.global.JSX.Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOnChange(
        value: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChangeEvent<HTMLInputElement> */ Any
            ]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* items */ js.UndefOr[Options], t1: /* event */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChangeEvent<HTMLInputElement> */ Any
            ]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Checked*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: checkbox | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckboxProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var theme: js.UndefOr[BaseFontSize] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(name: String): CheckboxProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type CheckboxType = ComponentType[CheckboxProps]
  
  type Options = js.Array[Checked]
}
