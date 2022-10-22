package typingsJapgolly.stripeV3.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  def preventDefault(): Unit
}
object PreventDefault {
  
  inline def apply(preventDefault: Callback): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[PreventDefault]
  }
  
  extension [Self <: PreventDefault](x: Self) {
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
