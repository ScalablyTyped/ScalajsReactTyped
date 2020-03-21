package typingsJapgolly.delay.mod

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearablePromise[T] extends Promise[T] {
  /**
  		Clears the delay and settles the promise.
  		*/
  def clear(): Unit = js.native
}

