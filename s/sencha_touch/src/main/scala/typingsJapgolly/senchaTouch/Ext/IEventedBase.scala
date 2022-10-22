package typingsJapgolly.senchaTouch.Ext

import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventedBase
  extends StObject
     with IObservable {
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IEventedBase: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
}
object IEventedBase {
  
  inline def apply(): IEventedBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventedBase]
  }
  
  extension [Self <: IEventedBase](x: Self) {
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
  }
}
