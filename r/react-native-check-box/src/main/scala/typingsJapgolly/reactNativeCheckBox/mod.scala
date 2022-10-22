package typingsJapgolly.reactNativeCheckBox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CheckBoxProps, js.Object, Any]
  
  type CheckBox = japgolly.scalajs.react.facade.React.Component[CheckBoxProps & js.Object, js.Object]
  
  trait CheckBoxProps extends StObject {
    
    var checkBoxColor: js.UndefOr[String] = js.undefined
    
    var checkedCheckBoxColor: js.UndefOr[String] = js.undefined
    
    var checkedImage: js.UndefOr[Element] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isChecked: Boolean
    
    var leftText: js.UndefOr[String] = js.undefined
    
    var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var leftTextView: js.UndefOr[Node] = js.undefined
    
    def onClick(): Unit
    
    var rightText: js.UndefOr[String] = js.undefined
    
    var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var rightTextView: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var unCheckedImage: js.UndefOr[Element] = js.undefined
    
    var uncheckedCheckBoxColor: js.UndefOr[String] = js.undefined
  }
  object CheckBoxProps {
    
    inline def apply(isChecked: Boolean, onClick: Callback): CheckBoxProps = {
      val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = onClick.toJsFn)
      __obj.asInstanceOf[CheckBoxProps]
    }
    
    extension [Self <: CheckBoxProps](x: Self) {
      
      inline def setCheckBoxColor(value: String): Self = StObject.set(x, "checkBoxColor", value.asInstanceOf[js.Any])
      
      inline def setCheckBoxColorUndefined: Self = StObject.set(x, "checkBoxColor", js.undefined)
      
      inline def setCheckedCheckBoxColor(value: String): Self = StObject.set(x, "checkedCheckBoxColor", value.asInstanceOf[js.Any])
      
      inline def setCheckedCheckBoxColorUndefined: Self = StObject.set(x, "checkedCheckBoxColor", js.undefined)
      
      inline def setCheckedImage(value: VdomElement): Self = StObject.set(x, "checkedImage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedImageUndefined: Self = StObject.set(x, "checkedImage", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setLeftText(value: String): Self = StObject.set(x, "leftText", value.asInstanceOf[js.Any])
      
      inline def setLeftTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "leftTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLeftTextStyleNull: Self = StObject.set(x, "leftTextStyle", null)
      
      inline def setLeftTextStyleUndefined: Self = StObject.set(x, "leftTextStyle", js.undefined)
      
      inline def setLeftTextUndefined: Self = StObject.set(x, "leftText", js.undefined)
      
      inline def setLeftTextView(value: VdomNode): Self = StObject.set(x, "leftTextView", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLeftTextViewNull: Self = StObject.set(x, "leftTextView", null)
      
      inline def setLeftTextViewUndefined: Self = StObject.set(x, "leftTextView", js.undefined)
      
      inline def setLeftTextViewVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "leftTextView", js.Array(value*))
      
      inline def setLeftTextViewVdomElement(value: VdomElement): Self = StObject.set(x, "leftTextView", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setRightText(value: String): Self = StObject.set(x, "rightText", value.asInstanceOf[js.Any])
      
      inline def setRightTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightTextStyle", value.asInstanceOf[js.Any])
      
      inline def setRightTextStyleNull: Self = StObject.set(x, "rightTextStyle", null)
      
      inline def setRightTextStyleUndefined: Self = StObject.set(x, "rightTextStyle", js.undefined)
      
      inline def setRightTextUndefined: Self = StObject.set(x, "rightText", js.undefined)
      
      inline def setRightTextView(value: VdomNode): Self = StObject.set(x, "rightTextView", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightTextViewNull: Self = StObject.set(x, "rightTextView", null)
      
      inline def setRightTextViewUndefined: Self = StObject.set(x, "rightTextView", js.undefined)
      
      inline def setRightTextViewVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rightTextView", js.Array(value*))
      
      inline def setRightTextViewVdomElement(value: VdomElement): Self = StObject.set(x, "rightTextView", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnCheckedImage(value: VdomElement): Self = StObject.set(x, "unCheckedImage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnCheckedImageUndefined: Self = StObject.set(x, "unCheckedImage", js.undefined)
      
      inline def setUncheckedCheckBoxColor(value: String): Self = StObject.set(x, "uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedCheckBoxColorUndefined: Self = StObject.set(x, "uncheckedCheckBoxColor", js.undefined)
    }
  }
}
