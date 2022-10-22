package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.BorderRightWidth
import typingsJapgolly.antDesignReactNative.libCarouselMod.CarouselProps
import typingsJapgolly.antDesignReactNative.libGridPropsTypeMod.GridPropsType
import typingsJapgolly.antDesignReactNative.libGridStyleMod.GridStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridMod {
  
  @JSImport("@ant-design/react-native/lib/grid", JSImport.Default)
  @js.native
  open class default () extends Grid
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/grid", "default.defaultProps")
    @js.native
    def defaultProps: GridProps = js.native
    inline def defaultProps_=(x: GridProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Grid extends Component[GridProps, Any, Any] {
    
    def getFlexItemStyle(columnNum: Double): BorderRightWidth = js.native
  }
  
  trait GridProps
    extends StObject
       with GridPropsType
       with WithThemeStyles[GridStyle] {
    
    var carouselProps: js.UndefOr[CarouselProps] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object GridProps {
    
    inline def apply(carouselMaxRow: Double, columnNum: Double): GridProps = {
      val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setCarouselProps(value: CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      inline def setCarouselPropsUndefined: Self = StObject.set(x, "carouselProps", js.undefined)
      
      inline def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    }
  }
}
