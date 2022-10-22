package typingsJapgolly.reduxPack

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxPack.anon.ReduxpackLIFECYCLE
import typingsJapgolly.reduxPack.reduxPackStrings.`redux-packSlashLIFECYCLE`
import typingsJapgolly.reduxPack.reduxPackStrings.`redux-packSlashTRANSACTION`
import typingsJapgolly.reduxPack.reduxPackStrings.failure
import typingsJapgolly.reduxPack.reduxPackStrings.start
import typingsJapgolly.reduxPack.reduxPackStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object KEY {
    
    @JSImport("redux-pack", "KEY.LIFECYCLE")
    @js.native
    val LIFECYCLE: `redux-packSlashLIFECYCLE` = js.native
    
    @JSImport("redux-pack", "KEY.TRANSACTION")
    @js.native
    val TRANSACTION: `redux-packSlashTRANSACTION` = js.native
  }
  
  object LIFECYCLE {
    
    @JSImport("redux-pack", "LIFECYCLE.FAILURE")
    @js.native
    val FAILURE: failure = js.native
    
    @JSImport("redux-pack", "LIFECYCLE.START")
    @js.native
    val START: start = js.native
    
    @JSImport("redux-pack", "LIFECYCLE.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  inline def handle[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    state: TState,
    action: Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload],
    handlers: Handlers[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  ): TState = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TState]
  
  @JSImport("redux-pack", "middleware")
  @js.native
  val middleware: Middleware[js.Object, Any, Dispatch[AnyAction]] = js.native
  
  trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
    extends StObject
       with typingsJapgolly.redux.mod.Action[Any] {
    
    // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
    // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
    var error: js.UndefOr[Boolean | Null] = js.undefined
    
    var meta: js.UndefOr[
        (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) & TMetaPayload
      ] = js.undefined
    
    var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.undefined
    
    var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.undefined
  }
  object Action {
    
    inline def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](`type`: Any): Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    }
    
    extension [Self <: Action[?, ?, ?, ?, ?], TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](x: Self & (Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMeta(value: (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) & TMetaPayload): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(value: TSuccessPayload | TErrorPayload | TStartPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPromise(value: js.Promise[TSuccessPayload]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends StObject {
    
    var onFailure: js.UndefOr[
        js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.undefined
    
    var onFinish: js.UndefOr[js.Function2[/* resolved */ Boolean, /* getState */ GetState[TFullState], Unit]] = js.undefined
    
    var onStart: js.UndefOr[
        js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], Unit]
      ] = js.undefined
    
    @JSName("redux-pack/LIFECYCLE")
    var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
    
    @JSName("redux-pack/TRANSACTION")
    var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.undefined
    
    var startPayload: js.UndefOr[TStartPayload] = js.undefined
  }
  object ActionMeta {
    
    inline def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
    }
    
    extension [Self <: ActionMeta[?, ?, ?, ?], TFullState, TSuccessPayload, TErrorPayload, TStartPayload](x: Self & (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload])) {
      
      inline def setOnFailure(value: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => Callback): Self = StObject.set(x, "onFailure", js.Any.fromFunction2((t0: /* error */ TErrorPayload, t1: /* getState */ GetState[TFullState]) => (value(t0, t1)).runNow()))
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOnFinish(value: (/* resolved */ Boolean, /* getState */ GetState[TFullState]) => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction2((t0: /* resolved */ Boolean, t1: /* getState */ GetState[TFullState]) => (value(t0, t1)).runNow()))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnStart(value: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* payload */ TStartPayload, t1: /* getState */ GetState[TFullState]) => (value(t0, t1)).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnSuccess(value: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* response */ TSuccessPayload, t1: /* getState */ GetState[TFullState]) => (value(t0, t1)).runNow()))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def `setRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = StObject.set(x, "redux-pack/LIFECYCLE", value.asInstanceOf[js.Any])
      
      inline def `setRedux-packSlashLIFECYCLEUndefined`: Self = StObject.set(x, "redux-pack/LIFECYCLE", js.undefined)
      
      inline def `setRedux-packSlashTRANSACTION`(value: String): Self = StObject.set(x, "redux-pack/TRANSACTION", value.asInstanceOf[js.Any])
      
      inline def `setRedux-packSlashTRANSACTIONUndefined`: Self = StObject.set(x, "redux-pack/TRANSACTION", js.undefined)
      
      inline def setStartPayload(value: TStartPayload): Self = StObject.set(x, "startPayload", value.asInstanceOf[js.Any])
      
      inline def setStartPayloadUndefined: Self = StObject.set(x, "startPayload", js.undefined)
    }
  }
  
  type GetState[S] = js.Function0[S]
  
  trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends StObject {
    
    var always: js.UndefOr[handlerReducer[S, typingsJapgolly.redux.mod.Action[Any]]] = js.undefined
    
    var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.undefined
    
    var finish: js.UndefOr[handlerReducer[S, typingsJapgolly.redux.mod.Action[Any]]] = js.undefined
    
    var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.undefined
    
    var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.undefined
  }
  object Handlers {
    
    inline def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    }
    
    extension [Self <: Handlers[?, ?, ?, ?, ?], S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](x: Self & (Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) {
      
      inline def setAlways(value: (S, typingsJapgolly.redux.mod.Action[Any]) => S): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
      
      inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      inline def setFailure(value: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => S): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
      
      inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      inline def setFinish(value: (S, typingsJapgolly.redux.mod.Action[Any]) => S): Self = StObject.set(x, "finish", js.Any.fromFunction2(value))
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      inline def setStart(value: (S, PackActionPayload[TStartPayload, TMetaPayload]) => S): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSuccess(value: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => S): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reduxPack.reduxPackStrings.start
    - typingsJapgolly.reduxPack.reduxPackStrings.success
    - typingsJapgolly.reduxPack.reduxPackStrings.failure
  */
  trait LIFECYCLEValues extends StObject
  object LIFECYCLEValues {
    
    inline def failure: typingsJapgolly.reduxPack.reduxPackStrings.failure = "failure".asInstanceOf[typingsJapgolly.reduxPack.reduxPackStrings.failure]
    
    inline def start: typingsJapgolly.reduxPack.reduxPackStrings.start = "start".asInstanceOf[typingsJapgolly.reduxPack.reduxPackStrings.start]
    
    inline def success: typingsJapgolly.reduxPack.reduxPackStrings.success = "success".asInstanceOf[typingsJapgolly.reduxPack.reduxPackStrings.success]
  }
  
  type MetaPayload[M] = M & ReduxpackLIFECYCLE
  
  trait PackActionPayload[Payload, M]
    extends StObject
       with typingsJapgolly.redux.mod.Action[Any] {
    
    var meta: MetaPayload[M]
    
    var payload: Payload
  }
  object PackActionPayload {
    
    inline def apply[Payload, M](meta: MetaPayload[M], payload: Payload, `type`: Any): PackActionPayload[Payload, M] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackActionPayload[Payload, M]]
    }
    
    extension [Self <: PackActionPayload[?, ?], Payload, M](x: Self & (PackActionPayload[Payload, M])) {
      
      inline def setMeta(value: MetaPayload[M]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackError extends StObject {
    
    var error: Boolean
    
    var payload: Any
  }
  object PackError {
    
    inline def apply(error: Boolean, payload: Any): PackError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackError]
    }
    
    extension [Self <: PackError](x: Self) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type TFullState = StringDictionary[Any]
  
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
