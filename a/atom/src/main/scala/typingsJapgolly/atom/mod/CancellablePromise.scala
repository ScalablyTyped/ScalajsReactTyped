package typingsJapgolly.atom.mod

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellablePromise[T] extends Promise[T] {
  def cancel(): Unit = js.native
}

