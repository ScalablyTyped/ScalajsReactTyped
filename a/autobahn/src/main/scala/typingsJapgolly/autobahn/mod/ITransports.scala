package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransports extends StObject {
  
  def get(name: TransportType): ITransportFactoryFactory
  
  def isRegistered(name: TransportType): Boolean
  
  def list(): js.Array[TransportType]
  
  def register(name: TransportType, factory: ITransportFactoryFactory): Unit
}
object ITransports {
  
  inline def apply(
    get: TransportType => ITransportFactoryFactory,
    isRegistered: TransportType => Boolean,
    list: CallbackTo[js.Array[TransportType]],
    register: (TransportType, ITransportFactoryFactory) => Callback
  ): ITransports = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isRegistered = js.Any.fromFunction1(isRegistered), list = list.toJsFn, register = js.Any.fromFunction2((t0: TransportType, t1: ITransportFactoryFactory) => (register(t0, t1)).runNow()))
    __obj.asInstanceOf[ITransports]
  }
  
  extension [Self <: ITransports](x: Self) {
    
    inline def setGet(value: TransportType => ITransportFactoryFactory): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setIsRegistered(value: TransportType => Boolean): Self = StObject.set(x, "isRegistered", js.Any.fromFunction1(value))
    
    inline def setList(value: CallbackTo[js.Array[TransportType]]): Self = StObject.set(x, "list", value.toJsFn)
    
    inline def setRegister(value: (TransportType, ITransportFactoryFactory) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: TransportType, t1: ITransportFactoryFactory) => (value(t0, t1)).runNow()))
  }
}
