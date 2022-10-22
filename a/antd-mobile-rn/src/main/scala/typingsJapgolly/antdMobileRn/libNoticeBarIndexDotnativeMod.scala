package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.Icon
import typingsJapgolly.antdMobileRn.libNoticeBarMarqueeDotnativeMod.MarqueeProps
import typingsJapgolly.antdMobileRn.libNoticeBarPropsTypeMod.NoticeBarPropsType
import typingsJapgolly.antdMobileRn.libNoticeBarStyleIndexDotnativeMod.INoticeBarStyle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeBarIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/notice-bar/index.native", JSImport.Default)
  @js.native
  open class default protected () extends NoticeBar {
    def this(props: NoticeNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/notice-bar/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/notice-bar/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Icon = js.native
    inline def defaultProps_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar extends Component[NoticeNativeProps, Any, Any] {
    
    def onClick(): Unit = js.native
  }
  
  trait NoticeNativeProps
    extends StObject
       with NoticeBarPropsType {
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[INoticeBarStyle] = js.undefined
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
      
      inline def setStyles(value: INoticeBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
