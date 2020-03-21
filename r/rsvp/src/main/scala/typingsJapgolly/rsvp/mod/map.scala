package typingsJapgolly.rsvp.mod

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
import typingsJapgolly.rsvp.mod.RSVP.Arg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "map")
@js.native
object map extends js.Object {
  def apply[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon8] = js.native
  def apply[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon8] = js.native
  def apply[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon7] = js.native
  def apply[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon7] = js.native
  def apply[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon6] = js.native
  def apply[T1, T2, T3, U](
    entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon6] = js.native
  def apply[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon5] = js.native
  def apply[T1, T2, T3, T4, U](
    entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon5] = js.native
  def apply[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon4] = js.native
  def apply[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon4] = js.native
  def apply[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon3] = js.native
  def apply[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon3] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon2] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon2] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon1] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon1] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon0] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with Anon0] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with AnonLength] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: String
  ): typingsJapgolly.rsvp.mod.RSVP.Promise[js.Array[U] with AnonLength] = js.native
}

