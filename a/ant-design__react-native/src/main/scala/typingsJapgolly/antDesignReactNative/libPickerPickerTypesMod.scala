package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerPickerTypesMod {
  
  trait PickerProps extends StObject {
    
    var defaultSelectedValue: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorClassName: js.UndefOr[String] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var noAnimate: js.UndefOr[Boolean] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var selectedValue: js.UndefOr[Any] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PickerProps {
    
    inline def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setDefaultSelectedValue(value: Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      inline def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      inline def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ Any => Callback): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Any => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setSelectedValue(value: Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
