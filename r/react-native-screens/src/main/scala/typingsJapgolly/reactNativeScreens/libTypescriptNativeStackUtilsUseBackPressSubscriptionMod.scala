package typingsJapgolly.reactNativeScreens

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackUtilsUseBackPressSubscriptionMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/utils/useBackPressSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBackPressSubscription(hasOnBackPressIsDisabled: Args): UseBackPressSubscription_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackPressSubscription")(hasOnBackPressIsDisabled.asInstanceOf[js.Any]).asInstanceOf[UseBackPressSubscription_]
  
  trait Args extends StObject {
    
    var isDisabled: Boolean
    
    def onBackPress(): Boolean
  }
  object Args {
    
    inline def apply(isDisabled: Boolean, onBackPress: CallbackTo[Boolean]): Args = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], onBackPress = onBackPress.toJsFn)
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setOnBackPress(value: CallbackTo[Boolean]): Self = StObject.set(x, "onBackPress", value.toJsFn)
    }
  }
  
  trait UseBackPressSubscription_ extends StObject {
    
    def clearSubscription(): Unit
    
    def createSubscription(): Unit
    
    def handleAttached(): Unit
    
    def handleDetached(): Unit
  }
  object UseBackPressSubscription_ {
    
    inline def apply(
      clearSubscription: Callback,
      createSubscription: Callback,
      handleAttached: Callback,
      handleDetached: Callback
    ): UseBackPressSubscription_ = {
      val __obj = js.Dynamic.literal(clearSubscription = clearSubscription.toJsFn, createSubscription = createSubscription.toJsFn, handleAttached = handleAttached.toJsFn, handleDetached = handleDetached.toJsFn)
      __obj.asInstanceOf[UseBackPressSubscription_]
    }
    
    extension [Self <: UseBackPressSubscription_](x: Self) {
      
      inline def setClearSubscription(value: Callback): Self = StObject.set(x, "clearSubscription", value.toJsFn)
      
      inline def setCreateSubscription(value: Callback): Self = StObject.set(x, "createSubscription", value.toJsFn)
      
      inline def setHandleAttached(value: Callback): Self = StObject.set(x, "handleAttached", value.toJsFn)
      
      inline def setHandleDetached(value: Callback): Self = StObject.set(x, "handleDetached", value.toJsFn)
    }
  }
}
