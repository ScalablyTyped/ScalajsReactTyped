package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHandlersNativeViewGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/handlers/NativeViewGestureHandler", JSImport.Default)
  @js.native
  open class default () extends NativeViewGestureHandler
  
  @js.native
  trait NativeViewGestureHandler
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default {
    
    /* private */ var buttonRole: Any = js.native
    
    /* private */ var disallowInterruption: Any = js.native
    
    def disallowsInterruption(): Boolean = js.native
    
    /* private */ var minDistSq: Any = js.native
    
    /* private */ var newPointerAction: Any = js.native
    
    /* protected */ def onPointerOut(): Unit = js.native
    
    /* private */ var onUp: Any = js.native
    
    /* private */ var shouldActivateOnStart: Any = js.native
    
    def shouldBeCancelledByOther(
      _handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    def shouldRecognizeSimultaneously(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* private */ var startX: Any = js.native
    
    /* private */ var startY: Any = js.native
  }
}
