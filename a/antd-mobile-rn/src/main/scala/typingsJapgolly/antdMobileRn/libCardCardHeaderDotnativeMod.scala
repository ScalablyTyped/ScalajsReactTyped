package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.ThumbStyle
import typingsJapgolly.antdMobileRn.libCardPropsTypeMod.CardHeaderPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardCardHeaderDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/CardHeader.native", JSImport.Default)
  @js.native
  open class default () extends CardHeader
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/CardHeader.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/CardHeader.native", "default.defaultProps")
    @js.native
    def defaultProps: ThumbStyle = js.native
    inline def defaultProps_=(x: ThumbStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardHeader extends Component[CardHeaderProps, Any, Any]
  
  trait CardHeaderProps
    extends StObject
       with CardHeaderPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  }
  object CardHeaderProps {
    
    inline def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    extension [Self <: CardHeaderProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setThumbStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    }
  }
}
