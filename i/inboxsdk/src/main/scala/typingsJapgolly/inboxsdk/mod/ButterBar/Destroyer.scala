package typingsJapgolly.inboxsdk.mod.ButterBar

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyer extends StObject {
  
  def destroy(): Unit
}
object Destroyer {
  
  inline def apply(destroy: Callback): Destroyer = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[Destroyer]
  }
  
  extension [Self <: Destroyer](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
