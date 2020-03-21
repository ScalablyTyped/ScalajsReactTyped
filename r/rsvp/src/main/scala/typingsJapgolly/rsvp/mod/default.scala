package typingsJapgolly.rsvp.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rsvp.Anon0
import typingsJapgolly.rsvp.Anon1
import typingsJapgolly.rsvp.Anon2
import typingsJapgolly.rsvp.Anon3
import typingsJapgolly.rsvp.Anon4
import typingsJapgolly.rsvp.Anon5
import typingsJapgolly.rsvp.Anon6
import typingsJapgolly.rsvp.Anon7
import typingsJapgolly.rsvp.Anon8
import typingsJapgolly.rsvp.AnonLength
import typingsJapgolly.rsvp.FnCall
import typingsJapgolly.rsvp.mod.RSVP.Arg
import typingsJapgolly.rsvp.mod.RSVP.Deferred
import typingsJapgolly.rsvp.mod.RSVP.InstrumentEvent
import typingsJapgolly.rsvp.mod.RSVP.ObjectWithEventMixins
import typingsJapgolly.rsvp.mod.RSVP.PromiseState
import typingsJapgolly.rsvp.rsvpBooleans.`false`
import typingsJapgolly.rsvp.rsvpBooleans.`true`
import typingsJapgolly.rsvp.rsvpStrings.chained
import typingsJapgolly.rsvp.rsvpStrings.created
import typingsJapgolly.rsvp.rsvpStrings.error
import typingsJapgolly.rsvp.rsvpStrings.fulfilled
import typingsJapgolly.rsvp.rsvpStrings.rejected
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class EventTarget ()
    extends typingsJapgolly.rsvp.mod.RSVP.EventTarget
  
  @js.native
  class Promise[T] protected ()
    extends typingsJapgolly.rsvp.mod.RSVP.Promise[T]
       with Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          typingsJapgolly.rsvp.mod.RSVP.Promise[js.Object]
        ] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
    def this(
      executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[Arg[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ],
      label: String
    ) = this()
  }
  
  val cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise.cast */ js.Any = js.native
  val off: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.off */ js.Any = js.native
  val on: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.on */ js.Any = js.native
  def allSettled[T](entries: js.Array[Arg[T]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  def allSettled[T](entries: js.Array[Arg[T]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[PromiseState[T]]] = js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple6[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple7[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple8[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    js.Tuple9[
      PromiseState[T1], 
      PromiseState[T2], 
      PromiseState[T3], 
      PromiseState[T4], 
      PromiseState[T5], 
      PromiseState[T6], 
      PromiseState[T7], 
      PromiseState[T8], 
      PromiseState[T9]
    ]
  ] = js.native
  def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  def configure[T](name: String): T = js.native
  def configure[T](name: String, value: T): Unit = js.native
  def defer[T](): Deferred[T] = js.native
  def defer[T](label: String): Deferred[T] = js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T]] = js.native
  def denodeify[T, A, K1 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typingsJapgolly.rsvp.mod.RSVP.Promise[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ typingsJapgolly.rsvp.rsvpStrings.denodeify with js.Any
    ]
  ] = js.native
  def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    typingsJapgolly.rsvp.mod.RSVP.Promise[typingsJapgolly.rsvp.rsvpStrings.denodeify with js.Any]
  ] = js.native
  def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    typingsJapgolly.rsvp.mod.RSVP.Promise[typingsJapgolly.rsvp.rsvpStrings.denodeify with js.Any]
  ] = js.native
  @JSName("denodeify")
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T1]] = js.native
  // ----- denodeify ----- //
  // Here be absurd things because we don't have variadic types. All of
  // this will go away if we can ever write this:
  //
  //     denodeify<...T, ...A>(
  //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
  //         options?: false
  //     ): (...args: ...A) => RSVP.Promise<...T>
  // That day, however, may never come. So, in the meantime, we do this.
  @JSName("denodeify")
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_false[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T]] = js.native
  @JSName("denodeify")
  def denodeify_false_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_false_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_true[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T]]] = js.native
  @JSName("denodeify")
  def denodeify_true_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]]] = js.native
  @JSName("denodeify")
  def denodeify_true_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]]] = js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
  def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2](
    entries: js.Tuple2[Arg[T1], Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon3] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon3] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  // ----- hash and hashSettled ----- //
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hash with T
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
  def hash[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hash with T,
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hashSettled with T
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hashSettled with T
  ] = js.native
  def hashSettled[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hashSettled with T,
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ typingsJapgolly.rsvp.rsvpStrings.hashSettled with T
  ] = js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon8] = js.native
  def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon8] = js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon7] = js.native
  def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon7] = js.native
  def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon6] = js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon6] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon5] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon5] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon4] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon4] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon3] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon3] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon2] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon2] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon1] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon1] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon0] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon0] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with AnonLength] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with AnonLength] = js.native
  def rethrow(reason: js.Any): Unit = js.native
  /* static members */
  @js.native
  object EventTarget extends js.Object {
    /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
    def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    def off(eventName: String): Unit = js.native
    def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    @JSName("on")
    def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /** Registers a callback to be executed when `eventName` is triggered */
    @JSName("on")
    def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
    @JSName("on")
    def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
    /**
      * Use `trigger` to fire custom events.
      *
      * You can also pass a value as a second argument to `trigger` that will be
      * passed as an argument to all event listeners for the event
      */
    def trigger(eventName: String): Unit = js.native
    def trigger(eventName: String, options: js.Any): Unit = js.native
    def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Promise extends js.Object {
    /**
      * @deprecated
      */
    @JSName("cast")
    var cast_Original: FnCall = js.native
    def all[T](values: js.Array[Arg[T]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    def all[T](values: js.Array[Arg[T]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[T]] = js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    /**
      * @deprecated
      */
    def cast(): js.Promise[Unit] = js.native
    /**
      * @deprecated
      */
    def cast[T](value: T): js.Promise[T] = js.native
    /**
      * @deprecated
      */
    def cast[T](value: js.Thenable[T]): js.Promise[T] = js.native
    def race[T](values: js.Array[Arg[T]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
    def race[T](values: js.Array[Arg[T]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    def race[T1, T2](values: js.Tuple2[Arg[T1], Arg[T2]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2] = js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    def race[T1, T2, T3](values: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3] = js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    def race[T1, T2, T3, T4](values: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4] = js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def race[T1, T2, T3, T4, T5](values: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def race[T1, T2, T3, T4, T5, T6](values: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7](values: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | js.Thenable[T10]
        ]
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          Arg[T1], 
          Arg[T2], 
          Arg[T3], 
          Arg[T4], 
          Arg[T5], 
          Arg[T6], 
          Arg[T7], 
          Arg[T8], 
          Arg[T9], 
          T10 | js.Thenable[T10]
        ],
      label: String
    ): typingsJapgolly.rsvp.mod.RSVP.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    def reject(): typingsJapgolly.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def reject(reason: js.Any): typingsJapgolly.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def reject(reason: js.Any, label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[scala.Nothing] = js.native
    def resolve(): typingsJapgolly.rsvp.mod.RSVP.Promise[Unit] = js.native
    def resolve[T](value: Arg[T]): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
    def resolve[T](value: Arg[T], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
    @JSName("resolve")
    def resolve_T[T](): typingsJapgolly.rsvp.mod.RSVP.Promise[T] = js.native
  }
  
  // RSVP supplies status for promises in certain places.
  @js.native
  object State extends js.Object {
    /* "fulfilled" */ val fulfilled: typingsJapgolly.rsvp.mod.RSVP.State.fulfilled with String = js.native
    /* "pending" */ val pending: typingsJapgolly.rsvp.mod.RSVP.State.pending with String = js.native
    /* "rejected" */ val rejected: typingsJapgolly.rsvp.mod.RSVP.State.rejected with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.rsvp.mod.RSVP.State with String] = js.native
  }
  
  @js.native
  object all extends js.Object {
    def apply[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
    def apply[TAll](values: Iterable[TAll | js.Thenable[TAll]]): js.Promise[js.Array[TAll]] = js.native
    def apply[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
    def apply[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def apply[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def apply[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  }
  
  @js.native
  object async extends js.Object {
    def apply[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
  }
  
  @js.native
  object race extends js.Object {
    def apply[T](values: js.Array[T]): js.Promise[T] = js.native
    def apply[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
  }
  
  @js.native
  object reject extends js.Object {
    def apply[T](): js.Promise[T] = js.native
    def apply[T](reason: js.Any): js.Promise[T] = js.native
  }
  
  @js.native
  object resolve extends js.Object {
    def apply(): js.Promise[Unit] = js.native
    def apply[T](value: T): js.Promise[T] = js.native
    def apply[T](value: js.Thenable[T]): js.Promise[T] = js.native
  }
  
}

