package typingsJapgolly.ember

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rsvp.mod.RSVP.Arg
import typingsJapgolly.rsvp.mod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPromise
  extends Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ] {
  /**
    * @deprecated
    */
  @JSName("cast")
  var cast_Original: typingsJapgolly.rsvp.FnCall = js.native
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

