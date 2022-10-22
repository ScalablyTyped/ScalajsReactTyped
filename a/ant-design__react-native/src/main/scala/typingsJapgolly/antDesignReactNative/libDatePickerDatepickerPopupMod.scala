package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.libPickerPopupPickerTypesMod.PopupPickerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerDatepickerPopupMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", JSImport.Default)
  @js.native
  open class default () extends PopupDatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      inline def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      inline def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupDatePicker extends Component[PopupDatePickerProps, Any, Any] {
    
    def onOk(v: Any): Unit = js.native
  }
  
  trait PopupDatePickerProps
    extends StObject
       with PopupPickerProps {
    
    var date: js.UndefOr[Any] = js.undefined
    
    var datePicker: Element
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object PopupDatePickerProps {
    
    inline def apply(datePicker: VdomElement): PopupDatePickerProps = {
      val __obj = js.Dynamic.literal(datePicker = datePicker.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDatePickerProps]
    }
    
    extension [Self <: PopupDatePickerProps](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDatePicker(value: VdomElement): Self = StObject.set(x, "datePicker", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setOnChange(value: /* date */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* date */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
