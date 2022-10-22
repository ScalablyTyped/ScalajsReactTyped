package typingsJapgolly.senchaTouch.Ext.device

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Method] Returns the value of src
      * @returns Object
      */
    var getSrc: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of src
      * @param src Object The new value.
      */
    var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetSrc(value: CallbackTo[Any]): Self = StObject.set(x, "getSrc", value.toJsFn)
      
      inline def setGetSrcUndefined: Self = StObject.set(x, "getSrc", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetSrc(value: /* src */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSrc", js.Any.fromFunction1((t0: /* src */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Property] (String) */
    var src: js.UndefOr[String] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    extension [Self <: ICordova](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract {
    
    /** [Property] (String) */
    var src: js.UndefOr[String] = js.undefined
  }
  object IPhoneGap {
    
    inline def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    extension [Self <: IPhoneGap](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
