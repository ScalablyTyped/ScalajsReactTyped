package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxGroupMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox/Group", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  
  @JSImport("antd/lib/checkbox/Group", "GroupContext")
  @js.native
  val GroupContext: Context[CheckboxGroupContext | Null] = js.native
  
  trait AbstractCheckboxGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Array[CheckboxOptionType | String | Double]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AbstractCheckboxGroupProps {
    
    inline def apply(): AbstractCheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractCheckboxGroupProps]
    }
    
    extension [Self <: AbstractCheckboxGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOptions(value: js.Array[CheckboxOptionType | String | Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (CheckboxOptionType | String | Double)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CheckboxGroupContext extends StObject {
    
    def cancelValue(`val`: String): Unit
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def registerValue(`val`: String): Unit
    
    var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object CheckboxGroupContext {
    
    inline def apply(cancelValue: String => Callback, registerValue: String => Callback): CheckboxGroupContext = {
      val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1((t0: String) => cancelValue(t0).runNow()), registerValue = js.Any.fromFunction1((t0: String) => registerValue(t0).runNow()))
      __obj.asInstanceOf[CheckboxGroupContext]
    }
    
    extension [Self <: CheckboxGroupContext](x: Self) {
      
      inline def setCancelValue(value: String => Callback): Self = StObject.set(x, "cancelValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegisterValue(value: String => Callback): Self = StObject.set(x, "registerValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setToggleOption(value: /* option */ CheckboxOptionType => Callback): Self = StObject.set(x, "toggleOption", js.Any.fromFunction1((t0: /* option */ CheckboxOptionType) => value(t0).runNow()))
      
      inline def setToggleOptionUndefined: Self = StObject.set(x, "toggleOption", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxGroupProps
    extends StObject
       with AbstractCheckboxGroupProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.undefined
    
    var value: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
  }
  object CheckboxGroupProps {
    
    inline def apply(): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    extension [Self <: CheckboxGroupProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* checkedValue */ js.Array[CheckboxValueType]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait CheckboxOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: Node
    
    var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: CheckboxValueType
  }
  object CheckboxOptionType {
    
    inline def apply(value: CheckboxValueType): CheckboxOptionType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[CheckboxOptionType]
    }
    
    extension [Self <: CheckboxOptionType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* e */ CheckboxChangeEvent => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ CheckboxChangeEvent) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: CheckboxValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxValueType = String | Double | Boolean
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxGroupMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = default
}
