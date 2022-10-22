package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.accepted
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TetheringApi extends StObject {
  
  /**
    * Request browser port binding.
    */
  def bind(params: BindRequest): js.Promise[Unit]
  
  /**
    * Informs that port was successfully bound and got a specified connection id.
    */
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function1[/* params */ AcceptedEvent, Unit]): Unit
  
  /**
    * Request browser port unbinding.
    */
  def unbind(params: UnbindRequest): js.Promise[Unit]
}
object TetheringApi {
  
  inline def apply(
    bind: BindRequest => js.Promise[Unit],
    on: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Callback,
    unbind: UnbindRequest => js.Promise[Unit]
  ): TetheringApi = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), on = js.Any.fromFunction2((t0: accepted, t1: js.Function1[/* params */ AcceptedEvent, Unit]) => (on(t0, t1)).runNow()), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[TetheringApi]
  }
  
  extension [Self <: TetheringApi](x: Self) {
    
    inline def setBind(value: BindRequest => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setOn(value: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: accepted, t1: js.Function1[/* params */ AcceptedEvent, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setUnbind(value: UnbindRequest => js.Promise[Unit]): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
