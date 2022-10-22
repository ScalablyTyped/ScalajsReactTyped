package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBarContentProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 子元素
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Sub element
    * @defaultValue null
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Content 标题及副标题颜色，副标题颜色为该颜色加 0.6 透明度
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description TopBar.Content Title and subtitle color, subtitle color is the color plus 0.6 transparency.
    * @defaultValue null
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 点击事件
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Click event
    * @types (event: <a target='_blank' href='https://reactnative.dev/docs/pressevent'>GestureResponderEvent</a>) => void
    * @defaultValue () => {}
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Content 的位置，可为左对齐、居中对齐和右对齐
    * @defaultValue 'center'
    */
  /**
    * @language en-US
    * @description TopBar.Content  Can be left, center, and right
    * @defaultValue 'center'
    */
  var position: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Content 的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The container style of the top toolbar internally handles the three StatusBar situations of iOS versions below and above iPhoneX, and Android. You can also define your own style.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description SubTitle
    * @defaultValue ''
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description SubTitle style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var subTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Content 的标题
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Title of TopBar.Content
    * @defaultValue ''
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 标题样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Title style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object TopBarContentProps {
  
  inline def apply(): TopBarContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarContentProps]
  }
  
  extension [Self <: TopBarContentProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOnPress(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setPosition(value: left | center | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    inline def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
