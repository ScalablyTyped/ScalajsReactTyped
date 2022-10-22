package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizemonitor {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of args
      * @returns Array
      */
    var getArgs: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of callback
      * @returns Object
      */
    var getCallback: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of scope
      * @returns Object
      */
    var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of args
      * @param args Array The new value.
      */
    var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of callback
      * @param callback Object The new value.
      */
    var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of scope
      * @param scope Object The new value.
      */
    var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetArgs(value: CallbackTo[Array]): Self = StObject.set(x, "getArgs", value.toJsFn)
      
      inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
      
      inline def setGetCallback(value: CallbackTo[Any]): Self = StObject.set(x, "getCallback", value.toJsFn)
      
      inline def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
      
      inline def setGetElement(value: CallbackTo[Any]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetScope(value: CallbackTo[Any]): Self = StObject.set(x, "getScope", value.toJsFn)
      
      inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
      
      inline def setSetArgs(value: /* args */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setArgs", js.Any.fromFunction1((t0: /* args */ js.UndefOr[Array]) => value(t0).runNow()))
      
      inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
      
      inline def setSetCallback(value: /* callback */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setCallback", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setElement", js.Any.fromFunction1((t0: /* element */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScope", js.Any.fromFunction1((t0: /* scope */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    }
  }
  
  type IDefault = IAbstract
  
  type IOverflowChange = IAbstract
  
  type IScroll = IAbstract
}
