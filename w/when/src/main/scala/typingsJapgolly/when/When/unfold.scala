package typingsJapgolly.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.unfold")
@js.native
object unfold extends js.Object {
  /**
    * Similar to when/iterate, when.unfold generates a potentially infinite stream of promises by repeatedly calling
    * unspool until predicate becomes true. when.unfold allows you to thread additional state information through the iteration.
    * @memberOf when
    * @param unspool function that, given a seed, returns a [valueToSendToHandler, newSeed] pair.
    * May return an array, array of promises, promise for an array, or promise for an array of promises.
    * @param predicate function that receives the current seed, and should return truthy when the unfold should stop
    * @param handler function that receives the valueToSendToHandler of the current iteration.
    * This function can process valueToSendToHandler in whatever way you need.
    * It may return a promise to delay the next iteration of the unfold.
    * @param seed initial value provided to the first unspool invocation. May be a promise.
    */
  def apply[T, U](
    unspool: js.Function1[
      /* seed */ U, 
      (js.Tuple2[T | Promise_[T], U | Promise_[U]]) | (Promise_[js.Tuple2[T | Promise_[T], U | Promise_[U]]])
    ],
    predicate: js.Function1[/* value */ U, Boolean | Promise_[Boolean]],
    handler: js.Function1[/* value */ T, Promise_[_] | Unit],
    seed: U
  ): Promise_[Unit] = js.native
  def apply[T, U](
    unspool: js.Function1[
      /* seed */ U, 
      (js.Tuple2[T | Promise_[T], U | Promise_[U]]) | (Promise_[js.Tuple2[T | Promise_[T], U | Promise_[U]]])
    ],
    predicate: js.Function1[/* value */ U, Boolean | Promise_[Boolean]],
    handler: js.Function1[/* value */ T, Promise_[_] | Unit],
    seed: Promise_[U]
  ): Promise_[Unit] = js.native
}

