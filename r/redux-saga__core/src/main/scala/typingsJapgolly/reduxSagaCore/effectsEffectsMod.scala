package typingsJapgolly.reduxSagaCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxSagaCore.anon.Context
import typingsJapgolly.reduxSagaCore.anon.ContextCtx
import typingsJapgolly.reduxSagaCore.anon.ContextFn
import typingsJapgolly.reduxSagaCore.anon.Fn
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ALL
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CALL
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCEL
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCELLED
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CPS
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FLUSH
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FORK
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.JOIN
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.PUT
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.RACE
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SELECT
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.TAKE
import typingsJapgolly.reduxSagaCore.typesEffectsMod.ActionChannelEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.AllEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CallEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CancelEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CancelledEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.ChannelPutEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.ChannelTakeEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CpsCallback
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CpsEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.CpsFunctionParameters
import typingsJapgolly.reduxSagaCore.typesEffectsMod.FlushEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.ForkEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.GetContextEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.HelperWorkerParameters
import typingsJapgolly.reduxSagaCore.typesEffectsMod.JoinEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.PutEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.RaceEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.SelectEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.SetContextEffect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.Tail
import typingsJapgolly.reduxSagaCore.typesEffectsMod.TakeEffect
import typingsJapgolly.reduxSagaCore.typesMod.FlushableChannel
import typingsJapgolly.reduxSagaCore.typesMod.PuttableChannel
import typingsJapgolly.reduxSagaCore.typesMod.TakeableChannel
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectsEffectsMod {
  
  @JSImport("@redux-saga/core/effects/effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): ActionChannelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any]).asInstanceOf[ActionChannelEffect]
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any,
    buffer: Buffer
  ): ActionChannelEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[ActionChannelEffect]
  
  inline def all[T](effects: js.Array[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  inline def all[T](effects: StringDictionary[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  
  inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def apply_CtxFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call_CtxFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def cancel(): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[CancelEffect]
  inline def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(task.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  inline def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
    ]
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(tasks.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  
  inline def cancelled(): CancelledEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelled")().asInstanceOf[CancelledEffect]
  
  inline def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[Any], Any] */](fn: Fn): CpsEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any]).asInstanceOf[CpsEffect]
  inline def cps[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Fn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](
    ctxAndFn: ContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def cps_CtxFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[A /* <: Action[Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def debounce_P[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def debounce_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def delay[T](ms: Double): CallEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[CallEffect]
  inline def delay[T](ms: Double, `val`: T): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  object effectTypes {
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ACTION_CHANNEL")
    @js.native
    def ACTION_CHANNEL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    inline def ACTION_CHANNEL_=(x: ACTION_CHANNEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ALL")
    @js.native
    def ALL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    inline def ALL_=(x: ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CALL")
    @js.native
    def CALL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    inline def CALL_=(x: CALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCEL")
    @js.native
    def CANCEL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCELLED")
    @js.native
    def CANCELLED: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    inline def CANCELLED_=(x: CANCELLED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    inline def CANCEL_=(x: CANCEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CPS")
    @js.native
    def CPS: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    inline def CPS_=(x: CPS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPS")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FLUSH")
    @js.native
    def FLUSH: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    inline def FLUSH_=(x: FLUSH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FORK")
    @js.native
    def FORK: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    inline def FORK_=(x: FORK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORK")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.GET_CONTEXT")
    @js.native
    def GET_CONTEXT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    inline def GET_CONTEXT_=(x: GET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.JOIN")
    @js.native
    def JOIN: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    inline def JOIN_=(x: JOIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.PUT")
    @js.native
    def PUT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    inline def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.RACE")
    @js.native
    def RACE: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    inline def RACE_=(x: RACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SELECT")
    @js.native
    def SELECT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    inline def SELECT_=(x: SELECT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SET_CONTEXT")
    @js.native
    def SET_CONTEXT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    inline def SET_CONTEXT_=(x: SET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.TAKE")
    @js.native
    def TAKE: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
    inline def TAKE_=(x: TAKE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAKE")(x.asInstanceOf[js.Any])
  }
  
  inline def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(channel.asInstanceOf[js.Any]).asInstanceOf[FlushEffect[T]]
  
  inline def fork[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def fork_CtxName[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def getContext(prop: String): GetContextEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(prop.asInstanceOf[js.Any]).asInstanceOf[GetContextEffect]
  
  inline def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(task.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  inline def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
    ]
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(tasks.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  
  inline def put[A /* <: Action[Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  inline def put[T](
    channel: PuttableChannel[T],
    action: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ Any) | T
  ): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  
  inline def putResolve[A /* <: Action[Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("putResolve")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  
  inline def race[T](effects: js.Array[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  inline def race[T](effects: StringDictionary[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  
  inline def retry[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(maxTries.asInstanceOf[js.Any], delayLength.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def select(): SelectEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[SelectEffect]
  inline def select[Fn /* <: js.Function2[/* state */ Any, /* repeated */ Any, Any] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectEffect]
  
  inline def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(props.asInstanceOf[js.Any]).asInstanceOf[SetContextEffect[C]]
  
  inline def spawn[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def spawn_CtxName[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def take(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeEvery_P[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeEvery_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest_P[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading_P[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeMaybe(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeMaybe_A[A /* <: Action[Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def take_A[A /* <: Action[Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[A /* <: Action[Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def throttle_P[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def throttle_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
}
