package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.Current
import typingsJapgolly.antDesignReactNative.anon.NextText
import typingsJapgolly.antDesignReactNative.libPaginationPropsTypeMod.PaginationPropsType
import typingsJapgolly.antDesignReactNative.libPaginationPropsTypeMod.PaginationState
import typingsJapgolly.antDesignReactNative.libPaginationStyleMod.PaginationStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationMod {
  
  @JSImport("@ant-design/react-native/lib/pagination", JSImport.Default)
  @js.native
  open class default protected () extends Pagination {
    def this(props: PaginationNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/pagination", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/pagination", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pagination extends Component[PaginationNativeProps, PaginationState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
    
    def onChange(p: Double): Unit = js.native
  }
  
  trait PaginationNativeProps
    extends StObject
       with PaginationPropsType
       with WithThemeStyles[PaginationStyle] {
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var locale: js.UndefOr[NextText] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PaginationNativeProps {
    
    inline def apply(current: Double, total: Double): PaginationNativeProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNativeProps]
    }
    
    extension [Self <: PaginationNativeProps](x: Self) {
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setLocale(value: NextText): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
