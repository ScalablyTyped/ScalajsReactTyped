package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.OnPress
import typingsJapgolly.antDesignReactNative.libNoticeBarMarqueeMod.MarqueeProps
import typingsJapgolly.antDesignReactNative.libNoticeBarPropsTypeMod.NoticeBarPropsType
import typingsJapgolly.antDesignReactNative.libNoticeBarStyleMod.NoticeBarStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeBarMod {
  
  @JSImport("@ant-design/react-native/lib/notice-bar", JSImport.Default)
  @js.native
  open class default protected () extends NoticeBar {
    def this(props: NoticeNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/notice-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/notice-bar", "default.defaultProps")
    @js.native
    def defaultProps: OnPress = js.native
    inline def defaultProps_=(x: OnPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar extends Component[NoticeNativeProps, Any, Any] {
    
    def onPress(): Unit = js.native
  }
  
  trait NoticeNativeProps
    extends StObject
       with NoticeBarPropsType
       with WithThemeStyles[NoticeBarStyle] {
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object NoticeNativeProps {
    
    inline def apply(): NoticeNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeNativeProps]
    }
    
    extension [Self <: NoticeNativeProps](x: Self) {
      
      inline def setMarqueeProps(value: MarqueeProps): Self = StObject.set(x, "marqueeProps", value.asInstanceOf[js.Any])
      
      inline def setMarqueePropsUndefined: Self = StObject.set(x, "marqueeProps", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
