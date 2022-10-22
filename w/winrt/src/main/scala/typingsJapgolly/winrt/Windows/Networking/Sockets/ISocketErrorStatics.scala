package typingsJapgolly.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISocketErrorStatics extends StObject {
  
  def getStatus(hresult: Double): SocketErrorStatus
}
object ISocketErrorStatics {
  
  inline def apply(getStatus: Double => SocketErrorStatus): ISocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[ISocketErrorStatics]
  }
  
  extension [Self <: ISocketErrorStatics](x: Self) {
    
    inline def setGetStatus(value: Double => SocketErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
