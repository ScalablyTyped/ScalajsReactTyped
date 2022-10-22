package typingsJapgolly.reactNativeScreens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closing extends StObject {
  
  var closing: typingsJapgolly.reactNative.mod.Animated.Value
  
  var goingForward: typingsJapgolly.reactNative.mod.Animated.Value
  
  var progress: typingsJapgolly.reactNative.mod.Animated.Value
}
object Closing {
  
  inline def apply(
    closing: typingsJapgolly.reactNative.mod.Animated.Value,
    goingForward: typingsJapgolly.reactNative.mod.Animated.Value,
    progress: typingsJapgolly.reactNative.mod.Animated.Value
  ): Closing = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], goingForward = goingForward.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closing]
  }
  
  extension [Self <: Closing](x: Self) {
    
    inline def setClosing(value: typingsJapgolly.reactNative.mod.Animated.Value): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setGoingForward(value: typingsJapgolly.reactNative.mod.Animated.Value): Self = StObject.set(x, "goingForward", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: typingsJapgolly.reactNative.mod.Animated.Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
