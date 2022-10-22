package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMethods extends StObject {
  
  def destroy(): Unit
  
  def init(): Unit
}
object AppMethods {
  
  inline def apply(destroy: Callback, init: Callback): AppMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = init.toJsFn)
    __obj.asInstanceOf[AppMethods]
  }
  
  extension [Self <: AppMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
  }
}
