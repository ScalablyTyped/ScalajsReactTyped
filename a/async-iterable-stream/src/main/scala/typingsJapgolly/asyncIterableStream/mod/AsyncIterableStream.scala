package typingsJapgolly.asyncIterableStream.mod

import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncIterableStream[T]
  extends AsyncIterator[T]
     with AsyncIterable[T] {
  def createAsyncIterable(): AsyncIterable[T] = js.native
  def createAsyncIterable(timeout: Double): AsyncIterable[T] = js.native
  def createAsyncIterator(): AsyncIterator[T] = js.native
  def createAsyncIterator(timeout: Double): AsyncIterator[T] = js.native
  def next(timeout: Double): js.Promise[IteratorResult[T, _]] = js.native
  def once(): js.Promise[T] = js.native
  def once(timeout: Double): js.Promise[T] = js.native
}

