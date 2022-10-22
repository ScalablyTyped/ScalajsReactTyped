package typingsJapgolly.arcgisJsApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHandle extends StObject {
  
  def remove(): Unit
}
object IHandle {
  
  inline def apply(remove: Callback): IHandle = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[IHandle]
  }
  
  extension [Self <: IHandle](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
