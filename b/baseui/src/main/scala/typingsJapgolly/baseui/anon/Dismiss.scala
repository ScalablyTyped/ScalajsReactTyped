package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismiss extends StObject {
  
  def dismiss(): Unit
}
object Dismiss {
  
  inline def apply(dismiss: Callback): Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = dismiss.toJsFn)
    __obj.asInstanceOf[Dismiss]
  }
  
  extension [Self <: Dismiss](x: Self) {
    
    inline def setDismiss(value: Callback): Self = StObject.set(x, "dismiss", value.toJsFn)
  }
}
