package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress extends StObject {
  
  def onPress(): Unit
}
object OnPress {
  
  inline def apply(onPress: Callback): OnPress = {
    val __obj = js.Dynamic.literal(onPress = onPress.toJsFn)
    __obj.asInstanceOf[OnPress]
  }
  
  extension [Self <: OnPress](x: Self) {
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
  }
}
