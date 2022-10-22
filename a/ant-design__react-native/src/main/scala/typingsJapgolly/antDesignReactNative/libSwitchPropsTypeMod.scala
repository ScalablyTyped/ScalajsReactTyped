package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.anon.False
import typingsJapgolly.reactNative.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchPropsTypeMod {
  
  trait SwitchPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedChildren: js.UndefOr[String | Node] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var thumbColor: js.UndefOr[ColorValue] = js.undefined
    
    var thumbTintColor: js.UndefOr[ColorValue] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var trackColor: js.UndefOr[False] = js.undefined
    
    var unCheckedChildren: js.UndefOr[String | Node] = js.undefined
  }
  object SwitchPropsType {
    
    inline def apply(): SwitchPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchPropsType]
    }
    
    extension [Self <: SwitchPropsType](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedChildren(value: String | Node): Self = StObject.set(x, "checkedChildren", value.asInstanceOf[js.Any])
      
      inline def setCheckedChildrenNull: Self = StObject.set(x, "checkedChildren", null)
      
      inline def setCheckedChildrenUndefined: Self = StObject.set(x, "checkedChildren", js.undefined)
      
      inline def setCheckedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedChildren", js.Array(value*))
      
      inline def setCheckedChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "checkedChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnChange(value: /* checked */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPress(value: /* checked */ Boolean => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setThumbColor(value: ColorValue): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      inline def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
      
      inline def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrackColor(value: False): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
      
      inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
      
      inline def setUnCheckedChildren(value: String | Node): Self = StObject.set(x, "unCheckedChildren", value.asInstanceOf[js.Any])
      
      inline def setUnCheckedChildrenNull: Self = StObject.set(x, "unCheckedChildren", null)
      
      inline def setUnCheckedChildrenUndefined: Self = StObject.set(x, "unCheckedChildren", js.undefined)
      
      inline def setUnCheckedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "unCheckedChildren", js.Array(value*))
      
      inline def setUnCheckedChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "unCheckedChildren", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
