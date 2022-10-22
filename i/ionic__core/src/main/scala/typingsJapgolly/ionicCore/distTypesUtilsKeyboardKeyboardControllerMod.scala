package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsKeyboardKeyboardControllerMod {
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard-controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createKeyboardController(): KeyboardController = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardController")().asInstanceOf[KeyboardController]
  inline def createKeyboardController(keyboardChangeCallback: js.Function1[/* keyboardOpen */ Boolean, Unit]): KeyboardController = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardController")(keyboardChangeCallback.asInstanceOf[js.Any]).asInstanceOf[KeyboardController]
  
  trait KeyboardController extends StObject {
    
    def destroy(): Unit
    
    def init(): Unit
    
    def isKeyboardVisible(): Boolean
  }
  object KeyboardController {
    
    inline def apply(destroy: Callback, init: Callback, isKeyboardVisible: CallbackTo[Boolean]): KeyboardController = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = init.toJsFn, isKeyboardVisible = isKeyboardVisible.toJsFn)
      __obj.asInstanceOf[KeyboardController]
    }
    
    extension [Self <: KeyboardController](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setIsKeyboardVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isKeyboardVisible", value.toJsFn)
    }
  }
}
