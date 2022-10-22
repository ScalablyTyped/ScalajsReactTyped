package typingsJapgolly.rnSwipeablePanel

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCloseMod {
  
  @JSImport("rn-swipeable-panel/dist/Close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Close(hasOnPressRootStyleIconStyle: CloseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Close")(hasOnPressRootStyleIconStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CloseProps extends StObject {
    
    var iconStyle: js.UndefOr[js.Object] = js.undefined
    
    def onPress(): Unit
    
    var rootStyle: js.UndefOr[js.Object] = js.undefined
  }
  object CloseProps {
    
    inline def apply(onPress: Callback): CloseProps = {
      val __obj = js.Dynamic.literal(onPress = onPress.toJsFn)
      __obj.asInstanceOf[CloseProps]
    }
    
    extension [Self <: CloseProps](x: Self) {
      
      inline def setIconStyle(value: js.Object): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setRootStyle(value: js.Object): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
    }
  }
}
