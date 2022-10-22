package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.libSwipeActionPropsTypeMod.SwipeActionPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwipeActionIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/swipe-action/index.native", JSImport.Default)
  @js.native
  open class default () extends SwipeAction
  
  @js.native
  trait SwipeAction extends Component[SwipeActionProps, Any, Any]
  
  trait SwipeActionProps
    extends StObject
       with SwipeActionPropsType[TextStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object SwipeActionProps {
    
    inline def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    extension [Self <: SwipeActionProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
