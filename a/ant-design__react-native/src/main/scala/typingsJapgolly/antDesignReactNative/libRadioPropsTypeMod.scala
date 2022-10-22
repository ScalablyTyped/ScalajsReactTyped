package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.anon.ValueRadioValue
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxForwardedRef
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxItemPropsType
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioPropsTypeMod {
  
  trait OnGroupChangeParams extends StObject {
    
    var target: ValueRadioValue
  }
  object OnGroupChangeParams {
    
    inline def apply(target: ValueRadioValue): OnGroupChangeParams = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnGroupChangeParams]
    }
    
    extension [Self <: OnGroupChangeParams](x: Self) {
      
      inline def setTarget(value: ValueRadioValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioForwardedRef = CheckboxForwardedRef
  
  trait RadioGroupContextProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onChange(_e: OnGroupChangeParams): Unit
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioGroupContextProps {
    
    inline def apply(onChange: OnGroupChangeParams => Callback): RadioGroupContextProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: OnGroupChangeParams) => onChange(t0).runNow()))
      __obj.asInstanceOf[RadioGroupContextProps]
    }
    
    extension [Self <: RadioGroupContextProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: OnGroupChangeParams => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: OnGroupChangeParams) => value(t0).runNow()))
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioGroupPropsType extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultValue: js.UndefOr[RadioValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* _e */ OnGroupChangeParams, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[RadioOptionType | RadioValue]] = js.undefined
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioGroupPropsType {
    
    inline def apply(): RadioGroupPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupPropsType]
    }
    
    extension [Self <: RadioGroupPropsType](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: RadioValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* _e */ OnGroupChangeParams => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* _e */ OnGroupChangeParams) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[RadioOptionType | RadioValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (RadioOptionType | RadioValue)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.CheckboxPropsType because Already inherited
  - typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioPropsType because var conflicts: checked, children, defaultChecked, disabled, indeterminate, onChange, prefixCls. Inlined value */ trait RadioItemPropsType
    extends StObject
       with CheckboxItemPropsType {
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioItemPropsType {
    
    inline def apply(): RadioItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemPropsType]
    }
    
    extension [Self <: RadioItemPropsType](x: Self) {
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: Node
    
    var value: RadioValue
  }
  object RadioOptionType {
    
    inline def apply(): RadioOptionType = {
      val __obj = js.Dynamic.literal(label = null)
      __obj.asInstanceOf[RadioOptionType]
    }
    
    extension [Self <: RadioOptionType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioPropsType
    extends StObject
       with CheckboxPropsType {
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioPropsType {
    
    inline def apply(): RadioPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioPropsType]
    }
    
    extension [Self <: RadioPropsType](x: Self) {
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RadioValue = js.UndefOr[String | Double]
}
