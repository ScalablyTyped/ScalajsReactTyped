package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptUtilsUseIsKeyboardShownMod {
  
  @JSImport("react-native-paper/lib/typescript/utils/useIsKeyboardShown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOnShowOnHide: Props): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnShowOnHide.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Props extends StObject {
    
    def onHide(): Unit
    
    def onShow(): Unit
  }
  object Props {
    
    inline def apply(onHide: Callback, onShow: Callback): Props = {
      val __obj = js.Dynamic.literal(onHide = onHide.toJsFn, onShow = onShow.toJsFn)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    }
  }
}
