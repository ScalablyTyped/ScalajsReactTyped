package typingsJapgolly.reduxTestUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<redux.redux.Store<{}, redux.redux.AnyAction>, 'Symbol.observable'> */
  trait OmitStoreAnyActionSymbolo extends StObject {
    
    def dispatch[T /* <: AnyAction */](action: T): T
    @JSName("dispatch")
    var dispatch_Original: js.Function1[/* action */ AnyAction, AnyAction]
    
    def getState(): js.Object
    @JSName("getState")
    var getState_Original: js.Function0[js.Object]
    
    def replaceReducer(nextReducer: Reducer[js.Object, AnyAction]): Unit
    @JSName("replaceReducer")
    var replaceReducer_Original: js.Function1[/* nextReducer */ Reducer[js.Object, AnyAction], Unit]
    
    def subscribe(listener: js.Function0[Unit]): Unsubscribe
    @JSName("subscribe")
    var subscribe_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe]
  }
  object OmitStoreAnyActionSymbolo {
    
    inline def apply(
      dispatch: /* action */ AnyAction => AnyAction,
      getState: CallbackTo[js.Object],
      replaceReducer: /* nextReducer */ Reducer[js.Object, AnyAction] => Callback,
      subscribe: /* listener */ js.Function0[Unit] => Unsubscribe
    ): OmitStoreAnyActionSymbolo = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = getState.toJsFn, replaceReducer = js.Any.fromFunction1((t0: /* nextReducer */ Reducer[js.Object, AnyAction]) => replaceReducer(t0).runNow()), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[OmitStoreAnyActionSymbolo]
    }
    
    extension [Self <: OmitStoreAnyActionSymbolo](x: Self) {
      
      inline def setDispatch(value: /* action */ AnyAction => AnyAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setGetState(value: CallbackTo[js.Object]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setReplaceReducer(value: /* nextReducer */ Reducer[js.Object, AnyAction] => Callback): Self = StObject.set(x, "replaceReducer", js.Any.fromFunction1((t0: /* nextReducer */ Reducer[js.Object, AnyAction]) => value(t0).runNow()))
      
      inline def setSubscribe(value: /* listener */ js.Function0[Unit] => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
}
