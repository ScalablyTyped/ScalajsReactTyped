package typingsJapgolly.reduxSagaCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxSagaCore.effectsMod.ActionChannelEffect
import typingsJapgolly.reduxSagaCore.effectsMod.AllEffect
import typingsJapgolly.reduxSagaCore.effectsMod.CallEffect
import typingsJapgolly.reduxSagaCore.effectsMod.CancelEffect
import typingsJapgolly.reduxSagaCore.effectsMod.CancelledEffect
import typingsJapgolly.reduxSagaCore.effectsMod.ChannelPutEffect
import typingsJapgolly.reduxSagaCore.effectsMod.ChannelTakeEffect
import typingsJapgolly.reduxSagaCore.effectsMod.CpsCallback
import typingsJapgolly.reduxSagaCore.effectsMod.CpsEffect
import typingsJapgolly.reduxSagaCore.effectsMod.CpsFunctionParameters
import typingsJapgolly.reduxSagaCore.effectsMod.FlushEffect
import typingsJapgolly.reduxSagaCore.effectsMod.ForkEffect
import typingsJapgolly.reduxSagaCore.effectsMod.GetContextEffect
import typingsJapgolly.reduxSagaCore.effectsMod.HelperWorkerParameters
import typingsJapgolly.reduxSagaCore.effectsMod.JoinEffect
import typingsJapgolly.reduxSagaCore.effectsMod.PutEffect
import typingsJapgolly.reduxSagaCore.effectsMod.RaceEffect
import typingsJapgolly.reduxSagaCore.effectsMod.SelectEffect
import typingsJapgolly.reduxSagaCore.effectsMod.SetContextEffect
import typingsJapgolly.reduxSagaCore.effectsMod.Tail
import typingsJapgolly.reduxSagaCore.effectsMod.TakeEffect
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.call_
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.cps_
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.fork_
import typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.spawn
import typingsJapgolly.reduxSagaCore.typesMod.FlushableChannel
import typingsJapgolly.reduxSagaCore.typesMod.PuttableChannel
import typingsJapgolly.reduxSagaCore.typesMod.TakeableChannel
import typingsJapgolly.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/effects/effects", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffect = js.native
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer
  ): ActionChannelEffect = js.native
  def all[T](effects: js.Array[T]): AllEffect[T] = js.native
  def all[T](effects: StringDictionary[T]): AllEffect[T] = js.native
  @JSName("apply")
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.apply with js.Any */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  @JSName("apply")
  def apply_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ with js.Any */, Name /* <: String */](
    ctxAndFnName: AnonContext[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: AnonFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  @JSName("call")
  def call_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def cancel(): CancelEffect = js.native
  def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): CancelEffect = js.native
  def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): CancelEffect = js.native
  def cancelled(): CancelledEffect = js.native
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ with js.Any */, Name /* <: String */](
    ctxAndFnName: AnonContextFn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: AnonContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSName("cps")
  def cps_Ctx_Intersectioncps_AnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = js.native
  def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def delay[T](ms: Double): CallEffect = js.native
  def delay[T](ms: Double, `val`: T): CallEffect = js.native
  def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = js.native
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ with js.Any */, Name /* <: String */](
    ctxAndFnName: AnonContext[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: AnonFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("fork")
  def fork_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def getContext(prop: String): GetContextEffect = js.native
  def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): JoinEffect = js.native
  def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): JoinEffect = js.native
  def put[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  def put[T](
    channel: PuttableChannel[T],
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = js.native
  def putResolve[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def race[T](effects: js.Array[T]): RaceEffect[T] = js.native
  def race[T](effects: StringDictionary[T]): RaceEffect[T] = js.native
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def select(): SelectEffect = js.native
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = js.native
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.spawn with js.Any */, Name /* <: String */](
    ctxAndFnName: AnonContext[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: AnonFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("spawn")
  def spawn_Ctx_IntersectionspawnAnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ spawn with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  def take(): TakeEffect = js.native
  def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeMaybe(): TakeEffect = js.native
  def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  @js.native
  object effectTypes extends js.Object {
    var ACTION_CHANNEL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    var ALL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    var CALL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    var CANCEL: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    var CANCELLED: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    var CPS: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    var FLUSH: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    var FORK: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    var GET_CONTEXT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    var JOIN: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    var PUT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    var RACE: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    var SELECT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    var SET_CONTEXT: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    var TAKE: typingsJapgolly.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
  }
  
}

