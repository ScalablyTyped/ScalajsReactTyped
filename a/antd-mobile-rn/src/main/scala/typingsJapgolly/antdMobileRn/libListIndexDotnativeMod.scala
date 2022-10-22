package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.ArrowV
import typingsJapgolly.antdMobileRn.anon.Styles
import typingsJapgolly.antdMobileRn.anon.TypeofItem
import typingsJapgolly.antdMobileRn.libListPropsTypeMod.ListPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/list/index.native", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.antdMobileRn.libListIndexDotnativeMod.List
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/list/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/index.native", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    inline def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/list/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List extends Component[ListProps, Any, Any]
  
  trait ListProps
    extends StObject
       with ListPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[ArrowV] = js.undefined
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
      
      inline def setStyles(value: ArrowV): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
