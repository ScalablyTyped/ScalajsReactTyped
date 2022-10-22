package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.cathoQuantum.anon.ColorsSpacing
import typingsJapgolly.cathoQuantum.anon.ComponentsSpacing
import typingsJapgolly.cathoQuantum.anon.Disabled
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.button
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.radio
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xlarge
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.xsmall
import typingsJapgolly.cathoQuantum.iconMod.IconNames
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RadioGroupProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/RadioGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/RadioGroup", "default.Button")
    @js.native
    def Button: RadioButton = js.native
    inline def Button_=(x: RadioButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/RadioGroup", "default.Radio")
    @js.native
    def Radio: typingsJapgolly.cathoQuantum.radioGroupMod.Radio = js.native
    inline def Radio_=(x: Radio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Radio")(x.asInstanceOf[js.Any])
  }
  
  type Radio = ComponentType[RadioProps]
  
  type RadioButton = ComponentType[RadioButtonProps]
  
  trait RadioButtonProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconNames | String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit | ChangeEventHandler[HTMLInputElement]]] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
    
    var theme: js.UndefOr[ComponentsSpacing] = js.undefined
    
    var value: String
  }
  object RadioButtonProps {
    
    inline def apply(value: String): RadioButtonProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: IconNames | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: CallbackTo[Unit | ChangeEventHandler[HTMLInputElement]]): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: neutral | primary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: ComponentsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioGroup = japgolly.scalajs.react.facade.React.Component[RadioGroupProps & js.Object, js.Object]
  
  trait RadioGroupProps extends StObject {
    
    var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[js.Function0[js.Object | ChangeEventHandler[HTMLInputElement]]] = js.undefined
    
    var options: js.UndefOr[js.Array[Disabled]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
    
    var theme: js.UndefOr[ColorsSpacing] = js.undefined
    
    var `type`: js.UndefOr[radio | button] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(name: String): RadioGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: CallbackTo[js.Object | ChangeEventHandler[HTMLInputElement]]): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[Disabled]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Disabled*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: radio | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RadioProps extends StObject {
    
    var children: js.UndefOr[String | js.Array[Node] | Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var theme: js.UndefOr[ColorsSpacing] = js.undefined
    
    var value: String
  }
  object RadioProps {
    
    inline def apply(value: String): RadioProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setChildren(value: String | js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTheme(value: ColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
