package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomCenter
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomLeft
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomRight
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topCenter
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topLeft
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipsProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 气泡背景颜色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description Bubble background color
    * @defaultValue '#fff'
    */
  var bgColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 嵌套子元素
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Nested sub elements
    * @defaultValue null
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 角标位置
    * @defaultValue 'topCenter'
    */
  /**
    * @language en-US
    * @description Corner mark position
    * @defaultValue 'topCenter'
    */
  var cornerPosition: js.UndefOr[topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画配置
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2767">MotionScaleFadeInProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2741">MotionFadeProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2754">MotionPullUpProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2824">MotionScalePullDownProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2848">MotionPushDownProps</a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Animation configuration
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2767">MotionScaleFadeInProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2741">MotionFadeProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2754">MotionPullUpProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2824">MotionScalePullDownProps</a> | <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/65d54ea9f8a91a28d45805aaa0f78ad7cec25a10/types/tuya-panel-kit/index.d.ts#L2848">MotionPushDownProps</a>
    * @defaultValue {}
    */
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 气泡动画类型
    * @defaultValue 'ScaleFadeIn'
    */
  /**
    * @language en-US
    * @description Bubble animation type
    * @defaultValue 'ScaleFadeIn'
    */
  var motionType: js.UndefOr[Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示气泡
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is bubble displayed
    * @defaultValue false
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示角标
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is corner marker displayed
    * @defaultValue true
    */
  var showCorner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 气泡位置信息
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Bubble position information
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var tipStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否应用于 Popup 上，并伴有遮罩
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether it is applied to popup with mask
    * @defaultValue false
    */
  var withModal: js.UndefOr[Boolean] = js.undefined
}
object TipsProps {
  
  inline def apply(): TipsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TipsProps]
  }
  
  extension [Self <: TipsProps](x: Self) {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setCornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    inline def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    inline def setMotionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowCorner(value: Boolean): Self = StObject.set(x, "showCorner", value.asInstanceOf[js.Any])
    
    inline def setShowCornerUndefined: Self = StObject.set(x, "showCorner", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTipStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tipStyle", value.asInstanceOf[js.Any])
    
    inline def setTipStyleNull: Self = StObject.set(x, "tipStyle", null)
    
    inline def setTipStyleUndefined: Self = StObject.set(x, "tipStyle", js.undefined)
    
    inline def setWithModal(value: Boolean): Self = StObject.set(x, "withModal", value.asInstanceOf[js.Any])
    
    inline def setWithModalUndefined: Self = StObject.set(x, "withModal", js.undefined)
  }
}
