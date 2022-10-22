package typingsJapgolly.rmcCascader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCascaderTypesMod {
  
  type CascaderOneValue = String | Double
  
  type CascaderValue = js.Array[CascaderOneValue]
  
  trait ICascaderDataItem extends StObject {
    
    var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.undefined
    
    var label: Node
    
    var value: CascaderOneValue
  }
  object ICascaderDataItem {
    
    inline def apply(value: CascaderOneValue): ICascaderDataItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[ICascaderDataItem]
    }
    
    extension [Self <: ICascaderDataItem](x: Self) {
      
      inline def setChildren(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: CascaderOneValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICascaderProps extends StObject {
    
    /** web only */
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[ICascaderDataItem]
    
    var defaultValue: js.UndefOr[CascaderValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorStyle: js.UndefOr[js.Object] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    /** web only */
    var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    var pickerItemStyle: js.UndefOr[js.Object] = js.undefined
    
    /** web only */
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[CascaderValue] = js.undefined
  }
  object ICascaderProps {
    
    inline def apply(data: js.Array[ICascaderDataItem]): ICascaderProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICascaderProps]
    }
    
    extension [Self <: ICascaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setData(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultValue(value: CascaderValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorStyle(value: js.Object): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ CascaderValue => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ CascaderValue => Callback): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setPickerItemStyle(value: js.Object): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: CascaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
