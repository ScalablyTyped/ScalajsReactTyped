package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2FrameCallbackFrameCallbackRegistryUIMod.FrameInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2FrameCallbackFrameCallbackRegistryJSMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/frameCallback/FrameCallbackRegistryJS", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FrameCallbackRegistryJS {
    
    /* CompleteClass */
    override def manageStateFrameCallback(callbackId: Double, state: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    var nextCallbackId: Any = js.native
    
    /* CompleteClass */
    override def registerFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit]): Double = js.native
    
    /* CompleteClass */
    override def unregisterFrameCallback(callbackId: Double): Unit = js.native
  }
  
  trait FrameCallbackRegistryJS extends StObject {
    
    def manageStateFrameCallback(callbackId: Double, state: Boolean): Unit
    
    /* private */ var nextCallbackId: Any
    
    def registerFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit]): Double
    
    def unregisterFrameCallback(callbackId: Double): Unit
  }
  object FrameCallbackRegistryJS {
    
    inline def apply(
      manageStateFrameCallback: (Double, Boolean) => Callback,
      nextCallbackId: Any,
      registerFrameCallback: js.Function1[/* frameInfo */ FrameInfo, Unit] => Double,
      unregisterFrameCallback: Double => Callback
    ): FrameCallbackRegistryJS = {
      val __obj = js.Dynamic.literal(manageStateFrameCallback = js.Any.fromFunction2((t0: Double, t1: Boolean) => (manageStateFrameCallback(t0, t1)).runNow()), nextCallbackId = nextCallbackId.asInstanceOf[js.Any], registerFrameCallback = js.Any.fromFunction1(registerFrameCallback), unregisterFrameCallback = js.Any.fromFunction1((t0: Double) => unregisterFrameCallback(t0).runNow()))
      __obj.asInstanceOf[FrameCallbackRegistryJS]
    }
    
    extension [Self <: FrameCallbackRegistryJS](x: Self) {
      
      inline def setManageStateFrameCallback(value: (Double, Boolean) => Callback): Self = StObject.set(x, "manageStateFrameCallback", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setNextCallbackId(value: Any): Self = StObject.set(x, "nextCallbackId", value.asInstanceOf[js.Any])
      
      inline def setRegisterFrameCallback(value: js.Function1[/* frameInfo */ FrameInfo, Unit] => Double): Self = StObject.set(x, "registerFrameCallback", js.Any.fromFunction1(value))
      
      inline def setUnregisterFrameCallback(value: Double => Callback): Self = StObject.set(x, "unregisterFrameCallback", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
