package typingsJapgolly.reactThreeFiber.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connect extends StObject {
  
  def connect(): Unit
  
  def disconnect(): Unit
}
object Connect {
  
  inline def apply(connect: Callback, disconnect: Callback): Connect = {
    val __obj = js.Dynamic.literal(connect = connect.toJsFn, disconnect = disconnect.toJsFn)
    __obj.asInstanceOf[Connect]
  }
  
  extension [Self <: Connect](x: Self) {
    
    inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
  }
}
