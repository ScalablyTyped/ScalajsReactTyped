package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeIn
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeInEaseOut
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeOut
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.keyboard
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.linear
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ type in react-native-windows.react-native-windows/rntypes.LayoutAnimationType ]: type} */
trait LayoutAnimationTypes extends StObject {
  
  var easeIn: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeIn
  
  var easeInEaseOut: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeInEaseOut
  
  var easeOut: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.easeOut
  
  var keyboard: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.keyboard
  
  var linear: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.linear
  
  var spring: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.spring
}
object LayoutAnimationTypes {
  
  inline def apply(): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = "easeIn", easeInEaseOut = "easeInEaseOut", easeOut = "easeOut", keyboard = "keyboard", linear = "linear", spring = "spring")
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
  
  extension [Self <: LayoutAnimationTypes](x: Self) {
    
    inline def setEaseIn(value: easeIn): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    inline def setEaseInEaseOut(value: easeInEaseOut): Self = StObject.set(x, "easeInEaseOut", value.asInstanceOf[js.Any])
    
    inline def setEaseOut(value: easeOut): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: linear): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setSpring(value: spring): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
  }
}
