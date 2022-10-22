package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.materialUiStrings.left
import typingsJapgolly.materialUi.materialUiStrings.right
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switches {
  
  @js.native
  trait Checkbox
    extends Component[CheckboxProps, js.Object, Any] {
    
    /** @deprecated Use checked property instead */
    def isChecked(): Unit = js.native
    
    /** @deprecated Use checked property instead */
    def setChecked(newCheckedValue: Boolean): Unit = js.native
  }
  
  trait CheckboxProps
    extends StObject
       with CommonEnhancedSwitchProps[Checkbox] {
    
    var checkedIcon: js.UndefOr[Element] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* event */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* checked */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var uncheckedIcon: js.UndefOr[Element] = js.undefined
    
    // Normally an SvgIcon
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setCheckedIcon(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnCheck(
        value: (/* event */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* checked */ Boolean) => Callback
      ): Self = StObject.set(x, "onCheck", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* checked */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setUncheckedIcon(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
  
  trait CommonEnhancedSwitchProps[T]
    extends StObject
       with InputHTMLAttributes[js.Object] {
    
    var label: js.UndefOr[Node] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[T]] = js.undefined
  }
  object CommonEnhancedSwitchProps {
    
    inline def apply[T](): CommonEnhancedSwitchProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
    }
    
    extension [Self <: CommonEnhancedSwitchProps[?], T](x: Self & CommonEnhancedSwitchProps[T]) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: T | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: T | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait EnhancedSwitch
    extends Component[EnhancedSwitchProps, js.Object, Any] {
    
    def getValue(): String = js.native
    
    def isKeyboardFocused(): Boolean = js.native
    
    def isSwitched(): Boolean = js.native
    
    def setSwitched(newSwitchedValue: Boolean): Unit = js.native
  }
  
  trait EnhancedSwitchProps
    extends StObject
       with CommonEnhancedSwitchProps[EnhancedSwitch] {
    
    var defaultSwitched: js.UndefOr[Boolean] = js.undefined
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: CSSProperties
    
    var inputType: String
    
    var labelPosition: js.UndefOr[String] = js.undefined
    
    // oneOf(['left', 'right'])
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    def onParentShouldUpdate(isInputChecked: Boolean): Unit
    
    var onSwitch: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* isInputChecked */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var rippleColor: js.UndefOr[String] = js.undefined
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var switchElement: Element
    
    var switched: Boolean
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    @JSName("value")
    var value_EnhancedSwitchProps: js.UndefOr[String] = js.undefined
  }
  object EnhancedSwitchProps {
    
    inline def apply(
      inputStyle: CSSProperties,
      inputType: String,
      onParentShouldUpdate: Boolean => Callback,
      switchElement: VdomElement,
      switched: Boolean
    ): EnhancedSwitchProps = {
      val __obj = js.Dynamic.literal(inputStyle = inputStyle.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], onParentShouldUpdate = js.Any.fromFunction1((t0: Boolean) => onParentShouldUpdate(t0).runNow()), switchElement = switchElement.rawElement.asInstanceOf[js.Any], switched = switched.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedSwitchProps]
    }
    
    extension [Self <: EnhancedSwitchProps](x: Self) {
      
      inline def setDefaultSwitched(value: Boolean): Self = StObject.set(x, "defaultSwitched", value.asInstanceOf[js.Any])
      
      inline def setDefaultSwitchedUndefined: Self = StObject.set(x, "defaultSwitched", js.undefined)
      
      inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnParentShouldUpdate(value: Boolean => Callback): Self = StObject.set(x, "onParentShouldUpdate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setOnSwitch(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* isInputChecked */ Boolean) => Callback
      ): Self = StObject.set(x, "onSwitch", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* isInputChecked */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnSwitchUndefined: Self = StObject.set(x, "onSwitch", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      inline def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      inline def setSwitchElement(value: VdomElement): Self = StObject.set(x, "switchElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
      
      inline def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Object, Any] {
    
    def getValue(): String = js.native
    
    def isChecked(): Boolean = js.native
  }
  
  @js.native
  trait RadioButtonGroup
    extends Component[RadioButtonGroupProps, js.Object, Any] {
    
    def clearValue(): Unit = js.native
    
    def getSelectedValue(): String = js.native
    
    def setSelectedValue(newSelectionValue: String): Unit = js.native
  }
  
  trait RadioButtonGroupProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSelected: js.UndefOr[Any] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], 
          /* selected */ String, 
          Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var valueSelected: js.UndefOr[Any] = js.undefined
  }
  object RadioButtonGroupProps {
    
    inline def apply(name: String): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    extension [Self <: RadioButtonGroupProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelected(value: Any): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(
        value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* selected */ String) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* selected */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValueSelected(value: Any): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      inline def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
  
  trait RadioButtonProps
    extends StObject
       with CommonEnhancedSwitchProps[RadioButton] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var checkedIcon: js.UndefOr[Element] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], 
          /* selected */ String, 
          Unit
        ]
      ] = js.undefined
    
    var uncheckedIcon: js.UndefOr[Element] = js.undefined
    
    // Normally an SvgIcon
    @JSName("value")
    var value_RadioButtonProps: js.UndefOr[Any] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def setCheckedIcon(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnCheck(
        value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* selected */ String) => Callback
      ): Self = StObject.set(x, "onCheck", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* selected */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setUncheckedIcon(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Toggle
    extends Component[ToggleProps, js.Object, Any] {
    
    def isToggled(): Boolean = js.native
    
    def setToggled(newToggledValue: Boolean): Unit = js.native
  }
  
  trait ToggleProps
    extends StObject
       with CommonEnhancedSwitchProps[Toggle] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var defaultToggled: js.UndefOr[Boolean] = js.undefined
    
    var elementStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function2[
          /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], 
          /* isInputChecked */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var toggled: js.UndefOr[Boolean] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  }
  object ToggleProps {
    
    inline def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    extension [Self <: ToggleProps](x: Self) {
      
      inline def setDefaultToggled(value: Boolean): Self = StObject.set(x, "defaultToggled", value.asInstanceOf[js.Any])
      
      inline def setDefaultToggledUndefined: Self = StObject.set(x, "defaultToggled", js.undefined)
      
      inline def setElementStyle(value: CSSProperties): Self = StObject.set(x, "elementStyle", value.asInstanceOf[js.Any])
      
      inline def setElementStyleUndefined: Self = StObject.set(x, "elementStyle", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnToggle(
        value: (/* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], /* isInputChecked */ Boolean) => Callback
      ): Self = StObject.set(x, "onToggle", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[js.Object & org.scalajs.dom.Element], t1: /* isInputChecked */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      inline def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      inline def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      inline def setThumbSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "thumbSwitchedStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbSwitchedStyleUndefined: Self = StObject.set(x, "thumbSwitchedStyle", js.undefined)
      
      inline def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      inline def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "trackSwitchedStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackSwitchedStyleUndefined: Self = StObject.set(x, "trackSwitchedStyle", js.undefined)
      
      inline def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
}
