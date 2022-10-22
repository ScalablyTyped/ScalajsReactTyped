package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def onPress(): Unit
}
object `0` {
  
  inline def apply(onPress: Callback): `0` = {
    val __obj = js.Dynamic.literal(onPress = onPress.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
  }
}
