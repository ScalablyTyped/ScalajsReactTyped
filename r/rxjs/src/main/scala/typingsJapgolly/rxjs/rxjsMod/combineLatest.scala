package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "combineLatest")
@js.native
object combineLatest extends js.Object {
  def apply[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[_]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](sources: js.Array[O1]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](sources: js.Array[O1], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](v1: O1): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def apply[O /* <: ObservableInput[_] */, R](sources: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O /* <: ObservableInput[_] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4]): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
}

