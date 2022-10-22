package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationViewProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "RotationView"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "RotationView"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否开启旋转动画
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to enable the rotation animation.
    * @defaultValue true
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 嵌套子元素
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Nested child elements of RotationView
    * @defaultValue undefined
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description 旋转动画一圈的时间， 单位是 ms
    * @defaultValue 5000
    */
  /**
    * @language en-US
    * @description The time to rotate the animation for one circle, in MS
    * @defaultValue 5000
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 此动画是否在 “InteractionManager” 上创建 “交互手柄”
    * @version 4.0.1
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether or not this animation creates an "interaction handle" on the `InteractionManager`. Default true.
    * @version 4.0.1
    * @defaultValue true
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Container Style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用原生动画驱动, 一般在安卓低端机上会比较有用
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether or not to use native animation driver is more useful on Android low-end computers
    * @defaultValue false
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}
object RotationViewProps {
  
  inline def apply(): RotationViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationViewProps]
  }
  
  extension [Self <: RotationViewProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
  }
}
