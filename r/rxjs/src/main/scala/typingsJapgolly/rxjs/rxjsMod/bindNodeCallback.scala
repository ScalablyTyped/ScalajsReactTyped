package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "bindNodeCallback")
@js.native
object bindNodeCallback extends js.Object {
  def apply(callbackFunc: js.Function): js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  def apply(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function0[typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def apply(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def apply(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, typingsJapgolly.rxjs.internalObservableMod.Observable[_]] = js.native
  def apply(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, typingsJapgolly.rxjs.internalObservableMod.Observable[_]] = js.native
  def apply(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  def apply[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function1[/* arg1 */ A1, typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def apply[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def apply[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typingsJapgolly.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
}

