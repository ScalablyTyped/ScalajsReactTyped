package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.Title
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.large
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.right
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.small
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupDropdownProps extends StObject {
  
  var corner: js.UndefOr[Boolean] = js.undefined
  
  var cornerColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 弹框区域的位置
    * @defaultValue 'top'
    */
  /**
    * @language en-US
    * @description Location of the pop-up area
    * @defaultValue 'top'
    */
  var cornerDirection: js.UndefOr[top | bottom | left | right] = js.undefined
  
  var cornerDirectionValue: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 顶部边框宽度大小
    * @defaultValue 'normal'
    */
  /**
    * @language en-US
    * @description Top border width size
    * @defaultValue 'normal'
    */
  var cornerSize: js.UndefOr[small | large | normal] = js.undefined
  
  var cornerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义顶部边框宽度大小
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Custom top border width size
    * @defaultValue ''
    */
  var customCornerSize: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description DataSource
    * @defaultValue []
    */
  var data: js.Array[Title]
  
  var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选中回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Select callback
    * @defaultValue () => {}
    */
  var onSelect: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var touchViewStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PopupDropdownProps {
  
  inline def apply(data: js.Array[Title]): PopupDropdownProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDropdownProps]
  }
  
  extension [Self <: PopupDropdownProps](x: Self) {
    
    inline def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setCornerColor(value: String): Self = StObject.set(x, "cornerColor", value.asInstanceOf[js.Any])
    
    inline def setCornerColorUndefined: Self = StObject.set(x, "cornerColor", js.undefined)
    
    inline def setCornerDirection(value: top | bottom | left | right): Self = StObject.set(x, "cornerDirection", value.asInstanceOf[js.Any])
    
    inline def setCornerDirectionUndefined: Self = StObject.set(x, "cornerDirection", js.undefined)
    
    inline def setCornerDirectionValue(value: String): Self = StObject.set(x, "cornerDirectionValue", value.asInstanceOf[js.Any])
    
    inline def setCornerDirectionValueUndefined: Self = StObject.set(x, "cornerDirectionValue", js.undefined)
    
    inline def setCornerSize(value: small | large | normal): Self = StObject.set(x, "cornerSize", value.asInstanceOf[js.Any])
    
    inline def setCornerSizeUndefined: Self = StObject.set(x, "cornerSize", js.undefined)
    
    inline def setCornerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cornerStyle", value.asInstanceOf[js.Any])
    
    inline def setCornerStyleNull: Self = StObject.set(x, "cornerStyle", null)
    
    inline def setCornerStyleUndefined: Self = StObject.set(x, "cornerStyle", js.undefined)
    
    inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
    
    inline def setCustomCornerSize(value: String): Self = StObject.set(x, "customCornerSize", value.asInstanceOf[js.Any])
    
    inline def setCustomCornerSizeUndefined: Self = StObject.set(x, "customCornerSize", js.undefined)
    
    inline def setData(value: js.Array[Title]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Title*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setListStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    inline def setListStyleNull: Self = StObject.set(x, "listStyle", null)
    
    inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    inline def setOnSelect(value: /* value */ js.UndefOr[Double | String] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Double | String]) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTouchViewStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "touchViewStyle", value.asInstanceOf[js.Any])
    
    inline def setTouchViewStyleNull: Self = StObject.set(x, "touchViewStyle", null)
    
    inline def setTouchViewStyleUndefined: Self = StObject.set(x, "touchViewStyle", js.undefined)
  }
}
