package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.Size
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xs
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xxs
import typingsJapgolly.antdMobileRn.libIconPropsTypeMod.IconPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
  @js.native
  open class default () extends Icon
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    inline def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Icon extends Component[IconProps, Any, Any]
  
  trait IconProps
    extends StObject
       with IconPropsType {
    
    var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object IconProps {
    
    inline def apply(`type`: String): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setSize(value: xxs | xs | sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
