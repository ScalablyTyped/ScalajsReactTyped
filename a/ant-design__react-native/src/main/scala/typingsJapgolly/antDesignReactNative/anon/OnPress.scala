package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress extends StObject {
  
  var mode: String
  
  def onPress(): Unit
}
object OnPress {
  
  inline def apply(mode: String, onPress: Callback): OnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = onPress.toJsFn)
    __obj.asInstanceOf[OnPress]
  }
  
  extension [Self <: OnPress](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
  }
}
