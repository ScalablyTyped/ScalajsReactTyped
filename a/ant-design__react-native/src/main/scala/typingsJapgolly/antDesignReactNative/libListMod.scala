package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.TypeofItem
import typingsJapgolly.antDesignReactNative.libListPropsTypeMod.ListPropsType
import typingsJapgolly.antDesignReactNative.libListStyleMod.ListStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListMod {
  
  @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.antDesignReactNative.libListMod.List
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/list", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    inline def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List extends Component[ListProps, Any, Any]
  
  trait ListProps
    extends StObject
       with ListPropsType
       with WithThemeStyles[ListStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
