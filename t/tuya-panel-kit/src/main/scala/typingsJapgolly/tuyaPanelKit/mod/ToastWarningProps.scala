package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastWarningProps
  extends StObject
     with ToastProps {
  
  /**
    * @language zh-CN
    * @description 图标颜色
    * @defaultValue '#FFF'
    */
  /**
    * @language en-US
    * @description Icon color
    * @defaultValue '#FFF'
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标路径
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/res/iconfont.json#L3">iconfont.warning</a>
    */
  /**
    * @language en-US
    * @description Icon path
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/res/iconfont.json#L3">iconfont.warning</a>
    */
  var d: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @defaultValue cx(28)
    */
  /**
    * @language en-US
    * @description Icon size
    * @defaultValue cx(40)
    */
  var size: js.UndefOr[Double] = js.undefined
}
object ToastWarningProps {
  
  inline def apply(onFinish: Callback, show: Boolean): ToastWarningProps = {
    val __obj = js.Dynamic.literal(onFinish = onFinish.toJsFn, show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastWarningProps]
  }
  
  extension [Self <: ToastWarningProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    inline def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    inline def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
