package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportFactory extends StObject {
  
  def create(): ITransport
  
  var `type`: TransportType
}
object ITransportFactory {
  
  inline def apply(create: CallbackTo[ITransport], `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
  
  extension [Self <: ITransportFactory](x: Self) {
    
    inline def setCreate(value: CallbackTo[ITransport]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setType(value: TransportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
