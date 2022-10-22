package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureStateManagerMod {
  
  object GestureStateManager {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureStateManager", "GestureStateManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(handlerTag: Double): GestureStateManagerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[GestureStateManagerType]
  }
  
  trait GestureStateManagerType extends StObject {
    
    def activate(): Unit
    
    def begin(): Unit
    
    def end(): Unit
    
    def fail(): Unit
  }
  object GestureStateManagerType {
    
    inline def apply(activate: Callback, begin: Callback, end: Callback, fail: Callback): GestureStateManagerType = {
      val __obj = js.Dynamic.literal(activate = activate.toJsFn, begin = begin.toJsFn, end = end.toJsFn, fail = fail.toJsFn)
      __obj.asInstanceOf[GestureStateManagerType]
    }
    
    extension [Self <: GestureStateManagerType](x: Self) {
      
      inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
      
      inline def setBegin(value: Callback): Self = StObject.set(x, "begin", value.toJsFn)
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    }
  }
}
