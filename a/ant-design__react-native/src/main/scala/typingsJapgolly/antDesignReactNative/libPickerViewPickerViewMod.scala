package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.anon.OnChange
import typingsJapgolly.antDesignReactNative.libPickerPropsTypeMod.PickerData
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerViewPickerViewMod {
  
  @JSImport("@ant-design/react-native/lib/picker-view/PickerView", JSImport.Default)
  @js.native
  open class default () extends PickerView
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker-view/PickerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker-view/PickerView", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PickerView extends Component[PickerViewProps, Any, Any] {
    
    def getCol(): js.Array[Element] = js.native
  }
  
  trait PickerViewProps extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object PickerViewProps {
    
    inline def apply(): PickerViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerViewProps]
    }
    
    extension [Self <: PickerViewProps](x: Self) {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
