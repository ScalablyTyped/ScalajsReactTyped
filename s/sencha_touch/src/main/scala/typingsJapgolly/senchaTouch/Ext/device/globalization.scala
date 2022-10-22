package typingsJapgolly.senchaTouch.Ext.device

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalization {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Method] Returns the value of currencyCode
      * @returns String
      */
    var getCurrencyCode: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of dateType
      * @returns String
      */
    var getDateType: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of formatLength
      * @returns String
      */
    var getFormatLength: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of items
      * @returns String
      */
    var getItems: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of numberType
      * @returns String
      */
    var getNumberType: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of selector
      * @returns String
      */
    var getSelector: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of currencyCode
      * @param currencyCode String The new value.
      */
    var setCurrencyCode: js.UndefOr[js.Function1[/* currencyCode */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of dateType
      * @param dateType String The new value.
      */
    var setDateType: js.UndefOr[js.Function1[/* dateType */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of formatLength
      * @param formatLength String The new value.
      */
    var setFormatLength: js.UndefOr[js.Function1[/* formatLength */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of items
      * @param items String The new value.
      */
    var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of numberType
      * @param numberType String The new value.
      */
    var setNumberType: js.UndefOr[js.Function1[/* numberType */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of selector
      * @param selector String The new value.
      */
    var setSelector: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetCurrencyCode(value: CallbackTo[String]): Self = StObject.set(x, "getCurrencyCode", value.toJsFn)
      
      inline def setGetCurrencyCodeUndefined: Self = StObject.set(x, "getCurrencyCode", js.undefined)
      
      inline def setGetDateType(value: CallbackTo[String]): Self = StObject.set(x, "getDateType", value.toJsFn)
      
      inline def setGetDateTypeUndefined: Self = StObject.set(x, "getDateType", js.undefined)
      
      inline def setGetFormatLength(value: CallbackTo[String]): Self = StObject.set(x, "getFormatLength", value.toJsFn)
      
      inline def setGetFormatLengthUndefined: Self = StObject.set(x, "getFormatLength", js.undefined)
      
      inline def setGetItems(value: CallbackTo[String]): Self = StObject.set(x, "getItems", value.toJsFn)
      
      inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
      
      inline def setGetNumberType(value: CallbackTo[String]): Self = StObject.set(x, "getNumberType", value.toJsFn)
      
      inline def setGetNumberTypeUndefined: Self = StObject.set(x, "getNumberType", js.undefined)
      
      inline def setGetSelector(value: CallbackTo[String]): Self = StObject.set(x, "getSelector", value.toJsFn)
      
      inline def setGetSelectorUndefined: Self = StObject.set(x, "getSelector", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetCurrencyCode(value: /* currencyCode */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setCurrencyCode", js.Any.fromFunction1((t0: /* currencyCode */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetCurrencyCodeUndefined: Self = StObject.set(x, "setCurrencyCode", js.undefined)
      
      inline def setSetDateType(value: /* dateType */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDateType", js.Any.fromFunction1((t0: /* dateType */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetDateTypeUndefined: Self = StObject.set(x, "setDateType", js.undefined)
      
      inline def setSetFormatLength(value: /* formatLength */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setFormatLength", js.Any.fromFunction1((t0: /* formatLength */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetFormatLengthUndefined: Self = StObject.set(x, "setFormatLength", js.undefined)
      
      inline def setSetItems(value: /* items */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setItems", js.Any.fromFunction1((t0: /* items */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
      
      inline def setSetNumberType(value: /* numberType */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setNumberType", js.Any.fromFunction1((t0: /* numberType */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetNumberTypeUndefined: Self = StObject.set(x, "setNumberType", js.undefined)
      
      inline def setSetSelector(value: /* selector */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSelector", js.Any.fromFunction1((t0: /* selector */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetSelectorUndefined: Self = StObject.set(x, "setSelector", js.undefined)
    }
  }
  
  type ICordova = IAbstract
  
  type IPhoneGap = IAbstract
  
  type ISimulator = IAbstract
}
